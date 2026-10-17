package lh6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f195159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f195160b;

    public a(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f195159a = textLocalisedClause;
        this.f195160b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f195159a, aVar.f195159a) && this.f195160b == aVar.f195160b;
    }

    public final int hashCode() {
        Clause clause = this.f195159a;
        return Boolean.hashCode(this.f195160b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
