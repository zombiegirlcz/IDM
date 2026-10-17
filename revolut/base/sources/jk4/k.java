package jk4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f175076b;

    public k(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f175075a = z;
        this.f175076b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f175075a == kVar.f175075a && this.f175076b.equals(kVar.f175076b);
    }

    public final int hashCode() {
        return this.f175076b.hashCode() + (Boolean.hashCode(this.f175075a) * 31);
    }
}
