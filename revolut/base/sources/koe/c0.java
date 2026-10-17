package koe;

import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreenContract$InputData;
import ip0.i10;
import ip0.k10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements cli.n {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ListSubheaderDelegate.Model f186311c;
    public static final k10 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f186312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxResidencyListScreenContract$InputData f186313b;

    static {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("list_header_item_id", (Image) null, (Clause) new TextLocalisedClause(R$string.tax_residency_self_certify_tax_residencies, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R$string.tax_residency_list_add_multiple, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp0;
        yp0.b.p(model, i, i2, i2, i2);
        f186311c = model;
        d = new k10("empty_tax_residency_item_id", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D021", null, null, null, 30), new i10(new TextLocalisedClause(R$string.tax_residency_list_no_residencies, null, null, 14)));
    }

    public c0(n8b.a countryInteractor, TaxResidencyListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f186312a = countryInteractor;
        this.f186313b = inputData;
    }

    public static a0 a(TextClause textClause, zme.l lVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tax_residency_list_document_missing, zhm.u.c(u0.p(lVar.d)), new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 8);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_16_exclamation_mark;
        int i2 = R$attr.uikit_colorWhite;
        return new a0(textClause, textLocalisedClause, LayeredImage.Companion.f(companion, i, i2, i2, Integer.valueOf(R$attr.uikit_colorOrange), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.valueOf(10.0f), 32), true);
    }

    public static a0 b(TextClause textClause, String str, zme.l lVar) {
        return new a0(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.tax_residency_list_document_not_required, zhm.u.c(u0.p(lVar.d)), null, 12), null, true);
    }

    public static a0 d(TextClause textClause) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tax_residency_list_document_review, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_16_time;
        int i2 = R$attr.uikit_colorWhite;
        return new a0(textClause, textLocalisedClause, LayeredImage.Companion.f(companion, i, i2, i2, Integer.valueOf(R$attr.uikit_colorGrey50), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.valueOf(10.0f), 32), false);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(t1.v(domainState.f186315b, domainState.f186316c, domainState.d, domainState.f186314a), new knd.a(20), new x(0), new y(this, domainState, 0));
    }
}
