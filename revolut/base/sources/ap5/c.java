package ap5;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8098b;

    public /* synthetic */ c(f fVar, int i) {
        this.f8097a = i;
        this.f8098b = fVar;
    }

    @Override // kfm.a
    public final void run() {
        ue0.c cVar;
        Boolean bool;
        Class cls;
        String str;
        switch (this.f8097a) {
            case 0:
                cVar = this.f8098b.f8101a;
                bool = Boolean.TRUE;
                cls = Boolean.TYPE;
                str = "CRYPTO_WITHDRAW_DONT_SHOW_AGAIN_NETWORK_WARNING";
                break;
            default:
                cVar = this.f8098b.f8101a;
                bool = Boolean.TRUE;
                cls = Boolean.TYPE;
                str = "CRYPTO_WITHDRAW_INITIAL_NETWORK_PICKER";
                break;
        }
        com.revolut.data.database.models.openbanking.d.D(cls, cVar, str, bool);
    }
}
