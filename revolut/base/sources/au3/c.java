package au3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9470b;

    public c(String title, List terms) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f9469a = title;
        this.f9470b = terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f9469a, cVar.f9469a) && Intrinsics.f(this.f9470b, cVar.f9470b);
    }

    public final int hashCode() {
        return this.f9470b.hashCode() + (this.f9469a.hashCode() * 31);
    }
}
