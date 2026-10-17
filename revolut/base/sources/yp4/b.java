package yp4;

import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedQuantityClause f315779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f315780b;

    public b(TextLocalisedQuantityClause text, Integer parcel) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f315779a = text;
        this.f315780b = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f315779a.equals(bVar.f315779a) && this.f315780b.equals(bVar.f315780b);
    }

    public final int hashCode() {
        return this.f315780b.hashCode() + (this.f315779a.hashCode() * 31);
    }
}
