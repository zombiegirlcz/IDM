package x9;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f303510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f303511c;

    public j(String str, String str2) {
        this.f303510b = str;
        this.f303511c = str2;
    }

    @Override // x9.n
    public final String a(String str) {
        return this.f303510b + str + this.f303511c;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("[PreAndSuffixTransformer('");
        sb6.append(this.f303510b);
        sb6.append("','");
        return v0.a.i(sb6, this.f303511c, "')]");
    }
}
