package hjb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class e implements h {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152683a;

    public /* synthetic */ e(int i, String str) {
        if (1 == (i & 1)) {
            this.f152683a = str;
        } else {
            j1.f(c.f152682a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f152683a, ((e) obj2).f152683a);
    }

    public final int hashCode() {
        return this.f152683a.hashCode();
    }

    public e(String jointId) {
        Intrinsics.checkNotNullParameter(jointId, "jointId");
        this.f152683a = jointId;
    }
}
