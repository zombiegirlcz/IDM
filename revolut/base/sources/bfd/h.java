package bfd;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import ix0.d0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        int i2;
        int i3;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i5 = 14;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.shared_alerts_create_alert_select_type_title, null, null, 14), null, null, null, false, 30);
        EnumEntries<mgd.f> enumEntriesA = mgd.f.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (mgd.f fVar : enumEntriesA) {
            boolean z = domainState.f14961a == fVar;
            String strQ = j6.a.q("LIST_ID_ALERT_TYPE_", fVar.name());
            int[] iArr = i.f14967a;
            int i6 = iArr[fVar.ordinal()];
            if (i6 == 1) {
                i = R$string.shared_alerts_create_alert_select_type_target_price_title;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.shared_alerts_create_alert_select_type_price_change_title;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, i5);
            xi0.b bVar = domainState.f14962b;
            int i21 = iArr[fVar.ordinal()];
            if (i21 == 1) {
                i2 = R$string.shared_alerts_create_alert_select_type_target_price_subtitle;
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.shared_alerts_create_alert_select_type_price_change_subtitle;
            }
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, u.c(d0.a(bVar, null)), null, 12);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i22 = iArr[fVar.ordinal()];
            if (i22 == 1) {
                i3 = R$drawable.uikit_icn_24_market_order;
            } else {
                if (i22 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R$drawable.uikit_icn_24_percent;
            }
            arrayList.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, i3, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, Float.valueOf(24.0f), null, 32), z ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, z, null, null, null, null, null, null, fVar, null, 0, 0, 0, 0, 532668376));
            i5 = 14;
        }
        yp0.b.k(arrayList, R$attr.uikit_dp0, 0, 0, 0, 30);
        return new f(arrayList, aVar);
    }
}
