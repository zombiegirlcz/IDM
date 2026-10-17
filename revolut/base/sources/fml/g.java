package fml;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f136478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136479b;

    public g(TextLocalisedClause title, String loadingTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(loadingTag, "loadingTag");
        this.f136478a = title;
        this.f136479b = loadingTag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f136478a.equals(gVar.f136478a) && this.f136479b.equals(gVar.f136479b);
    }

    public final int hashCode() {
        return this.f136479b.hashCode() + (this.f136478a.hashCode() * 31);
    }
}
