package aae;

import android.os.Parcelable;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.k;
import org.jetbrains.annotations.NotNull;
import qua.p;
import yp0.e0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f2807c;
        LocalDate localDate2 = domainState.f2806b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_end_date_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payment_end_date_subtitle, null, null, 14);
        p pVar = domainState.f2805a;
        qua.g gVar = pVar.f249332w;
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, null, (gVar != null ? gVar.f249296h : null) != null ? new k(new TextLocalisedClause(R$string.recurring_payment_end_date_remove, null, null, 14), "REMOVE_ID") : null, false, 20);
        LocalDate localDate3 = null;
        List listC = u.c(new g5("CALENDAR_LIST_ID", localDate2, localDate2, false, null, localDate, null, null, null, null, 0, 0, 1048504));
        e0 e0Var = e0.INSIDE_BOX;
        LocalDateTime localDateTimeAtStartOfDay = localDate2.atStartOfDay();
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "atStartOfDay(...)");
        long jC0 = oi0.d.c0(localDateTimeAtStartOfDay);
        TimeClause.Format.INSTANCE.getClass();
        ArrayList arrayListG = yp0.b.g(listC, new ListSubheaderDelegate.Model("HEADER_ID", (Image) null, (Clause) new TimeClause(jC0, TimeClause.Format.f57959a, null, null, 12), (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_reset, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450), e0Var, 0, 0, 124);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.recurring_payment_end_date_submit, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        qua.g gVar2 = pVar.f249332w;
        if (gVar2 != null) {
            localDate3 = gVar2.f249296h;
        }
        return new cii.b(new aw0.e(false, null, null, new n6(textLocalisedClause3, defaultFilledButton, null, null, !Intrinsics.f(localDate3, domainState.f2806b), null, null, 988), null, null, 55), arrayListG, aVar);
    }
}
