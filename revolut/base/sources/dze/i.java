package dze;

import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c f121333b;

    public /* synthetic */ i(com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar, int i) {
        this.f121332a = i;
        this.f121333b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121332a) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f121333b.C2(new e(throwable));
                return Boolean.TRUE;
            default:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.e) {
                    this.f121333b.C2(a.C0560a.f90958a);
                }
                return Unit.f186387a;
        }
    }
}
