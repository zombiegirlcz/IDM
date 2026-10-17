package ko5;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186224b;

    public a(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f186223a = title;
        this.f186224b = str;
    }

    public final String a() throws IOException {
        StringBuilder sb6 = new StringBuilder();
        String str = this.f186223a;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt) || CharsKt.e(cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        return sb6.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f186223a, aVar.f186223a) && Intrinsics.f(this.f186224b, aVar.f186224b);
    }

    public final int hashCode() {
        int iHashCode = this.f186223a.hashCode() * 31;
        String str = this.f186224b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
