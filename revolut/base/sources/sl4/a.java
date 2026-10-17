package sl4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f264135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264136b;

    public a(b type, String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f264135a = type;
        this.f264136b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f264135a == aVar.f264135a && Intrinsics.f(this.f264136b, aVar.f264136b);
    }

    public final int hashCode() {
        return this.f264136b.hashCode() + (this.f264135a.hashCode() * 31);
    }
}
