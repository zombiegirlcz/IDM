package lu9;

import ipa.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f200200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200201b;

    public a(n author, String text) {
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f200200a = author;
        this.f200201b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200200a, aVar.f200200a) && Intrinsics.f(this.f200201b, aVar.f200201b);
    }

    public final int hashCode() {
        return this.f200201b.hashCode() + (this.f200200a.hashCode() * 31);
    }
}
