package u09;

import com.revolut.feature.learn.shared.models.domain.LearnReward;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276147c;
    public final String d;
    public final List e;
    public final d0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LearnReward f276148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f276149h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kotlin.jvm.internal.s f276150j;
    public final i0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f276151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f276152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f276153n;

    public q(String id10, String title, String courseId, String thumbnail, List contentCards, d0 d0Var, LearnReward reward, y progress, String str, kotlin.jvm.internal.s content, i0 rewardStatus, int i, int i2, List list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(contentCards, "contentCards");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(rewardStatus, "rewardStatus");
        this.f276145a = id10;
        this.f276146b = title;
        this.f276147c = courseId;
        this.d = thumbnail;
        this.e = contentCards;
        this.f = d0Var;
        this.f276148g = reward;
        this.f276149h = progress;
        this.i = str;
        this.f276150j = content;
        this.k = rewardStatus;
        this.f276151l = i;
        this.f276152m = i2;
        this.f276153n = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f276145a, qVar.f276145a) && Intrinsics.f(this.f276146b, qVar.f276146b) && Intrinsics.f(this.f276147c, qVar.f276147c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f276148g, qVar.f276148g) && this.f276149h == qVar.f276149h && Intrinsics.f(this.i, qVar.i) && Intrinsics.f(this.f276150j, qVar.f276150j) && this.k == qVar.k && this.f276151l == qVar.f276151l && this.f276152m == qVar.f276152m && Intrinsics.f(this.f276153n, qVar.f276153n);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.c(this.f276145a.hashCode() * 31, 31, this.f276146b), 31, this.f276147c), 31, this.d), 31, this.e);
        d0 d0Var = this.f;
        int iHashCode = (this.f276149h.hashCode() + ((this.f276148g.hashCode() + ((iD + (d0Var == null ? 0 : d0Var.hashCode())) * 31)) * 31)) * 31;
        String str = this.i;
        int iB = j6.a.b(this.f276152m, j6.a.b(this.f276151l, (this.k.hashCode() + ((this.f276150j.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31);
        List list = this.f276153n;
        return iB + (list != null ? list.hashCode() : 0);
    }
}
