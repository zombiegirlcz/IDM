package gcm;

import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import java.net.ProxySelector;

/* JADX INFO: loaded from: classes13.dex */
public final class l1 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142744a;

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f142744a) {
            case 0:
                return Stopwatch.createUnstarted();
            default:
                return ProxySelector.getDefault();
        }
    }
}
