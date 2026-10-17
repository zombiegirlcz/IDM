package jz8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179665c;
    public final String d;
    public final List e;
    public final s0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0 f179666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u09.y f179667h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f179668j;
    public final u09.i0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f179669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f179670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f179671n;

    public t0(String id10, String title, String courseId, String thumbnail, List contentCards, s0 s0Var, z0 reward, u09.y progress, String str, e0 content, u09.i0 rewardStatus, int i, int i2, List list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(contentCards, "contentCards");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(rewardStatus, "rewardStatus");
        this.f179663a = id10;
        this.f179664b = title;
        this.f179665c = courseId;
        this.d = thumbnail;
        this.e = contentCards;
        this.f = s0Var;
        this.f179666g = reward;
        this.f179667h = progress;
        this.i = str;
        this.f179668j = content;
        this.k = rewardStatus;
        this.f179669l = i;
        this.f179670m = i2;
        this.f179671n = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f179663a, t0Var.f179663a) && Intrinsics.f(this.f179664b, t0Var.f179664b) && Intrinsics.f(this.f179665c, t0Var.f179665c) && Intrinsics.f(this.d, t0Var.d) && Intrinsics.f(this.e, t0Var.e) && Intrinsics.f(this.f, t0Var.f) && Intrinsics.f(this.f179666g, t0Var.f179666g) && this.f179667h == t0Var.f179667h && Intrinsics.f(this.i, t0Var.i) && Intrinsics.f(this.f179668j, t0Var.f179668j) && this.k == t0Var.k && this.f179669l == t0Var.f179669l && this.f179670m == t0Var.f179670m && Intrinsics.f(this.f179671n, t0Var.f179671n);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.c(this.f179663a.hashCode() * 31, 31, this.f179664b), 31, this.f179665c), 31, this.d), 31, this.e);
        s0 s0Var = this.f;
        int iHashCode = (this.f179667h.hashCode() + ((this.f179666g.hashCode() + ((iD + (s0Var == null ? 0 : s0Var.hashCode())) * 31)) * 31)) * 31;
        String str = this.i;
        int iB = j6.a.b(this.f179670m, j6.a.b(this.f179669l, (this.k.hashCode() + ((this.f179668j.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31);
        List list = this.f179671n;
        return iB + (list != null ? list.hashCode() : 0);
    }
}
