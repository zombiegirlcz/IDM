package ly3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200670b;

    public f(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f200669a = title;
        this.f200670b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f200669a, fVar.f200669a) && Intrinsics.f(this.f200670b, fVar.f200670b);
    }

    public final int hashCode() {
        return this.f200670b.hashCode() + (this.f200669a.hashCode() * 31);
    }
}
