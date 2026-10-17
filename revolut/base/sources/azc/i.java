package azc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11433b;

    public i(String currentNote, String enteredNote) {
        Intrinsics.checkNotNullParameter(currentNote, "currentNote");
        Intrinsics.checkNotNullParameter(enteredNote, "enteredNote");
        this.f11432a = currentNote;
        this.f11433b = enteredNote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f11432a, iVar.f11432a) && Intrinsics.f(this.f11433b, iVar.f11433b);
    }

    public final int hashCode() {
        return this.f11433b.hashCode() + (this.f11432a.hashCode() * 31);
    }
}
