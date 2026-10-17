package s9b;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.global_accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f261171a;

    public r(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f261171a = countryInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_INFO_SECTION_TITLE", (Image) null, (Clause) new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_screen_info_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        RowDelegate.Model model2 = new RowDelegate.Model("ID_INFO_SECTION_CONTENT_TRANSFER", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_right_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_screen_info_section_transfer_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_screen_info_section_transfer_sub_title, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("ID_PROFILES_SECTION_TITLE", (Image) null, (Clause) new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_screen_profiles_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        aim.e eVarB = u.b();
        eVarB.add(model);
        eVarB.add(model2);
        eVarB.add(model3);
        aim.e eVarA = u.a(eVarB);
        List list = (List) iii.c.f(domainState.f261154a, new s8h.h(this, 6), new s6d.r(this, 29), new ri4.o(this, 29));
        aim.e eVarB2 = u.b();
        eVarB2.addAll(eVarA);
        eVarB2.addAll(list);
        return new i(u.a(eVarB2));
    }
}
