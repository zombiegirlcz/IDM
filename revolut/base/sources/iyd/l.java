package iyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f169676b;

    public /* synthetic */ l(int i, String str, c cVar) {
        if (3 != (i & 3)) {
            j1.f(j.f169670a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169675a = str;
        this.f169676b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f169675a, lVar.f169675a) && Intrinsics.f(this.f169676b, lVar.f169676b);
    }

    public final int hashCode() {
        return this.f169676b.hashCode() + (this.f169675a.hashCode() * 31);
    }

    public l(String title, c action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f169675a = title;
        this.f169676b = action;
    }
}
