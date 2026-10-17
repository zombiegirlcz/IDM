package m74;

import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.d5;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.DatePickerScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DatePickerScreenContract$InputData f203315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f203316b;

    public g(DatePickerScreenContract$InputData inputData, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f203315a = inputData;
        this.f203316b = dateProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDateE = ((l80.f) this.f203316b).e();
        int i = R$string.conveyancing_appointment_scheduling_schedule_calendar_title;
        DatePickerScreenContract$InputData datePickerScreenContract$InputData = this.f203315a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(datePickerScreenContract$InputData.f67322a.f200656a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        int i2 = R$string.conveyancing_appointment_scheduling_schedule_calendar_description;
        ly3.a aVar = datePickerScreenContract$InputData.f67322a;
        lw0.a aVar2 = new lw0.a(textLocalisedClause, new TextLocalisedClause(i2, u.c(new TextClause(aVar.f200657b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, false, 28);
        LocalDate localDate = datePickerScreenContract$InputData.f67323b;
        List listC = u.c(new g5("datePicker", localDate == null ? localDateE : localDate, localDate, false, null, localDateE, aVar.f200658c, null, u.c(new d5(aVar.d)), null, 0, 0, 1047352));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new e(listC, aVar2);
    }
}
