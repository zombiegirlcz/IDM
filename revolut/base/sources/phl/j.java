package phl;

import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.corporate_events.CorporateEventsService;
import efm.d0;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import pb2.v;
import pfk.o0;
import pfk.q;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f236355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CorporateEventsService f236356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p56.a f236357c;
    public final p56.a d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f236358g;

    public j(ne0.j memoryCache, b80.c networkStateRepository, CorporateEventsService corporateEventsService, bhl.f upcomingEventsDao, bhl.a calendarEventsDao) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(corporateEventsService, "corporateEventsService");
        Intrinsics.checkNotNullParameter(upcomingEventsDao, "upcomingEventsDao");
        Intrinsics.checkNotNullParameter(calendarEventsDao, "calendarEventsDao");
        this.f236355a = memoryCache;
        this.f236356b = corporateEventsService;
        this.f236357c = new p56.a(new pgk.f(this, 4));
        this.d = new p56.a(new pgk.f(upcomingEventsDao, 5));
        final int i = 0;
        uj0.b bVarK0 = w.k0(networkStateRepository, new Function1(this) { // from class: phl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236351b;

            {
                this.f236351b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0<fed.j> marketEventsForPeriod;
                switch (i) {
                    case 0:
                        l params = (l) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<fed.j> upcomingEvents = this.f236351b.f236356b.getUpcomingEvents(params.f236361a, params.f236362b);
                        phc.b bVar = new phc.b(12, new phc.e(15));
                        upcomingEvents.getClass();
                        ufm.i iVar = new ufm.i(upcomingEvents, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return this.f236351b.f236357c.i(params2.f236362b);
                    case 2:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f236351b.d.i(params3.f236362b);
                    case 3:
                        a params4 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        boolean z = params4.d;
                        LocalDate localDate = params4.f236342c;
                        LocalDate localDate2 = params4.f236341b;
                        j jVar = this.f236351b;
                        if (z) {
                            marketEventsForPeriod = jVar.f236356b.getMyEventsForPeriod(params4.f236340a, params4.e, localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null, localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null, params4.f);
                        } else {
                            CorporateEventsService corporateEventsService2 = jVar.f236356b;
                            String str = params4.f236340a;
                            String str2 = params4.e;
                            Instant instantG = localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null;
                            Instant instantG2 = localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null;
                            Instant instant = instantG;
                            Integer num = params4.f;
                            iel.f fVar = params4.f236343g;
                            marketEventsForPeriod = corporateEventsService2.getMarketEventsForPeriod(str, str2, instant, instantG2, num, fVar != null ? u1.g(fVar, ihl.a.f161428a) : null);
                        }
                        phc.b bVar2 = new phc.b(13, new phc.e(16));
                        marketEventsForPeriod.getClass();
                        ufm.i iVar2 = new ufm.i(marketEventsForPeriod, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        a params5 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (List) this.f236351b.f236355a.get(jb3.l.c(params5));
                    default:
                        k params6 = (k) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (iel.i) this.f236351b.f236355a.get(params6.f236359a + "_" + params6.f236360b);
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: phl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236351b;

            {
                this.f236351b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0<fed.j> marketEventsForPeriod;
                switch (i2) {
                    case 0:
                        l params = (l) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<fed.j> upcomingEvents = this.f236351b.f236356b.getUpcomingEvents(params.f236361a, params.f236362b);
                        phc.b bVar = new phc.b(12, new phc.e(15));
                        upcomingEvents.getClass();
                        ufm.i iVar = new ufm.i(upcomingEvents, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return this.f236351b.f236357c.i(params2.f236362b);
                    case 2:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f236351b.d.i(params3.f236362b);
                    case 3:
                        a params4 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        boolean z = params4.d;
                        LocalDate localDate = params4.f236342c;
                        LocalDate localDate2 = params4.f236341b;
                        j jVar = this.f236351b;
                        if (z) {
                            marketEventsForPeriod = jVar.f236356b.getMyEventsForPeriod(params4.f236340a, params4.e, localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null, localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null, params4.f);
                        } else {
                            CorporateEventsService corporateEventsService2 = jVar.f236356b;
                            String str = params4.f236340a;
                            String str2 = params4.e;
                            Instant instantG = localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null;
                            Instant instantG2 = localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null;
                            Instant instant = instantG;
                            Integer num = params4.f;
                            iel.f fVar = params4.f236343g;
                            marketEventsForPeriod = corporateEventsService2.getMarketEventsForPeriod(str, str2, instant, instantG2, num, fVar != null ? u1.g(fVar, ihl.a.f161428a) : null);
                        }
                        phc.b bVar2 = new phc.b(13, new phc.e(16));
                        marketEventsForPeriod.getClass();
                        ufm.i iVar2 = new ufm.i(marketEventsForPeriod, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        a params5 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (List) this.f236351b.f236355a.get(jb3.l.c(params5));
                    default:
                        k params6 = (k) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (iel.i) this.f236351b.f236355a.get(params6.f236359a + "_" + params6.f236360b);
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: phl.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236353b;

            {
                this.f236353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f236353b.f236355a.f("UPCOMING_EVENTS_MEMORY_KEY", domain);
                        break;
                    case 1:
                        a params = (a) obj2;
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f236353b.f236355a.f(jb3.l.c(params), domain2);
                        break;
                    default:
                        k params2 = (k) obj2;
                        iel.i domain3 = (iel.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f236353b.f236355a.f(params2.f236359a + "_" + params2.f236360b, domain3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        this.e = new w4l.f(bVarK0, function1, function2, new Function1(this) { // from class: phl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236351b;

            {
                this.f236351b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0<fed.j> marketEventsForPeriod;
                switch (i5) {
                    case 0:
                        l params = (l) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<fed.j> upcomingEvents = this.f236351b.f236356b.getUpcomingEvents(params.f236361a, params.f236362b);
                        phc.b bVar = new phc.b(12, new phc.e(15));
                        upcomingEvents.getClass();
                        ufm.i iVar = new ufm.i(upcomingEvents, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return this.f236351b.f236357c.i(params2.f236362b);
                    case 2:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f236351b.d.i(params3.f236362b);
                    case 3:
                        a params4 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        boolean z = params4.d;
                        LocalDate localDate = params4.f236342c;
                        LocalDate localDate2 = params4.f236341b;
                        j jVar = this.f236351b;
                        if (z) {
                            marketEventsForPeriod = jVar.f236356b.getMyEventsForPeriod(params4.f236340a, params4.e, localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null, localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null, params4.f);
                        } else {
                            CorporateEventsService corporateEventsService2 = jVar.f236356b;
                            String str = params4.f236340a;
                            String str2 = params4.e;
                            Instant instantG = localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null;
                            Instant instantG2 = localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null;
                            Instant instant = instantG;
                            Integer num = params4.f;
                            iel.f fVar = params4.f236343g;
                            marketEventsForPeriod = corporateEventsService2.getMarketEventsForPeriod(str, str2, instant, instantG2, num, fVar != null ? u1.g(fVar, ihl.a.f161428a) : null);
                        }
                        phc.b bVar2 = new phc.b(13, new phc.e(16));
                        marketEventsForPeriod.getClass();
                        ufm.i iVar2 = new ufm.i(marketEventsForPeriod, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        a params5 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (List) this.f236351b.f236355a.get(jb3.l.c(params5));
                    default:
                        k params6 = (k) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (iel.i) this.f236351b.f236355a.get(params6.f236359a + "_" + params6.f236360b);
                }
            }
        }, new p5f.c(upcomingEventsDao, 24), null, null, null, BERTags.FLAGS);
        final int i6 = 3;
        uj0.b bVarK02 = w.k0(networkStateRepository, new Function1(this) { // from class: phl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236351b;

            {
                this.f236351b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0<fed.j> marketEventsForPeriod;
                switch (i6) {
                    case 0:
                        l params = (l) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<fed.j> upcomingEvents = this.f236351b.f236356b.getUpcomingEvents(params.f236361a, params.f236362b);
                        phc.b bVar = new phc.b(12, new phc.e(15));
                        upcomingEvents.getClass();
                        ufm.i iVar = new ufm.i(upcomingEvents, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return this.f236351b.f236357c.i(params2.f236362b);
                    case 2:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f236351b.d.i(params3.f236362b);
                    case 3:
                        a params4 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        boolean z = params4.d;
                        LocalDate localDate = params4.f236342c;
                        LocalDate localDate2 = params4.f236341b;
                        j jVar = this.f236351b;
                        if (z) {
                            marketEventsForPeriod = jVar.f236356b.getMyEventsForPeriod(params4.f236340a, params4.e, localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null, localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null, params4.f);
                        } else {
                            CorporateEventsService corporateEventsService2 = jVar.f236356b;
                            String str = params4.f236340a;
                            String str2 = params4.e;
                            Instant instantG = localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null;
                            Instant instantG2 = localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null;
                            Instant instant = instantG;
                            Integer num = params4.f;
                            iel.f fVar = params4.f236343g;
                            marketEventsForPeriod = corporateEventsService2.getMarketEventsForPeriod(str, str2, instant, instantG2, num, fVar != null ? u1.g(fVar, ihl.a.f161428a) : null);
                        }
                        phc.b bVar2 = new phc.b(13, new phc.e(16));
                        marketEventsForPeriod.getClass();
                        ufm.i iVar2 = new ufm.i(marketEventsForPeriod, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        a params5 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (List) this.f236351b.f236355a.get(jb3.l.c(params5));
                    default:
                        k params6 = (k) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (iel.i) this.f236351b.f236355a.get(params6.f236359a + "_" + params6.f236360b);
                }
            }
        });
        final int i21 = 4;
        Function1 function12 = new Function1(this) { // from class: phl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236351b;

            {
                this.f236351b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0<fed.j> marketEventsForPeriod;
                switch (i21) {
                    case 0:
                        l params = (l) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<fed.j> upcomingEvents = this.f236351b.f236356b.getUpcomingEvents(params.f236361a, params.f236362b);
                        phc.b bVar = new phc.b(12, new phc.e(15));
                        upcomingEvents.getClass();
                        ufm.i iVar = new ufm.i(upcomingEvents, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return this.f236351b.f236357c.i(params2.f236362b);
                    case 2:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f236351b.d.i(params3.f236362b);
                    case 3:
                        a params4 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        boolean z = params4.d;
                        LocalDate localDate = params4.f236342c;
                        LocalDate localDate2 = params4.f236341b;
                        j jVar = this.f236351b;
                        if (z) {
                            marketEventsForPeriod = jVar.f236356b.getMyEventsForPeriod(params4.f236340a, params4.e, localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null, localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null, params4.f);
                        } else {
                            CorporateEventsService corporateEventsService2 = jVar.f236356b;
                            String str = params4.f236340a;
                            String str2 = params4.e;
                            Instant instantG = localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null;
                            Instant instantG2 = localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null;
                            Instant instant = instantG;
                            Integer num = params4.f;
                            iel.f fVar = params4.f236343g;
                            marketEventsForPeriod = corporateEventsService2.getMarketEventsForPeriod(str, str2, instant, instantG2, num, fVar != null ? u1.g(fVar, ihl.a.f161428a) : null);
                        }
                        phc.b bVar2 = new phc.b(13, new phc.e(16));
                        marketEventsForPeriod.getClass();
                        ufm.i iVar2 = new ufm.i(marketEventsForPeriod, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        a params5 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (List) this.f236351b.f236355a.get(jb3.l.c(params5));
                    default:
                        k params6 = (k) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (iel.i) this.f236351b.f236355a.get(params6.f236359a + "_" + params6.f236360b);
                }
            }
        };
        final int i22 = 1;
        this.f = new w4l.f(bVarK02, function12, new Function2(this) { // from class: phl.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236353b;

            {
                this.f236353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f236353b.f236355a.f("UPCOMING_EVENTS_MEMORY_KEY", domain);
                        break;
                    case 1:
                        a params = (a) obj2;
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f236353b.f236355a.f(jb3.l.c(params), domain2);
                        break;
                    default:
                        k params2 = (k) obj2;
                        iel.i domain3 = (iel.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f236353b.f236355a.f(params2.f236359a + "_" + params2.f236360b, domain3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v(calendarEventsDao, 21), new p5f.c(calendarEventsDao, 25), null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        o29.l lVar = new o29.l(this, continuation, 24);
        final int i32 = 5;
        Function1 function13 = new Function1(this) { // from class: phl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236351b;

            {
                this.f236351b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0<fed.j> marketEventsForPeriod;
                switch (i32) {
                    case 0:
                        l params = (l) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<fed.j> upcomingEvents = this.f236351b.f236356b.getUpcomingEvents(params.f236361a, params.f236362b);
                        phc.b bVar = new phc.b(12, new phc.e(15));
                        upcomingEvents.getClass();
                        ufm.i iVar = new ufm.i(upcomingEvents, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return this.f236351b.f236357c.i(params2.f236362b);
                    case 2:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f236351b.d.i(params3.f236362b);
                    case 3:
                        a params4 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        boolean z = params4.d;
                        LocalDate localDate = params4.f236342c;
                        LocalDate localDate2 = params4.f236341b;
                        j jVar = this.f236351b;
                        if (z) {
                            marketEventsForPeriod = jVar.f236356b.getMyEventsForPeriod(params4.f236340a, params4.e, localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null, localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null, params4.f);
                        } else {
                            CorporateEventsService corporateEventsService2 = jVar.f236356b;
                            String str = params4.f236340a;
                            String str2 = params4.e;
                            Instant instantG = localDate2 != null ? oc.c.G(localDate2, g0m.a.f139502a) : null;
                            Instant instantG2 = localDate != null ? oc.c.G(localDate, g0m.a.f139502a) : null;
                            Instant instant = instantG;
                            Integer num = params4.f;
                            iel.f fVar = params4.f236343g;
                            marketEventsForPeriod = corporateEventsService2.getMarketEventsForPeriod(str, str2, instant, instantG2, num, fVar != null ? u1.g(fVar, ihl.a.f161428a) : null);
                        }
                        phc.b bVar2 = new phc.b(13, new phc.e(16));
                        marketEventsForPeriod.getClass();
                        ufm.i iVar2 = new ufm.i(marketEventsForPeriod, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        a params5 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (List) this.f236351b.f236355a.get(jb3.l.c(params5));
                    default:
                        k params6 = (k) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return (iel.i) this.f236351b.f236355a.get(params6.f236359a + "_" + params6.f236360b);
                }
            }
        };
        final int i33 = 2;
        this.f236358g = new x4l.c(lVar, function13, new Function2(this) { // from class: phl.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236353b;

            {
                this.f236353b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f236353b.f236355a.f("UPCOMING_EVENTS_MEMORY_KEY", domain);
                        break;
                    case 1:
                        a params = (a) obj2;
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f236353b.f236355a.f(jb3.l.c(params), domain2);
                        break;
                    default:
                        k params2 = (k) obj2;
                        iel.i domain3 = (iel.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f236353b.f236355a.f(params2.f236359a + "_" + params2.f236360b, domain3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new o0(calendarEventsDao, continuation, 3), new q(calendarEventsDao, continuation, 6));
    }
}
