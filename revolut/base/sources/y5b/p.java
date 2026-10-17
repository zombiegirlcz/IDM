package y5b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminder;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsBillingService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsBillingService f311057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f311058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f311059c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    public p(CobrandedCardsBillingService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f311057a = service;
        this.f311058b = storage;
        this.f311059c = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new wtc.b0(this, continuation, 9), new Function1(this) { // from class: y5b.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f311052b;

            {
                this.f311052b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (r5b.a) this.f311052b.f311059c.get("KEY_BILLING");
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        return (CobrandedCardsValueReminder) this.f311052b.f311059c.get(m.b(p.Companion, (String) pair.f186385a, (String) pair.f186386b));
                    default:
                        String cardId = (String) obj2;
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        return (CobrandedCardsValueReminder) this.f311052b.f311059c.get(m.a(p.Companion, cardId));
                }
            }
        }, new Function2(this) { // from class: y5b.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f311054b;

            {
                this.f311054b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        r5b.a domain = (r5b.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f311054b.f311059c.f("KEY_BILLING", domain);
                        break;
                    case 1:
                        Pair pair = (Pair) obj2;
                        CobrandedCardsValueReminder domain2 = (CobrandedCardsValueReminder) obj3;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f311054b.f311059c.f(m.b(p.Companion, (String) pair.f186385a, (String) pair.f186386b), domain2);
                        break;
                    default:
                        String cardId = (String) obj2;
                        CobrandedCardsValueReminder domain3 = (CobrandedCardsValueReminder) obj3;
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f311054b.f311059c.f(m.a(p.Companion, cardId), domain3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new xni.h(this, continuation, 28), new wa7.j(this, continuation, 15));
        wqj.g gVar = new wqj.g(this, continuation, 27);
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: y5b.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f311052b;

            {
                this.f311052b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (r5b.a) this.f311052b.f311059c.get("KEY_BILLING");
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        return (CobrandedCardsValueReminder) this.f311052b.f311059c.get(m.b(p.Companion, (String) pair.f186385a, (String) pair.f186386b));
                    default:
                        String cardId = (String) obj2;
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        return (CobrandedCardsValueReminder) this.f311052b.f311059c.get(m.a(p.Companion, cardId));
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: y5b.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f311054b;

            {
                this.f311054b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        r5b.a domain = (r5b.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f311054b.f311059c.f("KEY_BILLING", domain);
                        break;
                    case 1:
                        Pair pair = (Pair) obj2;
                        CobrandedCardsValueReminder domain2 = (CobrandedCardsValueReminder) obj3;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f311054b.f311059c.f(m.b(p.Companion, (String) pair.f186385a, (String) pair.f186386b), domain2);
                        break;
                    default:
                        String cardId = (String) obj2;
                        CobrandedCardsValueReminder domain3 = (CobrandedCardsValueReminder) obj3;
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f311054b.f311059c.f(m.a(p.Companion, cardId), domain3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        o oVar = new o(this, continuation, i2);
        int i3 = 26;
        this.e = new x4l.c(gVar, function1, function2, oVar, new wvg.i(this, continuation, i3));
        wqj.g gVar2 = new wqj.g(this, continuation, i3);
        final int i5 = 2;
        this.f = new x4l.c(gVar2, new Function1(this) { // from class: y5b.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f311052b;

            {
                this.f311052b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (r5b.a) this.f311052b.f311059c.get("KEY_BILLING");
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        return (CobrandedCardsValueReminder) this.f311052b.f311059c.get(m.b(p.Companion, (String) pair.f186385a, (String) pair.f186386b));
                    default:
                        String cardId = (String) obj2;
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        return (CobrandedCardsValueReminder) this.f311052b.f311059c.get(m.a(p.Companion, cardId));
                }
            }
        }, new Function2(this) { // from class: y5b.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f311054b;

            {
                this.f311054b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        r5b.a domain = (r5b.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f311054b.f311059c.f("KEY_BILLING", domain);
                        break;
                    case 1:
                        Pair pair = (Pair) obj2;
                        CobrandedCardsValueReminder domain2 = (CobrandedCardsValueReminder) obj3;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f311054b.f311059c.f(m.b(p.Companion, (String) pair.f186385a, (String) pair.f186386b), domain2);
                        break;
                    default:
                        String cardId = (String) obj2;
                        CobrandedCardsValueReminder domain3 = (CobrandedCardsValueReminder) obj3;
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f311054b.f311059c.f(m.a(p.Companion, cardId), domain3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new o(this, continuation, 0), new wvg.i(this, continuation, 25));
    }
}
