package l8h;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f192992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f192993c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f192994a;

    static {
        Type type = new TypeToken<b>() { // from class: com.revolut.feature.wealth.impl.data.storage.mosttraded.MostTradedAssetsStorage$Companion$TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f192992b = type;
        f192993c = "MostTradedAssets";
    }

    public g(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f192994a = storage;
    }

    public final b a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (b) yh5.b.u(this.f192994a, a0.d.r(f192993c, key), f192992b);
    }
}
