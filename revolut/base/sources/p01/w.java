package p01;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f231461a;

    public w(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f231461a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f231461a, ((w) obj2).f231461a);
    }

    public final int hashCode() {
        return this.f231461a.hashCode();
    }
}
