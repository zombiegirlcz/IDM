package k8h;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f182162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f182163c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f182164a;

    static {
        Type type = new TypeToken<b>() { // from class: com.revolut.feature.wealth.impl.data.storage.mostowned.MostOwnedStorage$Companion$TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f182162b = type;
        f182163c = "MostOwned";
    }

    public f(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f182164a = storage;
    }
}
