package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardService f116633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f116635c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f116636g;

    public e(CreditCardService api2, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116633a = api2;
        this.f116634b = memoryCache;
        this.f116635c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new cuh.a(this, continuation, 3), new Function1(this) { // from class: dp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116594b;

            {
                this.f116594b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        cp4.b key = (cp4.b) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (el4.a) this.f116594b.f116634b.a(key);
                    case 1:
                        cp4.d key2 = (cp4.d) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (el4.i) this.f116594b.f116634b.a(key2);
                    case 2:
                        cp4.e key3 = (cp4.e) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (el4.f) this.f116594b.f116634b.a(key3);
                    default:
                        cp4.c key4 = (cp4.c) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116594b.f116634b.a(key4);
                }
            }
        }, new Function2(this) { // from class: dp4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116599b;

            {
                this.f116599b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        cp4.b key = (cp4.b) obj2;
                        el4.a details = (el4.a) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116599b.f116634b.b(key, details);
                        break;
                    case 1:
                        cp4.d key2 = (cp4.d) obj2;
                        el4.i details2 = (el4.i) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f116599b.f116634b.b(key2, details2);
                        break;
                    case 2:
                        cp4.e key3 = (cp4.e) obj2;
                        el4.f settings = (el4.f) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116599b.f116634b.b(key3, settings);
                        break;
                    default:
                        cp4.c key4 = (cp4.c) obj2;
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        this.f116599b.f116634b.b(key4, cards);
                        break;
                }
                return Unit.f186387a;
            }
        }, new c(this, continuation, i), new bwb.n(this, continuation, 24));
        final int i2 = 1;
        this.e = new x4l.c(new cuh.a(this, continuation, 6), new Function1(this) { // from class: dp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116594b;

            {
                this.f116594b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        cp4.b key = (cp4.b) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (el4.a) this.f116594b.f116634b.a(key);
                    case 1:
                        cp4.d key2 = (cp4.d) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (el4.i) this.f116594b.f116634b.a(key2);
                    case 2:
                        cp4.e key3 = (cp4.e) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (el4.f) this.f116594b.f116634b.a(key3);
                    default:
                        cp4.c key4 = (cp4.c) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116594b.f116634b.a(key4);
                }
            }
        }, new Function2(this) { // from class: dp4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116599b;

            {
                this.f116599b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        cp4.b key = (cp4.b) obj2;
                        el4.a details = (el4.a) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116599b.f116634b.b(key, details);
                        break;
                    case 1:
                        cp4.d key2 = (cp4.d) obj2;
                        el4.i details2 = (el4.i) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f116599b.f116634b.b(key2, details2);
                        break;
                    case 2:
                        cp4.e key3 = (cp4.e) obj2;
                        el4.f settings = (el4.f) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116599b.f116634b.b(key3, settings);
                        break;
                    default:
                        cp4.c key4 = (cp4.c) obj2;
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        this.f116599b.f116634b.b(key4, cards);
                        break;
                }
                return Unit.f186387a;
            }
        }, new c(this, continuation, 3), new bwb.n(this, continuation, 27));
        final int i3 = 2;
        this.f = new x4l.c(new cuh.a(this, continuation, 5), new Function1(this) { // from class: dp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116594b;

            {
                this.f116594b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        cp4.b key = (cp4.b) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (el4.a) this.f116594b.f116634b.a(key);
                    case 1:
                        cp4.d key2 = (cp4.d) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (el4.i) this.f116594b.f116634b.a(key2);
                    case 2:
                        cp4.e key3 = (cp4.e) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (el4.f) this.f116594b.f116634b.a(key3);
                    default:
                        cp4.c key4 = (cp4.c) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116594b.f116634b.a(key4);
                }
            }
        }, new Function2(this) { // from class: dp4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116599b;

            {
                this.f116599b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        cp4.b key = (cp4.b) obj2;
                        el4.a details = (el4.a) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116599b.f116634b.b(key, details);
                        break;
                    case 1:
                        cp4.d key2 = (cp4.d) obj2;
                        el4.i details2 = (el4.i) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f116599b.f116634b.b(key2, details2);
                        break;
                    case 2:
                        cp4.e key3 = (cp4.e) obj2;
                        el4.f settings = (el4.f) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116599b.f116634b.b(key3, settings);
                        break;
                    default:
                        cp4.c key4 = (cp4.c) obj2;
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        this.f116599b.f116634b.b(key4, cards);
                        break;
                }
                return Unit.f186387a;
            }
        }, new c(this, continuation, i3), new bwb.n(this, continuation, 26));
        final int i5 = 3;
        this.f116636g = new x4l.c(new cuh.a(this, continuation, 4), new Function1(this) { // from class: dp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116594b;

            {
                this.f116594b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        cp4.b key = (cp4.b) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (el4.a) this.f116594b.f116634b.a(key);
                    case 1:
                        cp4.d key2 = (cp4.d) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (el4.i) this.f116594b.f116634b.a(key2);
                    case 2:
                        cp4.e key3 = (cp4.e) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (el4.f) this.f116594b.f116634b.a(key3);
                    default:
                        cp4.c key4 = (cp4.c) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116594b.f116634b.a(key4);
                }
            }
        }, new Function2(this) { // from class: dp4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f116599b;

            {
                this.f116599b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        cp4.b key = (cp4.b) obj2;
                        el4.a details = (el4.a) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116599b.f116634b.b(key, details);
                        break;
                    case 1:
                        cp4.d key2 = (cp4.d) obj2;
                        el4.i details2 = (el4.i) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f116599b.f116634b.b(key2, details2);
                        break;
                    case 2:
                        cp4.e key3 = (cp4.e) obj2;
                        el4.f settings = (el4.f) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116599b.f116634b.b(key3, settings);
                        break;
                    default:
                        cp4.c key4 = (cp4.c) obj2;
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        this.f116599b.f116634b.b(key4, cards);
                        break;
                }
                return Unit.f186387a;
            }
        }, new c(this, continuation, 1), new bwb.n(this, continuation, 25));
    }
}
