package gs2;

import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreenContract$Input;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import gr2.j0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements jki.p {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockedPaymentsListScreenContract$Input f146273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f146274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a9e.h f146275c;
    public final jla.h d;
    public final uw1.c e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f146276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f146277h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f146278j;

    public a0(BlockedPaymentsListScreenContract$Input input, thf.d iconMapper, a9e.h subscriptionsItemMapper, jla.h productCatalogueInteractor, uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f146273a = input;
        this.f146274b = iconMapper;
        this.f146275c = subscriptionsItemMapper;
        this.d = productCatalogueInteractor;
        this.e = apmFeatureChecker;
        this.f = te0.w.y0(new j0(6));
        this.f146276g = te0.w.y0(new j0(7));
        this.f146277h = te0.w.y0(new j0(8));
        this.i = te0.w.y0(new j0(9));
        this.f146278j = te0.w.y0(new j0(10));
    }

    public static RowDelegate.Model b(int i, int i2, int i3, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, i2, Integer.valueOf(R$attr.uikit_colorWhite), i3, 8.0f, null, null, 48), new InactiveCircleBadge(dw0.a.Cancelled), null, false, null, false, 60), new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
    }

    public static TextLocalisedClause c(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return new TextLocalisedClause(R$string.recurring_payments_blocked_since, zhm.u.c(new TimeClause(oc.c.F(localDate), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        Collection collectionG;
        boolean z;
        Iterable iterableG;
        Iterable iterableG2;
        List listE0;
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f146281a;
        boolean z3 = domainState.f146284g;
        Data data2 = domainState.f146282b;
        Data data3 = domainState.f146283c;
        Data dataU = t1.u(data, data2, data3);
        if (dataU.getContent() != null || dataU.getLoading()) {
            final k71.q qVar = domainState.f146285h;
            Data data4 = domainState.d;
            jla.h hVar = this.d;
            bla.c cVarD = hVar.d("BILLS_AND_TAXES.payto", null);
            bla.c cVar = bla.c.ENABLED;
            if (cVarD == cVar) {
                final int i = 1;
                collectionG = yp0.b.g((List) iii.c.f(data4, new t(0), new gp3.n(20), new Function3(this) { // from class: gs2.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a0 f146302b;

                    {
                        this.f146302b = this;
                    }

                    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i) {
                            case 0:
                                List subscriptions = (List) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                                boolean zIsEmpty = subscriptions.isEmpty();
                                a0 a0Var = this.f146302b;
                                if (zIsEmpty) {
                                    return zhm.u.c((RowDelegate.Model) a0Var.f146278j.getValue());
                                }
                                List listP0 = d0.P0(subscriptions, new z());
                                ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
                                Iterator it8 = listP0.iterator();
                                while (it8.hasNext()) {
                                    arrayList.add(a9e.h.d(a0Var.f146275c, (RecurringPaymentWithExtra) it8.next(), f0.f322471a, qVar, true, false, (LayeredImage) a0Var.f.getValue(), true, null, null, 384));
                                }
                                return arrayList;
                            case 1:
                                List subscriptions2 = (List) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(subscriptions2, "subscriptions");
                                boolean zIsEmpty2 = subscriptions2.isEmpty();
                                a0 a0Var2 = this.f146302b;
                                if (zIsEmpty2) {
                                    return zhm.u.c((RowDelegate.Model) a0Var2.i.getValue());
                                }
                                List listP02 = d0.P0(subscriptions2, new x());
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listP02, 10));
                                Iterator it9 = listP02.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(a9e.h.d(a0Var2.f146275c, (RecurringPaymentWithExtra) it9.next(), f0.f322471a, qVar, true, false, (LayeredImage) a0Var2.f.getValue(), true, null, null, 384));
                                }
                                return arrayList2;
                            case 2:
                                List inactiveDirectDebits = (List) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(inactiveDirectDebits, "inactiveDirectDebits");
                                if (inactiveDirectDebits.isEmpty()) {
                                    return f0.f322471a;
                                }
                                List<RecurringPaymentWithExtra> listP03 = d0.P0(inactiveDirectDebits, new v());
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(listP03, 10));
                                for (RecurringPaymentWithExtra recurringPaymentWithExtra : listP03) {
                                    a0 a0Var3 = this.f146302b;
                                    arrayList3.add(RowDelegate.Model.x(a9e.h.d(a0Var3.f146275c, recurringPaymentWithExtra, f0.f322471a, qVar, true, false, (LayeredImage) a0Var3.f.getValue(), true, null, null, 384), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15));
                                }
                                return arrayList3;
                            default:
                                List blockedSubscriptions = (List) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(blockedSubscriptions, "blockedSubscriptions");
                                boolean zIsEmpty3 = blockedSubscriptions.isEmpty();
                                a0 a0Var4 = this.f146302b;
                                if (zIsEmpty3) {
                                    return zhm.u.c((RowDelegate.Model) a0Var4.f146276g.getValue());
                                }
                                List<RecurringPaymentWithExtra> listP04 = d0.P0(blockedSubscriptions, new y());
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(listP04, 10));
                                for (RecurringPaymentWithExtra recurringPaymentWithExtra2 : listP04) {
                                    RowDelegate.Model modelD = a9e.h.d(a0Var4.f146275c, recurringPaymentWithExtra2, f0.f322471a, qVar, true, false, (LayeredImage) a0Var4.f.getValue(), true, null, null, 384);
                                    qua.g gVar = recurringPaymentWithExtra2.getF81653a().f249332w;
                                    arrayList4.add(RowDelegate.Model.x(modelD, null, null, null, a0.c(gVar != null ? gVar.f249296h : null), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15));
                                }
                                return arrayList4;
                        }
                    }
                }), new ListSubheaderDelegate.Model("ID_PAYTO_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_pay_to_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            } else {
                collectionG = f0.f322471a;
            }
            final int i2 = 3;
            ArrayList arrayListE0 = d0.E0(yp0.b.g((List) iii.c.f(data2, new t(2), new gp3.n(23), new gna.i(this, 7)), new ListSubheaderDelegate.Model("ID_MERCHANT_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_merchants_header, null, null, 14), (Image) (z3 ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null), (Clause) (hVar.d("security_hub.block_merchants", null) == cVar ? new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_merchants_add_new, null, null, 14) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, true), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65442), null, 0, 0, 126), d0.E0(yp0.b.g((List) iii.c.f(domainState.f146281a, new gqa.a(28), new gp3.n(22), new Function3(this) { // from class: gs2.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a0 f146302b;

                {
                    this.f146302b = this;
                }

                /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i2) {
                        case 0:
                            List subscriptions = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                            boolean zIsEmpty = subscriptions.isEmpty();
                            a0 a0Var = this.f146302b;
                            if (zIsEmpty) {
                                return zhm.u.c((RowDelegate.Model) a0Var.f146278j.getValue());
                            }
                            List listP0 = d0.P0(subscriptions, new z());
                            ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
                            Iterator it8 = listP0.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(a9e.h.d(a0Var.f146275c, (RecurringPaymentWithExtra) it8.next(), f0.f322471a, qVar, true, false, (LayeredImage) a0Var.f.getValue(), true, null, null, 384));
                            }
                            return arrayList;
                        case 1:
                            List subscriptions2 = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(subscriptions2, "subscriptions");
                            boolean zIsEmpty2 = subscriptions2.isEmpty();
                            a0 a0Var2 = this.f146302b;
                            if (zIsEmpty2) {
                                return zhm.u.c((RowDelegate.Model) a0Var2.i.getValue());
                            }
                            List listP02 = d0.P0(subscriptions2, new x());
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(listP02, 10));
                            Iterator it9 = listP02.iterator();
                            while (it9.hasNext()) {
                                arrayList2.add(a9e.h.d(a0Var2.f146275c, (RecurringPaymentWithExtra) it9.next(), f0.f322471a, qVar, true, false, (LayeredImage) a0Var2.f.getValue(), true, null, null, 384));
                            }
                            return arrayList2;
                        case 2:
                            List inactiveDirectDebits = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(inactiveDirectDebits, "inactiveDirectDebits");
                            if (inactiveDirectDebits.isEmpty()) {
                                return f0.f322471a;
                            }
                            List<RecurringPaymentWithExtra> listP03 = d0.P0(inactiveDirectDebits, new v());
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(listP03, 10));
                            for (RecurringPaymentWithExtra recurringPaymentWithExtra : listP03) {
                                a0 a0Var3 = this.f146302b;
                                arrayList3.add(RowDelegate.Model.x(a9e.h.d(a0Var3.f146275c, recurringPaymentWithExtra, f0.f322471a, qVar, true, false, (LayeredImage) a0Var3.f.getValue(), true, null, null, 384), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15));
                            }
                            return arrayList3;
                        default:
                            List blockedSubscriptions = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(blockedSubscriptions, "blockedSubscriptions");
                            boolean zIsEmpty3 = blockedSubscriptions.isEmpty();
                            a0 a0Var4 = this.f146302b;
                            if (zIsEmpty3) {
                                return zhm.u.c((RowDelegate.Model) a0Var4.f146276g.getValue());
                            }
                            List<RecurringPaymentWithExtra> listP04 = d0.P0(blockedSubscriptions, new y());
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(listP04, 10));
                            for (RecurringPaymentWithExtra recurringPaymentWithExtra2 : listP04) {
                                RowDelegate.Model modelD = a9e.h.d(a0Var4.f146275c, recurringPaymentWithExtra2, f0.f322471a, qVar, true, false, (LayeredImage) a0Var4.f.getValue(), true, null, null, 384);
                                qua.g gVar = recurringPaymentWithExtra2.getF81653a().f249332w;
                                arrayList4.add(RowDelegate.Model.x(modelD, null, null, null, a0.c(gVar != null ? gVar.f249296h : null), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15));
                            }
                            return arrayList4;
                    }
                }
            }), new ListSubheaderDelegate.Model("ID_SUBSCRIPTION_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_subscriptions_header, null, null, 14), (Image) (z3 ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null), (Clause) (hVar.d("revolut_card.subscriptions", null) == cVar ? new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_subscriptions_add_new, null, null, 14) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, true), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65442), null, 0, 0, 126), collectionG));
            BlockedPaymentsListScreenContract$Input blockedPaymentsListScreenContract$Input = this.f146273a;
            if (blockedPaymentsListScreenContract$Input.f64257a instanceof ContentUser.Junior) {
                z = false;
                iterableG = yp0.b.g(zhm.v.k(b(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_categories_section_cells_gambling, R$drawable.uikit_icn_24_game_cube, R$attr.uikit_colorIndigo, "ID_GAMBLING_BETTING_LOTTERY_ITEM"), b(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_categories_section_cells_luxuries, R$drawable.uikit_icn_24_cleaning, R$attr.uikit_colorCyan, "ID_LUXURIES_COLLECTIBLES"), b(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_categories_section_cells_cigar_and_tobacco, R$drawable.uikit_icn_24_smoking, R$attr.uikit_colorDeepGrey, "ID_CIGAR_TOBACCO_SHOPS"), b(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_categories_section_cells_dating, R$drawable.uikit_icn_24_flame, R$attr.uikit_colorDeepPink, "ID_DATING_ADULT_SERVICES"), b(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_categories_section_cells_e_money_transfers, R$drawable.uikit_icn_24_credit, R$attr.uikit_colorTeal, "ID_E_MONEY_TRANSFER"), b(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_categories_section_cells_financial_services, R$drawable.uikit_icn_24_bank, R$attr.uikit_colorIndigo, "ID_FINANCIAL_SERVICES_INSTITUTIONS")), new ListSubheaderDelegate.Model("ID_BLOCKED_CATEGORIES_ITEM", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_categories_section_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, true, false, 4), false, false, (Object) blockedPaymentsListScreenContract$Input.f64257a, (Parcelable) null, 0, 0, 0, 0, 64434), null, 0, R$attr.uikit_dp32, LDSFile.EF_DG4_TAG);
            } else {
                iterableG = f0.f322471a;
                z = false;
            }
            ArrayList arrayListE02 = d0.E0(iterableG, arrayListE0);
            Data data5 = domainState.f;
            aim.e eVarB = zhm.u.b();
            Collection collection = (List) data3.getContent();
            if (collection == null) {
                collection = f0.f322471a;
            }
            eVarB.addAll(collection);
            Collection collection2 = (List) data5.getContent();
            if (collection2 == null) {
                collection2 = f0.f322471a;
            }
            eVarB.addAll(collection2);
            aim.e eVarA = zhm.u.a(eVarB);
            if (eVarA.isEmpty()) {
                eVarA = null;
            }
            Throwable error = data3.getError();
            if (error == null) {
                error = data5.getError();
            }
            if (data3.getLoading() && data5.getLoading()) {
                z = true;
            }
            final int i3 = 2;
            List listG = (List) iii.c.f(new Data(eVarA, error, z), new t(1), new gp3.n(21), new Function3(this) { // from class: gs2.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a0 f146302b;

                {
                    this.f146302b = this;
                }

                /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i3) {
                        case 0:
                            List subscriptions = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                            boolean zIsEmpty = subscriptions.isEmpty();
                            a0 a0Var = this.f146302b;
                            if (zIsEmpty) {
                                return zhm.u.c((RowDelegate.Model) a0Var.f146278j.getValue());
                            }
                            List listP0 = d0.P0(subscriptions, new z());
                            ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
                            Iterator it8 = listP0.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(a9e.h.d(a0Var.f146275c, (RecurringPaymentWithExtra) it8.next(), f0.f322471a, qVar, true, false, (LayeredImage) a0Var.f.getValue(), true, null, null, 384));
                            }
                            return arrayList;
                        case 1:
                            List subscriptions2 = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(subscriptions2, "subscriptions");
                            boolean zIsEmpty2 = subscriptions2.isEmpty();
                            a0 a0Var2 = this.f146302b;
                            if (zIsEmpty2) {
                                return zhm.u.c((RowDelegate.Model) a0Var2.i.getValue());
                            }
                            List listP02 = d0.P0(subscriptions2, new x());
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(listP02, 10));
                            Iterator it9 = listP02.iterator();
                            while (it9.hasNext()) {
                                arrayList2.add(a9e.h.d(a0Var2.f146275c, (RecurringPaymentWithExtra) it9.next(), f0.f322471a, qVar, true, false, (LayeredImage) a0Var2.f.getValue(), true, null, null, 384));
                            }
                            return arrayList2;
                        case 2:
                            List inactiveDirectDebits = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(inactiveDirectDebits, "inactiveDirectDebits");
                            if (inactiveDirectDebits.isEmpty()) {
                                return f0.f322471a;
                            }
                            List<RecurringPaymentWithExtra> listP03 = d0.P0(inactiveDirectDebits, new v());
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(listP03, 10));
                            for (RecurringPaymentWithExtra recurringPaymentWithExtra : listP03) {
                                a0 a0Var3 = this.f146302b;
                                arrayList3.add(RowDelegate.Model.x(a9e.h.d(a0Var3.f146275c, recurringPaymentWithExtra, f0.f322471a, qVar, true, false, (LayeredImage) a0Var3.f.getValue(), true, null, null, 384), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15));
                            }
                            return arrayList3;
                        default:
                            List blockedSubscriptions = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(blockedSubscriptions, "blockedSubscriptions");
                            boolean zIsEmpty3 = blockedSubscriptions.isEmpty();
                            a0 a0Var4 = this.f146302b;
                            if (zIsEmpty3) {
                                return zhm.u.c((RowDelegate.Model) a0Var4.f146276g.getValue());
                            }
                            List<RecurringPaymentWithExtra> listP04 = d0.P0(blockedSubscriptions, new y());
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(listP04, 10));
                            for (RecurringPaymentWithExtra recurringPaymentWithExtra2 : listP04) {
                                RowDelegate.Model modelD = a9e.h.d(a0Var4.f146275c, recurringPaymentWithExtra2, f0.f322471a, qVar, true, false, (LayeredImage) a0Var4.f.getValue(), true, null, null, 384);
                                qua.g gVar = recurringPaymentWithExtra2.getF81653a().f249332w;
                                arrayList4.add(RowDelegate.Model.x(modelD, null, null, null, a0.c(gVar != null ? gVar.f249296h : null), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15));
                            }
                            return arrayList4;
                    }
                }
            });
            if (!listG.isEmpty()) {
                listG = yp0.b.g(listG, new ListSubheaderDelegate.Model("ID_DIRECT_DEBIT_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_direct_debits_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            }
            ArrayList arrayListE03 = d0.E0(listG, arrayListE02);
            Data data6 = domainState.e;
            if (((ty1.b) this.e).b(uw1.f.UPI)) {
                final int i5 = 0;
                iterableG2 = yp0.b.g((List) iii.c.f(data6, new gqa.a(29), new gp3.n(19), new Function3(this) { // from class: gs2.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a0 f146302b;

                    {
                        this.f146302b = this;
                    }

                    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i5) {
                            case 0:
                                List subscriptions = (List) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                                boolean zIsEmpty = subscriptions.isEmpty();
                                a0 a0Var = this.f146302b;
                                if (zIsEmpty) {
                                    return zhm.u.c((RowDelegate.Model) a0Var.f146278j.getValue());
                                }
                                List listP0 = d0.P0(subscriptions, new z());
                                ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
                                Iterator it8 = listP0.iterator();
                                while (it8.hasNext()) {
                                    arrayList.add(a9e.h.d(a0Var.f146275c, (RecurringPaymentWithExtra) it8.next(), f0.f322471a, qVar, true, false, (LayeredImage) a0Var.f.getValue(), true, null, null, 384));
                                }
                                return arrayList;
                            case 1:
                                List subscriptions2 = (List) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(subscriptions2, "subscriptions");
                                boolean zIsEmpty2 = subscriptions2.isEmpty();
                                a0 a0Var2 = this.f146302b;
                                if (zIsEmpty2) {
                                    return zhm.u.c((RowDelegate.Model) a0Var2.i.getValue());
                                }
                                List listP02 = d0.P0(subscriptions2, new x());
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listP02, 10));
                                Iterator it9 = listP02.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(a9e.h.d(a0Var2.f146275c, (RecurringPaymentWithExtra) it9.next(), f0.f322471a, qVar, true, false, (LayeredImage) a0Var2.f.getValue(), true, null, null, 384));
                                }
                                return arrayList2;
                            case 2:
                                List inactiveDirectDebits = (List) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(inactiveDirectDebits, "inactiveDirectDebits");
                                if (inactiveDirectDebits.isEmpty()) {
                                    return f0.f322471a;
                                }
                                List<RecurringPaymentWithExtra> listP03 = d0.P0(inactiveDirectDebits, new v());
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(listP03, 10));
                                for (RecurringPaymentWithExtra recurringPaymentWithExtra : listP03) {
                                    a0 a0Var3 = this.f146302b;
                                    arrayList3.add(RowDelegate.Model.x(a9e.h.d(a0Var3.f146275c, recurringPaymentWithExtra, f0.f322471a, qVar, true, false, (LayeredImage) a0Var3.f.getValue(), true, null, null, 384), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15));
                                }
                                return arrayList3;
                            default:
                                List blockedSubscriptions = (List) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(blockedSubscriptions, "blockedSubscriptions");
                                boolean zIsEmpty3 = blockedSubscriptions.isEmpty();
                                a0 a0Var4 = this.f146302b;
                                if (zIsEmpty3) {
                                    return zhm.u.c((RowDelegate.Model) a0Var4.f146276g.getValue());
                                }
                                List<RecurringPaymentWithExtra> listP04 = d0.P0(blockedSubscriptions, new y());
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(listP04, 10));
                                for (RecurringPaymentWithExtra recurringPaymentWithExtra2 : listP04) {
                                    RowDelegate.Model modelD = a9e.h.d(a0Var4.f146275c, recurringPaymentWithExtra2, f0.f322471a, qVar, true, false, (LayeredImage) a0Var4.f.getValue(), true, null, null, 384);
                                    qua.g gVar = recurringPaymentWithExtra2.getF81653a().f249332w;
                                    arrayList4.add(RowDelegate.Model.x(modelD, null, null, null, a0.c(gVar != null ? gVar.f249296h : null), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15));
                                }
                                return arrayList4;
                        }
                    }
                }), new ListSubheaderDelegate.Model("ID_UPI_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.blocked_payments_upi_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            } else {
                iterableG2 = f0.f322471a;
            }
            listE0 = d0.E0(iterableG2, arrayListE03);
        } else {
            listE0 = iii.c.b(null, null, 6, false);
        }
        return new p(listE0);
    }
}
