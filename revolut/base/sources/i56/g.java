package i56;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158773a;

    public g(String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f158773a = signature;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f158773a, ((g) obj2).f158773a);
    }

    public final int hashCode() {
        return this.f158773a.hashCode();
    }
}
