package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardMsiService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 {

    @NotNull
    private static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardMsiService f116659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f116661c;
    public final x4l.c d;
    public final x4l.c e;

    public k0(CreditCardMsiService creditCardMsiService, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(creditCardMsiService, "creditCardMsiService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116659a = creditCardMsiService;
        this.f116660b = memoryCache;
        this.f116661c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new i0(this, continuation, 1), new Function1(this) { // from class: dp4.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f116642b;

            {
                this.f116642b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        cp4.d0 key = (cp4.d0) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116642b.f116660b.a(key);
                    default:
                        cp4.c0 key2 = (cp4.c0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116642b.f116660b.a(key2);
                }
            }
        }, new Function2(this) { // from class: dp4.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f116648b;

            {
                this.f116648b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        cp4.d0 key = (cp4.d0) obj2;
                        List msiWidgetOffers = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(msiWidgetOffers, "msiWidgetOffers");
                        this.f116648b.f116660b.b(key, msiWidgetOffers);
                        break;
                    default:
                        cp4.c0 key2 = (cp4.c0) obj2;
                        List msiOffers = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(msiOffers, "msiOffers");
                        this.f116648b.f116660b.b(key2, msiOffers);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j0(this, continuation, 1), new n(this, continuation, 12));
        final int i2 = 1;
        this.e = new x4l.c(new i0(this, continuation, 0), new Function1(this) { // from class: dp4.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f116642b;

            {
                this.f116642b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        cp4.d0 key = (cp4.d0) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116642b.f116660b.a(key);
                    default:
                        cp4.c0 key2 = (cp4.c0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116642b.f116660b.a(key2);
                }
            }
        }, new Function2(this) { // from class: dp4.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f116648b;

            {
                this.f116648b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        cp4.d0 key = (cp4.d0) obj2;
                        List msiWidgetOffers = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(msiWidgetOffers, "msiWidgetOffers");
                        this.f116648b.f116660b.b(key, msiWidgetOffers);
                        break;
                    default:
                        cp4.c0 key2 = (cp4.c0) obj2;
                        List msiOffers = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(msiOffers, "msiOffers");
                        this.f116648b.f116660b.b(key2, msiOffers);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j0(this, continuation, 0), new n(this, continuation, 11));
    }
}
