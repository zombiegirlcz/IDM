package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219100c;
    public final int d;
    public final String e;
    public final a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f219101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f219102h;
    public final j0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p0 f219103j;

    public /* synthetic */ m0(int i, String str, String str2, String str3, int i2, String str4, a0 a0Var, String str5, String str6, j0 j0Var, p0 p0Var) {
        if (381 != (i & 381)) {
            qlm.j1.f(k0.f219082a.getDescriptor(), i, 381);
            throw null;
        }
        this.f219098a = str;
        if ((i & 2) == 0) {
            this.f219099b = null;
        } else {
            this.f219099b = str2;
        }
        this.f219100c = str3;
        this.d = i2;
        this.e = str4;
        this.f = a0Var;
        this.f219101g = str5;
        if ((i & 128) == 0) {
            this.f219102h = null;
        } else {
            this.f219102h = str6;
        }
        this.i = j0Var;
        if ((i & 512) == 0) {
            this.f219103j = null;
        } else {
            this.f219103j = p0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f219098a, m0Var.f219098a) && Intrinsics.f(this.f219099b, m0Var.f219099b) && Intrinsics.f(this.f219100c, m0Var.f219100c) && this.d == m0Var.d && Intrinsics.f(this.e, m0Var.e) && Intrinsics.f(this.f, m0Var.f) && Intrinsics.f(this.f219101g, m0Var.f219101g) && Intrinsics.f(this.f219102h, m0Var.f219102h) && Intrinsics.f(this.i, m0Var.i) && Intrinsics.f(this.f219103j, m0Var.f219103j);
    }

    public final int hashCode() {
        int iHashCode = this.f219098a.hashCode() * 31;
        String str = this.f219099b;
        int iC = p.a.c((this.f.hashCode() + p.a.c(j6.a.b(this.d, p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f219100c), 31), 31, this.e)) * 31, 31, this.f219101g);
        String str2 = this.f219102h;
        int iHashCode2 = (this.i.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        p0 p0Var = this.f219103j;
        return iHashCode2 + (p0Var != null ? p0Var.hashCode() : 0);
    }

    public m0(String campaignId, String str, String itemId, int i, String state, a0 action, String title, String str2, j0 asset, p0 p0Var) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f219098a = campaignId;
        this.f219099b = str;
        this.f219100c = itemId;
        this.d = i;
        this.e = state;
        this.f = action;
        this.f219101g = title;
        this.f219102h = str2;
        this.i = asset;
        this.f219103j = p0Var;
    }
}
