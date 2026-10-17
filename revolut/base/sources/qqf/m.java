package qqf;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f248543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f248544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f248545c;

    public m(ArrayList items, TextClause navBarDescription, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        this.f248543a = items;
        this.f248544b = navBarDescription;
        this.f248545c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f248543a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f248543a.equals(mVar.f248543a) && this.f248544b.equals(mVar.f248544b) && this.f248545c == mVar.f248545c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248545c) + v7.b(this.f248543a.hashCode() * 31, 31, this.f248544b);
    }
}
