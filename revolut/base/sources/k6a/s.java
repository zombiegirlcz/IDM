package k6a;

import cli.y;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentControllerContract$InputData;
import k3k.q0;
import k50.a4;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends oki.h implements k {

    @NotNull
    public static final o Companion = new o();
    public final CardsPaymentControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7.d f181670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ha3.f f181671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l93.f f181672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c70.a f181673s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r70.c f181674t;
    public final vii.b u;
    public final y v;

    public s(CardsPaymentControllerContract$InputData inputData, o7.d cardsProvider, ha3.f cardsConfigInteractor, l93.f revolutCardsInteractor, c70.a clipboard, r70.c hapticEngine, u statesMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsProvider, "cardsProvider");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(statesMapper, "statesMapper");
        this.o = inputData;
        this.f181670p = cardsProvider;
        this.f181671q = cardsConfigInteractor;
        this.f181672r = revolutCardsInteractor;
        this.f181673s = clipboard;
        this.f181674t = hapticEngine;
        this.u = new vii.b();
        this.v = mra.d.b(this, new j(inputData.f80282b, CertificateBody.profileType), statesMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.u, new jy6.l(continuation, this, 10)), null, null, new jv.o(this, continuation, 20), 3);
    }

    public final void I2() {
        y yVar = this.v;
        j jVar = (j) ((j2) yVar.f22677a).getValue();
        if (jVar.d != null) {
            H2(yVar, new a4(21));
            return;
        }
        String str = jVar.f181657c;
        if (str == null) {
            return;
        }
        l2(new q0(this, str, null, 17), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        y yVar = this.v;
        if (((j) ((j2) yVar.f22677a).getValue()).f181658g) {
            H2(yVar, new a4(22));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
