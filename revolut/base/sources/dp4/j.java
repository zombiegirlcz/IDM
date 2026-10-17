package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardService f116654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f116656c;
    public final wj0.a d;
    public final ij0.a e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f116657g;

    public j(CreditCardService service, xx4.d memoryCache, xx4.e storage, wj0.a idempotencyKeyHolder, ij0.a networkConfiguration) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f116654a = service;
        this.f116655b = memoryCache;
        this.f116656c = storage;
        this.d = idempotencyKeyHolder;
        this.e = networkConfiguration;
        Continuation continuation = null;
        final int i = 0;
        this.f = new x4l.c(new cuh.a(this, continuation, 8), new Function1(this) { // from class: dp4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f116640b;

            {
                this.f116640b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        cp4.h key = (cp4.h) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116640b.f116655b.a(key);
                    default:
                        cp4.g key2 = (cp4.g) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (gl4.c) this.f116640b.f116655b.a(key2);
                }
            }
        }, new Function2(this) { // from class: dp4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f116646b;

            {
                this.f116646b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        cp4.h key = (cp4.h) obj2;
                        List boletos = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(boletos, "boletos");
                        this.f116646b.f116655b.b(key, boletos);
                        break;
                    default:
                        cp4.g key2 = (cp4.g) obj2;
                        gl4.c eligibility = (gl4.c) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        this.f116646b.f116655b.b(key2, eligibility);
                        break;
                }
                return Unit.f186387a;
            }
        }, new i(this, continuation, 1), new bwb.n(this, continuation, 29));
        final int i2 = 1;
        this.f116657g = new x4l.c(new cuh.a(this, continuation, 7), new Function1(this) { // from class: dp4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f116640b;

            {
                this.f116640b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        cp4.h key = (cp4.h) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116640b.f116655b.a(key);
                    default:
                        cp4.g key2 = (cp4.g) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (gl4.c) this.f116640b.f116655b.a(key2);
                }
            }
        }, new Function2(this) { // from class: dp4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f116646b;

            {
                this.f116646b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        cp4.h key = (cp4.h) obj2;
                        List boletos = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(boletos, "boletos");
                        this.f116646b.f116655b.b(key, boletos);
                        break;
                    default:
                        cp4.g key2 = (cp4.g) obj2;
                        gl4.c eligibility = (gl4.c) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        this.f116646b.f116655b.b(key2, eligibility);
                        break;
                }
                return Unit.f186387a;
            }
        }, new i(this, continuation, 0), new bwb.n(this, continuation, 28));
    }
}
