package l0c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f191219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f191220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f191221c;
    public final List d;
    public final boolean e;

    public r(List items, TextClause textClause, File file, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f191219a = items;
        this.f191220b = textClause;
        this.f191221c = file;
        this.d = menuItems;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f191219a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f191219a, rVar.f191219a) && Intrinsics.f(this.f191220b, rVar.f191220b) && Intrinsics.f(this.f191221c, rVar.f191221c) && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f191219a.hashCode() * 31;
        Clause clause = this.f191220b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        File file = this.f191221c;
        return Boolean.hashCode(this.e) + p.a.d((iHashCode2 + (file != null ? file.hashCode() : 0)) * 31, 31, this.d);
    }

    public r(List list, TextClause textClause, List list2, boolean z, int i) {
        this(list, textClause, (File) null, (i & 8) != 0 ? f0.f322471a : list2, (i & 16) != 0 ? false : z);
    }
}
