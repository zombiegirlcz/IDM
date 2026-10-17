package jpl;

import android.os.Parcelable;
import aw0.o9;
import cjl.h;
import cjl.i;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.ConsentedClient;
import com.revolut.sso.api.models.OAuthUserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yy0.l;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aim.e a(List list) {
        RowDelegate.Model model;
        aim.e eVarB = u.b();
        if (!list.isEmpty()) {
            eVarB.add(b());
            List<i> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (i iVar : list2) {
                if (iVar instanceof h) {
                    ConsentedClient consentedClient = ((h) iVar).f24713a;
                    String strQ = j6.a.q("CONNECTED_APP_", consentedClient.f105928a);
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(consentedClient.f, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 60);
                    TextClause textClause = new TextClause(consentedClient.f105929b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_connected_apps_last_used, u.c(new TimeClause(consentedClient.e.toEpochMilli(), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12);
                    yy0.i iVar2 = l.Companion;
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    iVar2.getClass();
                    model = new RowDelegate.Model(strQ, image40, textClause, null, 0, textLocalisedClause, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, iVar, null, 0, 0, 0, 0, 532675544);
                } else {
                    if (!(iVar instanceof com.revolut.sso.api.models.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.sso.api.models.a aVar = (com.revolut.sso.api.models.a) iVar;
                    OAuthUserInfo.Client client = aVar.f106006a;
                    String strQ2 = j6.a.q("CONNECTED_OAUTH_APP_", client.f105948a);
                    RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(new UrlImage(client.f105950c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 60);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_sso_connected_app_cell_oauth_name, u.c(client.f105949b), null, 12);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.revolut_sso_connected_app_cell_oauth_expiration, u.c(new TimeClause(aVar.f106007b.f105955c, new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12);
                    yy0.i iVar3 = l.Companion;
                    ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    iVar3.getClass();
                    model = new RowDelegate.Model(strQ2, image402, textLocalisedClause2, null, 0, textLocalisedClause3, null, null, 0, new tf(yy0.i.a(resourceImage2)), false, null, false, null, null, null, null, null, null, iVar, null, 0, 0, 0, 0, 532675544);
                }
                arrayList.add(model);
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList);
        }
        return u.a(eVarB);
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("SECTION_CONNECTED_APPS", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_connected_apps_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
