package lkf;

import android.graphics.PointF;
import android.view.ViewConfiguration;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import com.revolut.RevolutApplication;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardBottomBarView;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardSearchView;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardTabs;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreen;
import com.revolut.feature.recurring_buys.schedule.impl.ui.RecurringSettingsController;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreen;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import lqa.a;
import lr7.a;
import lr7.b;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196375a;

    public /* synthetic */ f0(int i) {
        this.f196375a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f196375a) {
            case 0:
                return zhm.f0.f322471a;
            case 1:
                return zhm.f0.f322471a;
            case 2:
                RevolutApplication.a aVar = RevolutApplication.Companion;
                return ((tn0.a) tn0.c.d.c()).f272276a;
            case 3:
                KProperty[] kPropertyArr = AddContactScreen.U;
                return new FixedTabsDelegate();
            case 4:
                KProperty[] kPropertyArr2 = AddContactScreen.U;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr3 = AddContactScreen.U;
                return new InputTextDelegate(null);
            case 6:
                KProperty[] kPropertyArr4 = AddContactScreen.U;
                return new PhoneEditorDelegate();
            case 7:
                lpi.d dVar = lpi.e.Companion;
                return Unit.f186387a;
            case 8:
                a.C1124a c1124a = lqa.a.Companion;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.push_to_card.impl.dto.AdditionalFieldDto", p0Var.b(lqa.a.class), new KClass[]{p0Var.b(a.b.class), p0Var.b(a.c.class)}, new KSerializer[]{a.b.C1125a.f199217a, a.c.C1127a.f199220a}, new Annotation[0]);
            case 9:
                return new qlm.e(lqa.b.f199223a);
            case 10:
                return new qlm.e(lqa.a.Companion.serializer());
            case 11:
                b.C1132b c1132b = lr7.b.Companion;
                return new qlm.e(a.C1131a.f199428a);
            case 12:
                KProperty[] kPropertyArr5 = CreditCardChooseInstalmentsScreen.U;
                return new FullScreenStateDelegate();
            case 13:
                KProperty[] kPropertyArr6 = CreditCardChooseInstalmentsScreen.U;
                return new LargeActionButtonDelegate();
            case 14:
                KProperty[] kPropertyArr7 = CreditCardChooseInstalmentsScreen.U;
                return new CellDetailsDelegate();
            case 15:
                KProperty[] kPropertyArr8 = CreditCardChooseInstalmentsScreen.U;
                return new SuggestionsBarDelegate();
            case 16:
                return Long.valueOf(ViewConfiguration.getLongPressTimeout());
            case 17:
                return new PointF();
            case 18:
                return new PointF();
            case 19:
                KProperty[] kPropertyArr9 = TransferReasonsReuseDeclarationScreen.Q;
                return new LargeActionButtonDelegate();
            case 20:
                int i = ReactionsKeyboardBottomBarView.i;
                return new ihm.f();
            case 21:
                int i2 = ReactionsKeyboardBottomBarView.i;
                return new ihm.f();
            case 22:
                ReactionsKeyboardSearchView.a aVar2 = ReactionsKeyboardSearchView.Companion;
                return new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30));
            case 23:
                ReactionsKeyboardTabs.Companion companion = ReactionsKeyboardTabs.INSTANCE;
                return new ihm.f();
            case 24:
                ReactionsKeyboardTabs.Companion companion2 = ReactionsKeyboardTabs.INSTANCE;
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.setOrdering(1);
                Fade fade = new Fade(2);
                fade.setDuration(200L);
                transitionSet.addTransition(fade);
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(400L);
                transitionSet.addTransition(changeBounds);
                Fade fade2 = new Fade(1);
                fade2.setDuration(200L);
                transitionSet.addTransition(fade2);
                return transitionSet;
            case 25:
                KProperty[] kPropertyArr10 = RecurringSettingsController.R;
                return new InputTextDelegate(null);
            case 26:
                KProperty[] kPropertyArr11 = AsftCancelBookingScreen.R;
                return new CellDetailsActionDelegate();
            case 27:
                KProperty[] kPropertyArr12 = AsftCancelBookingScreen.R;
                return new TwinHorizontalButtonDelegate();
            case 28:
                KProperty[] kPropertyArr13 = CreditCardStatementPageScreen.Z;
                return new CellDetailsDelegate();
            default:
                KProperty[] kPropertyArr14 = CreditCardStatementPageScreen.Z;
                return new LargeActionButtonDelegate();
        }
    }
}
