package rp0;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f256043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f256044c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f256045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f256046h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Parcelable f256047j;

    public b(String dialogId, Clause clause, Clause message, Clause positiveButton, Clause clause2, Clause clause3, Object obj2, boolean z, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
        this.f256042a = dialogId;
        this.f256043b = clause;
        this.f256044c = message;
        this.d = positiveButton;
        this.e = clause2;
        this.f = clause3;
        this.f256045g = obj2;
        this.f256046h = z;
        this.i = analyticsProduct;
        this.f256047j = analyticsContext;
    }

    public final Parcelable a() {
        return this.f256047j;
    }

    public final Object b() {
        return this.i;
    }

    public final Clause c() {
        return this.f256044c;
    }

    public final Clause d() {
        return this.f;
    }

    public final Clause e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f256042a, bVar.f256042a) && Intrinsics.f(this.f256043b, bVar.f256043b) && Intrinsics.f(this.f256044c, bVar.f256044c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f256045g, bVar.f256045g) && this.f256046h == bVar.f256046h && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f256047j, bVar.f256047j);
    }

    public final Clause f() {
        return this.d;
    }

    public final Clause g() {
        return this.f256043b;
    }

    public final boolean h() {
        return this.f256046h;
    }

    public final int hashCode() {
        int iHashCode = this.f256042a.hashCode() * 31;
        Clause clause = this.f256043b;
        int iA = p.a.a(p.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f256044c), 31, this.d);
        Clause clause2 = this.e;
        int iHashCode2 = (iA + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f;
        int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Object obj2 = this.f256045g;
        int iC = j6.a.c((iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.f256046h);
        Object obj3 = this.i;
        int iHashCode4 = (iC + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Parcelable parcelable = this.f256047j;
        return iHashCode4 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public /* synthetic */ b(String str, Clause clause, Clause clause2, Clause clause3, TextLocalisedClause textLocalisedClause, Clause clause4, Object obj2, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : clause, clause2, clause3, (i & 16) != 0 ? null : textLocalisedClause, (i & 32) != 0 ? null : clause4, (i & 64) != 0 ? null : obj2, (i & 128) != 0 ? true : z, null, null);
    }
}
