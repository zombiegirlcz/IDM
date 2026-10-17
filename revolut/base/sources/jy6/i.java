package jy6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f179337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f179338b;

    public i(TextLocalisedClause buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f179337a = buttonLabel;
        this.f179338b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f179337a.equals(iVar.f179337a) && this.f179338b == iVar.f179338b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179338b) + (this.f179337a.hashCode() * 31);
    }
}
