package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170437c;

    public /* synthetic */ u(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(s.f170428a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170435a = str;
        this.f170436b = str2;
        this.f170437c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f170435a, uVar.f170435a) && Intrinsics.f(this.f170436b, uVar.f170436b) && Intrinsics.f(this.f170437c, uVar.f170437c);
    }

    public final int hashCode() {
        return this.f170437c.hashCode() + p.a.c(this.f170435a.hashCode() * 31, 31, this.f170436b);
    }

    public u(String id10, String product, String description) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f170435a = id10;
        this.f170436b = product;
        this.f170437c = description;
    }
}
