package mw1;

import android.graphics.Paint;
import android.telephony.PhoneNumberFormattingTextWatcher;
import androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import aw0.y6;
import com.revolut.bitmap_effects.BitmapEffects;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CardPersonalisationToolbarDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.TagsView;
import com.revolut.feature.apm.breb.impl.ui.qr_request.key_selection.BrebQrRequestKeySelectionScreen;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileActivity;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.breakdown.AirportLoungesPassBreakdownScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.immediatefamilymember.immediate_family_member_screen.ImmediateFamilyMemberDialogScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import mx0.n2;
import mx0.oc;
import myg.l;
import ngm.n;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209299a;

    public /* synthetic */ a(int i) {
        this.f209299a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f209299a) {
            case 0:
                KProperty[] kPropertyArr = BrebQrRequestKeySelectionScreen.S;
                return new RowDelegate(null, null, 7);
            case 1:
                return new TextLocalisedClause(R.string.top_up_card_error, null, null, 14);
            case 2:
                CardPersonalisationView.Companion companion = CardPersonalisationView.INSTANCE;
                return new CardPersonalisationToolbarDelegate();
            case 3:
                CardPersonalisationView.Companion companion2 = CardPersonalisationView.INSTANCE;
                return new CircleActionButtonsBarDelegate();
            case 4:
                CardPersonalisationView.Companion companion3 = CardPersonalisationView.INSTANCE;
                return new TextDelegate();
            case 5:
                int i2 = FooterActionButtonView.k;
                return new Paint(1);
            case 6:
                return Unit.f186387a;
            case 7:
                NewRevolutCardView.Companion companion4 = NewRevolutCardView.INSTANCE;
                return new to0.c();
            case 8:
                NewRevolutCardView.Companion companion5 = NewRevolutCardView.INSTANCE;
                int i3 = n2.f209850a;
                return new BitmapEffects();
            case 9:
                try {
                    return PhoneNumberFormattingTextWatcher.class.getDeclaredField("mSelfChange");
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            case 10:
                try {
                    return PhoneNumberFormattingTextWatcher.class.getDeclaredField("mStopFormatting");
                } catch (NoSuchFieldException unused2) {
                    return null;
                }
            case 11:
                Tabs.Companion companion6 = Tabs.INSTANCE;
                return Unit.f186387a;
            case 12:
                Tabs.Companion companion7 = Tabs.INSTANCE;
                return Unit.f186387a;
            case 13:
                Tabs.Companion companion8 = Tabs.INSTANCE;
                return new ihm.f();
            case 14:
                Tabs.Companion companion9 = Tabs.INSTANCE;
                return new ihm.f();
            case 15:
                Tabs.Companion companion10 = Tabs.INSTANCE;
                return new ihm.f();
            case 16:
                Tabs.Companion companion11 = Tabs.INSTANCE;
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
            case 17:
                int i5 = TagsView.e;
                return new TagDelegate(-2);
            case 18:
                KProperty[] kPropertyArr2 = AirportLoungesPassBreakdownScreen.S;
                return new z4l.j(7, m72.b.v(null, null, 7), false);
            case 19:
                return new HeaderDelegate();
            case 20:
                return new ActionsDelegate();
            case 21:
                return new ListSubheaderDelegate();
            case 22:
                return new RowDelegate(null, null, 7);
            case 23:
                l.a aVar = myg.l.Companion;
                List listI = n.i();
                ArrayList arrayList = new ArrayList(w.t(listI, 10));
                for (Object obj2 : listI) {
                    int i6 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList.add(new y6(i, ((Number) obj2).floatValue()));
                    i = i6;
                }
                return arrayList;
            case 24:
                Lazy lazy = mz8.a.f210722a;
                return ue0.e.b(Json.d, new oc(13));
            case 25:
                int i21 = ImmediateFamilyMemberDialogScreen.u0;
                return new z4l.j(7, m72.b.v(null, null, 7), false);
            case 26:
                return GuaranteedConfigurationsUtil.QUERYABLE_VIC_FCQ_COMBINATIONS_delegate$lambda$0();
            case 27:
                return GuaranteedConfigurationsUtil.QUERYABLE_BAKLAVA_FCQ_COMBINATIONS_delegate$lambda$0();
            case 28:
                int i22 = PetProfileActivity.F0;
                return new ListSubheaderDelegate();
            default:
                int i32 = PetProfileActivity.F0;
                return new RowDelegate(null, null, 7);
        }
    }
}
