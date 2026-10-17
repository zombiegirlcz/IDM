package k66;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c66.e f181650a;

    public h(c66.e words) {
        Intrinsics.checkNotNullParameter(words, "words");
        this.f181650a = words;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f181650a, ((h) obj2).f181650a);
    }

    public final int hashCode() {
        return this.f181650a.hashCode();
    }
}
