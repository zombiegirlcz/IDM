package xjc;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f306508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f306509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f306510c;

    public b(ArrayList items, TextClause title, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f306508a = items;
        this.f306509b = title;
        this.f306510c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f306508a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f306508a.equals(bVar.f306508a) && this.f306509b.equals(bVar.f306509b) && Intrinsics.f(this.f306510c, bVar.f306510c);
    }

    public final int hashCode() {
        int iB = v7.b(this.f306508a.hashCode() * 31, 31, this.f306509b);
        aw0.i iVar = this.f306510c;
        return iB + (iVar == null ? 0 : iVar.hashCode());
    }
}
