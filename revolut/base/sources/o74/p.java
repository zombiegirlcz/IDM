package o74;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.ScheduleScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import ip0.iq;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduleScreenContract$InputData f222717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f222718b;

    public p(ScheduleScreenContract$InputData inputData, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f222717a = inputData;
        this.f222718b = languageProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ly3.d dVar = this.f222717a.f67324a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.conveyancing_appointment_scheduling_schedule_title, u.c(new TextClause(dVar.f200662a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.conveyancing_appointment_scheduling_schedule_description, u.c(new TextClause(dVar.f200663b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.conveyancing_appointment_scheduling_schedule_button, u.c(new TextClause(dVar.f200664c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        boolean z = domainState.f222706a != null;
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.conveyancing_appointment_scheduling_schedule_calendar_item_title, u.c(new TextClause(dVar.d.f200659a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        LocalDate localDate = domainState.f222706a;
        if (localDate != null) {
            int i = R$string.conveyancing_appointment_scheduling_schedule_calendar_item_value;
            String str = DateTimeFormatter.ofPattern("EEEE, d MMM", ((s80.b) this.f222718b).b()).format(localDate);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            textLocalisedClause = null;
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("calendar-item", textLocalisedClause, null, textLocalisedClause5, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558540, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        ArrayList<ly3.c> arrayList = dVar.f200665g;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ly3.c cVar : arrayList) {
            arrayList2.add(new InputChecklistDelegate.Model(cVar.f200660a, new TextLocalisedClause(R$string.conveyancing_appointment_scheduling_schedule_periods_item_title, u.c(new TextClause(cVar.f200661b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), Intrinsics.f(domainState.f222707b, cVar.f200660a), false, null, iq.RADIO_BUTTON, null, null, cVar.f200660a, null, 0, 0, 0, 523992));
        }
        String str2 = dVar.f;
        eVarB.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(str2, (Image) null, (Clause) new TextLocalisedClause(R$string.conveyancing_appointment_scheduling_schedule_periods_title, u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        return new n(u.a(eVarB), textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, z);
    }
}
