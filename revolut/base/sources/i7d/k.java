package i7d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f159275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f159276c;

    public k(TextLocalisedClause title, String analyticsContextId, List items) {
        Intrinsics.checkNotNullParameter(analyticsContextId, "analyticsContextId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159274a = analyticsContextId;
        this.f159275b = title;
        this.f159276c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f159274a.equals(kVar.f159274a) && this.f159275b.equals(kVar.f159275b) && Intrinsics.f(this.f159276c, kVar.f159276c);
    }

    public final int hashCode() {
        return this.f159276c.hashCode() + t61.a.a(this.f159274a.hashCode() * 31, 31, this.f159275b);
    }
}
