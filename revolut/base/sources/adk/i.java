package adk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f3390g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3393c;
    public final String d;
    public final String e;
    public final String f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f3390g = new Lazy[]{yhm.j.c(kVar, new a92.d(9)), yhm.j.c(kVar, new a92.d(10)), null, null, null, null};
    }

    public /* synthetic */ i(int i, List list, List list2, String str, String str2, String str3, String str4) {
        if (63 != (i & 63)) {
            qlm.j1.f(g.f3386a.getDescriptor(), i, 63);
            throw null;
        }
        this.f3391a = list;
        this.f3392b = list2;
        this.f3393c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f3391a, iVar.f3391a) && Intrinsics.f(this.f3392b, iVar.f3392b) && Intrinsics.f(this.f3393c, iVar.f3393c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.d(this.f3391a.hashCode() * 31, 31, this.f3392b), 31, this.f3393c), 31, this.d), 31, this.e);
    }

    public i(String revealAt, String planName, String faqId, String termsUrl, ArrayList rewards, ArrayList additionalRewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(additionalRewards, "additionalRewards");
        Intrinsics.checkNotNullParameter(revealAt, "revealAt");
        Intrinsics.checkNotNullParameter(planName, "planName");
        Intrinsics.checkNotNullParameter(faqId, "faqId");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.f3391a = rewards;
        this.f3392b = additionalRewards;
        this.f3393c = revealAt;
        this.d = planName;
        this.e = faqId;
        this.f = termsUrl;
    }
}
