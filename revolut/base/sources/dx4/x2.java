package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x2 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120830a;

    public x2(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f120830a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x2) && Intrinsics.f(this.f120830a, ((x2) obj2).f120830a);
    }

    public final int hashCode() {
        return this.f120830a.hashCode();
    }
}
