package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j5 {

    @NotNull
    public static final i5 Companion = new i5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153161a;

    public /* synthetic */ j5(int i, String str) {
        if (1 == (i & 1)) {
            this.f153161a = str;
        } else {
            qlm.j1.f(h5.f153127a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j5) && Intrinsics.f(this.f153161a, ((j5) obj2).f153161a);
    }

    public final int hashCode() {
        return this.f153161a.hashCode();
    }
}
