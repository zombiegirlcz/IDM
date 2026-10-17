package maa;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends oki.h implements dli.b {

    @NotNull
    public static final n Companion = new n();
    public final jpc.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f203990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oaa.b f203991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s8a.n f203992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f203993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f203994t;

    public s(bof.r mapper, jpc.e pixAddTrustedAccountInteractor, j60.a bottomExpandableDialog, oaa.b pixAddTrustedAccountDialogFactory, s8a.n trustedBeneficiariesInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(pixAddTrustedAccountInteractor, "pixAddTrustedAccountInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(pixAddTrustedAccountDialogFactory, "pixAddTrustedAccountDialogFactory");
        Intrinsics.checkNotNullParameter(trustedBeneficiariesInteractor, "trustedBeneficiariesInteractor");
        this.o = pixAddTrustedAccountInteractor;
        this.f203990p = bottomExpandableDialog;
        this.f203991q = pixAddTrustedAccountDialogFactory;
        this.f203992r = trustedBeneficiariesInteractor;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(null);
        this.f203993s = z1VarB;
        this.f203994t = mra.d.b(this, new j(0), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.q(vkm.q.Q(t1.g(this.f203993s, 200L), new li2.f(continuation, this, 25))), null, null, new m75.i(this, continuation, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f203994t;
    }
}
