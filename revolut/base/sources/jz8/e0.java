package jz8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179611a;

    public /* synthetic */ e0(int i, String str) {
        if (1 == (i & 1)) {
            this.f179611a = str;
        } else {
            j1.f(c0.f179606a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f179611a, ((e0) obj2).f179611a);
    }

    public final int hashCode() {
        String str = this.f179611a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public e0(String str) {
        this.f179611a = str;
    }
}
