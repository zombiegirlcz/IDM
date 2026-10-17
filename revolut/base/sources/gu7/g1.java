package gu7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f146750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146751b;

    public g1(TextLocalisedClause text, String value) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f146750a = text;
        this.f146751b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return this.f146750a.equals(g1Var.f146750a) && Intrinsics.f(this.f146751b, g1Var.f146751b);
    }

    public final int hashCode() {
        return this.f146751b.hashCode() + (this.f146750a.hashCode() * 31);
    }
}
