package deb;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f113361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f113362c;

    public l(aim.e items, TextLocalisedClause submitButtonText, boolean z) {
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f113360a = z;
        this.f113361b = submitButtonText;
        this.f113362c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f113362c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f113360a == lVar.f113360a && this.f113361b.equals(lVar.f113361b) && Intrinsics.f(this.f113362c, lVar.f113362c);
    }

    public final int hashCode() {
        return this.f113362c.hashCode() + t61.a.a(Boolean.hashCode(this.f113360a) * 31, 31, this.f113361b);
    }
}
