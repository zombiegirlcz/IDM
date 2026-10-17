package nml;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f217384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f217385b;

    public k(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f217384a = title;
        this.f217385b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f217384a.equals(kVar.f217384a) && this.f217385b.equals(kVar.f217385b);
    }

    public final int hashCode() {
        return this.f217385b.hashCode() + (this.f217384a.hashCode() * 31);
    }
}
