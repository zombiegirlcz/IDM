package x8j;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f303465b;

    public /* synthetic */ p(g0 g0Var, int i) {
        this.f303464a = i;
        this.f303465b = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303464a) {
            case 0:
                ytd.e it8 = (ytd.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f303465b.r2().M0(new k0(it8));
                break;
            default:
                this.f303465b.r2().M0(new j0((ytd.b) obj2));
                break;
        }
        return Unit.f186387a;
    }
}
