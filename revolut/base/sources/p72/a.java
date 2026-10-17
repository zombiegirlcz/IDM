package p72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d12.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoRegistrationStatus f233511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233512b;

    public a(MultibancoRegistrationStatus status, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f233511a = status;
        this.f233512b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f233511a, aVar.f233511a) && Intrinsics.f(this.f233512b, aVar.f233512b);
    }

    public final int hashCode() {
        int iHashCode = this.f233511a.hashCode() * 31;
        String str = this.f233512b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
