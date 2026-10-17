package twb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f274977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f274978c;

    public f0(int i, int i2, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f274976a = i;
        this.f274977b = subtitle;
        this.f274978c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f274976a == f0Var.f274976a && Intrinsics.f(this.f274977b, f0Var.f274977b) && this.f274978c == f0Var.f274978c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f274978c) + t61.a.a(Integer.hashCode(this.f274976a) * 31, 31, this.f274977b);
    }
}
