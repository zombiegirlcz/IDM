package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxAuthorityService;
import ip0.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 {

    @NotNull
    public static final t2 Companion = new t2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerTaxAuthorityService f9651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f9653c;
    public final x4l.c d;
    public final x4l.c e;

    public w2(FreelancerTaxAuthorityService api2, ne0.j memoryCache, xe0.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9651a = api2;
        this.f9652b = memoryCache;
        this.f9653c = storage;
        final int i = 0;
        Continuation continuation = null;
        this.d = new x4l.c(new u2(this, continuation, i), new Function1(this) { // from class: au6.r2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f9611b;

            {
                this.f9611b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ds6.j type = (ds6.j) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(type, "type");
                        return (ds6.q) v7.r("freelancer:taxAuthority", type.name(), this.f9611b.f9652b);
                    default:
                        Intrinsics.checkNotNullParameter(type, "type");
                        return (List) v7.r("freelancer:taxAuthorityPaymentDetails:", type.name(), this.f9611b.f9652b);
                }
            }
        }, new Function2(this) { // from class: au6.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f9619b;

            {
                this.f9619b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ds6.j type = (ds6.j) obj2;
                switch (i) {
                    case 0:
                        ds6.q authority = (ds6.q) obj3;
                        Intrinsics.checkNotNullParameter(type, "type");
                        Intrinsics.checkNotNullParameter(authority, "authority");
                        this.f9619b.f9652b.f("freelancer:taxAuthority" + type.name(), authority);
                        break;
                    default:
                        List paymentDetails = (List) obj3;
                        Intrinsics.checkNotNullParameter(type, "type");
                        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
                        ehe.n.z("freelancer:taxAuthorityPaymentDetails:", type.name(), this.f9619b.f9652b, paymentDetails);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v2(this, continuation, i), new a0e.o(this, continuation, 12));
        final int i2 = 1;
        this.e = new x4l.c(new u2(this, continuation, i2), new Function1(this) { // from class: au6.r2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f9611b;

            {
                this.f9611b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ds6.j type = (ds6.j) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(type, "type");
                        return (ds6.q) v7.r("freelancer:taxAuthority", type.name(), this.f9611b.f9652b);
                    default:
                        Intrinsics.checkNotNullParameter(type, "type");
                        return (List) v7.r("freelancer:taxAuthorityPaymentDetails:", type.name(), this.f9611b.f9652b);
                }
            }
        }, new Function2(this) { // from class: au6.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f9619b;

            {
                this.f9619b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ds6.j type = (ds6.j) obj2;
                switch (i2) {
                    case 0:
                        ds6.q authority = (ds6.q) obj3;
                        Intrinsics.checkNotNullParameter(type, "type");
                        Intrinsics.checkNotNullParameter(authority, "authority");
                        this.f9619b.f9652b.f("freelancer:taxAuthority" + type.name(), authority);
                        break;
                    default:
                        List paymentDetails = (List) obj3;
                        Intrinsics.checkNotNullParameter(type, "type");
                        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
                        ehe.n.z("freelancer:taxAuthorityPaymentDetails:", type.name(), this.f9619b.f9652b, paymentDetails);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v2(this, continuation, i2), new a0e.o(this, continuation, 13));
    }
}
