package zr7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zr7.b;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f324623c = {null, yhm.j.c(yhm.k.PUBLICATION, new zr4.b(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f324625b;

    public /* synthetic */ e(int i, String str, b bVar) {
        if (3 != (i & 3)) {
            j1.f(c.f324622a.getDescriptor(), i, 3);
            throw null;
        }
        this.f324624a = str;
        this.f324625b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f324624a, eVar.f324624a) && Intrinsics.f(this.f324625b, eVar.f324625b);
    }

    public final int hashCode() {
        int iHashCode = this.f324624a.hashCode() * 31;
        b bVar = this.f324625b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public e(String text, b.C1801b c1801b) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f324624a = text;
        this.f324625b = c1801b;
    }
}
