package ms0;

import java.time.LocalDate;
import java.time.YearMonth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f208278b;

    public /* synthetic */ i0(l0 l0Var, int i) {
        this.f208277a = i;
        this.f208278b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f208277a;
        l0 l0Var = this.f208278b;
        switch (i) {
            case 0:
                YearMonth yearMonthMinusMonths = l0Var.f208323q.minusMonths(1L);
                Intrinsics.checkNotNullExpressionValue(yearMonthMinusMonths, "minusMonths(...)");
                l0Var.f208323q = yearMonthMinusMonths;
                l0Var.o.onNext(yearMonthMinusMonths);
                l0Var.h0();
                break;
            case 1:
                Unit it8 = (Unit) obj2;
                int i2 = l0.E;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 2:
                l0Var.f208326t = (LocalDate) obj2;
                l0Var.j0();
                break;
            case 3:
                YearMonth presentedYearMonth = (YearMonth) obj2;
                int i3 = l0.E;
                Intrinsics.checkNotNullParameter(presentedYearMonth, "presentedYearMonth");
                l0Var.f208323q = presentedYearMonth;
                l0Var.o.onNext(presentedYearMonth);
                l0Var.i0();
                break;
            case 4:
                int i5 = l0.E;
                l0Var.g0();
                break;
            default:
                YearMonth yearMonthPlusMonths = l0Var.f208323q.plusMonths(1L);
                Intrinsics.checkNotNullExpressionValue(yearMonthPlusMonths, "plusMonths(...)");
                l0Var.f208323q = yearMonthPlusMonths;
                l0Var.o.onNext(yearMonthPlusMonths);
                l0Var.h0();
                break;
        }
        return Unit.f186387a;
    }
}
