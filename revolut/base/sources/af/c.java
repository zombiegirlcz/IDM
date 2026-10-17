package af;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements cf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3808c;

    public /* synthetic */ c(Context context, int i, String str) {
        this.f3806a = i;
        this.f3807b = context;
        this.f3808c = str;
    }

    @Override // cf.b
    public final Object get() {
        switch (this.f3806a) {
            case 0:
                return new j(this.f3807b, this.f3808c);
            default:
                return this.f3807b.getSharedPreferences(this.f3808c, 0);
        }
    }
}
