package o5g;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin_details.TravelFlightsCheckInDetailsScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements f {

    @NotNull
    private static final h Companion = new h();
    public final b4g.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f222434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f222435q;

    public i(j stateMapper, TravelFlightsCheckInDetailsScreenContract$InputData inputData, b4g.f repository, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.o = repository;
        this.f222434p = clipboard;
        this.f222435q = mra.d.b(this, new e(new Data(null, null, true, 3, null), inputData.f93293a, inputData.f93294b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.a(((e) ((j2) this.f222435q.f22677a).getValue()).f222429a, w4l.h.f294642c), null, null, new nwc.f(this, null, 24), 3);
    }

    public final void I2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "CHECK_IN_DETAILS_REFERENCE") || Intrinsics.f(model.f53228a, "CHECK_IN_DETAILS_EMAIL")) {
            Object obj2 = model.u;
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                return;
            }
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            nsh.e eVar = new nsh.e(ref$BooleanRef, this, 20);
            c70.a aVar = this.f222434p;
            aVar.c(null, str, false, eVar);
            aVar.getClass();
            if (!c70.a.g() || ref$BooleanRef.f186407a) {
                return;
            }
            J2();
        }
    }

    public final void J2() {
        X1(new mii.f("CHECK_IN_DETAILS_COPIED_DIALOG", new TextLocalisedClause(R$string.travel_flights_booking_details_check_in_segment_details_copied_to_clipboard, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, LDSFile.EF_DG12_TAG));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f222435q;
    }
}
