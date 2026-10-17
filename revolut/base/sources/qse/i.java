package qse;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.tickets.impl.TicketsService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import om4.r0;
import org.jetbrains.annotations.NotNull;
import qsa.p;
import r4k.x;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketsService f248813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f248814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f248815c;
    public final ue0.c d;
    public final Type e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f248816g;

    public i(TicketsService ticketsService, e mapper, j memoryCache, ue0.c storage, re0.d cache) {
        Intrinsics.checkNotNullParameter(ticketsService, "ticketsService");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "dodCache");
        this.f248813a = ticketsService;
        this.f248814b = mapper;
        this.f248815c = memoryCache;
        this.d = storage;
        Type type = new TypeToken<List<? extends a>>() { // from class: com.revolut.feature.tickets.impl.TicketsRepository$ticketListType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.e = type;
        final int i = 6;
        Function2 function2 = new Function2(this) { // from class: qse.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248812b;

            {
                this.f248812b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        i iVar = this.f248812b;
                        iVar.d.G(iVar.f248814b.b(domain), "ACTIVE_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f248812b.f248815c.f("ALL_TICKETS", domain2);
                        return Unit.f186387a;
                    case 2:
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        i iVar2 = this.f248812b;
                        iVar2.d.G(iVar2.f248814b.b(domain3), "ALL_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        List tickets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets, "tickets");
                        return this.f248812b.f248814b.b(tickets);
                    case 4:
                        List tickets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets2, "tickets");
                        return this.f248812b.f248814b.a(tickets2);
                    case 5:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248812b;
                        d0<List<a>> activeTickets = iVar3.f248813a.getActiveTickets();
                        qsa.a aVar = new qsa.a(7, new qi3.i(1, iVar3.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 11));
                        activeTickets.getClass();
                        ufm.i iVar4 = new ufm.i(activeTickets, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        i iVar5 = this.f248812b;
                        d0<List<a>> tickets3 = iVar5.f248813a.getTickets();
                        qsa.a aVar2 = new qsa.a(6, new qi3.i(1, iVar5.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 12));
                        tickets3.getClass();
                        ufm.i iVar6 = new ufm.i(tickets3, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    default:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f248812b.f248815c.f("ACTIVE_TICKETS", domain4);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 2;
        Function1 function1 = new Function1(this) { // from class: qse.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248810b;

            {
                this.f248810b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar = this.f248810b;
                        List list = (List) iVar.d.T2("ACTIVE_TICKETS", iVar.e);
                        if (list != null) {
                            return iVar.f248814b.a(list);
                        }
                        return null;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar2 = this.f248810b;
                        iVar2.f248815c.remove("ACTIVE_TICKETS");
                        iVar2.d.I0("ACTIVE_TICKETS");
                        return Unit.f186387a;
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ALL_TICKETS");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248810b;
                        List list2 = (List) iVar3.d.T2("ALL_TICKETS", iVar3.e);
                        if (list2 != null) {
                            return iVar3.f248814b.a(list2);
                        }
                        return null;
                    case 4:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar4 = this.f248810b;
                        iVar4.f248815c.remove("ALL_TICKETS");
                        iVar4.d.I0("ALL_TICKETS");
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ACTIVE_TICKETS");
                }
            }
        };
        final int i3 = 1;
        Function2 function22 = new Function2(this) { // from class: qse.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248812b;

            {
                this.f248812b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        i iVar = this.f248812b;
                        iVar.d.G(iVar.f248814b.b(domain), "ACTIVE_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f248812b.f248815c.f("ALL_TICKETS", domain2);
                        return Unit.f186387a;
                    case 2:
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        i iVar2 = this.f248812b;
                        iVar2.d.G(iVar2.f248814b.b(domain3), "ALL_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        List tickets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets, "tickets");
                        return this.f248812b.f248814b.b(tickets);
                    case 4:
                        List tickets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets2, "tickets");
                        return this.f248812b.f248814b.a(tickets2);
                    case 5:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248812b;
                        d0<List<a>> activeTickets = iVar3.f248813a.getActiveTickets();
                        qsa.a aVar = new qsa.a(7, new qi3.i(1, iVar3.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 11));
                        activeTickets.getClass();
                        ufm.i iVar4 = new ufm.i(activeTickets, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        i iVar5 = this.f248812b;
                        d0<List<a>> tickets3 = iVar5.f248813a.getTickets();
                        qsa.a aVar2 = new qsa.a(6, new qi3.i(1, iVar5.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 12));
                        tickets3.getClass();
                        ufm.i iVar6 = new ufm.i(tickets3, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    default:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f248812b.f248815c.f("ACTIVE_TICKETS", domain4);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 3;
        Function1 function12 = new Function1(this) { // from class: qse.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248810b;

            {
                this.f248810b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar = this.f248810b;
                        List list = (List) iVar.d.T2("ACTIVE_TICKETS", iVar.e);
                        if (list != null) {
                            return iVar.f248814b.a(list);
                        }
                        return null;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar2 = this.f248810b;
                        iVar2.f248815c.remove("ACTIVE_TICKETS");
                        iVar2.d.I0("ACTIVE_TICKETS");
                        return Unit.f186387a;
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ALL_TICKETS");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248810b;
                        List list2 = (List) iVar3.d.T2("ALL_TICKETS", iVar3.e);
                        if (list2 != null) {
                            return iVar3.f248814b.a(list2);
                        }
                        return null;
                    case 4:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar4 = this.f248810b;
                        iVar4.f248815c.remove("ALL_TICKETS");
                        iVar4.d.I0("ALL_TICKETS");
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ACTIVE_TICKETS");
                }
            }
        };
        final int i6 = 2;
        Function2 function23 = new Function2(this) { // from class: qse.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248812b;

            {
                this.f248812b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        i iVar = this.f248812b;
                        iVar.d.G(iVar.f248814b.b(domain), "ACTIVE_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f248812b.f248815c.f("ALL_TICKETS", domain2);
                        return Unit.f186387a;
                    case 2:
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        i iVar2 = this.f248812b;
                        iVar2.d.G(iVar2.f248814b.b(domain3), "ALL_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        List tickets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets, "tickets");
                        return this.f248812b.f248814b.b(tickets);
                    case 4:
                        List tickets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets2, "tickets");
                        return this.f248812b.f248814b.a(tickets2);
                    case 5:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248812b;
                        d0<List<a>> activeTickets = iVar3.f248813a.getActiveTickets();
                        qsa.a aVar = new qsa.a(7, new qi3.i(1, iVar3.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 11));
                        activeTickets.getClass();
                        ufm.i iVar4 = new ufm.i(activeTickets, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        i iVar5 = this.f248812b;
                        d0<List<a>> tickets3 = iVar5.f248813a.getTickets();
                        qsa.a aVar2 = new qsa.a(6, new qi3.i(1, iVar5.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 12));
                        tickets3.getClass();
                        ufm.i iVar6 = new ufm.i(tickets3, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    default:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f248812b.f248815c.f("ACTIVE_TICKETS", domain4);
                        return Unit.f186387a;
                }
            }
        };
        final int i21 = 4;
        this.f = new w4l.f(function2, function1, function22, function12, function23, new Function1(this) { // from class: qse.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248810b;

            {
                this.f248810b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i21) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar = this.f248810b;
                        List list = (List) iVar.d.T2("ACTIVE_TICKETS", iVar.e);
                        if (list != null) {
                            return iVar.f248814b.a(list);
                        }
                        return null;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar2 = this.f248810b;
                        iVar2.f248815c.remove("ACTIVE_TICKETS");
                        iVar2.d.I0("ACTIVE_TICKETS");
                        return Unit.f186387a;
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ALL_TICKETS");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248810b;
                        List list2 = (List) iVar3.d.T2("ALL_TICKETS", iVar3.e);
                        if (list2 != null) {
                            return iVar3.f248814b.a(list2);
                        }
                        return null;
                    case 4:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar4 = this.f248810b;
                        iVar4.f248815c.remove("ALL_TICKETS");
                        iVar4.d.I0("ALL_TICKETS");
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ACTIVE_TICKETS");
                }
            }
        }, null, null, 192);
        final int i22 = 3;
        p key = new p(i22);
        Function2 mapToDto = new Function2(this) { // from class: qse.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248812b;

            {
                this.f248812b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        i iVar = this.f248812b;
                        iVar.d.G(iVar.f248814b.b(domain), "ACTIVE_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f248812b.f248815c.f("ALL_TICKETS", domain2);
                        return Unit.f186387a;
                    case 2:
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        i iVar2 = this.f248812b;
                        iVar2.d.G(iVar2.f248814b.b(domain3), "ALL_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        List tickets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets, "tickets");
                        return this.f248812b.f248814b.b(tickets);
                    case 4:
                        List tickets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets2, "tickets");
                        return this.f248812b.f248814b.a(tickets2);
                    case 5:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248812b;
                        d0<List<a>> activeTickets = iVar3.f248813a.getActiveTickets();
                        qsa.a aVar = new qsa.a(7, new qi3.i(1, iVar3.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 11));
                        activeTickets.getClass();
                        ufm.i iVar4 = new ufm.i(activeTickets, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        i iVar5 = this.f248812b;
                        d0<List<a>> tickets3 = iVar5.f248813a.getTickets();
                        qsa.a aVar2 = new qsa.a(6, new qi3.i(1, iVar5.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 12));
                        tickets3.getClass();
                        ufm.i iVar6 = new ufm.i(tickets3, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    default:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f248812b.f248815c.f("ACTIVE_TICKETS", domain4);
                        return Unit.f186387a;
                }
            }
        };
        final int i32 = 4;
        Function2 mapToDomain = new Function2(this) { // from class: qse.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248812b;

            {
                this.f248812b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        i iVar = this.f248812b;
                        iVar.d.G(iVar.f248814b.b(domain), "ACTIVE_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f248812b.f248815c.f("ALL_TICKETS", domain2);
                        return Unit.f186387a;
                    case 2:
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        i iVar2 = this.f248812b;
                        iVar2.d.G(iVar2.f248814b.b(domain3), "ALL_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        List tickets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets, "tickets");
                        return this.f248812b.f248814b.b(tickets);
                    case 4:
                        List tickets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets2, "tickets");
                        return this.f248812b.f248814b.a(tickets2);
                    case 5:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248812b;
                        d0<List<a>> activeTickets = iVar3.f248813a.getActiveTickets();
                        qsa.a aVar = new qsa.a(7, new qi3.i(1, iVar3.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 11));
                        activeTickets.getClass();
                        ufm.i iVar4 = new ufm.i(activeTickets, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        i iVar5 = this.f248812b;
                        d0<List<a>> tickets3 = iVar5.f248813a.getTickets();
                        qsa.a aVar2 = new qsa.a(6, new qi3.i(1, iVar5.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 12));
                        tickets3.getClass();
                        ufm.i iVar6 = new ufm.i(tickets3, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    default:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f248812b.f248815c.f("ACTIVE_TICKETS", domain4);
                        return Unit.f186387a;
                }
            }
        };
        Continuation continuation = null;
        pti.d fromNetwork = new pti.d(this, continuation, 11);
        Type dtoType = new TypeToken<List<? extends a>>() { // from class: com.revolut.feature.tickets.impl.TicketsRepository$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(dtoType, "getType(...)");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(dtoType, "dtoType");
        Intrinsics.checkNotNullParameter(mapToDto, "mapToDto");
        Intrinsics.checkNotNullParameter(mapToDomain, "mapToDomain");
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        new x4l.c(new r0(fromNetwork, mapToDomain, (Continuation) null), new x(cache, key), new qce.b(cache, key, 9), new a9h.c(7, cache, key, dtoType, mapToDomain, (Continuation) null), new re0.b(mapToDto, cache, key, dtoType, null), new qqj.g(cache, key, continuation, 4));
        final int i33 = 5;
        final int i43 = 5;
        final int i59 = 7;
        final int i66 = 0;
        final int i74 = 0;
        final int i92 = 1;
        this.f248816g = new w4l.f(new Function2(this) { // from class: qse.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248812b;

            {
                this.f248812b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        i iVar = this.f248812b;
                        iVar.d.G(iVar.f248814b.b(domain), "ACTIVE_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f248812b.f248815c.f("ALL_TICKETS", domain2);
                        return Unit.f186387a;
                    case 2:
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        i iVar2 = this.f248812b;
                        iVar2.d.G(iVar2.f248814b.b(domain3), "ALL_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        List tickets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets, "tickets");
                        return this.f248812b.f248814b.b(tickets);
                    case 4:
                        List tickets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets2, "tickets");
                        return this.f248812b.f248814b.a(tickets2);
                    case 5:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248812b;
                        d0<List<a>> activeTickets = iVar3.f248813a.getActiveTickets();
                        qsa.a aVar = new qsa.a(7, new qi3.i(1, iVar3.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 11));
                        activeTickets.getClass();
                        ufm.i iVar4 = new ufm.i(activeTickets, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        i iVar5 = this.f248812b;
                        d0<List<a>> tickets3 = iVar5.f248813a.getTickets();
                        qsa.a aVar2 = new qsa.a(6, new qi3.i(1, iVar5.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 12));
                        tickets3.getClass();
                        ufm.i iVar6 = new ufm.i(tickets3, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    default:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f248812b.f248815c.f("ACTIVE_TICKETS", domain4);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: qse.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248810b;

            {
                this.f248810b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i43) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar = this.f248810b;
                        List list = (List) iVar.d.T2("ACTIVE_TICKETS", iVar.e);
                        if (list != null) {
                            return iVar.f248814b.a(list);
                        }
                        return null;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar2 = this.f248810b;
                        iVar2.f248815c.remove("ACTIVE_TICKETS");
                        iVar2.d.I0("ACTIVE_TICKETS");
                        return Unit.f186387a;
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ALL_TICKETS");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248810b;
                        List list2 = (List) iVar3.d.T2("ALL_TICKETS", iVar3.e);
                        if (list2 != null) {
                            return iVar3.f248814b.a(list2);
                        }
                        return null;
                    case 4:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar4 = this.f248810b;
                        iVar4.f248815c.remove("ALL_TICKETS");
                        iVar4.d.I0("ALL_TICKETS");
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ACTIVE_TICKETS");
                }
            }
        }, new Function2(this) { // from class: qse.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248812b;

            {
                this.f248812b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        i iVar = this.f248812b;
                        iVar.d.G(iVar.f248814b.b(domain), "ACTIVE_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f248812b.f248815c.f("ALL_TICKETS", domain2);
                        return Unit.f186387a;
                    case 2:
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        i iVar2 = this.f248812b;
                        iVar2.d.G(iVar2.f248814b.b(domain3), "ALL_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        List tickets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets, "tickets");
                        return this.f248812b.f248814b.b(tickets);
                    case 4:
                        List tickets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets2, "tickets");
                        return this.f248812b.f248814b.a(tickets2);
                    case 5:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248812b;
                        d0<List<a>> activeTickets = iVar3.f248813a.getActiveTickets();
                        qsa.a aVar = new qsa.a(7, new qi3.i(1, iVar3.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 11));
                        activeTickets.getClass();
                        ufm.i iVar4 = new ufm.i(activeTickets, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        i iVar5 = this.f248812b;
                        d0<List<a>> tickets3 = iVar5.f248813a.getTickets();
                        qsa.a aVar2 = new qsa.a(6, new qi3.i(1, iVar5.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 12));
                        tickets3.getClass();
                        ufm.i iVar6 = new ufm.i(tickets3, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    default:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f248812b.f248815c.f("ACTIVE_TICKETS", domain4);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: qse.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248810b;

            {
                this.f248810b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i66) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar = this.f248810b;
                        List list = (List) iVar.d.T2("ACTIVE_TICKETS", iVar.e);
                        if (list != null) {
                            return iVar.f248814b.a(list);
                        }
                        return null;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar2 = this.f248810b;
                        iVar2.f248815c.remove("ACTIVE_TICKETS");
                        iVar2.d.I0("ACTIVE_TICKETS");
                        return Unit.f186387a;
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ALL_TICKETS");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248810b;
                        List list2 = (List) iVar3.d.T2("ALL_TICKETS", iVar3.e);
                        if (list2 != null) {
                            return iVar3.f248814b.a(list2);
                        }
                        return null;
                    case 4:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar4 = this.f248810b;
                        iVar4.f248815c.remove("ALL_TICKETS");
                        iVar4.d.I0("ALL_TICKETS");
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ACTIVE_TICKETS");
                }
            }
        }, new Function2(this) { // from class: qse.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248812b;

            {
                this.f248812b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        i iVar = this.f248812b;
                        iVar.d.G(iVar.f248814b.b(domain), "ACTIVE_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f248812b.f248815c.f("ALL_TICKETS", domain2);
                        return Unit.f186387a;
                    case 2:
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        i iVar2 = this.f248812b;
                        iVar2.d.G(iVar2.f248814b.b(domain3), "ALL_TICKETS", kii.e.o(a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        List tickets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets, "tickets");
                        return this.f248812b.f248814b.b(tickets);
                    case 4:
                        List tickets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tickets2, "tickets");
                        return this.f248812b.f248814b.a(tickets2);
                    case 5:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248812b;
                        d0<List<a>> activeTickets = iVar3.f248813a.getActiveTickets();
                        qsa.a aVar = new qsa.a(7, new qi3.i(1, iVar3.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 11));
                        activeTickets.getClass();
                        ufm.i iVar4 = new ufm.i(activeTickets, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        i iVar5 = this.f248812b;
                        d0<List<a>> tickets3 = iVar5.f248813a.getTickets();
                        qsa.a aVar2 = new qsa.a(6, new qi3.i(1, iVar5.f248814b, e.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 0, 12));
                        tickets3.getClass();
                        ufm.i iVar6 = new ufm.i(tickets3, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    default:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f248812b.f248815c.f("ACTIVE_TICKETS", domain4);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: qse.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f248810b;

            {
                this.f248810b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i92) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar = this.f248810b;
                        List list = (List) iVar.d.T2("ACTIVE_TICKETS", iVar.e);
                        if (list != null) {
                            return iVar.f248814b.a(list);
                        }
                        return null;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar2 = this.f248810b;
                        iVar2.f248815c.remove("ACTIVE_TICKETS");
                        iVar2.d.I0("ACTIVE_TICKETS");
                        return Unit.f186387a;
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ALL_TICKETS");
                    case 3:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar3 = this.f248810b;
                        List list2 = (List) iVar3.d.T2("ALL_TICKETS", iVar3.e);
                        if (list2 != null) {
                            return iVar3.f248814b.a(list2);
                        }
                        return null;
                    case 4:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        i iVar4 = this.f248810b;
                        iVar4.f248815c.remove("ALL_TICKETS");
                        iVar4.d.I0("ALL_TICKETS");
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f248810b.f248815c.get("ACTIVE_TICKETS");
                }
            }
        }, null, null, 192);
    }
}
