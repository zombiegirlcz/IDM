package hzj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f157199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f157200c;
    public final Clause d;
    public final a e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f157201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f157202h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f157203j;

    public b(String id10, TextLocalisedClause titleClause, Clause descriptionClause, Clause usageClause, a usageProgress, int i, int i2, int i3, int i5, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(descriptionClause, "descriptionClause");
        Intrinsics.checkNotNullParameter(usageClause, "usageClause");
        Intrinsics.checkNotNullParameter(usageProgress, "usageProgress");
        this.f157198a = id10;
        this.f157199b = titleClause;
        this.f157200c = descriptionClause;
        this.d = usageClause;
        this.e = usageProgress;
        this.f = i;
        this.f157201g = i2;
        this.f157202h = i3;
        this.i = i5;
        this.f157203j = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f157198a, bVar.f157198a) && this.f157199b.equals(bVar.f157199b) && Intrinsics.f(this.f157200c, bVar.f157200c) && Intrinsics.f(this.d, bVar.d) && this.e.equals(bVar.e) && this.f == bVar.f && this.f157201g == bVar.f157201g && this.f157202h == bVar.f157202h && this.i == bVar.i && Intrinsics.f(this.f157203j, bVar.f157203j);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.i, j6.a.b(this.f157202h, j6.a.b(this.f157201g, j6.a.b(this.f, (this.e.hashCode() + p.a.a(p.a.a(t61.a.a(this.f157198a.hashCode() * 31, 31, this.f157199b), 31, this.f157200c), 31, this.d)) * 31, 31), 31), 31), 31);
        String str = this.f157203j;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
