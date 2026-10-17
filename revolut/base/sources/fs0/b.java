package fs0;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f137515a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f137516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137517c;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f137515a.charAt(this.f137516b + i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f137517c - this.f137516b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        CharSequence charSequence = this.f137515a;
        int i3 = this.f137516b;
        return charSequence.subSequence(i + i3, i3 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f137515a.subSequence(this.f137516b, this.f137517c).toString();
    }
}
