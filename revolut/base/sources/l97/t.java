package l97;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f193100b;

    public /* synthetic */ t(AtomicReference atomicReference, int i) {
        this.f193099a = i;
        this.f193100b = atomicReference;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193099a) {
            case 0:
                lfm.d.d(this.f193100b, (ifm.c) obj2);
                break;
            case 1:
                ifm.c cVar = (ifm.c) this.f193100b.getAndSet(null);
                if (cVar != null) {
                    cVar.dispose();
                }
                break;
            default:
                this.f193100b.set(obj2);
                break;
        }
        return Unit.f186387a;
    }
}
