package qo5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248036a;

    public /* synthetic */ g(int i, String str) {
        if (1 == (i & 1)) {
            this.f248036a = str;
        } else {
            j1.f(e.f248035a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f248036a, ((g) obj2).f248036a);
    }

    public final int hashCode() {
        String str = this.f248036a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public g(String str) {
        this.f248036a = str;
    }
}
