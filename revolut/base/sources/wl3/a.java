package wl3;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f298370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f298371c;
    public final /* synthetic */ String d;

    public /* synthetic */ a(c cVar, String str, String str2, int i) {
        this.f298369a = i;
        this.f298370b = cVar;
        this.f298371c = str;
        this.d = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f298369a) {
            case 0:
                return Long.valueOf(((sl3.k) this.f298370b.f298374a).a(this.f298371c, this.d, null));
            default:
                return Long.valueOf(((sl3.k) this.f298370b.f298374a).a(this.f298371c, null, this.d));
        }
    }
}
