package i12;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f157527a;

    public b(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f157527a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f157527a.equals(((b) obj2).f157527a);
    }

    public final int hashCode() {
        return this.f157527a.hashCode();
    }
}
