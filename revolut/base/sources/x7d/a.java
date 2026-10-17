package x7d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f303178b;

    public a(String userInput, String str) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        this.f303177a = userInput;
        this.f303178b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f303177a, aVar.f303177a) && Intrinsics.f(this.f303178b, aVar.f303178b);
    }

    public final int hashCode() {
        int iHashCode = this.f303177a.hashCode() * 31;
        String str = this.f303178b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
