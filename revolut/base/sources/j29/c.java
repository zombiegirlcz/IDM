package j29;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170742c;
    public final jo3.a d;
    public final String e;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, jo3.a aVar) {
        if (31 != (i & 31)) {
            j1.f(a.f170737a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170740a = str;
        this.f170741b = str2;
        this.f170742c = str3;
        this.d = aVar;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f170740a, cVar.f170740a) && Intrinsics.f(this.f170741b, cVar.f170741b) && Intrinsics.f(this.f170742c, cVar.f170742c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.j(this.d, p.a.c(p.a.c(this.f170740a.hashCode() * 31, 31, this.f170741b), 31, this.f170742c), 31);
    }
}
