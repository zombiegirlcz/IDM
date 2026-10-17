package my8;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f210361b;

    public a(String text, List links) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f210360a = text;
        this.f210361b = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f210360a, aVar.f210360a) && Intrinsics.f(this.f210361b, aVar.f210361b);
    }

    public final int hashCode() {
        return this.f210361b.hashCode() + (this.f210360a.hashCode() * 31);
    }
}
