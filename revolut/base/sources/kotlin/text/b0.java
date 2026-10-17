package kotlin.text;

/* JADX INFO: loaded from: classes14.dex */
public final class b0 extends zhm.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f187896b;

    public b0(CharSequence charSequence) {
        this.f187896b = charSequence;
    }

    @Override // zhm.s
    public final char a() {
        int i = this.f187895a;
        this.f187895a = i + 1;
        return this.f187896b.charAt(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f187895a < this.f187896b.length();
    }
}
