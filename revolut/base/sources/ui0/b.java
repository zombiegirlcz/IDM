package ui0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280279b;

    public b(String googlePlayStoreId, String str) {
        Intrinsics.checkNotNullParameter(googlePlayStoreId, "googlePlayStoreId");
        this.f280278a = googlePlayStoreId;
        this.f280279b = str;
    }

    public final String a() {
        return this.f280278a;
    }

    public final String b() {
        return this.f280279b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f280278a, bVar.f280278a) && Intrinsics.f(this.f280279b, bVar.f280279b);
    }

    public final int hashCode() {
        int iHashCode = this.f280278a.hashCode() * 31;
        String str = this.f280279b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
