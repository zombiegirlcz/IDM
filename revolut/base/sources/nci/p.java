package nci;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f214210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f214211c;
    public final boolean d;

    public p(List items, TextClause textClause, File file, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f214209a = items;
        this.f214210b = textClause;
        this.f214211c = file;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f214209a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f214209a, pVar.f214209a) && Intrinsics.f(this.f214210b, pVar.f214210b) && Intrinsics.f(this.f214211c, pVar.f214211c) && this.d == pVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f214209a.hashCode() * 31;
        Clause clause = this.f214210b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        File file = this.f214211c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (file != null ? file.hashCode() : 0)) * 31);
    }

    public /* synthetic */ p(List list, TextClause textClause, boolean z, int i) {
        this(list, textClause, (File) null, (i & 8) != 0 ? false : z);
    }
}
