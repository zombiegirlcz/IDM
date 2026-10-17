package qh0;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetController;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.SelectAutopayMethodScreen;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlow;
import com.revolut.feature.trusted_merchants.impl.ui.trusted_merchants.TrustedMerchantsActivity;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.AddressSuggestionScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246390a;

    public /* synthetic */ d(int i) {
        this.f246390a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        switch (this.f246390a) {
            case 0:
                return g.Companion.serializer();
            case 1:
                return j.Companion.serializer();
            case 2:
                return n0.Companion.serializer();
            case 3:
                return j1.a("com.revolut.core.mobile_services.impl.auth.models.GmsCreateCredentialRequest.PublicKey.AuthenticatorSelection.AuthenticatorAttachment", g.values(), new String[]{"platform", "cross-platform"}, new Annotation[][]{null, null});
            case 4:
                return j1.a("com.revolut.core.mobile_services.impl.auth.models.GmsCreateCredentialRequest.PublicKey.AuthenticatorSelection.ResidentKey", j.values(), new String[]{"discouraged", "preferred", "required"}, new Annotation[][]{null, null, null});
            case 5:
                return j0.Companion.serializer();
            case 6:
                return j0.Companion.serializer();
            case 7:
                return j0.Companion.serializer();
            case 8:
                return j1.a("com.revolut.core.mobile_services.impl.auth.models.GmsCredential.PublicKey.Type", j0.values(), new String[]{"public-key"}, new Annotation[][]{null});
            case 9:
                return j1.a("com.revolut.core.mobile_services.impl.auth.models.GmsCredentialRequest.UserVerification", n0.values(), new String[]{"discouraged", "preferred", "required"}, new Annotation[][]{null, null, null});
            case 10:
                return new qlm.e(v1.f247718a);
            case 11:
                return n0.Companion.serializer();
            case 12:
                KProperty[] kPropertyArr = RolleeScreen.T;
                return new z4l.j(i, zhm.u.c(new FullScreenDocumentLoadingDelegate()), false);
            case 13:
                int i2 = BadAddressSheetController.V;
                return new RowDelegate(null, null, 7);
            case 14:
                ChooserActivity.Companion companion = ChooserActivity.INSTANCE;
                return new RowDelegate(null, null, 7);
            case 15:
                ChooserActivity.Companion companion2 = ChooserActivity.INSTANCE;
                return new AccountCellItemDelegate();
            case 16:
                ChooserActivity.Companion companion3 = ChooserActivity.INSTANCE;
                return new LargeActionButtonDelegate();
            case 17:
                ChooserActivity.Companion companion4 = ChooserActivity.INSTANCE;
                return new TwinHorizontalButtonDelegate();
            case 18:
                m70.a.c(t0.f186434a);
                return new TextImage("", 0, 0, 0, 0, 0, 206);
            case 19:
                KProperty[] kPropertyArr2 = TabCryptoFlow.R;
                return new AccountCellItemDelegate();
            case 20:
                int i3 = TrustedMerchantsActivity.C0;
                return new LargeActionButtonDelegate();
            case 21:
                int i5 = TrustedMerchantsActivity.C0;
                return new ListSubheaderDelegate();
            case 22:
                int i6 = TrustedMerchantsActivity.C0;
                return new RowDelegate(null, null, 7);
            case 23:
                int i21 = TrustedMerchantsActivity.C0;
                return new FullScreenStateDelegate();
            case 24:
                int i22 = TrustedMerchantsActivity.C0;
                return new RowLoadingDelegate();
            case 25:
                int i32 = TrustedMerchantsActivity.C0;
                return new ListSubheaderLoadingDelegate();
            case 26:
                KProperty[] kPropertyArr3 = SelectAutopayMethodScreen.f68649d0;
                return new PlainTextWarningDelegate();
            case 27:
                KProperty[] kPropertyArr4 = SelectAutopayMethodScreen.f68649d0;
                return new RowDelegate(null, null, 7);
            case 28:
                return ue0.e.b(Json.d, new ql6.s(6));
            default:
                KProperty[] kPropertyArr5 = AddressSuggestionScreen.R;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
        }
    }
}
