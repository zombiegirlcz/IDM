package s46;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f259775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259777c;
    public final String d;
    public final String e;

    public /* synthetic */ c(int i, f fVar, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            j1.f(a.f259774a.getDescriptor(), i, 31);
            throw null;
        }
        this.f259775a = fVar;
        this.f259776b = str;
        this.f259777c = str2;
        this.d = str3;
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
        return Intrinsics.f(this.f259775a, cVar.f259775a) && Intrinsics.f(this.f259776b, cVar.f259776b) && Intrinsics.f(this.f259777c, cVar.f259777c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f259775a.hashCode() * 31, 31, this.f259776b), 31, this.f259777c), 31, this.d);
    }
}
