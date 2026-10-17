package w50;

import com.revolut.chat.domain.model.TranscriptDateRange;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.k1;
import vkm.j2;
import vkm.t0;
import vq5.w;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends k {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t1j.b f294665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y40.b f294666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k1 f294667n;
    public final j2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ShotDialogDisplayer$Configuration f294668p;

    public o(t1j.b transcriptInteractor, y40.b pdfViewExtension, k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(transcriptInteractor, "transcriptInteractor");
        Intrinsics.checkNotNullParameter(pdfViewExtension, "pdfViewExtension");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.f294665l = transcriptInteractor;
        this.f294666m = pdfViewExtension;
        this.f294667n = shotDialogDisplayer;
        this.o = vkm.q.c(null);
    }

    public static final void c3(o oVar, Throwable th10) {
        if (th10 instanceof CancellationException) {
            throw th10;
        }
        oVar.d3(new ShotDialogDisplayer$Configuration("shot_error_dialog", new TextLocalisedClause(R$string.common_error, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_warning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
    }

    @Override // yji.n
    public final void F2() {
        if (this.f294668p != null) {
            this.f294668p = null;
            this.f294667n.c();
        }
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        yji.n.l2(this, rd0.e.b(this.f294667n.d), null, new g(this, continuation, 1), 3);
        yji.n.l2(this, vkm.q.Q(new t0(this.o, 1), new w2a.q(continuation, this, 4)), null, new w3k.i(this, (Continuation) null, 7), 3);
    }

    @Override // w50.k
    public final void Z2(TranscriptDateRange transcriptDateRange) {
        TranscriptIdentifier transcriptIdentifier = (TranscriptIdentifier) this.o.getValue();
        if (transcriptIdentifier == null) {
            return;
        }
        V2(new w(this, transcriptIdentifier, transcriptDateRange, null, 19), new yi5.b(29));
    }

    @Override // w50.k
    public final void b3(TranscriptIdentifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        j2 j2Var = this.o;
        j2Var.getClass();
        j2Var.g(null, identifier);
    }

    public final void d3(ShotDialogDisplayer$Configuration shotDialogDisplayer$Configuration) {
        if (shotDialogDisplayer$Configuration.equals(this.f294668p)) {
            return;
        }
        ShotDialogDisplayer$Configuration shotDialogDisplayer$Configuration2 = this.f294668p;
        k1 k1Var = this.f294667n;
        if (shotDialogDisplayer$Configuration2 != null) {
            this.f294668p = null;
            k1Var.c();
        }
        this.f294668p = shotDialogDisplayer$Configuration;
        k1Var.d(shotDialogDisplayer$Configuration);
    }
}
