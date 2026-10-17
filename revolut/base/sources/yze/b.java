package yze;

import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318091a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f318092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f318093c;

    public /* synthetic */ b(c cVar, boolean z) {
        this.f318093c = cVar;
        this.f318092b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f318091a) {
            case 0:
                c cVar = this.f318093c;
                boolean z = this.f318092b;
                Throwable th10 = (Throwable) obj2;
                if (((jte.d) cVar.f318095b).c(TopupApi$Toggles.LogGooglePay.f90467c)) {
                    if (z) {
                        Intrinsics.checkNotNullParameter("Error, " + th10.getMessage(), "<set-?>");
                    } else {
                        Intrinsics.checkNotNullParameter("Error, " + th10.getMessage(), "<set-?>");
                    }
                    Unit unit = Unit.f186387a;
                }
                break;
            default:
                boolean z3 = this.f318092b;
                c cVar2 = this.f318093c;
                Boolean bool = (Boolean) obj2;
                if (z3) {
                    if (((jte.d) cVar2.f318095b).c(TopupApi$Toggles.LogGooglePay.f90467c)) {
                        Intrinsics.checkNotNullParameter("Success, result " + bool, "<set-?>");
                        Unit unit2 = Unit.f186387a;
                    }
                    cVar2.d = bool;
                } else {
                    if (((jte.d) cVar2.f318095b).c(TopupApi$Toggles.LogGooglePay.f90467c)) {
                        Intrinsics.checkNotNullParameter("Success, result " + bool, "<set-?>");
                        Unit unit3 = Unit.f186387a;
                    }
                    cVar2.f318096c = bool;
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ b(boolean z, c cVar) {
        this.f318092b = z;
        this.f318093c = cVar;
    }
}
