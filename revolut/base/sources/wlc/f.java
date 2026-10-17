package wlc;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f298472b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f298473a;

    static {
        Type type = new TypeToken<vlc.d>() { // from class: com.revolut.feature.robo.impl.data.storage.TemplateStorage$Companion$TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f298472b = type;
    }

    public f(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f298473a = storage;
    }
}
