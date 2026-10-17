package oy6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f230899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f230900b;

    public l(TextLocalisedClause buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f230899a = buttonLabel;
        this.f230900b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f230899a.equals(lVar.f230899a) && this.f230900b == lVar.f230900b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230900b) + (this.f230899a.hashCode() * 31);
    }
}
