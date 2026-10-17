package uyc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f284140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f284141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f284142c;

    public l(TextLocalisedClause caption, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(caption, "caption");
        this.f284140a = z;
        this.f284141b = z3;
        this.f284142c = caption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f284140a == lVar.f284140a && this.f284141b == lVar.f284141b && this.f284142c.equals(lVar.f284142c);
    }

    public final int hashCode() {
        return this.f284142c.hashCode() + j6.a.c(Boolean.hashCode(this.f284140a) * 31, 31, this.f284141b);
    }
}
