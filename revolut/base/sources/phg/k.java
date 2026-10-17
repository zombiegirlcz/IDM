package phg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f236306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f236307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f236308c;

    public k(TextLocalisedClause navBarTitle, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f236306a = items;
        this.f236307b = navBarTitle;
        this.f236308c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f236306a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f236306a.equals(kVar.f236306a) && this.f236307b.equals(kVar.f236307b) && this.f236308c == kVar.f236308c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236308c) + t61.a.a(this.f236306a.hashCode() * 31, 31, this.f236307b);
    }
}
