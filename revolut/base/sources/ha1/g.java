package ha1;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f150356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f150357c;
    public final /* synthetic */ String d;

    public /* synthetic */ g(String str, String str2, String str3, int i) {
        this.f150355a = i;
        this.f150356b = str;
        this.f150357c = str2;
        this.d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f150355a) {
            case 0:
                return new ga1.m(this.f150356b, new ga1.a(this.f150357c, this.d));
            case 1:
                return new ga1.m(this.f150356b, new ga1.a(this.f150357c, this.d));
            default:
                return new ga1.m(this.f150356b, new ga1.a(this.f150357c, this.d));
        }
    }
}
