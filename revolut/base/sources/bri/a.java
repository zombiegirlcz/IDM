package bri;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18014b;

    public /* synthetic */ a(b bVar, int i) {
        this.f18013a = i;
        this.f18014b = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18013a) {
            case 0:
                while (true) {
                    b bVar = this.f18014b;
                    int i = bVar.f18017c;
                    if (i == 0) {
                        bVar.e = null;
                    } else {
                        bVar.f18017c = i - 1;
                        bVar.f18015a.f();
                    }
                    break;
                }
                break;
            default:
                while (true) {
                    b bVar2 = this.f18014b;
                    int i2 = bVar2.f18016b;
                    if (i2 == 0) {
                        bVar2.f = null;
                    } else {
                        bVar2.f18016b = i2 - 1;
                        bVar2.f18015a.e();
                    }
                    break;
                }
                break;
        }
    }
}
