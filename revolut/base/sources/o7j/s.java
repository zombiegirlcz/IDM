package o7j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f222873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f222874b;

    public s(TextLocalisedClause textClause, boolean z) {
        Intrinsics.checkNotNullParameter(textClause, "textClause");
        this.f222873a = textClause;
        this.f222874b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f222873a.equals(sVar.f222873a) && this.f222874b == sVar.f222874b;
    }

    public final int hashCode() {
        return j6.a.c(this.f222873a.hashCode() * 31, 31, this.f222874b);
    }
}
