package r61;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements Serializable {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f251632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f251633b;

    public c(Map byCryptoAddressIdKey, Map byAddressKey) {
        Intrinsics.checkNotNullParameter(byCryptoAddressIdKey, "byCryptoAddressIdKey");
        Intrinsics.checkNotNullParameter(byAddressKey, "byAddressKey");
        this.f251632a = byCryptoAddressIdKey;
        this.f251633b = byAddressKey;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Map a() {
        return this.f251633b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Map b() {
        return this.f251632a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f251632a.equals(cVar.f251632a) && this.f251633b.equals(cVar.f251633b);
    }

    public final int hashCode() {
        return this.f251633b.hashCode() + (this.f251632a.hashCode() * 31);
    }
}
