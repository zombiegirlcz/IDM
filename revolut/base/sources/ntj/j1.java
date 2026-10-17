package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219081c;

    public /* synthetic */ j1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(h1.f219073a.getDescriptor(), i, 7);
            throw null;
        }
        this.f219079a = str;
        this.f219080b = str2;
        this.f219081c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f219079a, j1Var.f219079a) && Intrinsics.f(this.f219080b, j1Var.f219080b) && Intrinsics.f(this.f219081c, j1Var.f219081c);
    }

    public final int hashCode() {
        return this.f219081c.hashCode() + p.a.c(this.f219079a.hashCode() * 31, 31, this.f219080b);
    }

    public j1(String id10, String title, String state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f219079a = id10;
        this.f219080b = title;
        this.f219081c = state;
    }
}
