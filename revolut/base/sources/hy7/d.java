package hy7;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f156746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f156747b;

    public d(Clause name, List paragraphs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(paragraphs, "paragraphs");
        this.f156746a = name;
        this.f156747b = paragraphs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f156746a, dVar.f156746a) && Intrinsics.f(this.f156747b, dVar.f156747b);
    }

    public final int hashCode() {
        return this.f156747b.hashCode() + (this.f156746a.hashCode() * 31);
    }
}
