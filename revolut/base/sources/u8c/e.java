package u8c;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q7c.g;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u0f.a f278162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f278163n;
    public final mki.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f278164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function0 f278165q;

    public e(u0f.a topUpResultStateHolder, g paymentMethodsInteractor, mki.b controllerEnvironment) {
        Intrinsics.checkNotNullParameter(topUpResultStateHolder, "topUpResultStateHolder");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(controllerEnvironment, "controllerEnvironment");
        this.f278162m = topUpResultStateHolder;
        this.f278163n = paymentMethodsInteractor;
        this.o = controllerEnvironment;
        this.f278164p = new a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f3(u8c.e r7, dj0.d r8, xi0.b r9, xi0.b r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u8c.e.f3(u8c.e, dj0.d, xi0.b, xi0.b, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void H2() {
        Function0 function0;
        if (((a) b3()).f278157a) {
            d3(new c(0));
            if (this.f278162m.f276169a && (function0 = this.f278165q) != null) {
                function0.invoke();
            }
            this.f278165q = null;
        }
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f278164p;
    }

    @Override // u8c.b
    public final void e3(dj0.d dVar, xi0.b bVar, xi0.b bVar2, Function0 onTopUpSuccess) {
        Intrinsics.checkNotNullParameter(onTopUpSuccess, "onTopUpSuccess");
        d3(new c(1));
        this.f278165q = onTopUpSuccess;
        T2(new sxe.g(6, this, dVar, bVar, bVar2, (Continuation) null), new yi5.b(27));
    }
}
