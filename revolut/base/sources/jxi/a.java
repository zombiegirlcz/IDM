package jxi;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.WalletWidgetDelegate;
import com.revolut.feature.credit.core.ui.transparent.CreditTransparentActivity;
import com.revolut.feature.insurance_pet.impl.ui.profile.document.PetPolicyDocumentActivity;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.statements.impl.ui.savings.SavingsStatementsScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.AccountPickerScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreen;
import java.lang.annotation.Annotation;
import jz8.b1;
import jz8.f0;
import jz8.i0;
import jz8.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179203a;

    public /* synthetic */ a(int i) {
        this.f179203a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f179203a) {
            case 0:
                KProperty[] kPropertyArr = AirportLoungesHomeScreen.f99073d0;
                return new SmallCardDelegate(null);
            case 1:
                KProperty[] kPropertyArr2 = AirportLoungesHomeScreen.f99073d0;
                return new ActionWidgetDelegate();
            case 2:
                KProperty[] kPropertyArr3 = AirportLoungesHomeScreen.f99073d0;
                return new WalletWidgetDelegate();
            case 3:
                KProperty[] kPropertyArr4 = AirportLoungesHomeScreen.f99073d0;
                return new HeroBannerDelegate(0);
            case 4:
                KProperty[] kPropertyArr5 = AirportLoungesHomeScreen.f99073d0;
                return new EsimDelegate();
            case 5:
                KProperty[] kPropertyArr6 = AirportLoungesHomeScreen.f99073d0;
                return new PlainTextWarningDelegate();
            case 6:
                KProperty[] kPropertyArr7 = AirportLoungesHomeScreen.f99073d0;
                return new ReferralContactDelegate();
            case 7:
                int i = CreditTransparentActivity.u0;
                return new LargeActionButtonDelegate();
            case 8:
                int i2 = CreditTransparentActivity.u0;
                return new PlainTextDelegate();
            case 9:
                KProperty[] kPropertyArr8 = AccountPickerScreen.S;
                return new RowDelegate(null, null, 7);
            case 10:
                return new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            case 11:
                return new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            case 12:
                return new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            case 13:
                return jz8.d.Companion.serializer();
            case 14:
                return j1.a("com.revolut.feature.learn.shared.impl.data.database.entity.CourseBadgeEmbeddedEntity.Type", jz8.d.values(), new String[]{"NEW", "TRENDING"}, new Annotation[][]{null, null});
            case 15:
                return new qlm.e(jz8.s.INSTANCE.serializer());
            case 16:
                s.Companion aVar = jz8.s.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.learn.shared.impl.data.database.entity.LessonEntity.ContentCardTextItemEmbeddedEntity", p0Var.b(jz8.s.class), new KClass[]{p0Var.b(jz8.v.class), p0Var.b(jz8.y.class), p0Var.b(jz8.b0.class)}, new KSerializer[]{jz8.t.f179662a, jz8.w.f179677a, jz8.z.f179682a}, new Annotation[0]);
            case 17:
                return new qlm.e(jz8.s.INSTANCE.serializer());
            case 18:
                return new qlm.e(jz8.s.INSTANCE.serializer());
            case 19:
                return j1.b("com.revolut.feature.learn.shared.models.domain.LearnQuestionSelection", u09.c0.values());
            case 20:
                return new qlm.e(i0.f179633a);
            case 21:
                return jz8.o0.Companion.serializer();
            case 22:
                return j1.a("com.revolut.feature.learn.shared.impl.data.database.entity.LessonEntity.QuizCoverEmbeddedEntity.Type", jz8.o0.values(), new String[]{"VIDEO", "IMAGE"}, new Annotation[][]{null, null});
            case 23:
                return new qlm.e(f0.f179615a);
            case 24:
                return b1.Companion.serializer();
            case 25:
                return j1.b("com.revolut.feature.learn.shared.impl.data.database.entity.RewardEmbeddedEntityType", b1.values());
            case 26:
                throw new IllegalStateException("No default size");
            case 27:
                int i3 = PetPolicyDocumentActivity.f76387w0;
                return new RowDelegate(null, null, 7);
            case 28:
                KProperty[] kPropertyArr9 = SavingsStatementsScreen.T;
                return new SmallActionButtonDelegate();
            default:
                return new qlm.e(k16.q.f180125a);
        }
    }
}
