package vch;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f287753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f287754c;
    public final y d;

    public z(aim.e items, TextLocalisedClause confirmButtonText, boolean z, y navBar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        this.f287752a = items;
        this.f287753b = confirmButtonText;
        this.f287754c = z;
        this.d = navBar;
    }

    @Override // jki.n
    public final List c() {
        return this.f287752a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f287752a, zVar.f287752a) && this.f287753b.equals(zVar.f287753b) && this.f287754c == zVar.f287754c && this.d.equals(zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f287752a.hashCode() * 31, 31, this.f287753b), 31, this.f287754c);
    }
}
