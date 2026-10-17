package wgj;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f297328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f297329b;

    public e(TextClause textClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f297328a = textClause;
        this.f297329b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f297329b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f297328a.equals(eVar.f297328a) && this.f297329b.equals(eVar.f297329b);
    }

    public final int hashCode() {
        return this.f297329b.hashCode() + (this.f297328a.hashCode() * 31);
    }
}
