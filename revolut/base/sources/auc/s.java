package auc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f9784c;
    public final Long d;

    public /* synthetic */ s(int i, String str, String str2, Long l2, Long l3) {
        if (15 != (i & 15)) {
            j1.f(q.f9780a.getDescriptor(), i, 15);
            throw null;
        }
        this.f9782a = str;
        this.f9783b = str2;
        this.f9784c = l2;
        this.d = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f9782a, sVar.f9782a) && Intrinsics.f(this.f9783b, sVar.f9783b) && Intrinsics.f(this.f9784c, sVar.f9784c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f9782a.hashCode() * 31, 31, this.f9783b);
        Long l2 = this.f9784c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }

    public s(String id10, Long l2, Long l3, String status) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f9782a = id10;
        this.f9783b = status;
        this.f9784c = l2;
        this.d = l3;
    }
}
