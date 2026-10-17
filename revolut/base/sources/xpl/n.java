package xpl;

import android.os.Parcelable;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.login.RevolutSsoApi$Toggles;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tll.r;
import xl9.p;
import xl9.q;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jpl.f f308021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rqk.k f308022b;

    public n(jpl.f connectedAppsListItemsMapper, r revolutAccountsUiFactory, rqk.k revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(connectedAppsListItemsMapper, "connectedAppsListItemsMapper");
        Intrinsics.checkNotNullParameter(revolutAccountsUiFactory, "revolutAccountsUiFactory");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        this.f308021a = connectedAppsListItemsMapper;
        this.f308022b = revolutSsoDependenciesProvider;
    }

    public static tf a() {
        yy0.i iVar = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        return new tf(yy0.i.a(resourceImage));
    }

    public static RowDelegate.Model.MainImage.Image40 b(int i) {
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 8.0f, null, null, 48), null, null, false, null, false, 60);
    }

    public static ListSubheaderDelegate.Model d() {
        return new ListSubheaderDelegate.Model("HEADER_REVOLUT_ACCOUNTS", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_accounts_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        aim.e eVarB2 = u.b();
        eVarB2.add(new RowDelegate.Model("PERSONAL_DETAILS", b(R$drawable.uikit_icn_24_person), new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_personal_details_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_personal_details_subtitle, null, null, 14), null, null, 0, a(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        if (((jte.d) this.f308022b.f).c(RevolutSsoApi$Toggles.SsoRevolutIdDocuments.f105883c)) {
            eVarB2.add(new RowDelegate.Model("IDENTITY_DOCUMENTS", b(R$drawable.uikit_icn_24_national_id), new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_identity_documents_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_identity_documents_subtitle, null, null, 14), null, null, 0, a(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        }
        eVarB2.add(new RowDelegate.Model("SIGN_IN_&_PASSCODE", b(R$drawable.uikit_icn_24_key), new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_sign_in_methods_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_sign_in_methods_subtitle, null, null, 14), null, null, 0, a(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        iii.c.f(domainState.f308011a, new p(eVarB, this), new xif.k(eVarB, this), new q(eVarB, this));
        Data connectedAppsData = domainState.f308012b;
        Intrinsics.checkNotNullParameter(connectedAppsData, "connectedAppsData");
        jpl.f fVar = this.f308021a;
        eVarB.addAll((List) iii.c.f(connectedAppsData, new jpl.e(fVar, 0), new jme.f(fVar, 11), new jb8.b(fVar, 16)));
        return new j(u.a(eVarB));
    }
}
