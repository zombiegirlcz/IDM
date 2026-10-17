package rwg;

import androidx.camera.camera2.impl.CameraCallbackMap;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.TrendingScreen;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsFragment;
import com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteActivity;
import com.revolut.feature.insurance_pet.impl.ui.profile.plan.PetPolicyDetailsActivity;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreen;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257916a;

    public /* synthetic */ e0(int i) {
        this.f257916a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f257916a) {
            case 0:
                return new qlm.e(b0.f257908a);
            case 1:
                int i = MaskedTextInputEditText.f59117y;
                return Unit.f186387a;
            case 2:
                KProperty[] kPropertyArr = TrendingScreen.R;
                return new ListSubheaderDelegate();
            case 3:
                KProperty[] kPropertyArr2 = TrendingScreen.R;
                return new RowDelegate(null, null, 7);
            case 4:
                int i2 = PetBreedDetailsFragment.m0;
                return new InputChecklistDelegate();
            case 5:
                int i3 = PetBreedDetailsFragment.m0;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr3 = DirectDebitAccountDetailsScreen.c0;
                return new CellDetailsDelegate();
            case 7:
                int i5 = PetEditQuoteActivity.A0;
                return new InputChecklistDelegate();
            case 8:
                int i6 = PetEditQuoteActivity.A0;
                return new ListSubheaderDelegate();
            case 9:
                int i21 = PetEditQuoteActivity.A0;
                return new LargeActionButtonDelegate();
            case 10:
                return new ResourceImage(R$drawable.uikit_icn_24_minus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            case 11:
                return new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            case 12:
                return new qlm.e(qz8.g.f250383a);
            case 13:
                return new qlm.e(pz8.g.Companion.serializer());
            case 14:
                return rz8.h.Companion.serializer();
            case 15:
                return new qlm.e(rz8.a.f258521a);
            case 16:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.course.category.CourseCategoryVariantDto", rz8.h.values(), new String[]{"LIST_SMALL", "LIST_LARGE", "GRID"}, new Annotation[][]{null, null, null});
            case 17:
                return CameraCallbackMap.rejectOperationCameraCaptureSession_delegate$lambda$0();
            case 18:
                return new s01.v();
            case 19:
                return new s01.w();
            case 20:
                EnumEntries enumEntriesB = q06.e.b();
                ArrayList<String> arrayList = new ArrayList(zhm.w.t(enumEntriesB, 10));
                Iterator<E> it8 = enumEntriesB.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((q06.e) it8.next()).c());
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (String str : arrayList) {
                    Regex regex = new Regex("<\\w+>");
                    Regex.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter("((\\w|-|:)+)", "literal");
                    String strQuoteReplacement = Matcher.quoteReplacement("((\\w|-|:)+)");
                    Intrinsics.checkNotNullExpressionValue(strQuoteReplacement, "quoteReplacement(...)");
                    arrayList2.add(new Pair(new Regex(regex.replace(str, strQuoteReplacement)), str));
                }
                return arrayList2;
            case 21:
                int i22 = PetPolicyDetailsActivity.B0;
                return new SmallActionButtonDelegate();
            case 22:
                int i32 = PetPolicyDetailsActivity.B0;
                return new CellDetailsActionDelegate();
            case 23:
                int i33 = PetPolicyDetailsActivity.B0;
                return new RowDelegate(null, null, 7);
            case 24:
                int i43 = PetPolicyDetailsActivity.B0;
                return new LargeActionButtonDelegate();
            case 25:
                KProperty[] kPropertyArr4 = ConsentRequestScreen.f104269d0;
                return new RowDelegate(null, null, 7);
            case 26:
                KProperty[] kPropertyArr5 = ConsentRequestScreen.f104269d0;
                return new ListCellDelegate();
            case 27:
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i59 = R$drawable.uikit_icn_16_hourglass;
                int i66 = R$attr.uikit_colorGroupedBackground;
                return new RawCutoutImageBadge(LayeredImage.Companion.g(companion, i59, new Color.Solid(R$attr.uikit_colorOrange), new Color.Solid(i66), new Color.Solid(i66), null, 2.0f, 2.0f, Float.valueOf(16.0f), SyslogConstants.LOG_LOCAL2));
            case 28:
                KProperty[] kPropertyArr6 = TravelExperiencesCancellationScreen.f93021h0;
                return new RowDelegate(null, null, 7);
            default:
                KProperty[] kPropertyArr7 = TravelExperiencesCancellationScreen.f93021h0;
                return new ProgressStepVerticalDelegate();
        }
    }

    public /* synthetic */ e0(s06.d dVar) {
        this.f257916a = 20;
    }
}
