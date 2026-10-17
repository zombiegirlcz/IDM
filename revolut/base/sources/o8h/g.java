package o8h;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.n0;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f223029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f223030c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f223031a;

    static {
        Type type = new TypeToken<b>() { // from class: com.revolut.feature.wealth.impl.data.storage.topmovers.TopMoversStorage$Companion$TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f223029b = type;
        Type type2 = new TypeToken<n0>() { // from class: com.revolut.feature.wealth.impl.data.storage.topmovers.TopMoversStorage$Companion$FILTER_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f223030c = type2;
    }

    public g(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f223031a = storage;
    }
}
