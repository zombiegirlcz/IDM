package m05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f201079c;

    public /* synthetic */ s(int i, String str, String str2, p pVar) {
        if (7 != (i & 7)) {
            j1.f(q.f201076a.getDescriptor(), i, 7);
            throw null;
        }
        this.f201077a = str;
        this.f201078b = str2;
        this.f201079c = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f201077a, sVar.f201077a) && Intrinsics.f(this.f201078b, sVar.f201078b) && Intrinsics.f(this.f201079c, sVar.f201079c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f201077a.hashCode() * 31, 31, this.f201078b);
        p pVar = this.f201079c;
        return iC + (pVar == null ? 0 : pVar.hashCode());
    }

    public s(String id10, String type, p pVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f201077a = id10;
        this.f201078b = type;
        this.f201079c = pVar;
    }
}
