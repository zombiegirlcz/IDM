package us4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f282429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f282430b;

    public k(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f282429a = textLocalisedClause;
        this.f282430b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f282429a, kVar.f282429a) && this.f282430b == kVar.f282430b;
    }

    public final int hashCode() {
        Clause clause = this.f282429a;
        return Boolean.hashCode(this.f282430b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
