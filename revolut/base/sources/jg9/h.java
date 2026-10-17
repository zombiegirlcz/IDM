package jg9;

import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import java.time.YearMonth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f173943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BillFormField f173944c;

    public /* synthetic */ h(Function1 function1, BillFormField billFormField, int i) {
        this.f173942a = i;
        this.f173943b = function1;
        this.f173944c = billFormField;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f173942a) {
            case 0:
                YearMonth yearMonth = (YearMonth) obj2;
                Intrinsics.checkNotNullParameter(yearMonth, "yearMonth");
                String str = this.f173944c.f61274a;
                String string = yearMonth.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.f173943b.invoke(new a(str, string));
                break;
            case 1:
                this.f173943b.invoke(new c(this.f173944c.f61274a, String.valueOf(((Integer) obj2).intValue())));
                break;
            case 2:
                sg9.a dropdownChoice = (sg9.a) obj2;
                Intrinsics.checkNotNullParameter(dropdownChoice, "dropdownChoice");
                this.f173943b.invoke(new a(this.f173944c.f61274a, dropdownChoice.f262632b.f61286a));
                break;
            default:
                this.f173943b.invoke(new a(this.f173944c.f61274a, String.valueOf(((Integer) obj2).intValue())));
                break;
        }
        return Unit.f186387a;
    }
}
