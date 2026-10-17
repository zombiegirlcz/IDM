package tdc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269950b;

    public c(String baseId, String str) {
        Intrinsics.checkNotNullParameter(baseId, "baseId");
        this.f269949a = baseId;
        this.f269950b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f269949a, cVar.f269949a) && Intrinsics.f(this.f269950b, cVar.f269950b);
    }

    public final int hashCode() {
        int iHashCode = this.f269949a.hashCode() * 31;
        String str = this.f269950b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
