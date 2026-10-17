package pf6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235485a;

    public /* synthetic */ l(int i, String str) {
        if (1 == (i & 1)) {
            this.f235485a = str;
        } else {
            j1.f(j.f235484a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f235485a, ((l) obj2).f235485a);
    }

    public final int hashCode() {
        return this.f235485a.hashCode();
    }

    public l(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f235485a = data;
    }
}
