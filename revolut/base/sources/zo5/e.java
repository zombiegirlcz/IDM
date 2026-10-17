package zo5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import yo5.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSendConfirmationControllerContract$InputData f323902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f323903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f323904c;

    public e(d dVar, f fVar, CryptoSendConfirmationControllerContract$InputData cryptoSendConfirmationControllerContract$InputData) {
        this.f323903b = dVar;
        this.f323902a = cryptoSendConfirmationControllerContract$InputData;
        this.f323904c = e4m.b.b(new vzc.h(dVar, 7, fVar, this));
    }

    public final tp5.b b() {
        d dVar = this.f323903b;
        uj5.a aVarB = ((ak5.i) dVar.f).b();
        vc.s.j(aVarB);
        go5.c cVar = dVar.f323886b;
        op5.e eVarF = ((w) cVar).f();
        vc.s.j(eVarF);
        io5.b bVarA = ((w) cVar).a();
        vc.s.j(bVarA);
        ic5.a aVar = new ic5.a();
        xo5.d mapper = new xo5.d();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new tp5.b(aVarB, eVarF, bVarA, aVar, mapper);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
