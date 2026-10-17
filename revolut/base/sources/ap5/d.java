package ap5;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8100b;

    public /* synthetic */ d(f fVar, int i) {
        this.f8099a = i;
        this.f8100b = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8099a) {
            case 0:
                return (Boolean) this.f8100b.f8101a.v0(Boolean.FALSE, "CRYPTO_WITHDRAW_INITIAL_NETWORK_PICKER", Boolean.TYPE);
            default:
                return (Boolean) this.f8100b.f8101a.v0(Boolean.FALSE, "CRYPTO_WITHDRAW_DONT_SHOW_AGAIN_NETWORK_WARNING", Boolean.TYPE);
        }
    }
}
