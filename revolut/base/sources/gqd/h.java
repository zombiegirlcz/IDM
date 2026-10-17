package gqd;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f145684a;

    public h(Clause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f145684a = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f145684a, ((h) obj2).f145684a);
    }

    public final int hashCode() {
        return this.f145684a.hashCode();
    }
}
