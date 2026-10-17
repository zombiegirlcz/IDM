package xck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f304184c;
    public final String d;
    public final String e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f304185g;

    public t(String str, String str2, u video, String rewardTitle, String rewardSubtitle, s action, String termsUrl) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(rewardTitle, "rewardTitle");
        Intrinsics.checkNotNullParameter(rewardSubtitle, "rewardSubtitle");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.f304182a = str;
        this.f304183b = str2;
        this.f304184c = video;
        this.d = rewardTitle;
        this.e = rewardSubtitle;
        this.f = action;
        this.f304185g = termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f304182a, tVar.f304182a) && Intrinsics.f(this.f304183b, tVar.f304183b) && Intrinsics.f(this.f304184c, tVar.f304184c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f304185g, tVar.f304185g);
    }

    public final int hashCode() {
        String str = this.f304182a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f304183b;
        return this.f304185g.hashCode() + ((this.f.hashCode() + p.a.c(p.a.c((this.f304184c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.d), 31, this.e)) * 31);
    }
}
