package vz1;

import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsService;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import ehe.n;
import ip0.v7;
import j02.m;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import th6.p;
import uyd.e0;
import vnl.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationsService f293363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f293364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f293365c;
    public final x4l.c d;

    public g(ApmPaymentAuthorisationsService service, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f293363a = service;
        this.f293364b = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        int i2 = 2;
        int i3 = 3;
        this.f293365c = new x4l.c(new f(this, continuation, 1), new Function1(this) { // from class: vz1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f293355b;

            {
                this.f293355b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                        return (List) v7.r("PENDING_PAYMENTS_KEY_", paymentMethod.name(), this.f293355b.f293364b);
                    case 1:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod2 = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        return (List) v7.r("INACTIVE_PENDING_PAYMENT_KEY_", paymentMethod2.name(), this.f293355b.f293364b);
                    default:
                        String authorisationId = (String) obj2;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        return (ApmPaymentAuthorisationSummary) v7.r("PENDING_PAYMENT_ITEM_KEY_", authorisationId, this.f293355b.f293364b);
                }
            }
        }, new Function2(this) { // from class: vz1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f293357b;

            {
                this.f293357b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                        Intrinsics.checkNotNullParameter(data, "data");
                        n.z("PENDING_PAYMENTS_KEY_", paymentMethod.name(), this.f293357b.f293364b, data);
                        break;
                    case 1:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod2 = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n.z("INACTIVE_PENDING_PAYMENT_KEY_", paymentMethod2.name(), this.f293357b.f293364b, data2);
                        break;
                    default:
                        String authorisationId = (String) obj2;
                        ApmPaymentAuthorisationSummary data3 = (ApmPaymentAuthorisationSummary) obj3;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f293357b.f293364b.f("PENDING_PAYMENT_ITEM_KEY_" + authorisationId, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new rp1.c(i2, 21, continuation), new e0(i3, 7, continuation));
        final int i5 = 1;
        new x4l.c(new f(this, continuation, 0), new Function1(this) { // from class: vz1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f293355b;

            {
                this.f293355b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                        return (List) v7.r("PENDING_PAYMENTS_KEY_", paymentMethod.name(), this.f293355b.f293364b);
                    case 1:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod2 = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        return (List) v7.r("INACTIVE_PENDING_PAYMENT_KEY_", paymentMethod2.name(), this.f293355b.f293364b);
                    default:
                        String authorisationId = (String) obj2;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        return (ApmPaymentAuthorisationSummary) v7.r("PENDING_PAYMENT_ITEM_KEY_", authorisationId, this.f293355b.f293364b);
                }
            }
        }, new Function2(this) { // from class: vz1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f293357b;

            {
                this.f293357b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                        Intrinsics.checkNotNullParameter(data, "data");
                        n.z("PENDING_PAYMENTS_KEY_", paymentMethod.name(), this.f293357b.f293364b, data);
                        break;
                    case 1:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod2 = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n.z("INACTIVE_PENDING_PAYMENT_KEY_", paymentMethod2.name(), this.f293357b.f293364b, data2);
                        break;
                    default:
                        String authorisationId = (String) obj2;
                        ApmPaymentAuthorisationSummary data3 = (ApmPaymentAuthorisationSummary) obj3;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f293357b.f293364b.f("PENDING_PAYMENT_ITEM_KEY_" + authorisationId, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new rp1.c(i2, 19, continuation), new e0(i3, 5, continuation));
        final int i6 = 2;
        final int i21 = 2;
        this.d = new x4l.c(new p(this, continuation, 22), new Function1(this) { // from class: vz1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f293355b;

            {
                this.f293355b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                        return (List) v7.r("PENDING_PAYMENTS_KEY_", paymentMethod.name(), this.f293355b.f293364b);
                    case 1:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod2 = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        return (List) v7.r("INACTIVE_PENDING_PAYMENT_KEY_", paymentMethod2.name(), this.f293355b.f293364b);
                    default:
                        String authorisationId = (String) obj2;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        return (ApmPaymentAuthorisationSummary) v7.r("PENDING_PAYMENT_ITEM_KEY_", authorisationId, this.f293355b.f293364b);
                }
            }
        }, new Function2(this) { // from class: vz1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f293357b;

            {
                this.f293357b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                        Intrinsics.checkNotNullParameter(data, "data");
                        n.z("PENDING_PAYMENTS_KEY_", paymentMethod.name(), this.f293357b.f293364b, data);
                        break;
                    case 1:
                        ApmPaymentAuthorisationPaymentMethod paymentMethod2 = (ApmPaymentAuthorisationPaymentMethod) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n.z("INACTIVE_PENDING_PAYMENT_KEY_", paymentMethod2.name(), this.f293357b.f293364b, data2);
                        break;
                    default:
                        String authorisationId = (String) obj2;
                        ApmPaymentAuthorisationSummary data3 = (ApmPaymentAuthorisationSummary) obj3;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f293357b.f293364b.f("PENDING_PAYMENT_ITEM_KEY_" + authorisationId, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new rp1.c(i2, 20, continuation), new e0(i3, 6, continuation));
    }

    public final Object a(m mVar, gim.c cVar) {
        o oVar = new o(this, mVar, null, 19);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, oVar, cVar);
    }

    public final vkm.d b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.d.b(id10, w4l.i.f294643c);
    }
}
