package v94;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f286978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f286979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f286980c;
    public final List d;
    public final File e;

    public k(List items, Clause title, Clause clause, List menuItems, File file) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f286978a = items;
        this.f286979b = title;
        this.f286980c = clause;
        this.d = menuItems;
        this.e = file;
    }

    @Override // cli.p
    public final List c() {
        return this.f286978a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f286978a, kVar.f286978a) && Intrinsics.f(this.f286979b, kVar.f286979b) && Intrinsics.f(this.f286980c, kVar.f286980c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f286978a.hashCode() * 31, 31, this.f286979b);
        Clause clause = this.f286980c;
        int iD = p.a.d((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        File file = this.e;
        return iD + (file != null ? file.hashCode() : 0);
    }
}
