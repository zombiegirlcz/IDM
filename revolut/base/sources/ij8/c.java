package ij8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161723a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f161723a = str;
        } else {
            j1.f(a.f161722a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f161723a, ((c) obj2).f161723a);
    }

    public final int hashCode() {
        return this.f161723a.hashCode();
    }

    public c(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f161723a = phone;
    }
}
