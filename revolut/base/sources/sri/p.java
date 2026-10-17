package sri;

import android.app.Activity;
import android.content.Context;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265239a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f265240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f265241c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(WeakReference weakReference, NaviCommand naviCommand, WeakReference weakReference2, Context context) {
        this.f265240b = weakReference;
        this.d = naviCommand;
        this.f265241c = weakReference2;
        this.e = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f265239a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f265241c;
        Object obj6 = this.f265240b;
        switch (i) {
            case 0:
                NaviCommand naviCommand = (NaviCommand) obj4;
                WeakReference weakReference = (WeakReference) obj5;
                Context context = (Context) obj3;
                Activity it8 = (Activity) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.retail.core.navigation.b bVar = (com.revolut.retail.core.navigation.b) ((WeakReference) obj6).get();
                if (bVar == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Navigator is destroyed");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else if (it8 instanceof nri.b) {
                    nri.b bVar2 = (nri.b) it8;
                    bVar2.runOnUiThread(new ag.n(bVar, 5, naviCommand, bVar2));
                } else {
                    Intrinsics.h(context);
                    bVar.i(weakReference, naviCommand, context);
                }
                break;
            default:
                w4l.f fVar = (w4l.f) obj6;
                Function1 function1 = (Function1) obj3;
                Throwable th10 = (Throwable) obj2;
                Function1 function12 = fVar.f294634a;
                ConcurrentHashMap concurrentHashMap = fVar.k;
                Object objInvoke = function12.invoke(obj5);
                Data data = new Data(objInvoke == null ? obj4 : objInvoke, th10, false, 4, null);
                if (th10 instanceof NoSuchElementException) {
                    concurrentHashMap.remove(obj5);
                } else {
                    concurrentHashMap.put(obj5, th10);
                }
                fVar.i(obj5).onNext(data);
                Intrinsics.h(th10);
                function1.invoke(th10);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ p(w4l.f fVar, Object obj2, Object obj3, Function1 function1) {
        this.f265240b = fVar;
        this.f265241c = obj2;
        this.d = obj3;
        this.e = function1;
    }
}
