package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f253658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callback f253659c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj2, int i) {
        this.f253657a = i;
        this.f253658b = anonymousClass1;
        this.f253659c = callback;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f253657a) {
            case 0:
                this.f253658b.lambda$onResponse$0(this.f253659c, (Response) this.d);
                break;
            default:
                this.f253658b.lambda$onFailure$1(this.f253659c, (Throwable) this.d);
                break;
        }
    }
}
