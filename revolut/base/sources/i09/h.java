package i09;

import kotlin.jvm.internal.Intrinsics;
import u09.q;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends com.revolut.feature.learn.shared.impl.ui.course.overview.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f157325a;

    public h(q lesson) {
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        this.f157325a = lesson;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f157325a, ((h) obj2).f157325a);
    }

    public final int hashCode() {
        return this.f157325a.hashCode();
    }
}
