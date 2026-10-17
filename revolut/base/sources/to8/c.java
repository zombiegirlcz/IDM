package to8;

import ko8.f;
import ko8.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b f272559b;

    public /* synthetic */ c(com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b bVar, int i) {
        this.f272558a = i;
        this.f272559b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f272558a) {
            case 0:
                g result = (g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof f) {
                    String str = ((f) result).f186272a;
                    com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b bVar = this.f272559b;
                    bVar.n2(new tgk.f(bVar, str, null, 23), new c(bVar, 1));
                } else if (!Intrinsics.f(result, ko8.e.f186271a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f272559b.s1();
                return Boolean.FALSE;
        }
    }
}
