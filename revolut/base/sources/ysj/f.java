package ysj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316476b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f316474a.getDescriptor(), i, 3);
            throw null;
        }
        this.f316475a = str;
        this.f316476b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f316475a, fVar.f316475a) && Intrinsics.f(this.f316476b, fVar.f316476b);
    }

    public final int hashCode() {
        return this.f316476b.hashCode() + (this.f316475a.hashCode() * 31);
    }

    public f(String id10, String state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f316475a = id10;
        this.f316476b = state;
    }
}
