package t6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f268303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f268304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268305c;

    public n(long j2, i iVar, String str) {
        this.f268303a = j2;
        this.f268304b = iVar;
        this.f268305c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return RevPoints.a(this.f268303a, nVar.f268303a) && Intrinsics.f(this.f268304b, nVar.f268304b) && Intrinsics.f(this.f268305c, nVar.f268305c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f268303a) * 31;
        i iVar = this.f268304b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f268305c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
