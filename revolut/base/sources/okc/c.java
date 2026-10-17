package okc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f225968c;
    public final String d;
    public final f e;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, f fVar) {
        if (31 != (i & 31)) {
            j1.f(a.f225965a.getDescriptor(), i, 31);
            throw null;
        }
        this.f225966a = str;
        this.f225967b = str2;
        this.f225968c = str3;
        this.d = str4;
        this.e = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f225966a, cVar.f225966a) && Intrinsics.f(this.f225967b, cVar.f225967b) && Intrinsics.f(this.f225968c, cVar.f225968c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f225966a.hashCode() * 31, 31, this.f225967b), 31, this.f225968c), 31, this.d);
    }
}
