package ggc;

import com.revolut.feature.rewards.api.model.rewards.RewardDetailsHeader;
import com.revolut.feature.rewards.api.model.rewards.RewardFooter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f143641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143642c;
    public final t d;
    public final t e;
    public final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f143643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f143644h;
    public final LocalDateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDateTime f143645j;
    public final cgc.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f143646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f143647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f143648n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f143649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f143650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f143651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f143652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f143653t;
    public final RewardFooter u;
    public final RewardDetailsHeader v;

    public l(String id10, d0 type, String primaryCategoryId, t description, t tVar, u details, p pVar, y merchant, LocalDateTime startDate, LocalDateTime endDate, cgc.m mVar, List steps, List list, m mVar2, int i, boolean z, boolean z3, boolean z4, boolean z6, String str, RewardFooter rewardFooter, RewardDetailsHeader rewardDetailsHeader) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(primaryCategoryId, "primaryCategoryId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f143640a = id10;
        this.f143641b = type;
        this.f143642c = primaryCategoryId;
        this.d = description;
        this.e = tVar;
        this.f = details;
        this.f143643g = pVar;
        this.f143644h = merchant;
        this.i = startDate;
        this.f143645j = endDate;
        this.k = mVar;
        this.f143646l = steps;
        this.f143647m = list;
        this.f143648n = mVar2;
        this.o = i;
        this.f143649p = z;
        this.f143650q = z3;
        this.f143651r = z4;
        this.f143652s = z6;
        this.f143653t = str;
        this.u = rewardFooter;
        this.v = rewardDetailsHeader;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f143640a, lVar.f143640a) && this.f143641b == lVar.f143641b && Intrinsics.f(this.f143642c, lVar.f143642c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f143643g, lVar.f143643g) && Intrinsics.f(this.f143644h, lVar.f143644h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f143645j, lVar.f143645j) && Intrinsics.f(this.k, lVar.k) && Intrinsics.f(this.f143646l, lVar.f143646l) && Intrinsics.f(this.f143647m, lVar.f143647m) && this.f143648n == lVar.f143648n && this.o == lVar.o && this.f143649p == lVar.f143649p && this.f143650q == lVar.f143650q && this.f143651r == lVar.f143651r && this.f143652s == lVar.f143652s && Intrinsics.f(this.f143653t, lVar.f143653t) && Intrinsics.f(this.u, lVar.u) && Intrinsics.f(this.v, lVar.v);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c((this.f143641b.hashCode() + (this.f143640a.hashCode() * 31)) * 31, 31, this.f143642c)) * 31;
        t tVar = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31;
        p pVar = this.f143643g;
        int iHashCode3 = (this.f143645j.hashCode() + ((this.i.hashCode() + ((this.f143644h.hashCode() + ((iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        cgc.m mVar = this.k;
        int iD = p.a.d((iHashCode3 + (mVar == null ? 0 : Integer.hashCode(mVar.f23921a))) * 31, 31, this.f143646l);
        List list = this.f143647m;
        int iHashCode4 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        m mVar2 = this.f143648n;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.o, (iHashCode4 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31, 31), 31, this.f143649p), 31, this.f143650q), 31, this.f143651r), 31, this.f143652s);
        String str = this.f143653t;
        int iHashCode5 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        RewardFooter rewardFooter = this.u;
        int iHashCode6 = (iHashCode5 + (rewardFooter == null ? 0 : rewardFooter.hashCode())) * 31;
        RewardDetailsHeader rewardDetailsHeader = this.v;
        return iHashCode6 + (rewardDetailsHeader != null ? rewardDetailsHeader.hashCode() : 0);
    }

    public /* synthetic */ l(String str, d0 d0Var, String str2, t tVar, t tVar2, u uVar, y yVar, LocalDateTime localDateTime, LocalDateTime localDateTime2, cgc.m mVar, List list, List list2, m mVar2, int i, boolean z, boolean z3, boolean z4, boolean z6, String str3) {
        this(str, d0Var, str2, tVar, tVar2, uVar, null, yVar, localDateTime, localDateTime2, mVar, list, list2, mVar2, i, z, z3, z4, z6, str3, null, null);
    }
}
