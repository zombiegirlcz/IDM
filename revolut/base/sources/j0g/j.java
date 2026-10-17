package j0g;

import androidx.room.util.DBUtil;
import c1g.m;
import com.revolut.feature.travel.experiences.api.TravelExperiencesApi$Toggles;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingRequest;
import com.revolut.feature.travel.experiences.api.models.cancellation.TravelExperienceCancellationRequest;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import com.revolut.feature.travel.experiences.impl.network.booking.TravelExperiencesBookingService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import myf.v;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import vkm.q;
import vkm.t1;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements exf.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesBookingService f170033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f170034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0g.c f170035c;
    public final a d;
    public final hyf.a e;
    public final ao.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ao.h f170036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f170037h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f170038j;
    public final w4l.f k;

    public j(TravelExperiencesBookingService service, ne0.j memoryCache, t0g.c bookingsDao, a experiencesBookingEventBus, hyf.a featureInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(bookingsDao, "bookingsDao");
        Intrinsics.checkNotNullParameter(experiencesBookingEventBus, "experiencesBookingEventBus");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        this.f170033a = service;
        this.f170034b = memoryCache;
        this.f170035c = bookingsDao;
        this.d = experiencesBookingEventBus;
        this.e = featureInteractor;
        final int i = 0;
        this.f = new ao.h(20, new Function1(this) { // from class: j0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170026b;

            {
                this.f170026b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                gzf.j jVar;
                switch (i) {
                    case 0:
                        TravelExperiencesBookingRequest params = (TravelExperiencesBookingRequest) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar2 = this.f170026b;
                        TravelExperiencesBookingService travelExperiencesBookingService = jVar2.f170033a;
                        String str = ((jte.d) ((m) jVar2.e).f20499c).c(TravelExperiencesApi$Toggles.ExperiencesRevPayMigration.f92745c) ? "2" : null;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        String str2 = params.f92764a;
                        List<TravelExperiencesBookingQuestionAnswer> list = params.f92765b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer : list) {
                            Intrinsics.checkNotNullParameter(travelExperiencesBookingQuestionAnswer, "<this>");
                            String str3 = travelExperiencesBookingQuestionAnswer.f92761a.f92788a;
                            String str4 = travelExperiencesBookingQuestionAnswer.f92762b;
                            myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
                            arrayList.add(new gzf.e(travelExperiencesBookingQuestionAnswer.d, str3, str4, dVar != null ? u1.g(dVar, zyf.a.f326455c) : null));
                        }
                        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = params.f92766c;
                        Intrinsics.checkNotNullParameter(travelExperiencesBookingContactDetails, "<this>");
                        gzf.b bVar = new gzf.b(new gzf.c(travelExperiencesBookingContactDetails.f92758a, travelExperiencesBookingContactDetails.f92759b), travelExperiencesBookingContactDetails.f92760c, travelExperiencesBookingContactDetails.d);
                        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = params.d;
                        if (travelExperienceSelectedLanguage != null) {
                            Intrinsics.checkNotNullParameter(travelExperienceSelectedLanguage, "<this>");
                            String str5 = travelExperienceSelectedLanguage.f92846a;
                            v vVar = travelExperienceSelectedLanguage.d;
                            jVar = new gzf.j(str5, vVar != null ? u1.g(vVar, zyf.d.f326458a) : null);
                        } else {
                            jVar = null;
                        }
                        d0<gzf.g> d0VarCreateBooking = travelExperiencesBookingService.createBooking(str, new gzf.f(str2, arrayList, bVar, jVar, params.e, params.f));
                        ivb.i iVar = new ivb.i(new iwk.b(19), 13);
                        d0VarCreateBooking.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarCreateBooking, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f170026b.f170034b.get("CACHE_KEY_BOOKINGS");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        t0g.c cVar = this.f170026b.f170035c;
                        List list2 = (List) DBUtil.performBlocking(cVar.f267025a, true, false, new sx8.a(cVar, 10));
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(uyf.a.b((u0g.a) it8.next()));
                        }
                        return arrayList2;
                    case 3:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (jyf.a) v7.r("CACHE_KEY_CANCELLATION_QUOTE", bookingId, this.f170026b.f170034b);
                    case 4:
                        TravelExperienceCancellationRequest params2 = (TravelExperienceCancellationRequest) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesBookingService travelExperiencesBookingService2 = this.f170026b.f170033a;
                        String str6 = params2.f92773a;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        z zVarD = travelExperiencesBookingService2.deleteBooking(str6, new izf.c(params2.f92774b)).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    case 5:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (TravelExperiencesBooking) v7.r("CACHE_KEY_BOOKING-", id10, this.f170026b.f170034b);
                    case 6:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        t0g.c cVar2 = this.f170026b.f170035c;
                        u0g.a aVar = (u0g.a) DBUtil.performBlocking(cVar2.f267025a, true, false, new sx2.h(cVar2, id11, 9));
                        if (aVar != null) {
                            return uyf.a.b(aVar);
                        }
                        return null;
                    default:
                        String bookingId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        return (iyf.c) v7.r("CACHE_KEY_BOOKING_STATUS-", bookingId2, this.f170026b.f170034b);
                }
            }
        });
        final int i2 = 4;
        this.f170036g = new ao.h(20, new Function1(this) { // from class: j0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170026b;

            {
                this.f170026b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                gzf.j jVar;
                switch (i2) {
                    case 0:
                        TravelExperiencesBookingRequest params = (TravelExperiencesBookingRequest) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar2 = this.f170026b;
                        TravelExperiencesBookingService travelExperiencesBookingService = jVar2.f170033a;
                        String str = ((jte.d) ((m) jVar2.e).f20499c).c(TravelExperiencesApi$Toggles.ExperiencesRevPayMigration.f92745c) ? "2" : null;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        String str2 = params.f92764a;
                        List<TravelExperiencesBookingQuestionAnswer> list = params.f92765b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer : list) {
                            Intrinsics.checkNotNullParameter(travelExperiencesBookingQuestionAnswer, "<this>");
                            String str3 = travelExperiencesBookingQuestionAnswer.f92761a.f92788a;
                            String str4 = travelExperiencesBookingQuestionAnswer.f92762b;
                            myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
                            arrayList.add(new gzf.e(travelExperiencesBookingQuestionAnswer.d, str3, str4, dVar != null ? u1.g(dVar, zyf.a.f326455c) : null));
                        }
                        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = params.f92766c;
                        Intrinsics.checkNotNullParameter(travelExperiencesBookingContactDetails, "<this>");
                        gzf.b bVar = new gzf.b(new gzf.c(travelExperiencesBookingContactDetails.f92758a, travelExperiencesBookingContactDetails.f92759b), travelExperiencesBookingContactDetails.f92760c, travelExperiencesBookingContactDetails.d);
                        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = params.d;
                        if (travelExperienceSelectedLanguage != null) {
                            Intrinsics.checkNotNullParameter(travelExperienceSelectedLanguage, "<this>");
                            String str5 = travelExperienceSelectedLanguage.f92846a;
                            v vVar = travelExperienceSelectedLanguage.d;
                            jVar = new gzf.j(str5, vVar != null ? u1.g(vVar, zyf.d.f326458a) : null);
                        } else {
                            jVar = null;
                        }
                        d0<gzf.g> d0VarCreateBooking = travelExperiencesBookingService.createBooking(str, new gzf.f(str2, arrayList, bVar, jVar, params.e, params.f));
                        ivb.i iVar = new ivb.i(new iwk.b(19), 13);
                        d0VarCreateBooking.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarCreateBooking, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f170026b.f170034b.get("CACHE_KEY_BOOKINGS");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        t0g.c cVar = this.f170026b.f170035c;
                        List list2 = (List) DBUtil.performBlocking(cVar.f267025a, true, false, new sx8.a(cVar, 10));
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(uyf.a.b((u0g.a) it8.next()));
                        }
                        return arrayList2;
                    case 3:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (jyf.a) v7.r("CACHE_KEY_CANCELLATION_QUOTE", bookingId, this.f170026b.f170034b);
                    case 4:
                        TravelExperienceCancellationRequest params2 = (TravelExperienceCancellationRequest) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesBookingService travelExperiencesBookingService2 = this.f170026b.f170033a;
                        String str6 = params2.f92773a;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        z zVarD = travelExperiencesBookingService2.deleteBooking(str6, new izf.c(params2.f92774b)).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    case 5:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (TravelExperiencesBooking) v7.r("CACHE_KEY_BOOKING-", id10, this.f170026b.f170034b);
                    case 6:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        t0g.c cVar2 = this.f170026b.f170035c;
                        u0g.a aVar = (u0g.a) DBUtil.performBlocking(cVar2.f267025a, true, false, new sx2.h(cVar2, id11, 9));
                        if (aVar != null) {
                            return uyf.a.b(aVar);
                        }
                        return null;
                    default:
                        String bookingId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        return (iyf.c) v7.r("CACHE_KEY_BOOKING_STATUS-", bookingId2, this.f170026b.f170034b);
                }
            }
        });
        final int i3 = 5;
        Function2 function2 = new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: j0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170026b;

            {
                this.f170026b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                gzf.j jVar;
                switch (i3) {
                    case 0:
                        TravelExperiencesBookingRequest params = (TravelExperiencesBookingRequest) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar2 = this.f170026b;
                        TravelExperiencesBookingService travelExperiencesBookingService = jVar2.f170033a;
                        String str = ((jte.d) ((m) jVar2.e).f20499c).c(TravelExperiencesApi$Toggles.ExperiencesRevPayMigration.f92745c) ? "2" : null;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        String str2 = params.f92764a;
                        List<TravelExperiencesBookingQuestionAnswer> list = params.f92765b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer : list) {
                            Intrinsics.checkNotNullParameter(travelExperiencesBookingQuestionAnswer, "<this>");
                            String str3 = travelExperiencesBookingQuestionAnswer.f92761a.f92788a;
                            String str4 = travelExperiencesBookingQuestionAnswer.f92762b;
                            myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
                            arrayList.add(new gzf.e(travelExperiencesBookingQuestionAnswer.d, str3, str4, dVar != null ? u1.g(dVar, zyf.a.f326455c) : null));
                        }
                        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = params.f92766c;
                        Intrinsics.checkNotNullParameter(travelExperiencesBookingContactDetails, "<this>");
                        gzf.b bVar = new gzf.b(new gzf.c(travelExperiencesBookingContactDetails.f92758a, travelExperiencesBookingContactDetails.f92759b), travelExperiencesBookingContactDetails.f92760c, travelExperiencesBookingContactDetails.d);
                        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = params.d;
                        if (travelExperienceSelectedLanguage != null) {
                            Intrinsics.checkNotNullParameter(travelExperienceSelectedLanguage, "<this>");
                            String str5 = travelExperienceSelectedLanguage.f92846a;
                            v vVar = travelExperienceSelectedLanguage.d;
                            jVar = new gzf.j(str5, vVar != null ? u1.g(vVar, zyf.d.f326458a) : null);
                        } else {
                            jVar = null;
                        }
                        d0<gzf.g> d0VarCreateBooking = travelExperiencesBookingService.createBooking(str, new gzf.f(str2, arrayList, bVar, jVar, params.e, params.f));
                        ivb.i iVar = new ivb.i(new iwk.b(19), 13);
                        d0VarCreateBooking.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarCreateBooking, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f170026b.f170034b.get("CACHE_KEY_BOOKINGS");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        t0g.c cVar = this.f170026b.f170035c;
                        List list2 = (List) DBUtil.performBlocking(cVar.f267025a, true, false, new sx8.a(cVar, 10));
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(uyf.a.b((u0g.a) it8.next()));
                        }
                        return arrayList2;
                    case 3:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (jyf.a) v7.r("CACHE_KEY_CANCELLATION_QUOTE", bookingId, this.f170026b.f170034b);
                    case 4:
                        TravelExperienceCancellationRequest params2 = (TravelExperienceCancellationRequest) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesBookingService travelExperiencesBookingService2 = this.f170026b.f170033a;
                        String str6 = params2.f92773a;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        z zVarD = travelExperiencesBookingService2.deleteBooking(str6, new izf.c(params2.f92774b)).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    case 5:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (TravelExperiencesBooking) v7.r("CACHE_KEY_BOOKING-", id10, this.f170026b.f170034b);
                    case 6:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        t0g.c cVar2 = this.f170026b.f170035c;
                        u0g.a aVar = (u0g.a) DBUtil.performBlocking(cVar2.f267025a, true, false, new sx2.h(cVar2, id11, 9));
                        if (aVar != null) {
                            return uyf.a.b(aVar);
                        }
                        return null;
                    default:
                        String bookingId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        return (iyf.c) v7.r("CACHE_KEY_BOOKING_STATUS-", bookingId2, this.f170026b.f170034b);
                }
            }
        };
        final int i5 = 6;
        Function2 function22 = new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: j0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170026b;

            {
                this.f170026b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                gzf.j jVar;
                switch (i5) {
                    case 0:
                        TravelExperiencesBookingRequest params = (TravelExperiencesBookingRequest) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar2 = this.f170026b;
                        TravelExperiencesBookingService travelExperiencesBookingService = jVar2.f170033a;
                        String str = ((jte.d) ((m) jVar2.e).f20499c).c(TravelExperiencesApi$Toggles.ExperiencesRevPayMigration.f92745c) ? "2" : null;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        String str2 = params.f92764a;
                        List<TravelExperiencesBookingQuestionAnswer> list = params.f92765b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer : list) {
                            Intrinsics.checkNotNullParameter(travelExperiencesBookingQuestionAnswer, "<this>");
                            String str3 = travelExperiencesBookingQuestionAnswer.f92761a.f92788a;
                            String str4 = travelExperiencesBookingQuestionAnswer.f92762b;
                            myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
                            arrayList.add(new gzf.e(travelExperiencesBookingQuestionAnswer.d, str3, str4, dVar != null ? u1.g(dVar, zyf.a.f326455c) : null));
                        }
                        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = params.f92766c;
                        Intrinsics.checkNotNullParameter(travelExperiencesBookingContactDetails, "<this>");
                        gzf.b bVar = new gzf.b(new gzf.c(travelExperiencesBookingContactDetails.f92758a, travelExperiencesBookingContactDetails.f92759b), travelExperiencesBookingContactDetails.f92760c, travelExperiencesBookingContactDetails.d);
                        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = params.d;
                        if (travelExperienceSelectedLanguage != null) {
                            Intrinsics.checkNotNullParameter(travelExperienceSelectedLanguage, "<this>");
                            String str5 = travelExperienceSelectedLanguage.f92846a;
                            v vVar = travelExperienceSelectedLanguage.d;
                            jVar = new gzf.j(str5, vVar != null ? u1.g(vVar, zyf.d.f326458a) : null);
                        } else {
                            jVar = null;
                        }
                        d0<gzf.g> d0VarCreateBooking = travelExperiencesBookingService.createBooking(str, new gzf.f(str2, arrayList, bVar, jVar, params.e, params.f));
                        ivb.i iVar = new ivb.i(new iwk.b(19), 13);
                        d0VarCreateBooking.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarCreateBooking, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f170026b.f170034b.get("CACHE_KEY_BOOKINGS");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        t0g.c cVar = this.f170026b.f170035c;
                        List list2 = (List) DBUtil.performBlocking(cVar.f267025a, true, false, new sx8.a(cVar, 10));
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(uyf.a.b((u0g.a) it8.next()));
                        }
                        return arrayList2;
                    case 3:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (jyf.a) v7.r("CACHE_KEY_CANCELLATION_QUOTE", bookingId, this.f170026b.f170034b);
                    case 4:
                        TravelExperienceCancellationRequest params2 = (TravelExperienceCancellationRequest) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesBookingService travelExperiencesBookingService2 = this.f170026b.f170033a;
                        String str6 = params2.f92773a;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        z zVarD = travelExperiencesBookingService2.deleteBooking(str6, new izf.c(params2.f92774b)).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    case 5:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (TravelExperiencesBooking) v7.r("CACHE_KEY_BOOKING-", id10, this.f170026b.f170034b);
                    case 6:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        t0g.c cVar2 = this.f170026b.f170035c;
                        u0g.a aVar = (u0g.a) DBUtil.performBlocking(cVar2.f267025a, true, false, new sx2.h(cVar2, id11, 9));
                        if (aVar != null) {
                            return uyf.a.b(aVar);
                        }
                        return null;
                    default:
                        String bookingId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        return (iyf.c) v7.r("CACHE_KEY_BOOKING_STATUS-", bookingId2, this.f170026b.f170034b);
                }
            }
        };
        final int i6 = 7;
        this.f170037h = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 8;
        Function2 function23 = new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        };
        final int i22 = 7;
        Function1 function13 = new Function1(this) { // from class: j0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170026b;

            {
                this.f170026b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                gzf.j jVar;
                switch (i22) {
                    case 0:
                        TravelExperiencesBookingRequest params = (TravelExperiencesBookingRequest) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar2 = this.f170026b;
                        TravelExperiencesBookingService travelExperiencesBookingService = jVar2.f170033a;
                        String str = ((jte.d) ((m) jVar2.e).f20499c).c(TravelExperiencesApi$Toggles.ExperiencesRevPayMigration.f92745c) ? "2" : null;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        String str2 = params.f92764a;
                        List<TravelExperiencesBookingQuestionAnswer> list = params.f92765b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer : list) {
                            Intrinsics.checkNotNullParameter(travelExperiencesBookingQuestionAnswer, "<this>");
                            String str3 = travelExperiencesBookingQuestionAnswer.f92761a.f92788a;
                            String str4 = travelExperiencesBookingQuestionAnswer.f92762b;
                            myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
                            arrayList.add(new gzf.e(travelExperiencesBookingQuestionAnswer.d, str3, str4, dVar != null ? u1.g(dVar, zyf.a.f326455c) : null));
                        }
                        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = params.f92766c;
                        Intrinsics.checkNotNullParameter(travelExperiencesBookingContactDetails, "<this>");
                        gzf.b bVar = new gzf.b(new gzf.c(travelExperiencesBookingContactDetails.f92758a, travelExperiencesBookingContactDetails.f92759b), travelExperiencesBookingContactDetails.f92760c, travelExperiencesBookingContactDetails.d);
                        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = params.d;
                        if (travelExperienceSelectedLanguage != null) {
                            Intrinsics.checkNotNullParameter(travelExperienceSelectedLanguage, "<this>");
                            String str5 = travelExperienceSelectedLanguage.f92846a;
                            v vVar = travelExperienceSelectedLanguage.d;
                            jVar = new gzf.j(str5, vVar != null ? u1.g(vVar, zyf.d.f326458a) : null);
                        } else {
                            jVar = null;
                        }
                        d0<gzf.g> d0VarCreateBooking = travelExperiencesBookingService.createBooking(str, new gzf.f(str2, arrayList, bVar, jVar, params.e, params.f));
                        ivb.i iVar = new ivb.i(new iwk.b(19), 13);
                        d0VarCreateBooking.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarCreateBooking, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f170026b.f170034b.get("CACHE_KEY_BOOKINGS");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        t0g.c cVar = this.f170026b.f170035c;
                        List list2 = (List) DBUtil.performBlocking(cVar.f267025a, true, false, new sx8.a(cVar, 10));
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(uyf.a.b((u0g.a) it8.next()));
                        }
                        return arrayList2;
                    case 3:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (jyf.a) v7.r("CACHE_KEY_CANCELLATION_QUOTE", bookingId, this.f170026b.f170034b);
                    case 4:
                        TravelExperienceCancellationRequest params2 = (TravelExperienceCancellationRequest) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesBookingService travelExperiencesBookingService2 = this.f170026b.f170033a;
                        String str6 = params2.f92773a;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        z zVarD = travelExperiencesBookingService2.deleteBooking(str6, new izf.c(params2.f92774b)).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    case 5:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (TravelExperiencesBooking) v7.r("CACHE_KEY_BOOKING-", id10, this.f170026b.f170034b);
                    case 6:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        t0g.c cVar2 = this.f170026b.f170035c;
                        u0g.a aVar = (u0g.a) DBUtil.performBlocking(cVar2.f267025a, true, false, new sx2.h(cVar2, id11, 9));
                        if (aVar != null) {
                            return uyf.a.b(aVar);
                        }
                        return null;
                    default:
                        String bookingId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        return (iyf.c) v7.r("CACHE_KEY_BOOKING_STATUS-", bookingId2, this.f170026b.f170034b);
                }
            }
        };
        final int i32 = 9;
        this.i = new w4l.f(function23, function13, new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i33 = 0;
        Function2 function24 = new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        };
        final int i43 = 1;
        Function1 function14 = new Function1(this) { // from class: j0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170026b;

            {
                this.f170026b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                gzf.j jVar;
                switch (i43) {
                    case 0:
                        TravelExperiencesBookingRequest params = (TravelExperiencesBookingRequest) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar2 = this.f170026b;
                        TravelExperiencesBookingService travelExperiencesBookingService = jVar2.f170033a;
                        String str = ((jte.d) ((m) jVar2.e).f20499c).c(TravelExperiencesApi$Toggles.ExperiencesRevPayMigration.f92745c) ? "2" : null;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        String str2 = params.f92764a;
                        List<TravelExperiencesBookingQuestionAnswer> list = params.f92765b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer : list) {
                            Intrinsics.checkNotNullParameter(travelExperiencesBookingQuestionAnswer, "<this>");
                            String str3 = travelExperiencesBookingQuestionAnswer.f92761a.f92788a;
                            String str4 = travelExperiencesBookingQuestionAnswer.f92762b;
                            myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
                            arrayList.add(new gzf.e(travelExperiencesBookingQuestionAnswer.d, str3, str4, dVar != null ? u1.g(dVar, zyf.a.f326455c) : null));
                        }
                        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = params.f92766c;
                        Intrinsics.checkNotNullParameter(travelExperiencesBookingContactDetails, "<this>");
                        gzf.b bVar = new gzf.b(new gzf.c(travelExperiencesBookingContactDetails.f92758a, travelExperiencesBookingContactDetails.f92759b), travelExperiencesBookingContactDetails.f92760c, travelExperiencesBookingContactDetails.d);
                        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = params.d;
                        if (travelExperienceSelectedLanguage != null) {
                            Intrinsics.checkNotNullParameter(travelExperienceSelectedLanguage, "<this>");
                            String str5 = travelExperienceSelectedLanguage.f92846a;
                            v vVar = travelExperienceSelectedLanguage.d;
                            jVar = new gzf.j(str5, vVar != null ? u1.g(vVar, zyf.d.f326458a) : null);
                        } else {
                            jVar = null;
                        }
                        d0<gzf.g> d0VarCreateBooking = travelExperiencesBookingService.createBooking(str, new gzf.f(str2, arrayList, bVar, jVar, params.e, params.f));
                        ivb.i iVar = new ivb.i(new iwk.b(19), 13);
                        d0VarCreateBooking.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarCreateBooking, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f170026b.f170034b.get("CACHE_KEY_BOOKINGS");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        t0g.c cVar = this.f170026b.f170035c;
                        List list2 = (List) DBUtil.performBlocking(cVar.f267025a, true, false, new sx8.a(cVar, 10));
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(uyf.a.b((u0g.a) it8.next()));
                        }
                        return arrayList2;
                    case 3:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (jyf.a) v7.r("CACHE_KEY_CANCELLATION_QUOTE", bookingId, this.f170026b.f170034b);
                    case 4:
                        TravelExperienceCancellationRequest params2 = (TravelExperienceCancellationRequest) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesBookingService travelExperiencesBookingService2 = this.f170026b.f170033a;
                        String str6 = params2.f92773a;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        z zVarD = travelExperiencesBookingService2.deleteBooking(str6, new izf.c(params2.f92774b)).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    case 5:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (TravelExperiencesBooking) v7.r("CACHE_KEY_BOOKING-", id10, this.f170026b.f170034b);
                    case 6:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        t0g.c cVar2 = this.f170026b.f170035c;
                        u0g.a aVar = (u0g.a) DBUtil.performBlocking(cVar2.f267025a, true, false, new sx2.h(cVar2, id11, 9));
                        if (aVar != null) {
                            return uyf.a.b(aVar);
                        }
                        return null;
                    default:
                        String bookingId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        return (iyf.c) v7.r("CACHE_KEY_BOOKING_STATUS-", bookingId2, this.f170026b.f170034b);
                }
            }
        };
        Function2 function25 = new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        };
        final int i59 = 2;
        this.f170038j = new w4l.f(function24, function14, function25, new Function1(this) { // from class: j0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170026b;

            {
                this.f170026b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                gzf.j jVar;
                switch (i59) {
                    case 0:
                        TravelExperiencesBookingRequest params = (TravelExperiencesBookingRequest) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar2 = this.f170026b;
                        TravelExperiencesBookingService travelExperiencesBookingService = jVar2.f170033a;
                        String str = ((jte.d) ((m) jVar2.e).f20499c).c(TravelExperiencesApi$Toggles.ExperiencesRevPayMigration.f92745c) ? "2" : null;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        String str2 = params.f92764a;
                        List<TravelExperiencesBookingQuestionAnswer> list = params.f92765b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer : list) {
                            Intrinsics.checkNotNullParameter(travelExperiencesBookingQuestionAnswer, "<this>");
                            String str3 = travelExperiencesBookingQuestionAnswer.f92761a.f92788a;
                            String str4 = travelExperiencesBookingQuestionAnswer.f92762b;
                            myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
                            arrayList.add(new gzf.e(travelExperiencesBookingQuestionAnswer.d, str3, str4, dVar != null ? u1.g(dVar, zyf.a.f326455c) : null));
                        }
                        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = params.f92766c;
                        Intrinsics.checkNotNullParameter(travelExperiencesBookingContactDetails, "<this>");
                        gzf.b bVar = new gzf.b(new gzf.c(travelExperiencesBookingContactDetails.f92758a, travelExperiencesBookingContactDetails.f92759b), travelExperiencesBookingContactDetails.f92760c, travelExperiencesBookingContactDetails.d);
                        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = params.d;
                        if (travelExperienceSelectedLanguage != null) {
                            Intrinsics.checkNotNullParameter(travelExperienceSelectedLanguage, "<this>");
                            String str5 = travelExperienceSelectedLanguage.f92846a;
                            v vVar = travelExperienceSelectedLanguage.d;
                            jVar = new gzf.j(str5, vVar != null ? u1.g(vVar, zyf.d.f326458a) : null);
                        } else {
                            jVar = null;
                        }
                        d0<gzf.g> d0VarCreateBooking = travelExperiencesBookingService.createBooking(str, new gzf.f(str2, arrayList, bVar, jVar, params.e, params.f));
                        ivb.i iVar = new ivb.i(new iwk.b(19), 13);
                        d0VarCreateBooking.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarCreateBooking, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f170026b.f170034b.get("CACHE_KEY_BOOKINGS");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        t0g.c cVar = this.f170026b.f170035c;
                        List list2 = (List) DBUtil.performBlocking(cVar.f267025a, true, false, new sx8.a(cVar, 10));
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(uyf.a.b((u0g.a) it8.next()));
                        }
                        return arrayList2;
                    case 3:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (jyf.a) v7.r("CACHE_KEY_CANCELLATION_QUOTE", bookingId, this.f170026b.f170034b);
                    case 4:
                        TravelExperienceCancellationRequest params2 = (TravelExperienceCancellationRequest) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesBookingService travelExperiencesBookingService2 = this.f170026b.f170033a;
                        String str6 = params2.f92773a;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        z zVarD = travelExperiencesBookingService2.deleteBooking(str6, new izf.c(params2.f92774b)).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    case 5:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (TravelExperiencesBooking) v7.r("CACHE_KEY_BOOKING-", id10, this.f170026b.f170034b);
                    case 6:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        t0g.c cVar2 = this.f170026b.f170035c;
                        u0g.a aVar = (u0g.a) DBUtil.performBlocking(cVar2.f267025a, true, false, new sx2.h(cVar2, id11, 9));
                        if (aVar != null) {
                            return uyf.a.b(aVar);
                        }
                        return null;
                    default:
                        String bookingId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        return (iyf.c) v7.r("CACHE_KEY_BOOKING_STATUS-", bookingId2, this.f170026b.f170034b);
                }
            }
        }, new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i66 = 3;
        Function2 function26 = new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function15 = new Function1(this) { // from class: j0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170026b;

            {
                this.f170026b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                gzf.j jVar;
                switch (i66) {
                    case 0:
                        TravelExperiencesBookingRequest params = (TravelExperiencesBookingRequest) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar2 = this.f170026b;
                        TravelExperiencesBookingService travelExperiencesBookingService = jVar2.f170033a;
                        String str = ((jte.d) ((m) jVar2.e).f20499c).c(TravelExperiencesApi$Toggles.ExperiencesRevPayMigration.f92745c) ? "2" : null;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        String str2 = params.f92764a;
                        List<TravelExperiencesBookingQuestionAnswer> list = params.f92765b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer : list) {
                            Intrinsics.checkNotNullParameter(travelExperiencesBookingQuestionAnswer, "<this>");
                            String str3 = travelExperiencesBookingQuestionAnswer.f92761a.f92788a;
                            String str4 = travelExperiencesBookingQuestionAnswer.f92762b;
                            myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
                            arrayList.add(new gzf.e(travelExperiencesBookingQuestionAnswer.d, str3, str4, dVar != null ? u1.g(dVar, zyf.a.f326455c) : null));
                        }
                        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = params.f92766c;
                        Intrinsics.checkNotNullParameter(travelExperiencesBookingContactDetails, "<this>");
                        gzf.b bVar = new gzf.b(new gzf.c(travelExperiencesBookingContactDetails.f92758a, travelExperiencesBookingContactDetails.f92759b), travelExperiencesBookingContactDetails.f92760c, travelExperiencesBookingContactDetails.d);
                        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = params.d;
                        if (travelExperienceSelectedLanguage != null) {
                            Intrinsics.checkNotNullParameter(travelExperienceSelectedLanguage, "<this>");
                            String str5 = travelExperienceSelectedLanguage.f92846a;
                            v vVar = travelExperienceSelectedLanguage.d;
                            jVar = new gzf.j(str5, vVar != null ? u1.g(vVar, zyf.d.f326458a) : null);
                        } else {
                            jVar = null;
                        }
                        d0<gzf.g> d0VarCreateBooking = travelExperiencesBookingService.createBooking(str, new gzf.f(str2, arrayList, bVar, jVar, params.e, params.f));
                        ivb.i iVar = new ivb.i(new iwk.b(19), 13);
                        d0VarCreateBooking.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarCreateBooking, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f170026b.f170034b.get("CACHE_KEY_BOOKINGS");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        t0g.c cVar = this.f170026b.f170035c;
                        List list2 = (List) DBUtil.performBlocking(cVar.f267025a, true, false, new sx8.a(cVar, 10));
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(uyf.a.b((u0g.a) it8.next()));
                        }
                        return arrayList2;
                    case 3:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (jyf.a) v7.r("CACHE_KEY_CANCELLATION_QUOTE", bookingId, this.f170026b.f170034b);
                    case 4:
                        TravelExperienceCancellationRequest params2 = (TravelExperienceCancellationRequest) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesBookingService travelExperiencesBookingService2 = this.f170026b.f170033a;
                        String str6 = params2.f92773a;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        z zVarD = travelExperiencesBookingService2.deleteBooking(str6, new izf.c(params2.f92774b)).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    case 5:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (TravelExperiencesBooking) v7.r("CACHE_KEY_BOOKING-", id10, this.f170026b.f170034b);
                    case 6:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        t0g.c cVar2 = this.f170026b.f170035c;
                        u0g.a aVar = (u0g.a) DBUtil.performBlocking(cVar2.f267025a, true, false, new sx2.h(cVar2, id11, 9));
                        if (aVar != null) {
                            return uyf.a.b(aVar);
                        }
                        return null;
                    default:
                        String bookingId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        return (iyf.c) v7.r("CACHE_KEY_BOOKING_STATUS-", bookingId2, this.f170026b.f170034b);
                }
            }
        };
        final int i74 = 4;
        this.k = new w4l.f(function26, function15, new Function2(this) { // from class: j0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f170028b;

            {
                this.f170028b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<gzf.d>> bookings = this.f170028b.f170033a.getBookings();
                        ivb.i iVar = new ivb.i(new iwk.b(21), 14);
                        bookings.getClass();
                        ufm.i iVar2 = new ufm.i(bookings, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        List bookingsList = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList, "bookingsList");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKINGS", bookingsList);
                        return Unit.f186387a;
                    case 2:
                        List bookingsList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(bookingsList2, "bookingsList");
                        t0g.c cVar = this.f170028b.f170035c;
                        List list = bookingsList2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(uyf.a.c((TravelExperiencesBooking) it8.next()));
                        }
                        DBUtil.performBlocking(cVar.f267025a, false, true, new t0g.a(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String bookingId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        d0<qzf.h> bookingCancellationQuote = this.f170028b.f170033a.getBookingCancellationQuote(bookingId);
                        ivb.i iVar3 = new ivb.i(new iwk.b(23), 16);
                        bookingCancellationQuote.getClass();
                        ufm.i iVar4 = new ufm.i(bookingCancellationQuote, iVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 4:
                        String bookingId2 = (String) obj2;
                        jyf.a quote = (jyf.a) obj3;
                        Intrinsics.checkNotNullParameter(bookingId2, "bookingId");
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        this.f170028b.f170034b.f("CACHE_KEY_CANCELLATION_QUOTE" + bookingId2, quote);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<gzf.d> booking = this.f170028b.f170033a.getBooking(id10);
                        ivb.i iVar5 = new ivb.i(new iwk.b(24), 17);
                        booking.getClass();
                        ufm.i iVar6 = new ufm.i(booking, iVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 6:
                        String id11 = (String) obj2;
                        TravelExperiencesBooking booking2 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(booking2, "booking");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING-" + id11, booking2);
                        return Unit.f186387a;
                    case 7:
                        TravelExperiencesBooking booking3 = (TravelExperiencesBooking) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(booking3, "booking");
                        t0g.c cVar2 = this.f170028b.f170035c;
                        u0g.a aVarC = uyf.a.c(booking3);
                        cVar2.getClass();
                        DBUtil.performBlocking(cVar2.f267025a, false, true, new sx2.h(cVar2, aVarC, 10));
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String bookingId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bookingId3, "bookingId");
                        d0<gzf.h> bookingStatus = this.f170028b.f170033a.getBookingStatus(bookingId3);
                        ivb.i iVar7 = new ivb.i(new iwk.b(22), 15);
                        bookingStatus.getClass();
                        ufm.i iVar8 = new ufm.i(bookingStatus, iVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    default:
                        String bookingId4 = (String) obj2;
                        iyf.c status = (iyf.c) obj3;
                        Intrinsics.checkNotNullParameter(bookingId4, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f170028b.f170034b.f("CACHE_KEY_BOOKING_STATUS-" + bookingId4, status);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    @Override // exf.a
    public final t1 a() {
        return q.g(this.d.f170023a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingRequest r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof j0g.g
            if (r0 == 0) goto L13
            r0 = r6
            j0g.g r0 = (j0g.g) r0
            int r1 = r0.f170030w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f170030w = r1
            goto L18
        L13:
            j0g.g r0 = new j0g.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f170030w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ao.h r6 = r4.f
            efm.d0 r5 = r6.k(r5)
            r0.f170030w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r6
            iyf.d r5 = (iyf.d) r5
            pei.a r5 = pei.a.CREATED
            r4.e(r5)
            java.lang.String r5 = "also(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j0g.j.b(com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingRequest, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.travel.experiences.api.models.cancellation.TravelExperienceCancellationRequest r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof j0g.h
            if (r0 == 0) goto L13
            r0 = r6
            j0g.h r0 = (j0g.h) r0
            int r1 = r0.f170031w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f170031w = r1
            goto L18
        L13:
            j0g.h r0 = new j0g.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f170031w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ao.h r6 = r4.f170036g
            efm.d0 r5 = r6.k(r5)
            r0.f170031w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r6
            kotlin.Unit r5 = (kotlin.Unit) r5
            pei.a r5 = pei.a.CANCELLED
            r4.e(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j0g.j.c(com.revolut.feature.travel.experiences.api.models.cancellation.TravelExperienceCancellationRequest, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof j0g.i
            if (r0 == 0) goto L13
            r0 = r8
            j0g.i r0 = (j0g.i) r0
            int r1 = r0.f170032w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f170032w = r1
            goto L18
        L13:
            j0g.i r0 = new j0g.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f170032w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L83
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            w4l.f r8 = r6.i
            w4l.i r2 = w4l.i.f294643c
            efm.r r7 = r8.e(r7, r2)
            iui.b r8 = new iui.b
            r2 = 29
            r8.<init>(r2)
            r2 = 0
            efm.r r7 = m70.a.g(r7, r2, r8, r3)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r8 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            j0g.b r8 = new j0g.b
            r2 = 0
            r8.<init>(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            ufm.i r7 = mra.d.H(r7, r4, r8)
            iwk.b r8 = new iwk.b
            r2 = 20
            r8.<init>(r2)
            ivb.i r2 = new ivb.i
            r4 = 12
            r2.<init>(r8, r4)
            ufm.i r8 = new ufm.i
            r4 = 1
            r8.<init>(r7, r2, r4)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            pei.a r7 = pei.a.FAILED
            pfm.z r7 = ue0.e.F(r8, r7)
            r0.f170032w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L83
            return r1
        L83:
            pei.a r8 = (pei.a) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            r6.e(r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j0g.j.d(java.lang.String, gim.c):java.lang.Object");
    }

    public final void e(pei.a event) {
        a aVar = this.d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        aVar.f170023a.k(event);
    }
}
