package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FlightSegmentDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/FlightSegmentDelegate$Model;", "Lip0/dj;", "<init>", "()V", "Companion", "Model", "ip0/cj", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlightSegmentDelegate extends BaseBoxRecyclerViewDelegate<Model, ip0.dj> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FlightSegmentDelegate$Model;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/q;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/k6", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.p, TrackableItem, qv0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k6 f52356c;
        public final LocalDate d;
        public final LocalDateTime e;
        public final CompositeClause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Duration f52357g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final LocalDateTime f52358h;
        public final CompositeClause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f52359j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public qv0.c f52360l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52361m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52362n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f52363p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52364q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f52365r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52366s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f52367t;

        public static abstract class a {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.FlightSegmentDelegate$Model$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0404a extends a {
                private AbstractC0404a() {
                }
            }

            private a() {
            }
        }

        public Model(String listId, Image airlineIcon, k6 title, LocalDate tripDepartureDate, LocalDateTime departureDateTime, CompositeClause placeDeparture, Duration duration, LocalDateTime arrivalDateTime, CompositeClause placeArrival, a footer) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(airlineIcon, "airlineIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tripDepartureDate, "tripDepartureDate");
            Intrinsics.checkNotNullParameter(departureDateTime, "departureDateTime");
            Intrinsics.checkNotNullParameter(placeDeparture, "placeDeparture");
            Intrinsics.checkNotNullParameter(arrivalDateTime, "arrivalDateTime");
            Intrinsics.checkNotNullParameter(placeArrival, "placeArrival");
            Intrinsics.checkNotNullParameter(footer, "footer");
            int i = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(airlineIcon, "airlineIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tripDepartureDate, "tripDepartureDate");
            Intrinsics.checkNotNullParameter(departureDateTime, "departureDateTime");
            Intrinsics.checkNotNullParameter(placeDeparture, "placeDeparture");
            Intrinsics.checkNotNullParameter(arrivalDateTime, "arrivalDateTime");
            Intrinsics.checkNotNullParameter(placeArrival, "placeArrival");
            Intrinsics.checkNotNullParameter(footer, "footer");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f52354a = listId;
            this.f52355b = airlineIcon;
            this.f52356c = title;
            this.d = tripDepartureDate;
            this.e = departureDateTime;
            this.f = placeDeparture;
            this.f52357g = duration;
            this.f52358h = arrivalDateTime;
            this.i = placeArrival;
            this.f52359j = footer;
            this.k = null;
            this.f52360l = positionInBox;
            this.f52361m = i;
            this.f52362n = i;
            this.o = i;
            this.f52363p = i;
            this.f52364q = null;
            this.f52365r = null;
            this.f52366s = null;
            this.f52367t = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new FlightSegmentDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF52656t() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52354a() {
            return this.f52354a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52354a, model.f52354a) && this.f52355b.equals(model.f52355b) && this.f52356c.equals(model.f52356c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f.equals(model.f) && Intrinsics.f(this.f52357g, model.f52357g) && Intrinsics.f(this.f52358h, model.f52358h) && this.i.equals(model.i) && this.f52359j.equals(model.f52359j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52360l, model.f52360l) && this.f52361m == model.f52361m && this.f52362n == model.f52362n && this.o == model.o && this.f52363p == model.f52363p && Intrinsics.f(this.f52364q, model.f52364q) && Intrinsics.f(this.f52365r, model.f52365r) && Intrinsics.f(this.f52366s, model.f52366s) && Intrinsics.f(this.f52367t, model.f52367t);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52361m() {
            return this.f52361m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52361m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.k;
        }

        public final int hashCode() {
            int iC = h30.l.c(this.f, ip0.v7.i(this.e, wp5.y.a((this.f52356c.hashCode() + a10.b.c(this.f52355b, this.f52354a.hashCode() * 31, 31)) * 31, 31, this.d), 31), 31);
            Duration duration = this.f52357g;
            int iHashCode = (this.f52359j.hashCode() + h30.l.c(this.i, ip0.v7.i(this.f52358h, (iC + (duration == null ? 0 : duration.hashCode())) * 31, 31), 31)) * 961;
            Parcelable parcelable = this.k;
            int iB = j6.a.b(this.f52363p, j6.a.b(this.o, j6.a.b(this.f52362n, j6.a.b(this.f52361m, h30.l.i(this.f52360l, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f52364q;
            int iHashCode2 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52365r;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52366s;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52367t;
            return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52364q() {
            return this.f52364q;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52360l = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52365r() {
            return this.f52365r;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52366s = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52362n() {
            return this.f52362n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52363p() {
            return this.f52363p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52362n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52360l() {
            return this.f52360l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52367t() {
            return this.f52367t;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52366s() {
            return this.f52366s;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52364q = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52365r = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52367t = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            Image image = model.f52355b;
            LocalDateTime localDateTime = model.e;
            boolean z = !image.equals(this.f52355b);
            boolean z3 = !model.f52356c.equals(this.f52356c);
            boolean z4 = !Intrinsics.f(model.d, this.d);
            LocalDateTime localDateTime2 = this.e;
            return new ip0.cj(z, z3, z4, !Intrinsics.f(localDateTime, localDateTime2), !model.f.equals(this.f), !Intrinsics.f(model.f52357g, this.f52357g), !Intrinsics.f(localDateTime, localDateTime2), !model.i.equals(this.i), !model.f52359j.equals(this.f52359j), !true, !Intrinsics.f(model.k, this.k), or0.b.l(this, (qv0.i) oldItem));
        }
    }

    public FlightSegmentDelegate() {
        super(R$layout.internal_delegate_flight_segment, false, new ip0.zf(23));
    }

    public static TextClause q(LocalDate localDate, LocalDate localDate2) {
        int iBetween = (int) ChronoUnit.DAYS.between(localDate, localDate2);
        Integer numValueOf = Integer.valueOf(iBetween);
        if (iBetween == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new TextClause(a0.d.n("+", numValueOf.intValue()), (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126);
        }
        return null;
    }

    public static TimeClause r(Duration duration) {
        return new TimeClause(duration.toMillis(), new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(com.revolut.core.ui_kit.models.p0.MINUTES)), null, null, 12);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.dj(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_flight_segment));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.dj holder, Model data, int i, List list) {
        Integer numValueOf;
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause;
        List payloads = list;
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.cj)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        boolean z54 = z49;
        int i3 = 0;
        while (i3 < size2) {
            ip0.cj cjVar = (ip0.cj) payloads.get(i3);
            z = z || cjVar.f163744a;
            z4 = z4 || cjVar.f163745b;
            z3 = z3 || cjVar.f163746c;
            zIsEmpty = zIsEmpty || cjVar.d;
            z6 = z6 || cjVar.e;
            z11 = z11 || cjVar.f;
            z12 = z12 || cjVar.f163747g;
            z29 = z29 || cjVar.f163748h;
            z31 = z31 || cjVar.i;
            List list2 = payloads;
            z41 = z41 || cjVar.f163749j;
            z49 = z49 || cjVar.k;
            z54 = z54 || cjVar.f163750l;
            i3++;
            payloads = list2;
        }
        if (zIsEmpty) {
            com.revolut.core.ui_kit.models.k kVar = aw0.d7.Companion;
            LocalTime localTime = data.e.toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
            kli.a.b(holder.f163910h, com.revolut.core.ui_kit.models.k.a(kVar, localTime), ty0.f.f275450a);
        }
        if (zIsEmpty || z3) {
            LocalDate localDate = data.d;
            LocalDate localDate2 = data.e.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
            kli.a.b(holder.i, q(localDate, localDate2), ty0.f.f275450a);
        }
        if (z6) {
            kli.a.b(holder.f163911j, data.f, ty0.f.f275450a);
        }
        if (z11) {
            TextView textView = holder.k;
            Duration duration = data.f52357g;
            kli.a.b(textView, duration != null ? r(duration) : null, ty0.f.f275450a);
        }
        if (z12) {
            com.revolut.core.ui_kit.models.k kVar2 = aw0.d7.Companion;
            LocalTime localTime2 = data.f52358h.toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime2, "toLocalTime(...)");
            kli.a.b(holder.f163912l, com.revolut.core.ui_kit.models.k.a(kVar2, localTime2), ty0.f.f275450a);
        }
        if (z12 || z3) {
            LocalDate localDate3 = data.d;
            LocalDate localDate4 = data.f52358h.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate4, "toLocalDate(...)");
            kli.a.b(holder.f163913m, q(localDate3, localDate4), ty0.f.f275450a);
        }
        if (z29) {
            kli.a.b(holder.f163914n, data.i, ty0.f.f275450a);
        }
        if (z) {
            zi0.c.g(holder.f, data.f52355b);
        }
        if (z4) {
            k6 k6Var = data.f52356c;
            TextClause textClause = k6Var.f54370a;
            TextClause textClause2 = k6Var.f54371b;
            Clause clause = k6Var.f54372c;
            TextView textView2 = holder.f163909g;
            Clause[] elements = {textClause, textClause2, clause};
            Intrinsics.checkNotNullParameter(elements, "elements");
            kli.a.b(textView2, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), ty0.f.f275450a);
        }
        if (z31) {
            Model.a aVar = data.f52359j;
            if (aVar instanceof h6) {
                textLocalisedClause = null;
                List listK = zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_calendar, Integer.valueOf(R$attr.uikit_colorGreyTone20), fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.uikit_travel_flight_segment_date_of_arrival, zhm.u.c(com.revolut.core.ui_kit.models.j.b(aw0.c7.Companion, ((h6) aVar).f54233a, new LocalDateClause$DateFormat.DateMedium(com.revolut.core.ui_kit.models.n0.HIDE_CURRENT_YEAR))), null, 12));
                m70.a.t(kotlin.jvm.internal.t0.f186434a);
                compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), null, null, 12);
                numValueOf = null;
            } else if (aVar instanceof i6) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.uikit_travel_flight_segment_connection_airport_change, zhm.v.k(r(((i6) aVar).f54279b), ((i6) aVar).f54278a), new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 8);
                numValueOf = Integer.valueOf(R$attr.uikit_colorInputError);
                compositeClause = null;
                textLocalisedClause = textLocalisedClause2;
            } else {
                if (!(aVar instanceof j6)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.uikit_travel_flight_segment_connection_at_airport, zhm.u.c(r(((j6) aVar).f54322a)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50_70), false, null, false, null, 254), 8);
                numValueOf = Integer.valueOf(R$attr.uikit_colorNestedBackground);
                compositeClause = null;
                textLocalisedClause = textLocalisedClause3;
            }
            TextView textView3 = holder.f163915p;
            TextView textView4 = holder.o;
            kli.a.b(textView3, compositeClause, ty0.f.f275450a);
            kli.a.b(textView4, textLocalisedClause, ty0.f.f275450a);
            if (numValueOf != null) {
                Context context = textView4.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                knm.b.A(kli.a.s(numValueOf.intValue(), context), textView4);
            }
        }
    }
}
