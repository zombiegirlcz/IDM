package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f124685b;

    public /* synthetic */ v(int i, String str, s sVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(t.f124672a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124684a = str;
        this.f124685b = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f124684a, vVar.f124684a) && Intrinsics.f(this.f124685b, vVar.f124685b);
    }

    public final int hashCode() {
        int iHashCode = this.f124684a.hashCode() * 31;
        s sVar = this.f124685b;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public v(String description, s sVar) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f124684a = description;
        this.f124685b = sVar;
    }
}
