package j1f;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(29)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170393c;
    public final String d;
    public final jo3.a e;

    public /* synthetic */ j0(int i, String str, String str2, List list, String str3, jo3.a aVar) {
        if (7 != (i & 7)) {
            j1.f(h0.f170384a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170391a = str;
        this.f170392b = str2;
        this.f170393c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = aVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f170391a, j0Var.f170391a) && Intrinsics.f(this.f170392b, j0Var.f170392b) && Intrinsics.f(this.f170393c, j0Var.f170393c) && Intrinsics.f(this.d, j0Var.d) && Intrinsics.f(this.e, j0Var.e);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f170391a.hashCode() * 31, 31, this.f170392b), 31, this.f170393c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        jo3.a aVar = this.e;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public j0(String title, String icon, ArrayList options, String str, jo3.a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f170391a = title;
        this.f170392b = icon;
        this.f170393c = options;
        this.d = str;
        this.e = aVar;
    }
}
