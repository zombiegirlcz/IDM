package qzb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f250496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f250497b;

    public f(TextLocalisedClause title, List pages) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f250496a = title;
        this.f250497b = pages;
    }

    @Override // qzb.i
    public final List a() {
        return this.f250497b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f250496a.equals(fVar.f250496a) && Intrinsics.f(this.f250497b, fVar.f250497b);
    }

    public final int hashCode() {
        return this.f250497b.hashCode() + (this.f250496a.hashCode() * 31);
    }
}
