package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v5 {

    @NotNull
    public static final u5 Companion = new u5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153339b;

    public /* synthetic */ v5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(t5.f153314a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153338a = str;
        this.f153339b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj2;
        return Intrinsics.f(this.f153338a, v5Var.f153338a) && Intrinsics.f(this.f153339b, v5Var.f153339b);
    }

    public final int hashCode() {
        return this.f153339b.hashCode() + (this.f153338a.hashCode() * 31);
    }

    public v5(String id10, String displayName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f153338a = id10;
        this.f153339b = displayName;
    }
}
