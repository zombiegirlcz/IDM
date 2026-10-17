package nme;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.lifestyle.impl.ui.screen.f f217310b;

    public /* synthetic */ o0(com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar, int i) {
        this.f217309a = i;
        this.f217310b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f217309a) {
            case 0:
                v19.a it8 = (v19.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                u29.m mVar = this.f217310b.f89946p;
                return xam.a.h(new u29.i(mVar, null, 0), vkm.q.q(f39.c.b(mVar.f)));
            case 1:
                v19.a it9 = (v19.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                u29.m mVar2 = this.f217310b.f89946p;
                return xam.a.h(new u29.i(mVar2, null, 1), vkm.q.q(f39.c.b(mVar2.f)));
            case 2:
                v19.a it10 = (v19.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = this.f217310b;
                return vkm.q.Q(new lfg.d0(fVar.g0.B(t0.f217315a), 20), new e0(8, fVar, null));
            case 3:
                v19.a it11 = (v19.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                u29.m mVar3 = this.f217310b.f89946p;
                return vkm.q.Q(mVar3.f276577g, new sdi.a(null, mVar3.e.a(f19.h.LOYALTY_HOME_SUGGESTED_FOR_YOU, w4l.i.f294643c), mVar3, 14));
            default:
                v19.a it12 = (v19.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return this.f217310b.f89946p.b(i19.f.ALWAYS);
        }
    }
}
