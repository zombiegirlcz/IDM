package mii;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f205871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f205872c;
    public final Parcelable d;
    public final f1 e;

    public k(String id10, Clause message, Clause clause, Parcelable parcelable, f1 position, int i) {
        clause = (i & 4) != 0 ? null : clause;
        parcelable = (i & 8) != 0 ? null : parcelable;
        position = (i & 16) != 0 ? f1.BOTTOM : position;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f205870a = id10;
        this.f205871b = message;
        this.f205872c = clause;
        this.d = parcelable;
        this.e = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f205870a, kVar.f205870a) && Intrinsics.f(this.f205871b, kVar.f205871b) && Intrinsics.f(this.f205872c, kVar.f205872c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f205870a.hashCode() * 31, 31, this.f205871b);
        Clause clause = this.f205872c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Parcelable parcelable = this.d;
        return this.e.hashCode() + ((iHashCode + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
    }
}
