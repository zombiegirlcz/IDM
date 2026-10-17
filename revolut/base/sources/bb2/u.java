package bb2;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.payid.api.R$string;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ListSubheaderDelegate.Model a(int i, String str) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i2 = R$attr.uikit_dp16;
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i2, i2, i2, i2, 4090);
    }

    public static RowDelegate.Model b(String str, int i, int i2, Alias alias) {
        CircleBadgeModel dangerCircleBadge;
        Clause textClause;
        RowDelegate.Model.b bVar;
        pf pfVar;
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 12.0f, null, null, 48);
        AliasStatus aliasStatus = alias.f61880c;
        AliasStatus.AVAILABLE available = AliasStatus.AVAILABLE.f61886b;
        if (Intrinsics.f(aliasStatus, available)) {
            dangerCircleBadge = new WhiteCircleBadge(dw0.a.Checked);
        } else {
            if (!(aliasStatus instanceof AliasStatus.OCCUPIED)) {
                throw new IllegalStateException("Unsupported alias status!");
            }
            dangerCircleBadge = new DangerCircleBadge(dw0.a.Error);
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(layeredImageB, dangerCircleBadge, null, false, null, false, 60);
        TextClause textClause2 = new TextClause(alias.f61879b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i3 = R$string.pay_id_details_subtitle;
        Clause[] clauseArr = new Clause[2];
        clauseArr[0] = new TextLocalisedClause(i2, null, null, 14);
        if (Intrinsics.f(aliasStatus, available)) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_available, null, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 10);
        } else if (aliasStatus instanceof AliasStatus.OCCUPIED) {
            String str2 = ((AliasStatus.OCCUPIED) aliasStatus).f61889b;
            textClause = str2 != null ? new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_occupied_with_bank, zhm.u.c(str2), null, 12) : new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_occupied, null, null, 14);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Unsupported alias status!");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        clauseArr[1] = textClause;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i3, zhm.v.k(clauseArr), null, 12);
        if (Intrinsics.f(aliasStatus, available)) {
            bVar = RowDelegate.Model.b.c.f53268a;
        } else {
            if (!(aliasStatus instanceof AliasStatus.OCCUPIED)) {
                throw new IllegalStateException("Unsupported alias status!");
            }
            bVar = RowDelegate.Model.b.a.f53266a;
        }
        RowDelegate.Model.b bVar2 = bVar;
        if (Intrinsics.f(aliasStatus, available)) {
            pfVar = new pf(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_available_action_add, null, null, 14), null, null, false, null, null, 510);
        } else {
            if (!(aliasStatus instanceof AliasStatus.OCCUPIED)) {
                throw new IllegalStateException("Unsupported alias status!");
            }
            pfVar = null;
        }
        return new RowDelegate.Model(str, image40, textClause2, null, 0, textLocalisedClause, null, null, 0, pfVar, false, null, false, bVar2, null, null, null, null, null, alias, null, 0, 0, 0, 0, 532657112);
    }

    public static RowDelegate.Model d(String str, int i, int i2, Alias alias) {
        Clause textClause;
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 12.0f, null, null, 48);
        AliasStatus aliasStatus = alias.f61880c;
        AliasStatus.DISABLED disabled = AliasStatus.DISABLED.f61888b;
        boolean zF = Intrinsics.f(aliasStatus, disabled);
        AliasStatus.BLOCKED blocked = AliasStatus.BLOCKED.f61887b;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(layeredImageB, zF ? new DangerCircleBadge(dw0.a.Frozen) : Intrinsics.f(aliasStatus, blocked) ? new DangerCircleBadge(dw0.a.Error) : null, null, false, null, false, 60);
        TextClause textClause2 = new TextClause(alias.f61879b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i3 = R$string.pay_id_details_subtitle;
        Clause[] clauseArr = new Clause[2];
        clauseArr[0] = new TextLocalisedClause(i2, null, null, 14);
        if (Intrinsics.f(aliasStatus, AliasStatus.ACTIVE.f61885b)) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_active, null, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 10);
        } else if (Intrinsics.f(aliasStatus, disabled)) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_disabled, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
        } else if (Intrinsics.f(aliasStatus, blocked)) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_blocked, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Unsupported alias status!");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        clauseArr[1] = textClause;
        return new RowDelegate.Model(str, image40, textClause2, null, 0, new TextLocalisedClause(i3, zhm.v.k(clauseArr), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, alias, null, 0, 0, 0, 0, 532676568);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        Data data = domainState.f14145a;
        ListSubheaderDelegate.Model modelA = a(R$string.payid_settings_section_registered, "LIST_ID_REGISTERED_ALIASES_HEADER");
        List list = (List) iii.c.f(data, new b96.a(19), new t(0), new b0c.a(this, 6));
        yp0.b.k(list, 0, 0, 0, 0, 31);
        zhm.a0.x(ue0.e.J(modelA, list), eVarB);
        Data data2 = domainState.f14146b;
        aim.e eVarB2 = zhm.u.b();
        List list2 = (List) iii.c.f(data2, new b96.a(20), new t(1), new b0c.a(this, 7));
        yp0.b.k(list2, 0, 0, 0, 0, 31);
        if (!list2.isEmpty()) {
            eVarB2.add(a(R$string.payid_settings_section_others, "LIST_ID_OTHER_ALIASES_HEADER"));
            zhm.a0.x(list2, eVarB2);
        }
        zhm.a0.x(zhm.u.a(eVarB2), eVarB);
        return new s(zhm.u.a(eVarB));
    }
}
