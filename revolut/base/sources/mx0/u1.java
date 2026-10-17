package mx0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u1 extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f210026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f210027b;

    public u1(Clause title, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f210026a = title;
        this.f210027b = parcelable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Intrinsics.f(this.f210026a, u1Var.f210026a) && Intrinsics.f(this.f210027b, u1Var.f210027b);
    }

    public final int hashCode() {
        int iHashCode = this.f210026a.hashCode() * 31;
        Parcelable parcelable = this.f210027b;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }
}
