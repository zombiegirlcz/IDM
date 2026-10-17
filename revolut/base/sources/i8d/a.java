package i8d;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f159498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f159499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159500c;

    public a(String comment, List tags, Set chosenTags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f159498a = tags;
        this.f159499b = chosenTags;
        this.f159500c = comment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f159498a, aVar.f159498a) && Intrinsics.f(this.f159499b, aVar.f159499b) && Intrinsics.f(this.f159500c, aVar.f159500c);
    }

    public final int hashCode() {
        return this.f159500c.hashCode() + p.a.f(this.f159498a.hashCode() * 31, 31, this.f159499b);
    }
}
