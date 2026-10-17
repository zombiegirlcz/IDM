package mu5;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.o0;
import wim.z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f208988b;

    public /* synthetic */ q(s sVar, int i) {
        this.f208987a = i;
        this.f208988b = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f208987a) {
            case 0:
                return (Boolean) this.f208988b.f208989a.v0(Boolean.FALSE, "TAX_FEATURE_JOINED", Boolean.TYPE);
            default:
                this.f208988b.f208989a.G(Boolean.TRUE, "TAX_FEATURE_JOINED", z.d(o0.b(Boolean.TYPE)));
                return Unit.f186387a;
        }
    }
}
