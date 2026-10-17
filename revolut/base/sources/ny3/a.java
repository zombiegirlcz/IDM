package ny3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220624b;

    public a(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f220623a = title;
        this.f220624b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f220623a, aVar.f220623a) && Intrinsics.f(this.f220624b, aVar.f220624b);
    }

    public final int hashCode() {
        return this.f220624b.hashCode() + (this.f220623a.hashCode() * 31);
    }
}
