package qo6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248058b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f248056a.getDescriptor(), i, 3);
            throw null;
        }
        this.f248057a = str;
        this.f248058b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f248057a, fVar.f248057a) && Intrinsics.f(this.f248058b, fVar.f248058b);
    }

    public final int hashCode() {
        int iHashCode = this.f248057a.hashCode() * 31;
        String str = this.f248058b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
