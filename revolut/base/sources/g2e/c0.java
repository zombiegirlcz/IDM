package g2e;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.store.api.model.StoreDealsLayout;
import com.revolut.feature.store.impl.data.network.StoreService;
import dp4.f1;
import ip0.v7;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements w {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Type f139975h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreService f139976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f139977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f139978c;
    public final twg.c d;
    public final fd0.d e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f139979g;

    static {
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.feature.store.impl.data.repository.StoreDealsRepositoryImpl$Companion$STORAGE_KEY_INDEX_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f139975h = type;
    }

    public c0(StoreService storeService, ne0.j memoryCache, ue0.c storage, twg.c shopsFeaturesHeaderProvider) {
        Intrinsics.checkNotNullParameter(storeService, "storeService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(shopsFeaturesHeaderProvider, "shopsFeaturesHeaderProvider");
        this.f139976a = storeService;
        this.f139977b = memoryCache;
        this.f139978c = storage;
        this.d = shopsFeaturesHeaderProvider;
        this.e = new fd0.d(10);
        Continuation continuation = null;
        final int i = 0;
        this.f = new x4l.c(new frk.a(this, continuation, 10), new Function1(this) { // from class: g2e.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f140038b;

            {
                this.f140038b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        v params = (v) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreDealsLayout) this.f140038b.e.c(c0.b(params));
                    default:
                        u params2 = (u) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) v7.r("STORE_DEALS_CAROUSEL_TILES_MEM_KEY_", c0.a(params2), this.f140038b.f139977b);
                }
            }
        }, new Function2(this) { // from class: g2e.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f140040b;

            {
                this.f140040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        v params = (v) obj2;
                        StoreDealsLayout layout = (StoreDealsLayout) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(layout, "layout");
                        this.f140040b.e.d(c0.b(params), layout);
                        break;
                    default:
                        u params2 = (u) obj2;
                        List tiles = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(tiles, "tiles");
                        ehe.n.z("STORE_DEALS_CAROUSEL_TILES_MEM_KEY_", c0.a(params2), this.f140040b.f139977b, tiles);
                        break;
                }
                return Unit.f186387a;
            }
        }, new b0(this, null, 1), new f1(this, continuation, 28));
        new x4l.c(new a0(this, null, 0), new g1k.k(this, 15), new g0c.h(this, 20), new b0(this, null, 0), new a0(this, null, 1));
        final int i2 = 1;
        this.f139979g = new x4l.c(new frk.a(this, continuation, 9), new Function1(this) { // from class: g2e.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f140038b;

            {
                this.f140038b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        v params = (v) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreDealsLayout) this.f140038b.e.c(c0.b(params));
                    default:
                        u params2 = (u) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) v7.r("STORE_DEALS_CAROUSEL_TILES_MEM_KEY_", c0.a(params2), this.f140038b.f139977b);
                }
            }
        }, new Function2(this) { // from class: g2e.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f140040b;

            {
                this.f140040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        v params = (v) obj2;
                        StoreDealsLayout layout = (StoreDealsLayout) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(layout, "layout");
                        this.f140040b.e.d(c0.b(params), layout);
                        break;
                    default:
                        u params2 = (u) obj2;
                        List tiles = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(tiles, "tiles");
                        ehe.n.z("STORE_DEALS_CAROUSEL_TILES_MEM_KEY_", c0.a(params2), this.f140040b.f139977b, tiles);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e31.i(2, 14, null), new eci.a(3, 9, null));
    }

    public static String a(u uVar) {
        String str = uVar.f140032a;
        Integer num = uVar.f140033b;
        Integer num2 = uVar.f140034c;
        String str2 = uVar.d;
        if (str2 == null) {
            str2 = "";
        }
        return "carouselId=" + str + "_limit=" + num + "_offset=" + num2 + "_shopsFeatures=" + str2;
    }

    public static String b(v vVar) {
        String strU0;
        String str = vVar.f140035a;
        if (str == null) {
            str = "";
        }
        co3.a aVar = vVar.f140036b;
        if (aVar != null) {
            String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(c(aVar.f25486a), "_", c(aVar.f25487b));
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = strO.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.h(bArrDigest);
            strU0 = kotlin.text.f0.U0(16, kotlin.collections.d.a0(bArrDigest, "", null, null, new g1k.k(14), 30));
        } else {
            strU0 = null;
        }
        return a0.d.s("shopsFeatures=", str, "_coords=", strU0);
    }

    public static String c(double d) {
        return m72.b.t(new Object[]{Double.valueOf(d)}, 1, Locale.US, "%.3f", "format(...)");
    }
}
