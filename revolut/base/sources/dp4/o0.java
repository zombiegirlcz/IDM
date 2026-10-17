package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardProductService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardProductService f116671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f116673c;
    public final x4l.c d;
    public final x4l.c e;

    public o0(CreditCardProductService api2, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116671a = api2;
        this.f116672b = memoryCache;
        this.f116673c = storage;
        Continuation continuation = null;
        ald.n nVar = new ald.n(this, continuation, 1);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: dp4.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f116665b;

            {
                this.f116665b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        n0 it8 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f116665b.f116672b.a(cp4.o.f107837a);
                    default:
                        cp4.i0 key = (cp4.i0) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (cl4.m) this.f116665b.f116672b.a(key);
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: dp4.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f116667b;

            {
                this.f116667b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List facilities = (List) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(facilities, "facilities");
                        this.f116667b.f116672b.b(cp4.o.f107837a, facilities);
                        break;
                    default:
                        cp4.i0 key = (cp4.i0) obj2;
                        cl4.m productDetails = (cl4.m) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                        this.f116667b.f116672b.b(key, productDetails);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i2 = 1;
        this.d = new x4l.c(nVar, function1, function2, new akl.w(this, continuation, i2), new akl.x(this, continuation, i2));
        final int i3 = 1;
        this.e = new x4l.c(new ald.n(this, continuation, 2), new Function1(this) { // from class: dp4.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f116665b;

            {
                this.f116665b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        n0 it8 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f116665b.f116672b.a(cp4.o.f107837a);
                    default:
                        cp4.i0 key = (cp4.i0) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (cl4.m) this.f116665b.f116672b.a(key);
                }
            }
        }, new Function2(this) { // from class: dp4.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f116667b;

            {
                this.f116667b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List facilities = (List) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(facilities, "facilities");
                        this.f116667b.f116672b.b(cp4.o.f107837a, facilities);
                        break;
                    default:
                        cp4.i0 key = (cp4.i0) obj2;
                        cl4.m productDetails = (cl4.m) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                        this.f116667b.f116672b.b(key, productDetails);
                        break;
                }
                return Unit.f186387a;
            }
        }, new ald.p(this, continuation, i3), new ald.q(this, continuation, i3));
    }

    public final akg.n a(w4l.k loadingStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(this.d.b(new n0(Intrinsics.f(loadingStrategy, w4l.i.f294643c)), loadingStrategy), new cmc.a(z, 10));
    }
}
