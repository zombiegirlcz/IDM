package zx6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f326052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f326053b;

    public k(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f326052a = title;
        this.f326053b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f326052a.equals(kVar.f326052a) && this.f326053b.equals(kVar.f326053b);
    }

    public final int hashCode() {
        return this.f326053b.hashCode() + (this.f326052a.hashCode() * 31);
    }
}
