package r37;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f251196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f251197b;

    public h(TextLocalisedClause title, TextLocalisedClause caption) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caption, "caption");
        this.f251196a = title;
        this.f251197b = caption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f251196a.equals(hVar.f251196a) && this.f251197b.equals(hVar.f251197b);
    }

    public final int hashCode() {
        return this.f251197b.hashCode() + (this.f251196a.hashCode() * 31);
    }
}
