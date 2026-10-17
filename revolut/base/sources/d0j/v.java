package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110438c;
    public final int d;
    public final x e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f110439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f110440h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f110441j;

    public v(String campaignId, String str, String itemId, int i, x state, s action, String title, String str2, w asset, y yVar) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f110436a = campaignId;
        this.f110437b = str;
        this.f110438c = itemId;
        this.d = i;
        this.e = state;
        this.f = action;
        this.f110439g = title;
        this.f110440h = str2;
        this.i = asset;
        this.f110441j = yVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f110436a, vVar.f110436a) && Intrinsics.f(this.f110437b, vVar.f110437b) && Intrinsics.f(this.f110438c, vVar.f110438c) && this.d == vVar.d && this.e == vVar.e && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f110439g, vVar.f110439g) && Intrinsics.f(this.f110440h, vVar.f110440h) && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f110441j, vVar.f110441j);
    }

    public final int hashCode() {
        int iHashCode = this.f110436a.hashCode() * 31;
        String str = this.f110437b;
        int iC = p.a.c((this.f.hashCode() + ((this.e.hashCode() + j6.a.b(this.d, p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f110438c), 31)) * 31)) * 31, 31, this.f110439g);
        String str2 = this.f110440h;
        int iHashCode2 = (this.i.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        y yVar = this.f110441j;
        return iHashCode2 + (yVar != null ? yVar.hashCode() : 0);
    }
}
