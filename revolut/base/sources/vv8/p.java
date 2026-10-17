package vv8;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements j21.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f292492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t3i.i f292493c;

    public /* synthetic */ p(q qVar, t3i.i iVar, int i) {
        this.f292491a = i;
        this.f292492b = qVar;
        this.f292493c = iVar;
    }

    @Override // j21.c
    public final void a(long j2, long j3) {
        switch (this.f292491a) {
            case 0:
                q qVar = this.f292492b;
                qVar.H2(qVar.f292497s, new rqj.i((t3i.f) this.f292493c, qVar, j2, j3, 1));
                break;
            default:
                q qVar2 = this.f292492b;
                qVar2.H2(qVar2.f292497s, new rqj.i((t3i.h) this.f292493c, qVar2, j2, j3, 2));
                break;
        }
    }
}
