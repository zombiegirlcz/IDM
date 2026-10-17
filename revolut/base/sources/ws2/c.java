package ws2;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import d9.t0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu.g f299647a;

    public c(vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f299647a = resourceProvider;
    }

    public static LayeredImage b(ru.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof ru.c) {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i = R$drawable.uikit_icn_16_status_clock_arrows;
            int i2 = R$attr.uikit_colorWidgetBackground;
            return LayeredImage.Companion.f(companion, i, R$attr.uikit_colorStatusWarning, i2, Integer.valueOf(i2), 4.0f, 4.0f, null, 64);
        }
        if (state instanceof ru.h) {
            LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
            int i3 = R$drawable.uikit_icn_16_status_clock_arrows;
            int i5 = R$attr.uikit_colorWidgetBackground;
            return LayeredImage.Companion.f(companion2, i3, R$attr.uikit_colorAccent, i5, Integer.valueOf(i5), 4.0f, 4.0f, null, 64);
        }
        if ((state instanceof ru.d) || (state instanceof ru.f)) {
            LayeredImage.Companion companion3 = LayeredImage.INSTANCE;
            int i6 = R$drawable.uikit_icn_16_canceled;
            int i21 = R$attr.uikit_colorWidgetBackground;
            return LayeredImage.Companion.f(companion3, i6, R$attr.uikit_colorGreyTone50, i21, Integer.valueOf(i21), 4.0f, 4.0f, null, 64);
        }
        if (state instanceof ru.e) {
            return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_revolut, R$attr.uikit_colorBlack, R$attr.uikit_colorWidgetBackground, Integer.valueOf(R$attr.uikit_colorWhite), 4.0f, 4.0f, null, 64);
        }
        if (!(state instanceof ru.g)) {
            throw new NoWhenBranchMatchedException();
        }
        LayeredImage.Companion companion4 = LayeredImage.INSTANCE;
        int i22 = R$drawable.uikit_icn_16_check;
        int i32 = R$attr.uikit_colorWidgetBackground;
        return LayeredImage.Companion.f(companion4, i22, R$attr.uikit_colorStatusSuccess, i32, Integer.valueOf(i32), 4.0f, 4.0f, null, 64);
    }

    public final Image a(ru.a invitee) {
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        String str = invitee.f257352c;
        return str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, invitee.f257351b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), false, null, null, null, false, false, 523262) : new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, invitee.f257351b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
    }

    public final ProgressStyle c(ru.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof ru.c) {
            return ProgressStyle.Companion.c(ProgressStyle.INSTANCE, ((ru.c) state).f257356a, R$attr.uikit_colorAccent);
        }
        if (state instanceof ru.h) {
            return ProgressStyle.Companion.c(ProgressStyle.INSTANCE, ((ru.h) state).f257366c, R$attr.uikit_colorAccent);
        }
        return null;
    }

    public final TextLocalisedClause d(ru.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z = state instanceof ru.c;
        vu.g gVar = this.f299647a;
        if (z) {
            return new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_active_campaign_active_invitees_cell_status_in_progress), null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
        }
        if (state instanceof ru.h) {
            return new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_active_campaign_active_invitees_cell_status_processing), null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        }
        if (state instanceof ru.d) {
            return new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_active_campaign_inactive_invitees_cell_status_deadline_missed), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        if (state instanceof ru.e) {
            return null;
        }
        if (state instanceof ru.g) {
            return new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_active_campaign_active_invitees_cell_status_completed), null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), 10);
        }
        if (!(state instanceof ru.f)) {
            throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_active_campaign_inactive_invitees_cell_status_not_eligible), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
    }

    public final List e(List invitees) {
        List listC;
        Intrinsics.checkNotNullParameter(invitees, "invitees");
        boolean zIsEmpty = invitees.isEmpty();
        vu.g gVar = this.f299647a;
        if (zIsEmpty) {
            n5j.b bVar = (n5j.b) gVar;
            listC = u.c(new RowDelegate.Model("ACTIVE_INVITEES_LIST_ID", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D194", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(bVar.b(vu.f.business_referrals_active_campaign_active_invitees_section_empty_cell_title), null, null, 14), null, 0, new TextLocalisedClause(bVar.b(vu.f.business_referrals_active_campaign_active_invitees_section_empty_cell_subtitle), null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        } else {
            List<ru.a> list = invitees;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (ru.a aVar : list) {
                String str = aVar.f257350a;
                ru.i iVar = aVar.d;
                arrayList.add(new RowDelegate.Model(j6.a.q("ACTIVE_INVITEES_LIST_ID", str), new RowDelegate.Model.MainImage.Image40(a(aVar), b(iVar), c(iVar), false, 24), t0.G(new TextClause(aVar.f257351b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((n5j.b) gVar).b(vu.f.referrals_actions_item)), null, 0, d(iVar), null, null, 0, iVar instanceof ru.g ? new RowDelegate.Model.c.b(new MoneyClause(((ru.g) iVar).f257363a, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), null, 8), null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532675544));
            }
            listC = arrayList;
        }
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public final ArrayList f() {
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("ACTIVE_INVITEES_LOADING_LIST_ID_", it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
