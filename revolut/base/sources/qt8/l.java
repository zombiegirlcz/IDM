package qt8;

import akl.x;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.kyc.core.impl.kyc.UserKycService;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements e {

    @NotNull
    public static final h Companion = new h();
    public static final Type f = new TypeToken<vt8.e>() { // from class: com.revolut.feature.kyc.core.impl.kyc.KycRepositoryImpl$Companion$KYC_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f249027g = new TypeToken<rt8.c>() { // from class: com.revolut.feature.kyc.core.impl.kyc.KycRepositoryImpl$Companion$KYC_ADDRESSES_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserKycService f249028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f249029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f249030c;
    public final x4l.c d;
    public final x4l.c e;

    public l(UserKycService kycService, ue0.c storage, m31.a fileUploader, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(kycService, "kycService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(fileUploader, "fileUploader");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f249028a = kycService;
        this.f249029b = storage;
        this.f249030c = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new j(this, continuation, 1), new Function1(this) { // from class: qt8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f249022b;

            {
                this.f249022b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (yt8.c) this.f249022b.f249030c.get("KYC_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (yt8.d) this.f249022b.f249030c.get("KYC_ADDRESSES_CACHE_KEY");
                }
            }
        }, new Function2(this) { // from class: qt8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f249024b;

            {
                this.f249024b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        yt8.c kyc2 = (yt8.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(kyc2, "kyc");
                        this.f249024b.f249030c.f("KYC_CACHE_KEY", kyc2);
                        break;
                    default:
                        yt8.d addresses = (yt8.d) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(addresses, "addresses");
                        this.f249024b.f249030c.f("KYC_ADDRESSES_CACHE_KEY", addresses);
                        break;
                }
                return Unit.f186387a;
            }
        }, new k(this, continuation, 1), new x(this, continuation, 4));
        final int i2 = 1;
        this.e = new x4l.c(new j(this, continuation, 0), new Function1(this) { // from class: qt8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f249022b;

            {
                this.f249022b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (yt8.c) this.f249022b.f249030c.get("KYC_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (yt8.d) this.f249022b.f249030c.get("KYC_ADDRESSES_CACHE_KEY");
                }
            }
        }, new Function2(this) { // from class: qt8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f249024b;

            {
                this.f249024b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        yt8.c kyc2 = (yt8.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(kyc2, "kyc");
                        this.f249024b.f249030c.f("KYC_CACHE_KEY", kyc2);
                        break;
                    default:
                        yt8.d addresses = (yt8.d) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(addresses, "addresses");
                        this.f249024b.f249030c.f("KYC_ADDRESSES_CACHE_KEY", addresses);
                        break;
                }
                return Unit.f186387a;
            }
        }, new k(this, continuation, 0), new x(this, continuation, 3));
    }
}
