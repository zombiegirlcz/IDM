package wd5;

import com.revolut.feature.crypto.config.impl.network.CryptoConfigService;
import efm.d0;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import w4l.f;
import wim.z;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoConfigService f296461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f296462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f296463c;
    public final f d;

    public d(CryptoConfigService api2, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f296461a = api2;
        this.f296462b = memoryCache;
        this.f296463c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: wd5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f296458b;

            {
                this.f296458b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<ud5.e> config = this.f296458b.f296461a.getConfig();
                        w4l.c cVar = new w4l.c(new wd3.a(1), 20);
                        config.getClass();
                        i iVar = new i(config, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        pd5.d cryptoConfig = (pd5.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoConfig, "cryptoConfig");
                        this.f296458b.f296462b.f("CACHE_KEY_CRYPTO_CONFIG", cryptoConfig);
                        break;
                    default:
                        pd5.d value = (pd5.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f296458b.f296463c.G(boh.f.G(value), "STORAGE_KEY_CRYPTO_CONFIG", z.d(o0.b(vd5.b.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: wd5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f296460b;

            {
                this.f296460b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pd5.d) this.f296460b.f296462b.get("CACHE_KEY_CRYPTO_CONFIG");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f296460b.f296463c;
                        Type typeA = e.a();
                        Intrinsics.checkNotNullExpressionValue(typeA, "<get-CRYPTO_CONFIG_TYPE>(...)");
                        vd5.b bVar = (vd5.b) cVar.T2("STORAGE_KEY_CRYPTO_CONFIG", typeA);
                        if (bVar != null) {
                            return boh.f.z(bVar);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: wd5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f296458b;

            {
                this.f296458b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<ud5.e> config = this.f296458b.f296461a.getConfig();
                        w4l.c cVar = new w4l.c(new wd3.a(1), 20);
                        config.getClass();
                        i iVar = new i(config, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        pd5.d cryptoConfig = (pd5.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoConfig, "cryptoConfig");
                        this.f296458b.f296462b.f("CACHE_KEY_CRYPTO_CONFIG", cryptoConfig);
                        break;
                    default:
                        pd5.d value = (pd5.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f296458b.f296463c.G(boh.f.G(value), "STORAGE_KEY_CRYPTO_CONFIG", z.d(o0.b(vd5.b.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: wd5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f296460b;

            {
                this.f296460b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pd5.d) this.f296460b.f296462b.get("CACHE_KEY_CRYPTO_CONFIG");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f296460b.f296463c;
                        Type typeA = e.a();
                        Intrinsics.checkNotNullExpressionValue(typeA, "<get-CRYPTO_CONFIG_TYPE>(...)");
                        vd5.b bVar = (vd5.b) cVar.T2("STORAGE_KEY_CRYPTO_CONFIG", typeA);
                        if (bVar != null) {
                            return boh.f.z(bVar);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        this.d = new f(function2, function1, function22, function12, new Function2(this) { // from class: wd5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f296458b;

            {
                this.f296458b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<ud5.e> config = this.f296458b.f296461a.getConfig();
                        w4l.c cVar = new w4l.c(new wd3.a(1), 20);
                        config.getClass();
                        i iVar = new i(config, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        pd5.d cryptoConfig = (pd5.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoConfig, "cryptoConfig");
                        this.f296458b.f296462b.f("CACHE_KEY_CRYPTO_CONFIG", cryptoConfig);
                        break;
                    default:
                        pd5.d value = (pd5.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f296458b.f296463c.G(boh.f.G(value), "STORAGE_KEY_CRYPTO_CONFIG", z.d(o0.b(vd5.b.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
