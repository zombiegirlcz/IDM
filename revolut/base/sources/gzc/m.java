package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148013c;

    public m(String type, String title, String adverb) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(adverb, "adverb");
        this.f148011a = type;
        this.f148012b = title;
        this.f148013c = adverb;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f148011a, mVar.f148011a) && Intrinsics.f(this.f148012b, mVar.f148012b) && Intrinsics.f(this.f148013c, mVar.f148013c);
    }

    public final int hashCode() {
        return this.f148013c.hashCode() + p.a.c(this.f148011a.hashCode() * 31, 31, this.f148012b);
    }
}
