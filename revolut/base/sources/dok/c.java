package dok;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f116577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f116578c;
    public final /* synthetic */ gim.i d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(Function2 function2, AtomicBoolean atomicBoolean, Function1 function1, int i) {
        this.f116576a = i;
        this.f116577b = (q) function2;
        this.f116578c = atomicBoolean;
        this.d = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r5v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f116576a) {
            case 0:
                this.f116577b.invoke(new dmj.a(20), new d(this.f116578c, this.d, null, 0));
                break;
            default:
                this.f116577b.invoke(new kxb.c(8), new d(this.f116578c, this.d, null, 1));
                break;
        }
        return Unit.f186387a;
    }
}
