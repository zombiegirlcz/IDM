package epl;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.ConsentedClient;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.ConnectedAppDetailsScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectedAppDetailsScreenContract$InputData f128212a;

    public k(ConnectedAppDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f128212a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listA;
        int i;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ConnectedAppDetailsScreenContract$InputData connectedAppDetailsScreenContract$InputData = this.f128212a;
        TextClause textClause = new TextClause(connectedAppDetailsScreenContract$InputData.f106722a.f105929b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_connected_apps_details_subtitle, null, null, 14);
        ConsentedClient consentedClient = connectedAppDetailsScreenContract$InputData.f106722a;
        boolean z = false;
        String str = "REVOKE_ACCESS";
        boolean z3 = false;
        e4 e4Var = null;
        f fVar = new f(textClause, textLocalisedClause, new UrlImage(consentedClient.f, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), null, null, false, false, 507902), u.c(new ActionsView.Item(str, mx0.d.NEGATIVE, z3, e4Var, null, new TextLocalisedClause(R$string.revolut_sso_connected_apps_details_revoke, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)));
        ArrayList arrayList = consentedClient.f105930c;
        ArrayList<ConsentedClient.Consent> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ConsentedClient.Consent) obj2).f105931a) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (ConsentedClient.Consent consent : arrayList2) {
            ArrayList<ConsentedClient.Consent.Claim> arrayList4 = consent.d;
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
            for (ConsentedClient.Consent.Claim claim : arrayList4) {
                String str2 = "CLAIM_" + consent.f105932b + "_" + claim.f105934a;
                switch (j.f128211a[claim.f105934a.ordinal()]) {
                    case 1:
                        i = R$drawable.uikit_icn_24_utilities;
                        break;
                    case 2:
                        i = R$drawable.uikit_icn_24_cake;
                        break;
                    case 3:
                        i = R$drawable.uikit_icn_24_flag;
                        break;
                    case 4:
                        i = R$drawable.uikit_icn_24_envelope;
                        break;
                    case 5:
                        i = R$drawable.uikit_icn_24_profile;
                        break;
                    case 6:
                        i = R$drawable.uikit_icn_24_call;
                        break;
                    case 7:
                        i = R$drawable.uikit_icn_24_info;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList5.add(new RowDelegate.Model(str2, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextClause(claim.f105935b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
            }
            a0.x(arrayList5, arrayList3);
        }
        if (arrayList3.isEmpty()) {
            listA = f0.f322471a;
        } else {
            aim.e eVarB = u.b();
            eVarB.add(new ListSubheaderDelegate.Model("SUBHEADER_CONSENTS", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_sso_connected_apps_content_header_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_sso_connected_apps_content_header_subtitle, u.c(new TimeClause(consentedClient.d.toEpochMilli(), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514));
            yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList3);
            listA = u.a(eVarB);
        }
        return new g(fVar, listA);
    }
}
