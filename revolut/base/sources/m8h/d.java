package m8h;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f203545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f203546c;
    public static final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f203547a;

    static {
        Type type = new TypeToken<a>() { // from class: com.revolut.feature.wealth.impl.data.storage.popularfirstbuy.PopularFirstBuyStorage$Companion$ENTITY_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f203545b = type;
        Type type2 = new TypeToken<Boolean>() { // from class: com.revolut.feature.wealth.impl.data.storage.popularfirstbuy.PopularFirstBuyStorage$Companion$ETF_SELECTED_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f203546c = type2;
        d = "PopularFirstBuy.ETF_SELECTED_KEY";
    }

    public d(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f203547a = storage;
    }
}
