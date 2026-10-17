package zk5;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Serializable {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f322908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f322909b;

    public c(Map byCryptoAddressIdKey, Map byAddressKey) {
        Intrinsics.checkNotNullParameter(byCryptoAddressIdKey, "byCryptoAddressIdKey");
        Intrinsics.checkNotNullParameter(byAddressKey, "byAddressKey");
        this.f322908a = byCryptoAddressIdKey;
        this.f322909b = byAddressKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f322908a.equals(cVar.f322908a) && this.f322909b.equals(cVar.f322909b);
    }

    public final int hashCode() {
        return this.f322909b.hashCode() + (this.f322908a.hashCode() * 31);
    }
}
