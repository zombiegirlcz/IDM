package dtf;

import cli.p;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f117447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f117448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f117449c;

    public h(ArrayList items, boolean z, CompositeClause footerClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerClause, "footerClause");
        this.f117447a = items;
        this.f117448b = z;
        this.f117449c = footerClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f117447a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f117447a.equals(hVar.f117447a) && this.f117448b == hVar.f117448b && this.f117449c.equals(hVar.f117449c);
    }

    public final int hashCode() {
        return this.f117449c.hashCode() + j6.a.c(this.f117447a.hashCode() * 31, 31, this.f117448b);
    }
}
