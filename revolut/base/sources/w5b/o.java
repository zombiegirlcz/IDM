package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294960c;

    public /* synthetic */ o(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(m.f294917a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294958a = str;
        this.f294959b = str2;
        this.f294960c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f294958a, oVar.f294958a) && Intrinsics.f(this.f294959b, oVar.f294959b) && Intrinsics.f(this.f294960c, oVar.f294960c);
    }

    public final int hashCode() {
        return this.f294960c.hashCode() + p.a.c(this.f294958a.hashCode() * 31, 31, this.f294959b);
    }
}
