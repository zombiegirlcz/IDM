package zme;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f323479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f323480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323481c;
    public final String d;

    public d(wi0.b countryCode, e certificationState, String str, String str2) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(certificationState, "certificationState");
        this.f323479a = countryCode;
        this.f323480b = certificationState;
        this.f323481c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f323479a, dVar.f323479a) && this.f323480b == dVar.f323480b && Intrinsics.f(this.f323481c, dVar.f323481c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f323480b.hashCode() + (this.f323479a.f297794a.hashCode() * 31)) * 31;
        String str = this.f323481c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
