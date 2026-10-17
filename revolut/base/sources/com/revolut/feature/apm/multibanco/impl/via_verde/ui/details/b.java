package com.revolut.feature.apm.multibanco.impl.via_verde.ui.details;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreenContract$Action;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.EnrollmentLabelScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.EnrollmentLabelScreenContract$InputData;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.kompot.common.ModalDestination;
import h92.f;
import ha3.x;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.e;
import vkm.j2;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements f {

    @NotNull
    public static final h92.h Companion = new h92.h();
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f62650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f62651q;

    public b(l93.f cardsInteractor, c70.a clipboard, EnrollmentDetailsScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = cardsInteractor;
        this.f62650p = clipboard;
        this.f62651q = d.b(this, new h92.d(inputData.f62648a, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, e.b(((x) this.o).v(((h92.d) ((j2) this.f62651q.f22677a).getValue()).f150085a.f62643b)), null, null, new gul.n(this, null, 25), 3);
    }

    public final void I2(Object obj2) {
        if (!(obj2 instanceof EnrollmentDetailsScreenContract$Action)) {
            if (obj2 instanceof n93.b) {
                C1(new com.revolut.kompot.common.b(e1(new o63.d(new CardScreenAction.Select(((n93.b) obj2).f213547a, 6, false, false), 15)), (ModalDestination.Style) null, 6));
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "Unknown ViaVerdeDetails parcel: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        EnrollmentDetailsScreenContract$Action enrollmentDetailsScreenContract$Action = (EnrollmentDetailsScreenContract$Action) obj2;
        boolean zEquals = enrollmentDetailsScreenContract$Action.equals(EnrollmentDetailsScreenContract$Action.Edit.f62647a);
        y yVar = this.f62651q;
        if (zEquals) {
            EnrollmentLabelScreen enrollmentLabelScreen = new EnrollmentLabelScreen(new EnrollmentLabelScreenContract$InputData(((h92.d) ((j2) yVar.f22677a).getValue()).f150085a));
            h56.a block = new h56.a(this, 10);
            Intrinsics.checkNotNullParameter(block, "block");
            enrollmentLabelScreen.H = block;
            C1(new com.revolut.kompot.common.b(enrollmentLabelScreen, (ModalDestination.Style) null, 6));
            return;
        }
        boolean zEquals2 = enrollmentDetailsScreenContract$Action.equals(EnrollmentDetailsScreenContract$Action.CopyIdentifier.f62645a);
        c70.a aVar = this.f62650p;
        if (zEquals2) {
            aVar.c(null, ((h92.d) ((j2) yVar.f22677a).getValue()).f150085a.f62644c, false, new h1g.a(this, 7));
        } else {
            if (!enrollmentDetailsScreenContract$Action.equals(EnrollmentDetailsScreenContract$Action.CopyReference.f62646a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.c(null, ((h92.d) ((j2) yVar.f22677a).getValue()).f150085a.d, false, new h1g.a(this, 7));
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f62651q;
    }
}
