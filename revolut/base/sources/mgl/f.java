package mgl;

import cie.k1;
import com.revolut.shared.feature.wealth_advanced_features.domain.impl.data.network.OrderBookService;
import do3.q;
import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lp6.g;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import qe0.o;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderBookService f205303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f205304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f205305c;
    public final CoroutineScope d;
    public final o e;
    public final x4l.c f;

    public f(OrderBookService orderBookService, j memoryCache, ue0.c storage, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(orderBookService, "orderBookService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f205303a = orderBookService;
        this.f205304b = memoryCache;
        this.f205305c = storage;
        this.d = appCoroutineScope;
        Continuation continuation = null;
        final int i = 0;
        this.e = q.f(new x4l.c(new d(this, continuation, 1), new Function1(this) { // from class: mgl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f205297b;

            {
                this.f205297b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String securityRef = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        return (rel.a) v7.r("ORDER_BOOK_CACHE_KEY", securityRef, this.f205297b.f205304b);
                    default:
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        return (Boolean) v7.r("ORDER_BOOK_AVAILABILITY_CACHE_KEY", securityRef, this.f205297b.f205304b);
                }
            }
        }, new Function2(this) { // from class: mgl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f205299b;

            {
                this.f205299b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String securityRef = (String) obj2;
                switch (i) {
                    case 0:
                        rel.a orderBook = (rel.a) obj3;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        Intrinsics.checkNotNullParameter(orderBook, "orderBook");
                        this.f205299b.f205304b.f("ORDER_BOOK_CACHE_KEY" + securityRef, orderBook);
                        break;
                    default:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        this.f205299b.f205304b.f("ORDER_BOOK_AVAILABILITY_CACHE_KEY" + securityRef, bool);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 1), new g(this, continuation, 7)), appCoroutineScope);
        final int i2 = 1;
        this.f = new x4l.c(new d(this, continuation, 0), new Function1(this) { // from class: mgl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f205297b;

            {
                this.f205297b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String securityRef = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        return (rel.a) v7.r("ORDER_BOOK_CACHE_KEY", securityRef, this.f205297b.f205304b);
                    default:
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        return (Boolean) v7.r("ORDER_BOOK_AVAILABILITY_CACHE_KEY", securityRef, this.f205297b.f205304b);
                }
            }
        }, new Function2(this) { // from class: mgl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f205299b;

            {
                this.f205299b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String securityRef = (String) obj2;
                switch (i2) {
                    case 0:
                        rel.a orderBook = (rel.a) obj3;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        Intrinsics.checkNotNullParameter(orderBook, "orderBook");
                        this.f205299b.f205304b.f("ORDER_BOOK_CACHE_KEY" + securityRef, orderBook);
                        break;
                    default:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        this.f205299b.f205304b.f("ORDER_BOOK_AVAILABILITY_CACHE_KEY" + securityRef, bool);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 0), new k1(this, continuation, 3));
    }
}
