package hp2;

import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig;
import java.time.LocalDate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.t;
import nkm.y;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154393a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DatePickerConfig f154394b;

    public /* synthetic */ i(DatePickerConfig datePickerConfig) {
        this.f154394b = datePickerConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f154393a) {
            case 0:
                LocalDate it8 = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(!it8.isAfter(this.f154394b.f63988c));
            default:
                f fVar = (f) obj2;
                LocalDate localDate = fVar.f154387b;
                DatePickerConfig datePickerConfig = this.f154394b;
                if (localDate == null) {
                    nkm.g gVar = new nkm.g(y.I(t.g(datePickerConfig.f63987b, new hmc.a(28)), new i(datePickerConfig)));
                    while (true) {
                        if (gVar.hasNext()) {
                            next = gVar.next();
                            if (!datePickerConfig.d.contains((LocalDate) next)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    localDate = (LocalDate) next;
                }
                return f.a(fVar, localDate, zi0.c.P(datePickerConfig, false, null, 3), 1);
        }
    }

    public /* synthetic */ i(j jVar, DatePickerConfig datePickerConfig) {
        this.f154394b = datePickerConfig;
    }
}
