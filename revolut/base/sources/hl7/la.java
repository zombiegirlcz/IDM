package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class la {

    @NotNull
    public static final ka Companion = new ka();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153198b;

    public /* synthetic */ la(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(ja.f153165a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153197a = str;
        this.f153198b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof la)) {
            return false;
        }
        la laVar = (la) obj2;
        return Intrinsics.f(this.f153197a, laVar.f153197a) && Intrinsics.f(this.f153198b, laVar.f153198b);
    }

    public final int hashCode() {
        return this.f153198b.hashCode() + (this.f153197a.hashCode() * 31);
    }
}
