package nhc;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.data.network.services.RentAndBillsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import nfj.j2;
import nfj.l1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsService f215412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f215413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f215414c;
    public final x4l.c d;
    public final x4l.c e;

    public i(RentAndBillsService service, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f215412a = service;
        this.f215413b = storage;
        this.f215414c = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new f(this, continuation, 1), new Function1(this) { // from class: nhc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f215404b;

            {
                this.f215404b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (RentAndBillsLinkedPayments) this.f215404b.f215414c.get("KEY_RENT_AND_BILLS_LINKED_PAYMENTS");
                    default:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (RentAndBillsConfigurations) this.f215404b.f215414c.get(params.a());
                }
            }
        }, new Function2(this) { // from class: nhc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f215406b;

            {
                this.f215406b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        RentAndBillsLinkedPayments linkedPayments = (RentAndBillsLinkedPayments) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
                        this.f215406b.f215414c.f("KEY_RENT_AND_BILLS_LINKED_PAYMENTS", linkedPayments);
                        break;
                    default:
                        e params = (e) obj2;
                        RentAndBillsConfigurations configurations = (RentAndBillsConfigurations) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(configurations, "configurations");
                        this.f215406b.f215414c.f(params.a(), configurations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j2(this, continuation, 4), new l05.b(this, continuation, 23));
        final int i2 = 1;
        this.e = new x4l.c(new f(this, continuation, 0), new Function1(this) { // from class: nhc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f215404b;

            {
                this.f215404b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (RentAndBillsLinkedPayments) this.f215404b.f215414c.get("KEY_RENT_AND_BILLS_LINKED_PAYMENTS");
                    default:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (RentAndBillsConfigurations) this.f215404b.f215414c.get(params.a());
                }
            }
        }, new Function2(this) { // from class: nhc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f215406b;

            {
                this.f215406b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        RentAndBillsLinkedPayments linkedPayments = (RentAndBillsLinkedPayments) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
                        this.f215406b.f215414c.f("KEY_RENT_AND_BILLS_LINKED_PAYMENTS", linkedPayments);
                        break;
                    default:
                        e params = (e) obj2;
                        RentAndBillsConfigurations configurations = (RentAndBillsConfigurations) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(configurations, "configurations");
                        this.f215406b.f215414c.f(params.a(), configurations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new naf.j(this, continuation, 19), new l1(this, continuation, 3));
    }
}
