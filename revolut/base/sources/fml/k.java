package fml;

import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.a9;
import com.revolut.core.ui_kit.delegates.c9;
import com.revolut.core.ui_kit.delegates.d9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.common.unexpected_location.UnexpectedLocationScreenContract$InputData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnexpectedLocationScreenContract$InputData f136483a;

    public k(UnexpectedLocationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f136483a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        CompositeClause compositeClause;
        char c2;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        UnexpectedLocationScreenContract$InputData unexpectedLocationScreenContract$InputData = this.f136483a;
        ConsentChallenge.Qr.Delegated.Selection.Identity identity = unexpectedLocationScreenContract$InputData.f106465b;
        ConsentChallenge consentChallenge = unexpectedLocationScreenContract$InputData.f106464a;
        ConsentChallenge.Operation f105927g = consentChallenge.getF105927g();
        if (identity != null) {
            String str = identity.f105923c;
            String str2 = f105927g != null ? f105927g.f105908c : null;
            textLocalisedClause = str2 != null ? new TextLocalisedClause(R$string.revolut_sso_login_confirmation_subject_title, v.k(str2, str), null, 12) : new TextLocalisedClause(R$string.revolut_sso_login_confirmation_subject_login_reason_title, u.c(str), null, 12);
        } else {
            String str3 = f105927g != null ? f105927g.f105908c : null;
            textLocalisedClause = str3 != null ? new TextLocalisedClause(R$string.revolut_sso_login_confirmation_location_operation_title, u.c(str3), null, 12) : new TextLocalisedClause(R$string.revolut_sso_login_confirmation_location_title, null, null, 14);
        }
        ConsentChallenge.Device e = consentChallenge.getE();
        ConsentChallenge.Device.Location location = e.f105902c;
        if (location.f105903a != com.revolut.sso.api.models.b.PENDING_VERIFICATION) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Wrong screen configuration. Location unverified expected true, but was false", null, h0Var);
        }
        Double d = location.f105905c;
        Double d5 = location.d;
        aim.e eVarB = u.b();
        if (d != null && d5 != null) {
            d9 d9Var = new d9("LIST_ID_DEVICE_LOCATION_MAP", new a9(d.doubleValue(), d5.doubleValue()), false, new c9(null, f0.f322471a), null, null, null, false, 2036);
            yp0.b.l(d9Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(d9Var);
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("LIST_ID_DEVICE", new t0((Clause) new TextLocalisedClause(R$string.revolut_sso_login_confirmation_location_details_device_title, null, null, 14), (Image) null, 0, false, 30), new TextClause(e.f105900a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        String str4 = location.f105904b;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254);
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_warning, Integer.valueOf(R$attr.uikit_colorStatusWarning), (Float) null, (Float) null, 28);
        if (str4 != null) {
            compositeClause = new CompositeClause(v.k(new TextClause(str4, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124), imageClause), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            c2 = 1;
        } else {
            c2 = 1;
            compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.revolut_sso_login_confirmation_location_details_location_unknown, null, custom, 10), imageClause), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        CellDetailsNoteDelegate.Model model2 = new CellDetailsNoteDelegate.Model("LIST_ID_DEVICE_LOCATION", new TextLocalisedClause(R$string.revolut_sso_login_confirmation_location_details_location_title, null, null, 14), null, identity != null ? new TextLocalisedClause(R$string.revolut_sso_login_confirmation_subject_description, null, null, 14) : new TextLocalisedClause(R$string.revolut_sso_login_confirmation_location_description, null, null, 14), null, false, null, compositeClause, null, null, null, 0, 130804);
        qv0.i[] iVarArr = new qv0.i[2];
        iVarArr[0] = model;
        iVarArr[c2] = model2;
        List listK = v.k(iVarArr);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new h(textLocalisedClause, u.a(eVarB), new g(identity != null ? new TextLocalisedClause(R$string.revolut_sso_login_confirmation_subject_action_confirm, u.c(identity.f105923c), null, 12) : new TextLocalisedClause(R$string.revolut_sso_login_confirmation_location_action_confirm, null, null, 14), "TAG_LOADING_TWIN_VERTICAL_BUTTON_PRIMARY"), new g(identity != null ? new TextLocalisedClause(R$string.revolut_sso_login_confirmation_subject_action_decline, u.c(identity.f105923c), null, 12) : new TextLocalisedClause(R$string.revolut_sso_login_confirmation_location_action_decline, null, null, 14), "TAG_LOADING_TWIN_VERTICAL_BUTTON_SECONDARY"));
    }
}
