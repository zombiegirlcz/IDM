package kkf;

import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final om4.n0 f184636n;
    public final bl4.e o;

    public d1(klf.h0 commonDataSource, klf.m1 juniorDataSource, om4.n0 feeWaiverInteractor, bl4.e feeWaiverMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(feeWaiverInteractor, "feeWaiverInteractor");
        Intrinsics.checkNotNullParameter(feeWaiverMapper, "feeWaiverMapper");
        this.f184634l = commonDataSource;
        this.f184635m = juniorDataSource;
        this.f184636n = feeWaiverInteractor;
        this.o = feeWaiverMapper;
    }

    public final cmf.p Z2(Function1 entryPointFactory) {
        Intrinsics.checkNotNullParameter(entryPointFactory, "entryPointFactory");
        return new cmf.p(new kh4.f(vkm.q.Q(yh5.b.d(this.f184634l.d(), this.f184635m.a()), new k25.o((Continuation) null, this, entryPointFactory)), this, 10), new chc.c0(23), zhm.u.c(this), "FeeWaiver");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "fee_waiver_progress")) {
            return Boolean.FALSE;
        }
        nl4.g gVar = obj2 instanceof nl4.g ? (nl4.g) obj2 : null;
        if (gVar != null && gVar.f217000c) {
            hha.w0 w0Var = gVar.f216999b;
            nl4.e eVar = gVar.f216998a;
            yji.n.P2(this, o2(new zl4.i(w0Var, eVar.d, eVar.f216996c, eVar.f216995b, eVar.e)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
