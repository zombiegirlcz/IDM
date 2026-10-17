package z78;

import android.os.Parcelable;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.models.AvatarByUserIdImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import ip0.ae0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mx0.i1;
import qv0.i;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f319949a;

    public h(e input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f319949a = input;
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        Collection collectionK;
        Integer num;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVar = this.f319949a;
        List list = eVar.f319946a;
        i1 i1Var = null;
        if (list.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("We cannot show this screen on empty input::profilesWithWalletId");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.junior_currency_account_child_selector_title, null, null, 14), new TextLocalisedClause(R$string.junior_currency_account_child_selector_subtitle, null, null, 14), null, null, false, 28);
        s0 s0Var = new s0(2);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_currency_account_child_selector_add_child_title, null, null, 14);
        Integer num2 = eVar.f319947b;
        RowDelegate.Model model = new RowDelegate.Model("LIST_ID_CREATE_NEW_ACCOUNT", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_add_contact, new Color.Solid(R$attr.uikit_colorAccentNeutral), new Color.Solid(R$attr.uikit_colorAccentNeutral_10)), null, null, false, null, false, 62), textLocalisedClause, null, 0, (num2 == null || (num = eVar.f319948c) == null) ? null : new TextLocalisedClause(R$string.junior_currency_account_child_selector_add_child_subtitle, v.k(num2, num), null, 12), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, d.f319945a, null, 0, 0, 0, 0, 532673496);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model);
        if (list.isEmpty()) {
            collectionK = f0.f322471a;
            i = 0;
        } else {
            s0 s0Var2 = new s0(3);
            ae0 ae0Var = new ae0(new TextLocalisedClause(R$string.junior_currency_account_child_selector_separator_text, null, null, 14), "LIST_ID_SEPARATOR");
            int i2 = R$attr.uikit_dp32;
            yp0.b.r(ae0Var, 0, 0, i2, i2, 3);
            s0Var2.a(ae0Var);
            s0Var2.a(new ListSubheaderDelegate.Model("LIST_ID_JUNIOR_PROFILES_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_currency_account_child_selector_children_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            List<t68.f> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (t68.f fVar : list2) {
                JuniorBankingProfile juniorBankingProfile = fVar.f268267a;
                RowDelegate.Model model2 = new RowDelegate.Model(j6.a.q("LIST_ID_JUNIOR_PROFILE_", juniorBankingProfile.f77103j), new RowDelegate.Model.MainImage.Avatar(new AvatarModel.Default(new AvatarByUserIdImage(juniorBankingProfile.f77103j, ta6.a.t(juniorBankingProfile), 40.0f, new StylableContactImage$Style(R$attr.uikit_colorRevolutU18Violet, R$attr.uikit_colorBlack), 40), null, null, null, null, null, 126), i1Var, 6), new TextClause(juniorBankingProfile.f77099b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, new c(fVar), null, 0, 0, 0, 0, 532673528);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                arrayList.add(model2);
            }
            i = 0;
            s0Var2.b(arrayList.toArray(new RowDelegate.Model[0]));
            ArrayList arrayList2 = s0Var2.f186433a;
            collectionK = v.k(arrayList2.toArray(new i[arrayList2.size()]));
        }
        s0Var.b(collectionK.toArray(new koi.j[i]));
        ArrayList arrayList3 = s0Var.f186433a;
        return new cii.b(null, v.k(arrayList3.toArray(new koi.j[arrayList3.size()])), aVar);
    }
}
