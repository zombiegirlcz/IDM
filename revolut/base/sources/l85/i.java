package l85;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f192791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f192792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f192793c;

    public i(aw0.e eVar, TextLocalisedClause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f192791a = items;
        this.f192792b = navBarTitle;
        this.f192793c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f192791a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f192791a, iVar.f192791a) && this.f192792b.equals(iVar.f192792b) && Intrinsics.f(this.f192793c, iVar.f192793c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f192791a.hashCode() * 31, 31, this.f192792b);
        aw0.i iVar = this.f192793c;
        return iA + (iVar == null ? 0 : iVar.hashCode());
    }
}
