package com.revolut.feature.address.common.impl.flow.screen.find;

import android.os.Parcelable;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.common.impl.error.InvalidPostCodeError;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$LocationSearchMode;
import com.revolut.feature.address.common.impl.flow.screen.find.a;
import com.revolut.feature.address.models.AddressAutocomplete;
import com.revolut.feature.address.models.AddressSearchListResult;
import com.revolut.feature.address.models.AddressSearchResult;
import ip0.i10;
import ip0.k10;
import java.util.ArrayList;
import java.util.List;
import ji1.e;
import ji1.g;
import ji1.h;
import ji1.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import sh1.l;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f61021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AddressSearchScreenContract$InputData f61022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uh1.a f61023c;
    public final xi1.a d;
    public final CdnImage e;

    public c(l strings, AddressSearchScreenContract$InputData inputData, uh1.a addressPrinter, xi1.a itemsProvider) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressPrinter, "addressPrinter");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.f61021a = strings;
        this.f61022b = inputData;
        this.f61023c = addressPrinter;
        this.d = itemsProvider;
        this.e = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30);
    }

    public static ListSubheaderDelegate.Model b() {
        int i = R$drawable.uikit_icn_24_location_pin;
        Float fValueOf = Float.valueOf(24.0f);
        return new ListSubheaderDelegate.Model("LOCATION_HEADER_ID", (Image) null, (Clause) new CompositeClause(v.k(new ImageClause(i, (Integer) null, fValueOf, fValueOf, 18), new TextLocalisedClause(R$string.address_picker_location_title, null, null, 14)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final List a() {
        ListSubheaderDelegate.Model modelB = b();
        Intrinsics.checkNotNullParameter("LOCATION_NO_RESULTS_ITEM_ID", "clickId");
        k10 k10Var = new k10("LOCATION_SEARCH_NO_RESULTS_ITEM_ID", (Image) this.d.f306296a.getValue(), new i10(new CompositeClause(v.k(new TextLocalisedClause(R$string.address_picker_address_enter_manually_no_result_found, null, null, 14), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.address_picker_address_enter_manually_link, null, new Click(30, (Integer) null, (Object) null, "LOCATION_NO_RESULTS_ITEM_ID", false), 10)), null, null, null, 14)));
        yp0.b.l(k10Var, 0, 0, 0, 0, null, false, 63);
        return v.k(modelB, k10Var);
    }

    @Override // cli.n
    public final o c(j jVar) {
        List listL;
        RowDelegate.Model modelB;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        a aVar = domainState.f174324b;
        boolean zF = Intrinsics.f(aVar, a.C0454a.f61015a);
        final int i = 1;
        final int i2 = 0;
        l lVar = this.f61021a;
        if (zF) {
            mi1.a aVar2 = domainState.f174323a;
            if (!(this.f61022b.e instanceof AddressSearchScreenContract$LocationSearchMode.Enabled) || aVar2 == mi1.a.REJECTED) {
                modelB = null;
            } else {
                modelB = xi1.a.b();
                yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
            }
            k10 k10Var = new k10("EMPTY_ITEM_ID", this.e, new i10(lVar.f263377b.f263373c));
            yp0.b.l(k10Var, 0, 0, 0, 0, null, false, 63);
            i[] elements = {modelB, k10Var};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = d.L(elements);
        } else if (aVar instanceof g) {
            listL = (List) iii.c.f(((g) aVar).f174326a, new jhi.a(this, 13), new Function2(this) { // from class: ji1.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.address.common.impl.flow.screen.find.c f174338b;

                {
                    this.f174338b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    FullScreenStateDelegate.Model model;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                            return this.f174338b.a();
                        default:
                            Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                            sh1.l lVar2 = this.f174338b.f61021a;
                            if (Intrinsics.f((Throwable) obj2, InvalidPostCodeError.f60963a)) {
                                ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30));
                                sh1.k kVar = lVar2.f263377b;
                                model = new FullScreenStateDelegate.Model("FULL_SCREEN_ERROR_ITEM", kVar.f263375h, kVar.i, regular, null, null, false, null, null, false, 0, 0, 32752);
                            } else {
                                ComplexImage.Regular regular2 = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30));
                                sh1.k kVar2 = lVar2.f263377b;
                                model = new FullScreenStateDelegate.Model("FULL_SCREEN_ERROR_ITEM", kVar2.f, kVar2.f263374g, regular2, null, null, false, null, null, false, 0, 0, 32752);
                            }
                            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                            return u.c(model);
                    }
                }
            }, new Function3(this) { // from class: ji1.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.address.common.impl.flow.screen.find.c f174340b;

                {
                    this.f174340b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i) {
                        case 0:
                            List suggestions = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                            boolean zIsEmpty = suggestions.isEmpty();
                            com.revolut.feature.address.common.impl.flow.screen.find.c cVar = this.f174340b;
                            if (zIsEmpty) {
                                return cVar.a();
                            }
                            ListSubheaderDelegate.Model modelB2 = com.revolut.feature.address.common.impl.flow.screen.find.c.b();
                            Intrinsics.checkNotNullParameter("LOCATION_NOT_LISTED_ID", "clickId");
                            RowDelegate.Model model = new RowDelegate.Model("LOCATION_NOT_LISTED_ID", null, new TextLocalisedClause(R$string.address_autocomplete_address_not_listed, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
                            List<AddressAutocomplete> list = suggestions;
                            ArrayList arrayList = new ArrayList(w.t(list, 10));
                            for (AddressAutocomplete addressAutocomplete : list) {
                                arrayList.add(new Pair(yi1.g.a(addressAutocomplete.getAddress()), ((yi1.a) cVar.f61023c).c(", ", addressAutocomplete.getAddress())));
                            }
                            List<Pair> listP0 = d0.P0(arrayList, new r());
                            ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
                            for (Pair pair : listP0) {
                                arrayList2.add(new RowDelegate.Model((String) pair.f186385a, null, new TextClause((String) pair.f186386b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
                            }
                            ArrayList arrayListJ = ue0.e.J(model, arrayList2);
                            yp0.b.k(arrayListJ, 0, 0, 0, 0, 31);
                            return ue0.e.J(modelB2, arrayListJ);
                        default:
                            com.revolut.feature.address.common.impl.flow.screen.find.c cVar2 = this.f174340b;
                            sh1.l lVar2 = cVar2.f61021a;
                            AddressSearchListResult result = (AddressSearchListResult) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result.getItems().isEmpty()) {
                                k10 k10Var2 = new k10("NO_RESULTS_ITEM_ID", cVar2.e, new i10(lVar2.f263377b.d));
                                yp0.b.l(k10Var2, 0, 0, 0, 0, null, false, 63);
                                return u.c(k10Var2);
                            }
                            aim.e eVarB = u.b();
                            if (!com.bumptech.glide.d.u(com.bumptech.glide.d.c(cVar2.f61022b.f61009a))) {
                                eVarB.add(new RowDelegate.Model("NOT_LISTED_ID", null, lVar2.f263377b.e, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
                            }
                            List<AddressSearchResult> items = result.getItems();
                            ArrayList arrayList3 = new ArrayList(w.t(items, 10));
                            for (AddressSearchResult addressSearchResult : items) {
                                arrayList3.add(new Pair(addressSearchResult.getId(), !kotlin.text.d0.W(addressSearchResult.getDescription()) ? com.google.android.gms.internal.mlkit_vision_face.a.o(addressSearchResult.getResult(), ", ", addressSearchResult.getDescription()) : addressSearchResult.getResult()));
                            }
                            List<Pair> listP02 = d0.P0(arrayList3, new q());
                            ArrayList arrayList4 = new ArrayList(w.t(listP02, 10));
                            for (Pair pair2 : listP02) {
                                arrayList4.add(new RowDelegate.Model((String) pair2.f186385a, null, new TextClause((String) pair2.f186386b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
                            }
                            eVarB.addAll(arrayList4);
                            aim.e eVarA = u.a(eVarB);
                            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                            return eVarA;
                    }
                }
            });
        } else {
            if (!(aVar instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            listL = (List) iii.c.f(((h) aVar).f174328a, new jhi.a(this, 12), new Function2(this) { // from class: ji1.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.address.common.impl.flow.screen.find.c f174338b;

                {
                    this.f174338b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    FullScreenStateDelegate.Model model;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                            return this.f174338b.a();
                        default:
                            Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                            sh1.l lVar2 = this.f174338b.f61021a;
                            if (Intrinsics.f((Throwable) obj2, InvalidPostCodeError.f60963a)) {
                                ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30));
                                sh1.k kVar = lVar2.f263377b;
                                model = new FullScreenStateDelegate.Model("FULL_SCREEN_ERROR_ITEM", kVar.f263375h, kVar.i, regular, null, null, false, null, null, false, 0, 0, 32752);
                            } else {
                                ComplexImage.Regular regular2 = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30));
                                sh1.k kVar2 = lVar2.f263377b;
                                model = new FullScreenStateDelegate.Model("FULL_SCREEN_ERROR_ITEM", kVar2.f, kVar2.f263374g, regular2, null, null, false, null, null, false, 0, 0, 32752);
                            }
                            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                            return u.c(model);
                    }
                }
            }, new Function3(this) { // from class: ji1.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.address.common.impl.flow.screen.find.c f174340b;

                {
                    this.f174340b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i2) {
                        case 0:
                            List suggestions = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                            boolean zIsEmpty = suggestions.isEmpty();
                            com.revolut.feature.address.common.impl.flow.screen.find.c cVar = this.f174340b;
                            if (zIsEmpty) {
                                return cVar.a();
                            }
                            ListSubheaderDelegate.Model modelB2 = com.revolut.feature.address.common.impl.flow.screen.find.c.b();
                            Intrinsics.checkNotNullParameter("LOCATION_NOT_LISTED_ID", "clickId");
                            RowDelegate.Model model = new RowDelegate.Model("LOCATION_NOT_LISTED_ID", null, new TextLocalisedClause(R$string.address_autocomplete_address_not_listed, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
                            List<AddressAutocomplete> list = suggestions;
                            ArrayList arrayList = new ArrayList(w.t(list, 10));
                            for (AddressAutocomplete addressAutocomplete : list) {
                                arrayList.add(new Pair(yi1.g.a(addressAutocomplete.getAddress()), ((yi1.a) cVar.f61023c).c(", ", addressAutocomplete.getAddress())));
                            }
                            List<Pair> listP0 = d0.P0(arrayList, new r());
                            ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
                            for (Pair pair : listP0) {
                                arrayList2.add(new RowDelegate.Model((String) pair.f186385a, null, new TextClause((String) pair.f186386b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
                            }
                            ArrayList arrayListJ = ue0.e.J(model, arrayList2);
                            yp0.b.k(arrayListJ, 0, 0, 0, 0, 31);
                            return ue0.e.J(modelB2, arrayListJ);
                        default:
                            com.revolut.feature.address.common.impl.flow.screen.find.c cVar2 = this.f174340b;
                            sh1.l lVar2 = cVar2.f61021a;
                            AddressSearchListResult result = (AddressSearchListResult) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result.getItems().isEmpty()) {
                                k10 k10Var2 = new k10("NO_RESULTS_ITEM_ID", cVar2.e, new i10(lVar2.f263377b.d));
                                yp0.b.l(k10Var2, 0, 0, 0, 0, null, false, 63);
                                return u.c(k10Var2);
                            }
                            aim.e eVarB = u.b();
                            if (!com.bumptech.glide.d.u(com.bumptech.glide.d.c(cVar2.f61022b.f61009a))) {
                                eVarB.add(new RowDelegate.Model("NOT_LISTED_ID", null, lVar2.f263377b.e, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
                            }
                            List<AddressSearchResult> items = result.getItems();
                            ArrayList arrayList3 = new ArrayList(w.t(items, 10));
                            for (AddressSearchResult addressSearchResult : items) {
                                arrayList3.add(new Pair(addressSearchResult.getId(), !kotlin.text.d0.W(addressSearchResult.getDescription()) ? com.google.android.gms.internal.mlkit_vision_face.a.o(addressSearchResult.getResult(), ", ", addressSearchResult.getDescription()) : addressSearchResult.getResult()));
                            }
                            List<Pair> listP02 = d0.P0(arrayList3, new q());
                            ArrayList arrayList4 = new ArrayList(w.t(listP02, 10));
                            for (Pair pair2 : listP02) {
                                arrayList4.add(new RowDelegate.Model((String) pair2.f186385a, null, new TextClause((String) pair2.f186386b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
                            }
                            eVarB.addAll(arrayList4);
                            aim.e eVarA = u.a(eVarB);
                            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                            return eVarA;
                    }
                }
            });
        }
        return new ji1.i(lVar.f263377b.f263371a, listL);
    }
}
