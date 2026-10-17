package quc;

import android.os.Parcelable;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f249348a;

    public i(jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f249348a = productCatalogueInteractor;
    }

    public static RowDelegate.Model a(int i, String str) {
        return new RowDelegate.Model(str, null, new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, b(i), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
    }

    public static tf b(int i) {
        return new tf(new yy0.h(new TextLocalisedClause(i, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246)));
    }

    @Override // cli.n
    public final o c(j jVar) {
        Iterable iterableG;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayListG = yp0.b.g(v.k(a(R$string.security_hub_learn_about_fraud_section_faq_lost_phone, "FAQ_LOST_PHONE_ITEM_ID"), a(R$string.security_hub_learn_about_fraud_section_faq_prevent_fraud, "FAQ_PREVENT_FRAUD_ITEM_ID"), a(R$string.security_hub_learn_about_fraud_section_faq_protect, "FAQ_REVOLUT_PROTECT_ITEM_ID")), new ListSubheaderDelegate.Model("FAQ_SECTION_SUBTITLE_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.security_hub_learn_about_fraud_section_faq_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        if (this.f249348a.d("security_hub.learn_fraud", null) == bla.c.ENABLED) {
            iterableG = yp0.b.g(u.c(new RowDelegate.Model("LEARN_ABOUT_FRAUD_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.security_hub_learn_about_fraud_section_course_cell_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.security_hub_learn_about_fraud_section_course_cell_subtitle, null, null, 14), null, null, 0, b(R$string.security_hub_learn_about_fraud_section_course_cell_title), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848)), new ListSubheaderDelegate.Model("LEARN_ABOUT_FRAUD_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.security_hub_learn_about_fraud_section_course_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        } else {
            iterableG = f0.f322471a;
        }
        return new e(d0.E0(iterableG, arrayListG));
    }
}
