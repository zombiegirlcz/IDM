package au6;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxCalendarEventsService;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 {

    @NotNull
    public static final z2 Companion = new z2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f9505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe0.e f9506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreelancerTaxCalendarEventsService f9507c;
    public final os6.b d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f9508g;

    public c3(ne0.j memoryCache, xe0.e storage, FreelancerTaxCalendarEventsService taxCalendarEventsApi, os6.b taxCalendarEventsDao) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(taxCalendarEventsApi, "taxCalendarEventsApi");
        Intrinsics.checkNotNullParameter(taxCalendarEventsDao, "taxCalendarEventsDao");
        this.f9505a = memoryCache;
        this.f9506b = storage;
        this.f9507c = taxCalendarEventsApi;
        this.d = taxCalendarEventsDao;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new a09.o(this, continuation, 12), new Function1(this) { // from class: au6.x2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c3 f9660b;

            {
                this.f9660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f9660b.f9505a.get("freelancer:taxCalendarEvents:events");
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        TaxHubCalendarEvent taxHubCalendarEvent = (TaxHubCalendarEvent) v7.r("freelancer:taxCalendarEvents:events", id10, this.f9660b.f9505a);
                        if (taxHubCalendarEvent == null) {
                            return null;
                        }
                        od0.i.Companion.getClass();
                        return od0.h.a(taxHubCalendarEvent);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        return (TaxHubVatSummary) v7.r("freelancer:taxCalendarEvents:eventVatSummary:", id11, this.f9660b.f9505a);
                }
            }
        }, new Function2(this) { // from class: au6.y2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c3 f9666b;

            {
                this.f9666b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List<TaxHubCalendarEvent> events = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(events, "events");
                        c3 c3Var = this.f9666b;
                        ne0.j jVar = c3Var.f9505a;
                        jVar.f("freelancer:taxCalendarEvents:events", events);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (TaxHubCalendarEvent taxHubCalendarEvent : events) {
                            String str = taxHubCalendarEvent.f73483a;
                            if (((TaxHubCalendarEvent) v7.r("freelancer:taxCalendarEvents:events", str, jVar)) != null) {
                                linkedHashSet.add(str);
                                jVar.f("freelancer:taxCalendarEvents:events" + str, taxHubCalendarEvent);
                            }
                        }
                        x4l.c.a(c3Var.f, new an9.t(linkedHashSet, 1));
                        break;
                    case 1:
                        od0.i event = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        TaxHubCalendarEvent taxHubCalendarEvent2 = (TaxHubCalendarEvent) event.f224257a;
                        if (taxHubCalendarEvent2 != null) {
                            String str2 = taxHubCalendarEvent2.f73483a;
                            c3 c3Var2 = this.f9666b;
                            ne0.j jVar2 = c3Var2.f9505a;
                            jVar2.f("freelancer:taxCalendarEvents:events" + str2, taxHubCalendarEvent2);
                            List list = (List) jVar2.get("freelancer:taxCalendarEvents:events");
                            if (list != null) {
                                int size = list.size();
                                ArrayList arrayListF1 = zhm.d0.f1(list);
                                Iterator it8 = arrayListF1.iterator();
                                int i2 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i2 = -1;
                                    } else if (!Intrinsics.f(((TaxHubCalendarEvent) it8.next()).f73483a, str2)) {
                                        i2++;
                                    }
                                }
                                if (i2 >= 0) {
                                    arrayListF1.set(i2, taxHubCalendarEvent2);
                                } else {
                                    arrayListF1.add(size, taxHubCalendarEvent2);
                                }
                                jVar2.f("freelancer:taxCalendarEvents:events", arrayListF1);
                                x4l.c.a(c3Var2.e, new e2(2));
                            }
                        }
                        break;
                    default:
                        String id10 = (String) obj2;
                        TaxHubVatSummary summary = (TaxHubVatSummary) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f9666b.f9505a.f("freelancer:taxCalendarEvents:eventVatSummary:" + id10, summary);
                        break;
                }
                return Unit.f186387a;
            }
        }, new akl.e0(this, continuation, 15), new a09.p(this, continuation, 22));
        final int i2 = 1;
        this.f = new x4l.c(new a3(this, continuation, 0), new Function1(this) { // from class: au6.x2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c3 f9660b;

            {
                this.f9660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f9660b.f9505a.get("freelancer:taxCalendarEvents:events");
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        TaxHubCalendarEvent taxHubCalendarEvent = (TaxHubCalendarEvent) v7.r("freelancer:taxCalendarEvents:events", id10, this.f9660b.f9505a);
                        if (taxHubCalendarEvent == null) {
                            return null;
                        }
                        od0.i.Companion.getClass();
                        return od0.h.a(taxHubCalendarEvent);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        return (TaxHubVatSummary) v7.r("freelancer:taxCalendarEvents:eventVatSummary:", id11, this.f9660b.f9505a);
                }
            }
        }, new Function2(this) { // from class: au6.y2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c3 f9666b;

            {
                this.f9666b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List<TaxHubCalendarEvent> events = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(events, "events");
                        c3 c3Var = this.f9666b;
                        ne0.j jVar = c3Var.f9505a;
                        jVar.f("freelancer:taxCalendarEvents:events", events);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (TaxHubCalendarEvent taxHubCalendarEvent : events) {
                            String str = taxHubCalendarEvent.f73483a;
                            if (((TaxHubCalendarEvent) v7.r("freelancer:taxCalendarEvents:events", str, jVar)) != null) {
                                linkedHashSet.add(str);
                                jVar.f("freelancer:taxCalendarEvents:events" + str, taxHubCalendarEvent);
                            }
                        }
                        x4l.c.a(c3Var.f, new an9.t(linkedHashSet, 1));
                        break;
                    case 1:
                        od0.i event = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        TaxHubCalendarEvent taxHubCalendarEvent2 = (TaxHubCalendarEvent) event.f224257a;
                        if (taxHubCalendarEvent2 != null) {
                            String str2 = taxHubCalendarEvent2.f73483a;
                            c3 c3Var2 = this.f9666b;
                            ne0.j jVar2 = c3Var2.f9505a;
                            jVar2.f("freelancer:taxCalendarEvents:events" + str2, taxHubCalendarEvent2);
                            List list = (List) jVar2.get("freelancer:taxCalendarEvents:events");
                            if (list != null) {
                                int size = list.size();
                                ArrayList arrayListF1 = zhm.d0.f1(list);
                                Iterator it8 = arrayListF1.iterator();
                                int i22 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i22 = -1;
                                    } else if (!Intrinsics.f(((TaxHubCalendarEvent) it8.next()).f73483a, str2)) {
                                        i22++;
                                    }
                                }
                                if (i22 >= 0) {
                                    arrayListF1.set(i22, taxHubCalendarEvent2);
                                } else {
                                    arrayListF1.add(size, taxHubCalendarEvent2);
                                }
                                jVar2.f("freelancer:taxCalendarEvents:events", arrayListF1);
                                x4l.c.a(c3Var2.e, new e2(2));
                            }
                        }
                        break;
                    default:
                        String id10 = (String) obj2;
                        TaxHubVatSummary summary = (TaxHubVatSummary) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f9666b.f9505a.f("freelancer:taxCalendarEvents:eventVatSummary:" + id10, summary);
                        break;
                }
                return Unit.f186387a;
            }
        }, new b3(this, continuation, 0), new a09.p(this, continuation, 21));
        final int i3 = 2;
        this.f9508g = new x4l.c(new a72.k(this, continuation, 13), new Function1(this) { // from class: au6.x2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c3 f9660b;

            {
                this.f9660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f9660b.f9505a.get("freelancer:taxCalendarEvents:events");
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        TaxHubCalendarEvent taxHubCalendarEvent = (TaxHubCalendarEvent) v7.r("freelancer:taxCalendarEvents:events", id10, this.f9660b.f9505a);
                        if (taxHubCalendarEvent == null) {
                            return null;
                        }
                        od0.i.Companion.getClass();
                        return od0.h.a(taxHubCalendarEvent);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        return (TaxHubVatSummary) v7.r("freelancer:taxCalendarEvents:eventVatSummary:", id11, this.f9660b.f9505a);
                }
            }
        }, new Function2(this) { // from class: au6.y2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c3 f9666b;

            {
                this.f9666b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List<TaxHubCalendarEvent> events = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(events, "events");
                        c3 c3Var = this.f9666b;
                        ne0.j jVar = c3Var.f9505a;
                        jVar.f("freelancer:taxCalendarEvents:events", events);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (TaxHubCalendarEvent taxHubCalendarEvent : events) {
                            String str = taxHubCalendarEvent.f73483a;
                            if (((TaxHubCalendarEvent) v7.r("freelancer:taxCalendarEvents:events", str, jVar)) != null) {
                                linkedHashSet.add(str);
                                jVar.f("freelancer:taxCalendarEvents:events" + str, taxHubCalendarEvent);
                            }
                        }
                        x4l.c.a(c3Var.f, new an9.t(linkedHashSet, 1));
                        break;
                    case 1:
                        od0.i event = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        TaxHubCalendarEvent taxHubCalendarEvent2 = (TaxHubCalendarEvent) event.f224257a;
                        if (taxHubCalendarEvent2 != null) {
                            String str2 = taxHubCalendarEvent2.f73483a;
                            c3 c3Var2 = this.f9666b;
                            ne0.j jVar2 = c3Var2.f9505a;
                            jVar2.f("freelancer:taxCalendarEvents:events" + str2, taxHubCalendarEvent2);
                            List list = (List) jVar2.get("freelancer:taxCalendarEvents:events");
                            if (list != null) {
                                int size = list.size();
                                ArrayList arrayListF1 = zhm.d0.f1(list);
                                Iterator it8 = arrayListF1.iterator();
                                int i22 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i22 = -1;
                                    } else if (!Intrinsics.f(((TaxHubCalendarEvent) it8.next()).f73483a, str2)) {
                                        i22++;
                                    }
                                }
                                if (i22 >= 0) {
                                    arrayListF1.set(i22, taxHubCalendarEvent2);
                                } else {
                                    arrayListF1.add(size, taxHubCalendarEvent2);
                                }
                                jVar2.f("freelancer:taxCalendarEvents:events", arrayListF1);
                                x4l.c.a(c3Var2.e, new e2(2));
                            }
                        }
                        break;
                    default:
                        String id10 = (String) obj2;
                        TaxHubVatSummary summary = (TaxHubVatSummary) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f9666b.f9505a.f("freelancer:taxCalendarEvents:eventVatSummary:" + id10, summary);
                        break;
                }
                return Unit.f186387a;
            }
        }, new b3(this, continuation, 1), new a0e.o(this, continuation, 14));
    }
}
