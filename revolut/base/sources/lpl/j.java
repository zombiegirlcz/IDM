package lpl;

import android.os.Parcelable;
import aw0.o9;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.OAuthUserInfo;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.ConnectedClientScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectedClientScreenContract$InputData f199155a;

    public j(ConnectedClientScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f199155a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ConnectedClientScreenContract$InputData connectedClientScreenContract$InputData = this.f199155a;
        f fVar = new f(new TextClause(connectedClientScreenContract$InputData.f106732a.f105949b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UrlImage(connectedClientScreenContract$InputData.f106732a.f105950c, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090));
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_oauth_connected_client_end_date, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        OAuthUserInfo.Connection connection = connectedClientScreenContract$InputData.f106733b;
        RowDelegate.Model model = new RowDelegate.Model("CONNECTED_CLIENT_EXPIRATION_LIST_ID", null, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TimeClause(connection.f105955c, TimeClause.Format.DateLong.f57962b, null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        ArrayList<OAuthUserInfo.Scope> arrayList = connection.f105954b;
        if (!arrayList.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("CONNECTED_CLIENT_PERMISSIONS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_oauth_connected_client_permissions, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp16, R$attr.uikit_dp4, 0, 0, 53242));
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (OAuthUserInfo.Scope scope : arrayList) {
                arrayList2.add(new RowDelegate.Model(j6.a.q("CONNECTED_CLIENT_PERMISSION_LIST_ID_", scope.f105956a), null, new TextClause(scope.f105957b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList2);
        }
        RowDelegate.Model model2 = new RowDelegate.Model("CONNECTED_CLIENT_DISCONNECT_LIST_ID", null, new TextLocalisedClause(R$string.revolut_oauth_connected_client_disconnect, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868858);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        return new g(fVar, u.a(eVarB));
    }
}
