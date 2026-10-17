package w19;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f293804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPointsTextWithLinks f293805c;
    public final String d;

    public /* synthetic */ e(int i, String str, String str2, RevPointsTextWithLinks revPointsTextWithLinks, String str3) {
        if (15 != (i & 15)) {
            j1.f(c.f293802a.getDescriptor(), i, 15);
            throw null;
        }
        this.f293803a = str;
        this.f293804b = str2;
        this.f293805c = revPointsTextWithLinks;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f293803a, eVar.f293803a) && Intrinsics.f(this.f293804b, eVar.f293804b) && Intrinsics.f(this.f293805c, eVar.f293805c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f293805c.hashCode() + p.a.c(this.f293803a.hashCode() * 31, 31, this.f293804b)) * 31);
    }

    public e(String id10, String title, RevPointsTextWithLinks subtitle, String icon) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f293803a = id10;
        this.f293804b = title;
        this.f293805c = subtitle;
        this.d = icon;
    }
}
