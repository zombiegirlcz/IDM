package vq5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f291326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f291327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f291328c;
    public final List d;

    public l(aim.e items, TextLocalisedClause title, TextLocalisedClause ctaText, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f291326a = title;
        this.f291327b = ctaText;
        this.f291328c = z;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f291326a.equals(lVar.f291326a) && this.f291327b.equals(lVar.f291327b) && this.f291328c == lVar.f291328c && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f291326a.hashCode() * 31, 31, this.f291327b), 31, this.f291328c);
    }
}
