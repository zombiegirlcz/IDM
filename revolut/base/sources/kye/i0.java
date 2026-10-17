package kye;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import mx0.f7;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f190739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f190740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f190741c;
    public final h0 d;
    public final f7 e;
    public final String f;

    public i0(TextLocalisedClause title, boolean z, LargeActionButton.ButtonStyle style, h0 roundButtonState, c7 c7Var, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(roundButtonState, "roundButtonState");
        this.f190739a = title;
        this.f190740b = z;
        this.f190741c = style;
        this.d = roundButtonState;
        this.e = c7Var;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return this.f190739a.equals(i0Var.f190739a) && this.f190740b == i0Var.f190740b && Intrinsics.f(this.f190741c, i0Var.f190741c) && this.d == i0Var.d && Intrinsics.f(this.e, i0Var.e) && Intrinsics.f(this.f, i0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + r6.b.d(this.f190741c, j6.a.c(this.f190739a.hashCode() * 31, 31, this.f190740b), 31)) * 31;
        f7 f7Var = this.e;
        int iHashCode2 = (iHashCode + (f7Var == null ? 0 : f7Var.hashCode())) * 31;
        String str = this.f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
