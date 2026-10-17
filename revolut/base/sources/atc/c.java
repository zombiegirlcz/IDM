package atc;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f9025a;

    public c(Set keywords) {
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        this.f9025a = keywords;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        targetCollection.addAll(this.f9025a);
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f9025a, ((c) obj2).f9025a);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f9025a.hashCode();
    }
}
