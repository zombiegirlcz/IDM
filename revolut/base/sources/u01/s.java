package u01;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f276023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f276024c;

    public /* synthetic */ s(v vVar, String str, int i) {
        this.f276022a = i;
        this.f276023b = vVar;
        this.f276024c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f276022a) {
            case 0:
                this.f276023b.f276034h.invoke(this.f276024c);
                break;
            case 1:
                this.f276023b.i.invoke(this.f276024c);
                break;
            case 2:
                this.f276023b.d.invoke(this.f276024c);
                break;
            default:
                this.f276023b.f276032c.invoke(this.f276024c);
                break;
        }
    }
}
