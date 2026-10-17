package ha1;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f150367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f150368c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ l(String str, String str2, String str3, String str4, int i) {
        this.f150366a = i;
        this.f150367b = str;
        this.f150368c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f150366a) {
            case 0:
                return new ga1.f(this.f150367b, this.f150368c, new ga1.a(this.d, this.e));
            default:
                return new ga1.f(this.f150367b, this.f150368c, new ga1.a(this.d, this.e));
        }
    }
}
