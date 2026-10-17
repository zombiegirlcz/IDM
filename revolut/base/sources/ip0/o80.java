package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o80 extends p80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80 f165637a;

    public o80(l80 emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        this.f165637a = emoji;
    }

    @Override // ip0.p80
    public final l80 a() {
        return this.f165637a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o80) && Intrinsics.f(this.f165637a, ((o80) obj2).f165637a);
    }

    public final int hashCode() {
        return this.f165637a.hashCode();
    }
}
