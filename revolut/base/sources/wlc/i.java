package wlc;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f298475b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f298476a;

    static {
        Type type = new TypeToken<h>() { // from class: com.revolut.feature.robo.impl.data.storage.TemplatesStorage$Companion$TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f298475b = type;
    }

    public i(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f298476a = storage;
    }
}
