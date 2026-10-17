package i6h;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f159011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159013c;

    public d(String str, ArrayList rates, boolean z) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f159011a = rates;
        this.f159012b = str;
        this.f159013c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f159011a.equals(dVar.f159011a) && Intrinsics.f(this.f159012b, dVar.f159012b) && this.f159013c == dVar.f159013c;
    }

    public final int hashCode() {
        int iHashCode = this.f159011a.hashCode() * 31;
        String str = this.f159012b;
        return Boolean.hashCode(this.f159013c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
