package zhm;

/* JADX INFO: loaded from: classes14.dex */
public final class x0 extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f322485c;
    public int d;
    public final /* synthetic */ kotlin.collections.f e;

    public x0(kotlin.collections.f fVar) {
        this.e = fVar;
        this.f322485c = fVar.size();
        this.d = fVar.f186401c;
    }

    @Override // zhm.b
    public final void a() {
        int i = this.f322485c;
        if (i == 0) {
            this.f322461a = 2;
            return;
        }
        kotlin.collections.f fVar = this.e;
        Object[] objArr = fVar.f186399a;
        int i2 = this.d;
        this.f322462b = objArr[i2];
        this.f322461a = 1;
        this.d = (i2 + 1) % fVar.f186400b;
        this.f322485c = i - 1;
    }
}
