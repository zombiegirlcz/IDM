package tof;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class h3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5 f272779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p6 f272780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f272781c;
    public final String d;
    public final DateTime e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f272782g;

    public h3(j5 merchant, p6 p6Var, t0 fraudState, String str, DateTime dateTime, boolean z, List relatedTransactions) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(fraudState, "fraudState");
        Intrinsics.checkNotNullParameter(relatedTransactions, "relatedTransactions");
        this.f272779a = merchant;
        this.f272780b = p6Var;
        this.f272781c = fraudState;
        this.d = str;
        this.e = dateTime;
        this.f = z;
        this.f272782g = relatedTransactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.f272779a, h3Var.f272779a) && Intrinsics.f(this.f272780b, h3Var.f272780b) && this.f272781c == h3Var.f272781c && Intrinsics.f(this.d, h3Var.d) && Intrinsics.f(this.e, h3Var.e) && this.f == h3Var.f && Intrinsics.f(this.f272782g, h3Var.f272782g);
    }

    public final int hashCode() {
        int iHashCode = this.f272779a.hashCode() * 31;
        p6 p6Var = this.f272780b;
        int iHashCode2 = (this.f272781c.hashCode() + ((iHashCode + (p6Var == null ? 0 : p6Var.hashCode())) * 31)) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.e;
        return this.f272782g.hashCode() + j6.a.c((iHashCode3 + (dateTime != null ? dateTime.hashCode() : 0)) * 31, 31, this.f);
    }
}
