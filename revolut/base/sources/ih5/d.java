package ih5;

import aw0.m6;
import aw0.n6;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import com.revolut.retail.common.ui.R$string;
import ieg.y;
import igh.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements n {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoBalanceBreakdownInputData f161294a;

    public d(CryptoBalanceBreakdownInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161294a = inputData;
    }

    public static CellDetailsDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, dj0.d dVar, eh5.a aVar, TextLocalisedClause textLocalisedClause2) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), aVar != null ? new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254) : null, null, 8), null, aVar, null, null, 0, aVar != null ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, textLocalisedClause2, LDSFile.EF_DG4_TAG) : null, aVar != null, false, null, null, 29624);
    }

    public static /* synthetic */ CellDetailsDelegate.Model b(String str, TextLocalisedClause textLocalisedClause, dj0.d dVar, eh5.a aVar, int i) {
        if ((i & 8) != 0) {
            aVar = null;
        }
        return a(str, textLocalisedClause, dVar, aVar, null);
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "LOCKED_BALANCE_BREAKDOWN_DISMISS", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55), (List) iii.c.f(domainState.f161293a, new k(this, 7), new y(16), new igh.o(this, this.f161294a.f70874c, 3)), new lw0.a(new TextLocalisedClause(com.revolut.feature.crypto.locked.balance.impl.R$string.crypto_pocket_details_balance_breakdown_title, null, null, 14), null, null, null, false, 30));
    }
}
