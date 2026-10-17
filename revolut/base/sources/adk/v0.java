package adk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Lazy[] f3441q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3444c;
    public final Integer d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f3445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f3446h;
    public final r0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f3447j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f3448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f3450n;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f3451p;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f3441q = new Lazy[]{null, null, null, null, null, yhm.j.c(kVar, new a92.d(11)), null, null, null, yhm.j.c(kVar, new a92.d(12)), null, null, null, null, null, null};
    }

    public /* synthetic */ v0(int i, String str, String str2, String str3, Integer num, String str4, List list, c0 c0Var, f0 f0Var, r0 r0Var, List list2, String str5, String str6, String str7, s sVar, p pVar, String str8) {
        if (65535 != (i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) {
            qlm.j1.f(m.f3411a.getDescriptor(), i, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            throw null;
        }
        this.f3442a = str;
        this.f3443b = str2;
        this.f3444c = str3;
        this.d = num;
        this.e = str4;
        this.f = list;
        this.f3445g = c0Var;
        this.f3446h = f0Var;
        this.i = r0Var;
        this.f3447j = list2;
        this.k = str5;
        this.f3448l = str6;
        this.f3449m = str7;
        this.f3450n = sVar;
        this.o = pVar;
        this.f3451p = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f3442a, v0Var.f3442a) && Intrinsics.f(this.f3443b, v0Var.f3443b) && Intrinsics.f(this.f3444c, v0Var.f3444c) && Intrinsics.f(this.d, v0Var.d) && Intrinsics.f(this.e, v0Var.e) && Intrinsics.f(this.f, v0Var.f) && Intrinsics.f(this.f3445g, v0Var.f3445g) && Intrinsics.f(this.f3446h, v0Var.f3446h) && Intrinsics.f(this.i, v0Var.i) && Intrinsics.f(this.f3447j, v0Var.f3447j) && Intrinsics.f(this.k, v0Var.k) && Intrinsics.f(this.f3448l, v0Var.f3448l) && Intrinsics.f(this.f3449m, v0Var.f3449m) && Intrinsics.f(this.f3450n, v0Var.f3450n) && Intrinsics.f(this.o, v0Var.o) && Intrinsics.f(this.f3451p, v0Var.f3451p);
    }

    public final int hashCode() {
        int iHashCode = this.f3442a.hashCode() * 31;
        String str = this.f3443b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3444c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (this.f3446h.hashCode() + ((this.f3445g.hashCode() + p.a.d(p.a.c((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f)) * 31)) * 31;
        r0 r0Var = this.i;
        int iHashCode5 = (iHashCode4 + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
        List list = this.f3447j;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3448l;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3449m;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        s sVar = this.f3450n;
        int iHashCode10 = (iHashCode9 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        p pVar = this.o;
        int iHashCode11 = (iHashCode10 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str6 = this.f3451p;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public v0(String title, String str, String str2, Integer num, String state, ArrayList promotedRewards, c0 everydayRewards, f0 exceptionalRewards, r0 r0Var, ArrayList arrayList, String str3, String str4, String str5, s sVar, p pVar, String str6) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(promotedRewards, "promotedRewards");
        Intrinsics.checkNotNullParameter(everydayRewards, "everydayRewards");
        Intrinsics.checkNotNullParameter(exceptionalRewards, "exceptionalRewards");
        this.f3442a = title;
        this.f3443b = str;
        this.f3444c = str2;
        this.d = num;
        this.e = state;
        this.f = promotedRewards;
        this.f3445g = everydayRewards;
        this.f3446h = exceptionalRewards;
        this.i = r0Var;
        this.f3447j = arrayList;
        this.k = str3;
        this.f3448l = str4;
        this.f3449m = str5;
        this.f3450n = sVar;
        this.o = pVar;
        this.f3451p = str6;
    }
}
