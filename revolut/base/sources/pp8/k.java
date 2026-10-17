package pp8;

import android.os.Parcelable;
import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.ChallengeEditFrequencyDatePickerScreenContract$InputData;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChallengeEditFrequencyDatePickerScreenContract$InputData f238301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f238302b;

    public k(ChallengeEditFrequencyDatePickerScreenContract$InputData inputData, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f238301a = inputData;
        this.f238302b = dateProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean zF = Intrinsics.f(domainState.f238295a.toLocalDate(), this.f238301a.f77372a.toLocalDate());
        boolean z = !zF;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.junior_challenges_edit_dialog_start_date_title, null, null, 14), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.junior_challenges_edit_dialog_start_date_action_select_date, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        ZonedDateTime zonedDateTime = domainState.f238295a;
        long jI = pu7.a.I(zonedDateTime);
        TimeClause.Format.INSTANCE.getClass();
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER", (Image) null, (Clause) new TimeClause(jI, TimeClause.Format.f57959a, null, null, 12), (Image) null, (Clause) (!zF ? new TextLocalisedClause(R$string.junior_challenges_edit_dialog_start_date_subtitle_action_clear, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, z, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
        LocalDate localDate = zonedDateTime.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        List listK = v.k(model, new g5("LIST_ID_DATE_PICKER", localDate, zonedDateTime.toLocalDate(), false, null, ((l80.f) this.f238302b).e(), null, null, null, null, 0, 0, 1015576));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(eVar, listK, aVar);
    }
}
