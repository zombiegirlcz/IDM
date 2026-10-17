package nr6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218564c;
    public final String d;

    public i(String str, String str2, String str3, String str4) {
        this.f218562a = str;
        this.f218563b = str2;
        this.f218564c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f218562a, iVar.f218562a) && Intrinsics.f(this.f218563b, iVar.f218563b) && Intrinsics.f(this.f218564c, iVar.f218564c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        String str = this.f218562a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f218563b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f218564c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
