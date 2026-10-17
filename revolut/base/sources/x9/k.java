package x9;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f303512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f303513c;

    public /* synthetic */ k(String str, int i) {
        this.f303512b = i;
        this.f303513c = str;
    }

    @Override // x9.n
    public final String a(String str) {
        switch (this.f303512b) {
            case 0:
                return v0.a.i(new StringBuilder(), this.f303513c, str);
            default:
                StringBuilder sbS = p.a.s(str);
                sbS.append(this.f303513c);
                return sbS.toString();
        }
    }

    public final String toString() {
        switch (this.f303512b) {
            case 0:
                return v0.a.i(new StringBuilder("[PrefixTransformer('"), this.f303513c, "')]");
            default:
                return v0.a.i(new StringBuilder("[SuffixTransformer('"), this.f303513c, "')]");
        }
    }
}
