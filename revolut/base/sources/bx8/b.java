package bx8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f19514b;

    public b(TextLocalisedClause textLocalisedClause, String regex) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.f19513a = regex;
        this.f19514b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f19513a.equals(bVar.f19513a) && this.f19514b.equals(bVar.f19514b);
    }

    public final int hashCode() {
        return this.f19514b.hashCode() + (this.f19513a.hashCode() * 31);
    }
}
