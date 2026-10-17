package y38;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f310685c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f310686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f310687b;

    static {
        Type type = new TypeToken<a48.b>() { // from class: com.revolut.feature.joint.impl.data.JointAccountStore$Companion$JOINT_ACCOUNTS_STORAGE_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f310685c = type;
    }

    public b(j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f310686a = storage;
        this.f310687b = memoryCache;
    }

    public final List a() {
        return (List) this.f310687b.get("JOINT_ACCOUNTS_CACHE_KEY");
    }
}
