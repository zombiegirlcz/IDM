package ds6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117255c;

    public y(String str, String str2, String str3) {
        this.f117253a = str;
        this.f117254b = str2;
        this.f117255c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f117253a, yVar.f117253a) && Intrinsics.f(this.f117254b, yVar.f117254b) && Intrinsics.f(this.f117255c, yVar.f117255c);
    }

    public final int hashCode() {
        String str = this.f117253a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117254b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f117255c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
