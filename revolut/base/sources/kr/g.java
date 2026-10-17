package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188498a;

    public /* synthetic */ g(int i, String str) {
        if (1 == (i & 1)) {
            this.f188498a = str;
        } else {
            qlm.j1.f(e.f188481a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f188498a, ((g) obj2).f188498a);
    }

    public final int hashCode() {
        return this.f188498a.hashCode();
    }

    public g(String verificationId) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        this.f188498a = verificationId;
    }
}
