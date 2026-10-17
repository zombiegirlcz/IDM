package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardService f116604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.d f116606c;
    public final xx4.e d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f116607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f116608h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f116609j;

    public c0(CreditCardService api2, xx4.d timeMemoryCache, xx4.d hashMemoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(timeMemoryCache, "timeMemoryCache");
        Intrinsics.checkNotNullParameter(hashMemoryCache, "hashMemoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116604a = api2;
        this.f116605b = timeMemoryCache;
        this.f116606c = hashMemoryCache;
        this.d = storage;
        Continuation continuation = null;
        cuh.a aVar = new cuh.a(this, continuation, 14);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: dp4.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116712b;

            {
                this.f116712b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        cp4.z key = (cp4.z) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (ql4.e) this.f116712b.f116605b.a(key);
                    case 1:
                        cp4.o0 key2 = (cp4.o0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (ql4.d0) this.f116712b.f116606c.a(key2);
                    case 2:
                        cp4.g0 key3 = (cp4.g0) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (ql4.y) this.f116712b.f116606c.a(key3);
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (ql4.a0) this.f116712b.f116606c.a(key4);
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (List) this.f116712b.f116606c.a(key5);
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (ql4.q) this.f116712b.f116606c.a(key6);
                }
            }
        };
        final int i2 = 2;
        this.e = new x4l.c(aVar, function1, new Function2(this) { // from class: dp4.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116716b;

            {
                this.f116716b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        cp4.o0 key = (cp4.o0) obj2;
                        ql4.d0 planDetails = (ql4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
                        this.f116716b.f116606c.b(key, planDetails);
                        break;
                    case 1:
                        cp4.g0 key2 = (cp4.g0) obj2;
                        ql4.y planDetails2 = (ql4.y) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(planDetails2, "planDetails");
                        this.f116716b.f116606c.b(key2, planDetails2);
                        break;
                    case 2:
                        cp4.z key3 = (cp4.z) obj2;
                        ql4.e availability = (ql4.e) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f116716b.f116605b.b(key3, availability);
                        break;
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        ql4.a0 availability2 = (ql4.a0) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f116716b.f116606c.b(key4, availability2);
                        break;
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        List instalments = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(instalments, "instalments");
                        this.f116716b.f116606c.b(key5, instalments);
                        break;
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        ql4.q instalmentDetails = (ql4.q) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(instalmentDetails, "instalmentDetails");
                        this.f116716b.f116606c.b(key6, instalmentDetails);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a0(this, continuation, 0), new n(this, continuation, 5));
        final int i3 = 3;
        this.f = new x4l.c(new cuh.a(this, continuation, 17), new Function1(this) { // from class: dp4.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116712b;

            {
                this.f116712b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        cp4.z key = (cp4.z) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (ql4.e) this.f116712b.f116605b.a(key);
                    case 1:
                        cp4.o0 key2 = (cp4.o0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (ql4.d0) this.f116712b.f116606c.a(key2);
                    case 2:
                        cp4.g0 key3 = (cp4.g0) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (ql4.y) this.f116712b.f116606c.a(key3);
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (ql4.a0) this.f116712b.f116606c.a(key4);
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (List) this.f116712b.f116606c.a(key5);
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (ql4.q) this.f116712b.f116606c.a(key6);
                }
            }
        }, new Function2(this) { // from class: dp4.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116716b;

            {
                this.f116716b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        cp4.o0 key = (cp4.o0) obj2;
                        ql4.d0 planDetails = (ql4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
                        this.f116716b.f116606c.b(key, planDetails);
                        break;
                    case 1:
                        cp4.g0 key2 = (cp4.g0) obj2;
                        ql4.y planDetails2 = (ql4.y) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(planDetails2, "planDetails");
                        this.f116716b.f116606c.b(key2, planDetails2);
                        break;
                    case 2:
                        cp4.z key3 = (cp4.z) obj2;
                        ql4.e availability = (ql4.e) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f116716b.f116605b.b(key3, availability);
                        break;
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        ql4.a0 availability2 = (ql4.a0) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f116716b.f116606c.b(key4, availability2);
                        break;
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        List instalments = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(instalments, "instalments");
                        this.f116716b.f116606c.b(key5, instalments);
                        break;
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        ql4.q instalmentDetails = (ql4.q) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(instalmentDetails, "instalmentDetails");
                        this.f116716b.f116606c.b(key6, instalmentDetails);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a0(this, continuation, 4), new n(this, continuation, 9));
        final int i5 = 4;
        this.f116607g = new x4l.c(new cvi.i(this, continuation, 25), new Function1(this) { // from class: dp4.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116712b;

            {
                this.f116712b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        cp4.z key = (cp4.z) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (ql4.e) this.f116712b.f116605b.a(key);
                    case 1:
                        cp4.o0 key2 = (cp4.o0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (ql4.d0) this.f116712b.f116606c.a(key2);
                    case 2:
                        cp4.g0 key3 = (cp4.g0) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (ql4.y) this.f116712b.f116606c.a(key3);
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (ql4.a0) this.f116712b.f116606c.a(key4);
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (List) this.f116712b.f116606c.a(key5);
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (ql4.q) this.f116712b.f116606c.a(key6);
                }
            }
        }, new Function2(this) { // from class: dp4.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116716b;

            {
                this.f116716b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        cp4.o0 key = (cp4.o0) obj2;
                        ql4.d0 planDetails = (ql4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
                        this.f116716b.f116606c.b(key, planDetails);
                        break;
                    case 1:
                        cp4.g0 key2 = (cp4.g0) obj2;
                        ql4.y planDetails2 = (ql4.y) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(planDetails2, "planDetails");
                        this.f116716b.f116606c.b(key2, planDetails2);
                        break;
                    case 2:
                        cp4.z key3 = (cp4.z) obj2;
                        ql4.e availability = (ql4.e) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f116716b.f116605b.b(key3, availability);
                        break;
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        ql4.a0 availability2 = (ql4.a0) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f116716b.f116606c.b(key4, availability2);
                        break;
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        List instalments = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(instalments, "instalments");
                        this.f116716b.f116606c.b(key5, instalments);
                        break;
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        ql4.q instalmentDetails = (ql4.q) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(instalmentDetails, "instalmentDetails");
                        this.f116716b.f116606c.b(key6, instalmentDetails);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a0(this, continuation, 1), new n(this, continuation, 6));
        final int i6 = 5;
        this.f116608h = new x4l.c(new cuh.a(this, continuation, 15), new Function1(this) { // from class: dp4.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116712b;

            {
                this.f116712b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        cp4.z key = (cp4.z) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (ql4.e) this.f116712b.f116605b.a(key);
                    case 1:
                        cp4.o0 key2 = (cp4.o0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (ql4.d0) this.f116712b.f116606c.a(key2);
                    case 2:
                        cp4.g0 key3 = (cp4.g0) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (ql4.y) this.f116712b.f116606c.a(key3);
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (ql4.a0) this.f116712b.f116606c.a(key4);
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (List) this.f116712b.f116606c.a(key5);
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (ql4.q) this.f116712b.f116606c.a(key6);
                }
            }
        }, new Function2(this) { // from class: dp4.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116716b;

            {
                this.f116716b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        cp4.o0 key = (cp4.o0) obj2;
                        ql4.d0 planDetails = (ql4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
                        this.f116716b.f116606c.b(key, planDetails);
                        break;
                    case 1:
                        cp4.g0 key2 = (cp4.g0) obj2;
                        ql4.y planDetails2 = (ql4.y) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(planDetails2, "planDetails");
                        this.f116716b.f116606c.b(key2, planDetails2);
                        break;
                    case 2:
                        cp4.z key3 = (cp4.z) obj2;
                        ql4.e availability = (ql4.e) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f116716b.f116605b.b(key3, availability);
                        break;
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        ql4.a0 availability2 = (ql4.a0) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f116716b.f116606c.b(key4, availability2);
                        break;
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        List instalments = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(instalments, "instalments");
                        this.f116716b.f116606c.b(key5, instalments);
                        break;
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        ql4.q instalmentDetails = (ql4.q) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(instalmentDetails, "instalmentDetails");
                        this.f116716b.f116606c.b(key6, instalmentDetails);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a0(this, continuation, 2), new n(this, continuation, 7));
        cuh.a aVar2 = new cuh.a(this, continuation, 18);
        final int i21 = 1;
        Function1 function12 = new Function1(this) { // from class: dp4.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116712b;

            {
                this.f116712b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        cp4.z key = (cp4.z) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (ql4.e) this.f116712b.f116605b.a(key);
                    case 1:
                        cp4.o0 key2 = (cp4.o0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (ql4.d0) this.f116712b.f116606c.a(key2);
                    case 2:
                        cp4.g0 key3 = (cp4.g0) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (ql4.y) this.f116712b.f116606c.a(key3);
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (ql4.a0) this.f116712b.f116606c.a(key4);
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (List) this.f116712b.f116606c.a(key5);
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (ql4.q) this.f116712b.f116606c.a(key6);
                }
            }
        };
        final int i22 = 0;
        this.i = new x4l.c(aVar2, function12, new Function2(this) { // from class: dp4.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116716b;

            {
                this.f116716b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        cp4.o0 key = (cp4.o0) obj2;
                        ql4.d0 planDetails = (ql4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
                        this.f116716b.f116606c.b(key, planDetails);
                        break;
                    case 1:
                        cp4.g0 key2 = (cp4.g0) obj2;
                        ql4.y planDetails2 = (ql4.y) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(planDetails2, "planDetails");
                        this.f116716b.f116606c.b(key2, planDetails2);
                        break;
                    case 2:
                        cp4.z key3 = (cp4.z) obj2;
                        ql4.e availability = (ql4.e) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f116716b.f116605b.b(key3, availability);
                        break;
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        ql4.a0 availability2 = (ql4.a0) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f116716b.f116606c.b(key4, availability2);
                        break;
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        List instalments = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(instalments, "instalments");
                        this.f116716b.f116606c.b(key5, instalments);
                        break;
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        ql4.q instalmentDetails = (ql4.q) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(instalmentDetails, "instalmentDetails");
                        this.f116716b.f116606c.b(key6, instalmentDetails);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a0(this, continuation, 5), new n(this, continuation, 10));
        cuh.a aVar3 = new cuh.a(this, continuation, 16);
        final int i32 = 2;
        Function1 function13 = new Function1(this) { // from class: dp4.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116712b;

            {
                this.f116712b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i32) {
                    case 0:
                        cp4.z key = (cp4.z) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (ql4.e) this.f116712b.f116605b.a(key);
                    case 1:
                        cp4.o0 key2 = (cp4.o0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (ql4.d0) this.f116712b.f116606c.a(key2);
                    case 2:
                        cp4.g0 key3 = (cp4.g0) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (ql4.y) this.f116712b.f116606c.a(key3);
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (ql4.a0) this.f116712b.f116606c.a(key4);
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (List) this.f116712b.f116606c.a(key5);
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (ql4.q) this.f116712b.f116606c.a(key6);
                }
            }
        };
        final int i33 = 1;
        this.f116609j = new x4l.c(aVar3, function13, new Function2(this) { // from class: dp4.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f116716b;

            {
                this.f116716b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        cp4.o0 key = (cp4.o0) obj2;
                        ql4.d0 planDetails = (ql4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
                        this.f116716b.f116606c.b(key, planDetails);
                        break;
                    case 1:
                        cp4.g0 key2 = (cp4.g0) obj2;
                        ql4.y planDetails2 = (ql4.y) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(planDetails2, "planDetails");
                        this.f116716b.f116606c.b(key2, planDetails2);
                        break;
                    case 2:
                        cp4.z key3 = (cp4.z) obj2;
                        ql4.e availability = (ql4.e) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f116716b.f116605b.b(key3, availability);
                        break;
                    case 3:
                        cp4.n0 key4 = (cp4.n0) obj2;
                        ql4.a0 availability2 = (ql4.a0) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f116716b.f116606c.b(key4, availability2);
                        break;
                    case 4:
                        cp4.a0 key5 = (cp4.a0) obj2;
                        List instalments = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(instalments, "instalments");
                        this.f116716b.f116606c.b(key5, instalments);
                        break;
                    default:
                        cp4.f0 key6 = (cp4.f0) obj2;
                        ql4.q instalmentDetails = (ql4.q) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(instalmentDetails, "instalmentDetails");
                        this.f116716b.f116606c.b(key6, instalmentDetails);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a0(this, continuation, 3), new n(this, continuation, 8));
    }
}
