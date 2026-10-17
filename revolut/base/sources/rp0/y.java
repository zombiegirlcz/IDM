package rp0;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y implements oy0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f256218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f256219c;
    public final boolean d;
    public final boolean e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f256220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f256221h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f256222j;
    public final Parcelable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f256223l;

    public y(List items, u uVar, l background, boolean z, boolean z3, Integer num, Object obj2, String str, String str2, Object obj3, Parcelable parcelable, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f256217a = items;
        this.f256218b = uVar;
        this.f256219c = background;
        this.d = z;
        this.e = z3;
        this.f = num;
        this.f256220g = obj2;
        this.f256221h = str;
        this.i = str2;
        this.f256222j = obj3;
        this.k = parcelable;
        this.f256223l = clause;
    }

    public static y a(y yVar, String str) {
        List items = yVar.f256217a;
        u uVar = yVar.f256218b;
        l background = yVar.f256219c;
        boolean z = yVar.d;
        boolean z3 = yVar.e;
        Integer num = yVar.f;
        Object obj2 = yVar.f256220g;
        String str2 = yVar.f256221h;
        Object obj3 = yVar.f256222j;
        Parcelable parcelable = yVar.k;
        Clause clause = yVar.f256223l;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(background, "background");
        return new y(items, uVar, background, z, z3, num, obj2, str2, str, obj3, parcelable, clause);
    }

    public final l b() {
        return this.f256219c;
    }

    public final String c() {
        return this.i;
    }

    public final Object d() {
        return this.f256220g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f256217a, yVar.f256217a) && Intrinsics.f(this.f256218b, yVar.f256218b) && this.f256219c == yVar.f256219c && this.d == yVar.d && this.e == yVar.e && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f256220g, yVar.f256220g) && Intrinsics.f(this.f256221h, yVar.f256221h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f256222j, yVar.f256222j) && Intrinsics.f(this.k, yVar.k) && Intrinsics.f(this.f256223l, yVar.f256223l);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription */
    public final Clause getF57774b() {
        return this.f256223l;
    }

    public final int hashCode() {
        int iHashCode = this.f256217a.hashCode() * 31;
        u uVar = this.f256218b;
        int iC = j6.a.c(j6.a.c((this.f256219c.hashCode() + ((iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        Integer num = this.f;
        int iHashCode2 = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Object obj2 = this.f256220g;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str = this.f256221h;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj3 = this.f256222j;
        int iHashCode6 = (iHashCode5 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Parcelable parcelable = this.k;
        int iHashCode7 = (iHashCode6 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Clause clause = this.f256223l;
        return iHashCode7 + (clause != null ? clause.hashCode() : 0);
    }

    public /* synthetic */ y(List list, u uVar, l lVar, Integer num, Object obj2, String str, String str2, AnalyticsProduct analyticsProduct, Parcelable parcelable, Clause clause, int i) {
        this(list, (i & 2) != 0 ? null : uVar, (i & 4) != 0 ? l.DEFAULT : lVar, true, true, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : obj2, (i & 128) != 0 ? null : str, str2, (i & 512) != 0 ? null : analyticsProduct, (i & 1024) != 0 ? null : parcelable, (i & 2048) != 0 ? null : clause);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(List items, u uVar, l lVar, Integer num, Object obj2, Parcelable parcelable, int i) {
        u uVar2 = (i & 2) != 0 ? null : uVar;
        l background = (i & 4) != 0 ? l.DEFAULT : lVar;
        Integer num2 = (i & 16) != 0 ? null : num;
        Object obj3 = (i & 32) != 0 ? null : obj2;
        String str = (i & 64) != 0 ? null : "MEDIA_PICKER_TAG";
        Parcelable parcelable2 = (i & 256) != 0 ? null : parcelable;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(background, "background");
        this(items, uVar2, background, num2, obj3, str, null, null, parcelable2, null, 16);
    }
}
