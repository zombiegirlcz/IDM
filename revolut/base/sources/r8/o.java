package r8;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class o implements y8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f252294a;

    @Override // y8.g
    public Object get() {
        return (ConnectivityManager) this.f252294a.getSystemService("connectivity");
    }
}
