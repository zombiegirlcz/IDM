package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161333b;

    public k(String type, String url2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f161332a = type;
        this.f161333b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f161332a, kVar.f161332a) && Intrinsics.f(this.f161333b, kVar.f161333b);
    }

    public final int hashCode() {
        return this.f161333b.hashCode() + (this.f161332a.hashCode() * 31);
    }
}
