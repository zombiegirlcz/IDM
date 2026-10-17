package j8i;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f172220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f172221c;

    public h(TextLocalisedClause title, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f172219a = items;
        this.f172220b = title;
        this.f172221c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f172219a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f172219a.equals(hVar.f172219a) && this.f172220b.equals(hVar.f172220b) && this.f172221c == hVar.f172221c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172221c) + t61.a.a(this.f172219a.hashCode() * 31, 31, this.f172220b);
    }
}
