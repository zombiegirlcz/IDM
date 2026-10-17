package n1g;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.s4;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.r1;
import yp0.e0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f211353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f211354b;

    public u(whf.n transactionItemsMapper, x experiencesBookingTransactionItemsMapper) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        Intrinsics.checkNotNullParameter(experiencesBookingTransactionItemsMapper, "experiencesBookingTransactionItemsMapper");
        this.f211353a = transactionItemsMapper;
        this.f211354b = experiencesBookingTransactionItemsMapper;
    }

    public static CellDetailsTextProgressDelegate.Model b(TravelExperiencesBooking travelExperiencesBooking) {
        TextLocalisedClause textLocalisedClause;
        iyf.c cVar = travelExperiencesBooking.f92747b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.experiences_booking_booking_status, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        int i = t.f211351a[cVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.experiences_booking_status_confirmed, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 10);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.experiences_booking_status_processing_payment, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.experiences_booking_status_failed, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.experiences_booking_status_cancelled, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        CellDetailsTextProgressDelegate.Model model = new CellDetailsTextProgressDelegate.Model("EXPERIENCE_BOOKING_STATUS_ITEM", new CompositeClause(zhm.v.k(textLocalisedClause2, textLocalisedClause), new TextClause(": ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, travelExperiencesBooking.f92747b == iyf.c.PENDING ? new CellDetailsTextProgressDelegate.a(true, 0, 6, 0) : null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static CounterTextDelegate.Model c(TravelExperiencesBooking travelExperiencesBooking) {
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("EXPERIENCE_DATE_ITEM", new TextLocalisedClause(R$string.experiences_booking_date_title, null, null, 14), new t4(new TimeClause(travelExperiencesBooking.d.getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12), s4.FIXED_SMALL), null, false, null, null, 0, 0, 0, 0, 2040);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static qv0.i d(TravelExperiencesBooking travelExperiencesBooking) {
        if (travelExperiencesBooking.e == null) {
            return c(travelExperiencesBooking);
        }
        CounterTextDelegate.Model modelC = c(travelExperiencesBooking);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.experiences_booking_time_title, null, null, 14);
        String str = travelExperiencesBooking.e;
        Intrinsics.i(str, "null cannot be cast to non-null type kotlin.String");
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("EXPERIENCE_TIME_ITEM", textLocalisedClause, new t4(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), s4.FIXED_SMALL), null, false, null, null, 0, 0, 0, 0, 2040);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listK = zhm.v.k(modelC, model);
        int i = R$attr.uikit_dp8;
        return new xk("EXPERIENCE_DATE_TIME_ITEM", listK, null, null, null, i, i, 0, 0, 65148);
    }

    public static CellDetailsChevronDelegate.Model e(TravelExperiencesBooking travelExperiencesBooking) {
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("EXPERIENCE_ITEM", new TextLocalisedClause(R$string.experiences_booking_experience_details, null, null, 14), 0, false, travelExperiencesBooking, null, null, 2028);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static u8 f(TravelExperiencesBooking travelExperiencesBooking) {
        TextClause textClause = new TextClause(travelExperiencesBooking.f.f92805b, (Style) null, Integer.valueOf(R$attr.uikit_colorWhite), false, (o9) null, (List) null, 122);
        String str = (String) d0.d0(travelExperiencesBooking.f.f92806c);
        u8 u8Var = new u8("EXPERIENCE_TILE_ITEM", textClause, null, null, str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : new ResourceImage(R$drawable.uikit_icn_rect_background, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, null, false, false, false, null, 129000);
        yp0.b.l(u8Var, 0, 0, 0, 0, null, false, 63);
        return u8Var;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f211325a, new n0c.o(this, 25), new n0c.v(4), new m88.c(this, domainState, 17));
    }

    public final List g(e eVar) {
        if (eVar.e) {
            final int i = 1;
            return (List) iii.c.f(eVar.f211327c, new n0c.o(27), new n0c.v(6), new Function3(this) { // from class: n1g.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f211350b;

                {
                    this.f211350b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    qv0.o oVarG;
                    switch (i) {
                        case 0:
                            whf.p content = (whf.p) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content, "content");
                            return content.f297646a.isEmpty() ? f0.f322471a : yp0.b.g(whf.n.a(this.f211350b.f211353a, content, null, null, null, 14), new ListSubheaderDelegate.Model("TRANSACTIONS_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.experiences_booking_payments_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
                        default:
                            d1g.d transactionsContent = (d1g.d) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(transactionsContent, "content");
                            List list = transactionsContent.f110644a;
                            k71.q qVar = transactionsContent.f110645b;
                            if (list.isEmpty()) {
                                return f0.f322471a;
                            }
                            y yVar = (y) this.f211350b.f211354b;
                            yVar.getClass();
                            Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                            List<d1g.c> list2 = transactionsContent.f110644a;
                            ArrayList arrayList = new ArrayList();
                            for (d1g.c cVar : list2) {
                                if (cVar instanceof d1g.a) {
                                    oVarG = (qv0.i) d0.d0(whf.n.a(yVar.f211355a, new whf.p(zhm.u.c(((d1g.a) cVar).f110641b), qVar, transactionsContent.f110646c), null, null, null, 14));
                                } else {
                                    if (!(cVar instanceof d1g.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oVarG = ((pyb.s) yVar.f211356b).g(new r1(((d1g.b) cVar).f110642b, null), qVar, new TimeClause.Format.Pretty(q0.DATETIME));
                                }
                                if (oVarG != null) {
                                    arrayList.add(oVarG);
                                }
                            }
                            return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("TRANSACTIONS_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.experiences_booking_payments_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
                    }
                }
            });
        }
        final int i2 = 0;
        return (List) iii.c.f(eVar.f211326b, new n0c.o(26), new n0c.v(5), new Function3(this) { // from class: n1g.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f211350b;

            {
                this.f211350b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                qv0.o oVarG;
                switch (i2) {
                    case 0:
                        whf.p content = (whf.p) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content, "content");
                        return content.f297646a.isEmpty() ? f0.f322471a : yp0.b.g(whf.n.a(this.f211350b.f211353a, content, null, null, null, 14), new ListSubheaderDelegate.Model("TRANSACTIONS_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.experiences_booking_payments_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
                    default:
                        d1g.d transactionsContent = (d1g.d) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(transactionsContent, "content");
                        List list = transactionsContent.f110644a;
                        k71.q qVar = transactionsContent.f110645b;
                        if (list.isEmpty()) {
                            return f0.f322471a;
                        }
                        y yVar = (y) this.f211350b.f211354b;
                        yVar.getClass();
                        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                        List<d1g.c> list2 = transactionsContent.f110644a;
                        ArrayList arrayList = new ArrayList();
                        for (d1g.c cVar : list2) {
                            if (cVar instanceof d1g.a) {
                                oVarG = (qv0.i) d0.d0(whf.n.a(yVar.f211355a, new whf.p(zhm.u.c(((d1g.a) cVar).f110641b), qVar, transactionsContent.f110646c), null, null, null, 14));
                            } else {
                                if (!(cVar instanceof d1g.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oVarG = ((pyb.s) yVar.f211356b).g(new r1(((d1g.b) cVar).f110642b, null), qVar, new TimeClause.Format.Pretty(q0.DATETIME));
                            }
                            if (oVarG != null) {
                                arrayList.add(oVarG);
                            }
                        }
                        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("TRANSACTIONS_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.experiences_booking_payments_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
                }
            }
        });
    }
}
