package es;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.flow.launcher.d f128752b;

    public /* synthetic */ d(com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, int i) {
        this.f128751a = i;
        this.f128752b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128751a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar = this.f128752b;
                return Boolean.valueOf(dVar.R2(error, new e(dVar, 0)));
            default:
                this.f128752b.l2(new i(0, null, (Function1) obj2), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
