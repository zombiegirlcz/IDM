package com.revolut.feature.apm.multibanco.impl.via_verde.ui.details;

import aim.e;
import android.os.Parcelable;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreenContract$Action;
import h92.d;
import h92.g;
import h93.f0;
import ia3.t;
import ip0.t5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.g f62649a;

    public a(m93.g cardsListMapper) {
        Intrinsics.checkNotNullParameter(cardsListMapper, "cardsListMapper");
        this.f62649a = cardsListMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVarB = u.b();
        f0 f0Var = domainState.f150086b;
        ViaVerdeEnrollment viaVerdeEnrollment = domainState.f150085a;
        if (f0Var != null) {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_HEADER_CARD", (Image) null, (Clause) new TextLocalisedClause(R$string.via_verde_identifier_details_section_linked_card_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338);
            RowDelegate.Model modelG = ((t) this.f62649a).g(true, f0Var, (24 & 4) != 0, null);
            yp0.b.l(modelG, 0, 0, 0, 0, null, false, 63);
            e eVarB2 = u.b();
            eVarB2.add(model);
            eVarB2.add(modelG);
            eVarB.addAll(u.a(eVarB2));
        }
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ID_HEADER_DETAILS", (Image) null, (Clause) new TextLocalisedClause(R$string.via_verde_identifier_details_section_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338);
        TextClause textClause = new TextClause(viaVerdeEnrollment.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.via_verde_identifier_details_section_details_item_identifier_label_title, null, null, 14);
        int i = R$attr.uikit_colorBlue;
        int i2 = R$drawable.uikit_icn_24_pencil;
        int i3 = R$attr.uikit_dp8;
        t5 t5Var = new t5("ID_DETAILS_LABEL", textClause, textLocalisedClause, EnrollmentDetailsScreenContract$Action.Edit.f62647a, Integer.valueOf(i), Integer.valueOf(i2), i3, i3, 0, 0, 1544);
        TextClause textClause2 = new TextClause(viaVerdeEnrollment.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.via_verde_identifier_details_section_details_item_payment_reference_title, null, null, 14);
        int i5 = R$attr.uikit_colorBlue;
        int i6 = R$drawable.uikit_icn_24_copy;
        int i21 = R$attr.uikit_dp8;
        t5 t5Var2 = new t5("ID_DETAILS_REFERENCE", textClause2, textLocalisedClause2, EnrollmentDetailsScreenContract$Action.CopyReference.f62646a, Integer.valueOf(i5), Integer.valueOf(i6), i21, i21, 0, 0, 1544);
        TextClause textClause3 = new TextClause(viaVerdeEnrollment.f62644c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.via_verde_identifier_details_section_details_item_identifier_title, null, null, 14);
        int i22 = R$attr.uikit_colorBlue;
        int i32 = R$drawable.uikit_icn_24_copy;
        int i33 = R$attr.uikit_dp8;
        List listK = v.k(t5Var, t5Var2, new t5("ID_DETAILS_IDENTIFIER", textClause3, textLocalisedClause3, EnrollmentDetailsScreenContract$Action.CopyIdentifier.f62645a, Integer.valueOf(i22), Integer.valueOf(i32), i33, i33, 0, 0, 1544));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        e eVarB3 = u.b();
        eVarB3.add(model2);
        eVarB3.addAll(listK);
        eVarB.addAll(u.a(eVarB3));
        return new h92.e(u.a(eVarB), new TextClause(viaVerdeEnrollment.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }
}
