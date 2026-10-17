package vmf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290567b;

    public f(String text, String initialText) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(initialText, "initialText");
        this.f290566a = text;
        this.f290567b = initialText;
    }

    public static f a(f fVar, String text) {
        String initialText = fVar.f290567b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(initialText, "initialText");
        return new f(text, initialText);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f290566a, fVar.f290566a) && Intrinsics.f(this.f290567b, fVar.f290567b);
    }

    public final int hashCode() {
        return this.f290567b.hashCode() + (this.f290566a.hashCode() * 31);
    }
}
