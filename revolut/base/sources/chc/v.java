package chc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24179b;

    public /* synthetic */ v(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(t.f24177a.getDescriptor(), i, 3);
            throw null;
        }
        this.f24178a = str;
        this.f24179b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f24178a, vVar.f24178a) && Intrinsics.f(this.f24179b, vVar.f24179b);
    }

    public final int hashCode() {
        return this.f24179b.hashCode() + (this.f24178a.hashCode() * 31);
    }

    public v(String id10, String type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f24178a = id10;
        this.f24179b = type;
    }
}
