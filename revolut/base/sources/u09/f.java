package u09;

import com.revolut.feature.learn.shared.models.domain.LearnReward;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LearnReward f276111c;
    public final String d;
    public final l e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f276112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f276113h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f276114j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f276115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f276116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f276117n;
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f276118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f276119q;

    public f(String id10, String title, LearnReward reward, String thumbnail, l state, k mode, v domain, String description, int i, List lessons, List lessonsProgress, boolean z, List tags, String str, o oVar, List list, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        Intrinsics.checkNotNullParameter(lessonsProgress, "lessonsProgress");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f276109a = id10;
        this.f276110b = title;
        this.f276111c = reward;
        this.d = thumbnail;
        this.e = state;
        this.f = mode;
        this.f276112g = domain;
        this.f276113h = description;
        this.i = i;
        this.f276114j = lessons;
        this.k = lessonsProgress;
        this.f276115l = z;
        this.f276116m = tags;
        this.f276117n = str;
        this.o = oVar;
        this.f276118p = list;
        this.f276119q = z3;
    }

    public final int a() {
        int i;
        List<y> list = this.k;
        int i2 = 0;
        for (y yVar : list) {
            yVar.getClass();
            switch (x.f276157a[yVar.ordinal()]) {
                case 1:
                case 2:
                    i = 0;
                    break;
                case 3:
                    i = 25;
                    break;
                case 4:
                case 5:
                    i = 50;
                    break;
                case 6:
                    i = 100;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            i2 += i;
        }
        return i2 / list.size();
    }

    public final boolean b() {
        List<y> list = this.k;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (y yVar : list) {
            yVar.getClass();
            if (yVar != y.COMPLETED) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f276109a, fVar.f276109a) && Intrinsics.f(this.f276110b, fVar.f276110b) && Intrinsics.f(this.f276111c, fVar.f276111c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f && this.f276112g == fVar.f276112g && Intrinsics.f(this.f276113h, fVar.f276113h) && this.i == fVar.i && Intrinsics.f(this.f276114j, fVar.f276114j) && Intrinsics.f(this.k, fVar.k) && this.f276115l == fVar.f276115l && Intrinsics.f(this.f276116m, fVar.f276116m) && Intrinsics.f(this.f276117n, fVar.f276117n) && Intrinsics.f(this.o, fVar.o) && Intrinsics.f(this.f276118p, fVar.f276118p) && this.f276119q == fVar.f276119q;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(p.a.d(p.a.d(j6.a.b(this.i, p.a.c((this.f276112g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + p.a.c((this.f276111c.hashCode() + p.a.c(this.f276109a.hashCode() * 31, 31, this.f276110b)) * 31, 31, this.d)) * 31)) * 31)) * 31, 31, this.f276113h), 31), 31, this.f276114j), 31, this.k), 31, this.f276115l), 31, this.f276116m);
        String str = this.f276117n;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        o oVar = this.o;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.f276138a.hashCode())) * 31;
        List list = this.f276118p;
        return Boolean.hashCode(this.f276119q) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }
}
