package ti7;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vi7.a f271443c;

    public j(String title, String url2, vi7.a type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f271441a = title;
        this.f271442b = url2;
        this.f271443c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f271441a, jVar.f271441a) && Intrinsics.f(this.f271442b, jVar.f271442b) && this.f271443c == jVar.f271443c;
    }

    public final int hashCode() {
        return this.f271443c.hashCode() + p.a.c(this.f271441a.hashCode() * 31, 31, this.f271442b);
    }
}
