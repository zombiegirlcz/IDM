package kzj;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f191120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f191121b;

    public c(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f191120a = items;
        this.f191121b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f191120a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f191120a, cVar.f191120a) && this.f191121b.equals(cVar.f191121b);
    }

    public final int hashCode() {
        return this.f191121b.hashCode() + (this.f191120a.hashCode() * 31);
    }
}
