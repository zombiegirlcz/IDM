package rv7;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f257727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f257728c;
    public final List d;
    public final String e;
    public final boolean f;

    public i(List items, TextClause title, boolean z, List tabs, String str, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f257726a = items;
        this.f257727b = title;
        this.f257728c = z;
        this.d = tabs;
        this.e = str;
        this.f = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f257726a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f257726a, iVar.f257726a) && this.f257727b.equals(iVar.f257727b) && this.f257728c == iVar.f257728c && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(v7.b(this.f257726a.hashCode() * 31, 31, this.f257727b), 31, this.f257728c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
