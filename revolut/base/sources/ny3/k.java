package ny3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f220645c;

    public k(String title, String str, j status) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f220643a = title;
        this.f220644b = str;
        this.f220645c = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f220643a, kVar.f220643a) && Intrinsics.f(this.f220644b, kVar.f220644b) && this.f220645c == kVar.f220645c;
    }

    public final int hashCode() {
        int iHashCode = this.f220643a.hashCode() * 31;
        String str = this.f220644b;
        return this.f220645c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
