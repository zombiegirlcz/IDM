package cc7;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.home.nps.R$string;
import ip0.n80;
import ip0.o80;
import ip0.q80;
import ip0.t80;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {

    @NotNull
    public static final C0142a Companion = new C0142a();

    /* JADX INFO: renamed from: cc7.a$a, reason: collision with other inner class name */
    public static final class C0142a {
        private C0142a() {
        }
    }

    public static q80 a(boolean z) {
        o oVar = o.TERRIBLE;
        n80 n80Var = new n80(oVar.b(), oVar.a());
        o80 o80Var = new o80(o.BAD.a());
        o80 o80Var2 = new o80(o.OK.a());
        o80 o80Var3 = new o80(o.GOOD.a());
        o oVar2 = o.GREAT;
        return new q80(n80Var, o80Var, o80Var2, o80Var3, new n80(oVar2.b(), oVar2.a()), z ? new TextLocalisedClause(R$string.revolut_nps_widget_button_title, null, null, 14) : null);
    }

    public final y b(d detailedSurveyState) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(detailedSurveyState, "detailedSurveyState");
        ArrayList arrayList = new ArrayList();
        n nVar = o.Companion;
        q80 q80VarA = a(false);
        zb7.g gVar = detailedSurveyState.f22944a;
        zb7.c cVar = gVar.f320840c;
        String strQ = null;
        if (cVar != null) {
            nVar.getClass();
            numValueOf = Integer.valueOf(n.a(cVar));
        } else {
            numValueOf = null;
        }
        t80 t80Var = new t80("NPS_DETAILS_RATING_BAR_ID", null, q80VarA, numValueOf, false, null, 994);
        yp0.b.l(t80Var, 0, R$attr.uikit_dp8, 0, 0, null, false, 61);
        arrayList.add(t80Var);
        arrayList.add(new ListSubheaderDelegate.Model("NPS_CATEGORIES_SUB_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_nps_details_categories_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338));
        mx0.l lVar = mx0.l.FLEXBOX;
        ArrayList<zb7.a> arrayList2 = gVar.e;
        zb7.f fVar = gVar.f320839b;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (zb7.a aVar : arrayList2) {
            boolean zContains = detailedSurveyState.f22945b.contains(aVar);
            arrayList3.add(new ActionsView.Item(aVar.f320831a, zContains ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, null, null, new TextClause(aVar.f320832b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, aVar, null, 24476));
        }
        arrayList.add(new z("NPS_ACTIONS_LIST_ID", arrayList3, null, lVar, 0, 0, 116));
        InputTextDelegate.Model model = new InputTextDelegate.Model("NPS_INPUT_TEXT_ID", new TextClause(detailedSurveyState.f22946c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.revolut_nps_details_custom_note_placeholder, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, R$attr.uikit_dp24, R$attr.uikit_dp16, 0, 0, 12);
        arrayList.add(model);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("NPS_SEND_ACTION_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.revolut_nps_details_button_title, null, null, 14), false, null, null, 0, R$attr.uikit_dp16, 0, 0, 7152);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        arrayList.add(model2);
        t tVar = new t(new TextClause(gVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30);
        rp0.l lVar2 = rp0.l.WINDOW;
        if (b.f22943a[fVar.ordinal()] != 1) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            strQ = j6.a.q("SURVEY_DETAILS_DIALOG_", fVar.a());
        }
        return new y(arrayList, tVar, lVar2, null, "SURVEY_DETAILS_DIALOG", null, strQ, null, null, null, 3768);
    }
}
