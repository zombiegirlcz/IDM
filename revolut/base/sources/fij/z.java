package fij;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f135467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f135468b;

    public z(TextLocalisedClause ctaText, boolean z) {
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        this.f135467a = ctaText;
        this.f135468b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f135467a.equals(zVar.f135467a) && this.f135468b == zVar.f135468b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135468b) + (this.f135467a.hashCode() * 31);
    }
}
