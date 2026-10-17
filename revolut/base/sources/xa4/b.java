package xa4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import wh3.h;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PluginFlowContract$Input f303774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f303775m;

    public b(PluginFlowContract$Input inputData, ImmutableSet handlers) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f303774l = inputData;
        this.f303775m = handlers;
    }

    @Override // xa4.a
    public final boolean Z2(Throwable throwable, Function1 onExit) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(onExit, "onExit");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, throwable, h0Var);
        Set set = this.f303775m;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (((ya4.a) obj2).a(throwable)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() > 1) {
            IllegalStateException illegalStateException = new IllegalStateException(v1.c.u("More than one handler can handle error: ", throwable));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.a(c.ERROR, null, null, illegalStateException, h0Var2);
        }
        ya4.a aVar = (ya4.a) d0.d0(arrayList);
        if (aVar == null) {
            return false;
        }
        T2(new h(aVar, throwable, this, onExit, (Continuation) null), new x8i.h(11));
        return true;
    }
}
