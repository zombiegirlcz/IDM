package mx0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f209668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f209669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f209670c;
    public final Clause d;
    public final Parcelable e;
    public final d2 f;

    public /* synthetic */ e2(f2 f2Var, TextLocalisedClause textLocalisedClause, d2 d2Var) {
        this(f2Var, x1.f210101a, a2.f209574a, textLocalisedClause, null, d2Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj2;
        return Intrinsics.f(this.f209668a, e2Var.f209668a) && Intrinsics.f(this.f209669b, e2Var.f209669b) && Intrinsics.f(this.f209670c, e2Var.f209670c) && Intrinsics.f(this.d, e2Var.d) && Intrinsics.f(this.e, e2Var.e) && this.f == e2Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f209670c.hashCode() + ((this.f209669b.hashCode() + (this.f209668a.hashCode() * 31)) * 31)) * 31;
        Clause clause = this.d;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Parcelable parcelable = this.e;
        return this.f.hashCode() + ((iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
    }

    public e2(i2 stories, y1 action, b2 errorHandler, Clause clause, Parcelable parcelable, d2 style) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f209668a = stories;
        this.f209669b = action;
        this.f209670c = errorHandler;
        this.d = clause;
        this.e = parcelable;
        this.f = style;
    }
}
