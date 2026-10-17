package n29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211494b;

    public /* synthetic */ v(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(t.f211492a.getDescriptor(), i, 3);
            throw null;
        }
        this.f211493a = str;
        this.f211494b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f211493a, vVar.f211493a) && Intrinsics.f(this.f211494b, vVar.f211494b);
    }

    public final int hashCode() {
        int iHashCode = this.f211493a.hashCode() * 31;
        String str = this.f211494b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public v(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f211493a = text;
        this.f211494b = str;
    }
}
