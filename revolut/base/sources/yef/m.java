package yef;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.transaction.recogniser.api.domain.models.RecogniserTransaction;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import com.revolut.feature.transaction.recogniser.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yef.h;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements p {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f312922a;

    public m(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f312922a = uiKitResources;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        TransactionRecogniserDetails transactionRecogniserDetails = domainState.f312915a;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(1, null, null, null, 30), false, false, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_ask_friends_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_ask_friends_subtitle, null, null, 14);
        int i = R$string.transaction_recogniser_final_checks_screen_action_send_message;
        int i2 = R$string.transaction_recogniser_final_checks_screen_share_message;
        TextClause textClause = new TextClause(transactionRecogniserDetails.f91803a.f91801b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        RecogniserTransaction recogniserTransaction = transactionRecogniserDetails.f91803a;
        arrayList.add(new RowDelegate.Model("FINAL_CHECKS_LOADED_FRIENDS_AND_FAMILY", image24, textLocalisedClause, null, 0, textLocalisedClause2, new TextLocalisedClause(i, null, new Click(28, (Integer) null, (Object) new i(this.f312922a.b(new TextLocalisedClause(i2, v.k(textClause, new MoneyClause(recogniserTransaction.f91802c.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TimeClause(oi0.d.R(recogniserTransaction.d), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12)).toString()), "SEND_MESSAGE", false), 10), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760));
        TransactionRecogniserDetails transactionRecogniserDetails2 = domainState.f312915a;
        arrayList.add(new RowDelegate.Model("FINAL_CHECKS_LOADED_CHECK_EMAIL", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(2, null, null, null, 30), false, false, 6), new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_check_email_title, u.c(new TimeClause(oi0.d.R(transactionRecogniserDetails2.f91803a.d), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12), null, 0, new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_check_email_subtitle, null, null, 14), new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_action_open_mail, null, new Click(28, (Integer) null, (Object) h.a.f312918a, "OPEN_EMAIL", false), 10), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760));
        arrayList.add(new RowDelegate.Model("FINAL_CHECKS_LOADED_CHECK_PHOTOS", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(3, null, null, null, 30), false, false, 6), new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_check_photos_title, u.c(new TimeClause(oi0.d.R(transactionRecogniserDetails2.f91803a.d), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12), null, 0, null, new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_action_open_photo, null, new Click(28, (Integer) null, (Object) h.b.f312919a, "OPEN_PHOTOS", false), 10), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868792));
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new k(arrayList);
    }
}
