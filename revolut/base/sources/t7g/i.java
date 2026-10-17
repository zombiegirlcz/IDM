package t7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268677c;
    public final String d;

    public /* synthetic */ i(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(g.f268674a.getDescriptor(), i, 15);
            throw null;
        }
        this.f268675a = str;
        this.f268676b = str2;
        this.f268677c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f268675a, iVar.f268675a) && Intrinsics.f(this.f268676b, iVar.f268676b) && Intrinsics.f(this.f268677c, iVar.f268677c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f268675a.hashCode() * 31, 31, this.f268676b), 31, this.f268677c);
    }
}
