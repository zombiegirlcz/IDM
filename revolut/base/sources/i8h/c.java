package i8h;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f159539b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f159540a;

    static {
        Type type = new TypeToken<a>() { // from class: com.revolut.feature.wealth.impl.data.storage.eodrates.EodRatesStorage$Companion$TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f159539b = type;
    }

    public c(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f159540a = storage;
    }
}
