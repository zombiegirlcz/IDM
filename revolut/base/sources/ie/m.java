package ie;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f160533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f160534b;

    public m(n nVar, long j2) {
        this.f160534b = nVar;
        this.f160533a = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f160533a);
        this.f160534b.k.i(bundle);
        return null;
    }
}
