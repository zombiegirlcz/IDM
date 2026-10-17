package ro8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f255940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f255941b;

    public g(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f255940a = title;
        this.f255941b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f255940a.equals(gVar.f255940a) && this.f255941b.equals(gVar.f255941b);
    }

    public final int hashCode() {
        return this.f255941b.hashCode() + (this.f255940a.hashCode() * 31);
    }
}
