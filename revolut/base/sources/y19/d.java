package y19;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPointsTextWithLinks f310337c;
    public final c d;
    public final ArrayList e;

    public d(String icon, String title, RevPointsTextWithLinks subtitle, c cVar, ArrayList contentItems) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        this.f310335a = icon;
        this.f310336b = title;
        this.f310337c = subtitle;
        this.d = cVar;
        this.e = contentItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f310335a, dVar.f310335a) && Intrinsics.f(this.f310336b, dVar.f310336b) && this.f310337c.equals(dVar.f310337c) && Intrinsics.f(this.d, dVar.d) && this.e.equals(dVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f310337c.hashCode() + p.a.c(this.f310335a.hashCode() * 31, 31, this.f310336b)) * 31;
        c cVar = this.d;
        return this.e.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
