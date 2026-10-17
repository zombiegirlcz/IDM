package w26;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f293952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f293953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f293954c;

    public /* synthetic */ d(int i, g gVar, String str, int i2) {
        if (7 != (i & 7)) {
            j1.f(b.f293951a.getDescriptor(), i, 7);
            throw null;
        }
        this.f293952a = gVar;
        this.f293953b = str;
        this.f293954c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f293952a, dVar.f293952a) && Intrinsics.f(this.f293953b, dVar.f293953b) && this.f293954c == dVar.f293954c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f293954c) + p.a.c(this.f293952a.hashCode() * 31, 31, this.f293953b);
    }
}
