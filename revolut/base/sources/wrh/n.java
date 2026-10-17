package wrh;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.web_sign_in.navigation.WebSignInDestinationInput;
import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreenContract$InputData;
import com.revolut.sso.api.R$string;
import ip0.y10;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xjl.s;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements p {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prh.g f299592a;

    public n(s webSignInUiFactory, WebSignInDestinationInput input) {
        urh.a type;
        Intrinsics.checkNotNullParameter(webSignInUiFactory, "webSignInUiFactory");
        Intrinsics.checkNotNullParameter(input, "input");
        WebSignInDestinationInput.LaunchMode launchMode = input.f96326a;
        WebSignInDestinationInput.LaunchMode.Confirm confirm = launchMode instanceof WebSignInDestinationInput.LaunchMode.Confirm ? (WebSignInDestinationInput.LaunchMode.Confirm) launchMode : null;
        Intrinsics.checkNotNullParameter((confirm == null || (type = confirm.f96328b) == null) ? urh.a.SIGNIN_3FA : type, "type");
        this.f299592a = new prh.g(new TextLocalisedClause(R$string.revolut_sso_login_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_confirmation_about_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_confirmation_about_description, null, null, 14), v.k(new prh.e(new TextLocalisedClause(R$string.revolut_sso_login_confirmation_where, null, null, 14)), new prh.c(new TextLocalisedClause(R$string.revolut_sso_login_confirmation_browser, null, null, 14)), new prh.d(new TextLocalisedClause(R$string.revolut_sso_login_confirmation_ip, null, null, 14))), new prh.b(prh.a.HORIZONTAL, new TextLocalisedClause(R$string.revolut_sso_login_confirmation_authorise, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_confirmation_reject, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246)));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        h hVar;
        CellDetailsDelegate.Model model;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        long j2 = domainState.f299581a;
        WebSignInConfirmationScreenContract$InputData webSignInConfirmationScreenContract$InputData = domainState.f299582b;
        long j3 = webSignInConfirmationScreenContract$InputData.e;
        prh.g gVar = this.f299592a;
        TextLocalisedClause textLocalisedClause = gVar.f239022a;
        prh.b bVar = gVar.e;
        arrayList.add(new np0.b("TIMER", j2, j3, textLocalisedClause));
        sa saVar = new sa("TITLE", (Clause) gVar.f239023b, (Clause) gVar.f239024c, (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        arrayList.add(saVar);
        List<prh.f> list = gVar.d;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (prh.f fVar : list) {
            if (fVar instanceof prh.c) {
                model = new CellDetailsDelegate.Model("DEVICE", new t0((Clause) ((prh.c) fVar).f239019a, (Image) null, 0, false, 30), new TextClause(webSignInConfirmationScreenContract$InputData.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
            } else if (fVar instanceof prh.d) {
                model = new CellDetailsDelegate.Model("IP", new t0((Clause) ((prh.d) fVar).f239020a, (Image) null, 0, false, 30), new TextClause(webSignInConfirmationScreenContract$InputData.f96344b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
            } else {
                if (!(fVar instanceof prh.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (webSignInConfirmationScreenContract$InputData.f96343a == null) {
                    throw new IllegalArgumentException("Where is missing for location");
                }
                model = new CellDetailsDelegate.Model("LOCATION", new t0((Clause) ((prh.e) fVar).f239021a, (Image) null, 0, false, 30), new TextClause(webSignInConfirmationScreenContract$InputData.f96343a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
            }
            arrayList2.add(model);
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        arrayList.addAll(arrayList2);
        int i = m.f299591a[bVar.f239016a.ordinal()];
        if (i == 1) {
            hVar = h.HORIZONTAL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = h.VERTICAL;
        }
        return new j(arrayList, new i(hVar, bVar.f239017b, bVar.f239018c, bVar.d, bVar.e));
    }
}
