package shi;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nhi.j;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f263493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f263494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yhi.a f263495c;

    public c(Context context, j featuresRegistry, yhi.a featureGatewaysWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featuresRegistry, "featuresRegistry");
        Intrinsics.checkNotNullParameter(featureGatewaysWrapper, "featureGatewaysWrapper");
        this.f263493a = context;
        this.f263494b = featuresRegistry;
        this.f263495c = featureGatewaysWrapper;
    }

    @Override // od0.e
    public final void clear() {
        if (!Looper.getMainLooper().isCurrentThread()) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("featuresRegistry.clearFeatures on ", Thread.currentThread().getName()));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "BUGS-391372", null, illegalStateException, h0Var);
        }
        nhi.b bVar = (nhi.b) this.f263494b;
        ArrayList arrayList = bVar.f215498b;
        ArrayList arrayList2 = bVar.f215497a;
        Context context = this.f263493a;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            ((nhi.f) it8.next()).f(context);
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            ((nhi.h) it9.next()).f(context);
        }
        Iterator it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            ((nhi.f) it10.next()).b();
        }
        arrayList2.clear();
        Iterator it11 = arrayList.iterator();
        while (it11.hasNext()) {
            ((nhi.h) it11.next()).b();
        }
        arrayList.clear();
        ArrayList features = this.f263495c.f314167a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(features, "features");
        bVar.f215497a.addAll(features);
    }
}
