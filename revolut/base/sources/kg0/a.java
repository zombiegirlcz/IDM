package kg0;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f183893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f183894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f183895c;

    public a(String comment, List tags, Set chosenTags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f183893a = tags;
        this.f183894b = chosenTags;
        this.f183895c = comment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f183893a, aVar.f183893a) && Intrinsics.f(this.f183894b, aVar.f183894b) && Intrinsics.f(this.f183895c, aVar.f183895c);
    }

    public final int hashCode() {
        return this.f183895c.hashCode() + p.a.f(this.f183893a.hashCode() * 31, 31, this.f183894b);
    }
}
