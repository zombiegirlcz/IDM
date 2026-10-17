package aw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f10442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f10443b;

    public o(TextLocalisedClause linkText) {
        v linkLocation = v.START;
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        Intrinsics.checkNotNullParameter(linkLocation, "linkLocation");
        this.f10442a = linkText;
        this.f10443b = linkLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f10442a, oVar.f10442a) && this.f10443b == oVar.f10443b;
    }

    public final int hashCode() {
        return this.f10443b.hashCode() + (this.f10442a.hashCode() * 31);
    }
}
