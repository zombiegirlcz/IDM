package ht2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f155234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155235b;

    public o(TextLocalisedClause name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f155234a = name;
        this.f155235b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f155234a.equals(oVar.f155234a) && this.f155235b == oVar.f155235b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f155235b) + (this.f155234a.hashCode() * 31);
    }
}
