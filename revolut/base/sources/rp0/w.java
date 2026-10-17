package rp0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f256207b;

    public w(TextLocalisedClause value, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f256206a = id10;
        this.f256207b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f256206a.equals(wVar.f256206a) && this.f256207b.equals(wVar.f256207b);
    }

    public final int hashCode() {
        return this.f256207b.hashCode() + (this.f256206a.hashCode() * 31);
    }
}
