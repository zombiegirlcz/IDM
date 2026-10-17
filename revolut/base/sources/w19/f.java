package w19;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f = {null, null, j.c(k.PUBLICATION, new vo8.b(26)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f293807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f293808c;
    public final String d;
    public final RevPointsTextWithLinks e;

    public /* synthetic */ f(int i, String str, String str2, List list, String str3, RevPointsTextWithLinks revPointsTextWithLinks) {
        if (31 != (i & 31)) {
            j1.f(a.f293801a.getDescriptor(), i, 31);
            throw null;
        }
        this.f293806a = str;
        this.f293807b = str2;
        this.f293808c = list;
        this.d = str3;
        this.e = revPointsTextWithLinks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f293806a, fVar.f293806a) && Intrinsics.f(this.f293807b, fVar.f293807b) && Intrinsics.f(this.f293808c, fVar.f293808c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(p.a.c(this.f293806a.hashCode() * 31, 31, this.f293807b), 31, this.f293808c), 31, this.d);
        RevPointsTextWithLinks revPointsTextWithLinks = this.e;
        return iC + (revPointsTextWithLinks == null ? 0 : revPointsTextWithLinks.hashCode());
    }

    public f(String title, String subtitle, List items, String cta2, RevPointsTextWithLinks revPointsTextWithLinks) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(cta2, "cta");
        this.f293806a = title;
        this.f293807b = subtitle;
        this.f293808c = items;
        this.d = cta2;
        this.e = revPointsTextWithLinks;
    }
}
