package nv4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f219467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f219468b;

    public k(TextLocalisedClause title, TextLocalisedClause footer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f219467a = title;
        this.f219468b = footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f219467a.equals(kVar.f219467a) && this.f219468b.equals(kVar.f219468b);
    }

    public final int hashCode() {
        return this.f219468b.hashCode() + (this.f219467a.hashCode() * 31);
    }
}
