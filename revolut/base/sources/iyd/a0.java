package iyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new iw4.b(11)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f169651c;
    public final l d;

    public /* synthetic */ a0(int i, String str, String str2, List list, l lVar) {
        if (15 != (i & 15)) {
            j1.f(y.f169698a.getDescriptor(), i, 15);
            throw null;
        }
        this.f169649a = str;
        this.f169650b = str2;
        this.f169651c = list;
        this.d = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f169649a, a0Var.f169649a) && Intrinsics.f(this.f169650b, a0Var.f169650b) && Intrinsics.f(this.f169651c, a0Var.f169651c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f169649a.hashCode() * 31;
        String str = this.f169650b;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f169651c);
        l lVar = this.d;
        return iD + (lVar != null ? lVar.hashCode() : 0);
    }

    public a0(String id10, String str, ArrayList items, l lVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f169649a = id10;
        this.f169650b = str;
        this.f169651c = items;
        this.d = lVar;
    }
}
