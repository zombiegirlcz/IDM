package fb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133521b;

    public /* synthetic */ q(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(o.f133519a.getDescriptor(), i, 3);
            throw null;
        }
        this.f133520a = str;
        this.f133521b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f133520a, qVar.f133520a) && Intrinsics.f(this.f133521b, qVar.f133521b);
    }

    public final int hashCode() {
        return this.f133521b.hashCode() + (this.f133520a.hashCode() * 31);
    }

    public q(String state, String permissionUpdate) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(permissionUpdate, "permissionUpdate");
        this.f133520a = state;
        this.f133521b = permissionUpdate;
    }
}
