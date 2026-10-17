package sz5;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import au0.g4;
import aw0.v1;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.navbar.NavBarNavigationButtonView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.youTransactor.uCube.connexion.ScanError;
import com.youTransactor.uCube.connexion.ScanListener;
import defpackage.a1;
import defpackage.t1;
import efm.r;
import flf.j;
import flf.t;
import fp0.l;
import ix0.m;
import ix0.v;
import java.util.ArrayList;
import java.util.regex.Pattern;
import klf.h0;
import klf.m1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mkf.s0;
import ngm.n;
import wli.x;
import x9h.g;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g4, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f266765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f266766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f266767c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f266768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f266769h;

    public f(Context context, BluetoothAdapter bluetoothAdapter) {
        this.f = new Handler(Looper.myLooper());
        this.f266768g = new ArrayList();
        this.f266769h = new a1(this);
        this.f266765a = context;
        this.f266766b = bluetoothAdapter;
    }

    @Override // ix0.m
    public boolean A() {
        return ((MaskedTextInputEditText) this.f266766b).isFocused();
    }

    @Override // ix0.m
    public void B(int i) {
        ((TextView) this.f266765a).setTextColor(i);
    }

    @Override // ix0.m
    public r C() {
        ihm.f fVar = (ihm.f) this.f266769h;
        String strH = h();
        if (strH == null) {
            strH = "";
        }
        r rVarStartWith = fVar.startWith(strH);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    @Override // ix0.m
    public void D(String str) {
        ((TextView) this.d).setText(str);
        ihm.f fVar = (ihm.f) this.f266769h;
        if (str == null) {
            str = "";
        }
        fVar.onNext(str);
    }

    @Override // ix0.m
    public void E(l runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((MaskedTextInputEditText) this.f266766b).post(runnable);
    }

    @Override // ix0.m
    public void F(int i) {
        ((TextView) this.d).setTextColor(i);
    }

    @Override // ix0.m
    public void G(boolean z) {
        ((TextView) this.f266765a).setVisibility(z ? 0 : 8);
    }

    @Override // ix0.m
    public void H(yz0.b bVar) {
        ((MaskedTextInputEditText) this.f266766b).setMaskingDelegate(bVar);
    }

    public ScanError I() {
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.f266766b;
        if (!((Context) this.f266765a).getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            t1.b("Error! BLE is not supported null", new Exception[0]);
            return ScanError.BLE_NOT_SUPPORTED;
        }
        if (bluetoothAdapter.getBluetoothLeScanner() == null) {
            t1.b("Error! bluetooth LE scanner null", new Exception[0]);
            return ScanError.BLE_NOT_SUPPORTED;
        }
        if (bluetoothAdapter.isEnabled()) {
            return null;
        }
        t1.b("Error! bluetooth disabled", new Exception[0]);
        return ScanError.BT_DISABLED;
    }

    public void J(String str, ScanListener scanListener) {
        t1.a("Start scan");
        ScanError scanErrorI = I();
        if (scanErrorI != null) {
            scanListener.onError(scanErrorI);
            return;
        }
        if (str != null) {
            this.d = str;
        }
        N();
        ((ArrayList) this.f266768g).clear();
        this.e = scanListener;
        ((Handler) this.f).postDelayed(new o6.a(this, 17), 10000L);
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).setReportDelay(0L).build();
        ScanFilter scanFilterBuild = new ScanFilter.Builder().setServiceUuid(new ParcelUuid(defpackage.m.f201026a)).build();
        ArrayList arrayList = new ArrayList();
        arrayList.add(scanFilterBuild);
        ((BluetoothAdapter) this.f266766b).getBluetoothLeScanner().startScan(arrayList, scanSettingsBuild, (a1) this.f266769h);
    }

    public void K(Pattern pattern, ScanListener scanListener) {
        t1.a("Start scan");
        ScanError scanErrorI = I();
        if (scanErrorI != null) {
            scanListener.onError(scanErrorI);
            return;
        }
        if (pattern != null) {
            this.f266767c = pattern;
        }
        N();
        ((ArrayList) this.f266768g).clear();
        this.e = scanListener;
        ((Handler) this.f).postDelayed(new o6.a(this, 17), 10000L);
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).setReportDelay(0L).build();
        ScanFilter scanFilterBuild = new ScanFilter.Builder().setServiceUuid(new ParcelUuid(defpackage.m.f201026a)).build();
        ArrayList arrayList = new ArrayList();
        arrayList.add(scanFilterBuild);
        ((BluetoothAdapter) this.f266766b).getBluetoothLeScanner().startScan(arrayList, scanSettingsBuild, (a1) this.f266769h);
    }

    public void L(float f) {
        Context themedContext = (Context) this.f;
        Intrinsics.checkNotNullExpressionValue(themedContext, "themedContext");
        int iS = kli.a.s(R$attr.uikit_colorElevatedPopoverBackground, themedContext);
        int iD = io0.a.d(f, iS);
        Context themedContext2 = (Context) this.f;
        Intrinsics.checkNotNullExpressionValue(themedContext2, "themedContext");
        int iS2 = kli.a.s(((v1) this.f266769h).a(), themedContext2);
        ((SearchButton) this.f266765a).setBackgroundAlpha$ui_kit_components_release(f, iS);
        com.revolut.core.ui_kit.internal.views.navbar.d dVar = (com.revolut.core.ui_kit.internal.views.navbar.d) this.f266767c;
        dVar.e(dVar.f, dVar.d, iD);
        ((NavBarNavigationButtonView) this.e).setBackgroundColor(iD);
        ((AvatarView) this.f266766b).D0(iD, iS2);
    }

    public void M() {
        Context themedContext = (Context) this.f;
        Intrinsics.checkNotNullExpressionValue(themedContext, "themedContext");
        int iS = kli.a.s(R$attr.uikit_colorElevatedPopoverBackground, themedContext);
        ((com.revolut.core.ui_kit.internal.views.navbar.d) this.f266767c).e = null;
        ((NavBarNavigationButtonView) this.e).setBackgroundColor(0);
        ((SearchButton) this.f266765a).setBackgroundAlpha$ui_kit_components_release(0.6f, iS);
        ImageWithAnimatedBackgroundView imageWithAnimatedBackgroundView = ((AvatarView) this.f266766b).f58348b;
        imageWithAnimatedBackgroundView.d = null;
        imageWithAnimatedBackgroundView.e = null;
        RoundedBackgroundDrawable roundedBackgroundDrawable = imageWithAnimatedBackgroundView.f58650b;
        Context context = imageWithAnimatedBackgroundView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        roundedBackgroundDrawable.d(kli.a.s(R$attr.uikit_colorForeground, context), imageWithAnimatedBackgroundView.f58651c);
        imageWithAnimatedBackgroundView.f.setBackground(null);
    }

    public void N() {
        t1.a("stop scan");
        if (I() != null) {
            return;
        }
        ((BluetoothAdapter) this.f266766b).getBluetoothLeScanner().stopScan((a1) this.f266769h);
        ((Handler) this.f).removeCallbacksAndMessages(null);
        ScanListener scanListener = (ScanListener) this.e;
        if (scanListener != null) {
            scanListener.onScanComplete((ArrayList) this.f266768g);
            this.e = null;
        }
    }

    public g O(ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        return new g(navigationCommandsDispatcher, (ugh.a) this.d, (g9h.c) this.e, (g9h.e) this.f266769h);
    }

    public String P(int i) {
        return n.I(((f01.c) this.f266765a).b(new TextLocalisedClause(i, null, null, 14)).toString());
    }

    @Override // ix0.m
    public void a(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((MaskedTextInputEditText) this.f266766b).a(listener);
    }

    @Override // au0.g4
    public void b(v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (((v1) this.f266769h) == colorScheme) {
            return;
        }
        this.f266769h = colorScheme;
        Context context = ((View) this.d).getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f = new gs0.c(context, colorScheme);
        au0.d dVar = (au0.d) this.f266768g;
        if (dVar instanceof au0.b) {
            L(((au0.b) dVar).f9145a);
        } else {
            if (!Intrinsics.f(dVar, au0.c.f9154a)) {
                throw new NoWhenBranchMatchedException();
            }
            M();
        }
    }

    @Override // ix0.m
    public r c() {
        ihm.f fVar = (ihm.f) this.f266768g;
        String strZ = z();
        if (strZ == null) {
            strZ = "";
        }
        r rVarStartWith = fVar.startWith(strZ);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    @Override // ix0.m
    public void d(int i, int i2) {
        ((MaskedTextInputEditText) this.f266766b).setSelection(i, i2);
    }

    @Override // ix0.m
    public void e() {
        ((TextView) this.f266767c).setText("");
        ((ihm.f) this.f266768g).onNext("");
    }

    @Override // ix0.m
    public boolean f() {
        return ((TextView) this.f266767c).getVisibility() == 0;
    }

    @Override // ix0.m
    public void g(String str) {
        ((MaskedTextInputEditText) this.f266766b).setText(str);
    }

    @Override // ix0.m
    public String getHintText() {
        CharSequence hint = ((MaskedTextInputEditText) this.f266766b).getHint();
        if (hint != null) {
            return hint.toString();
        }
        return null;
    }

    @Override // ix0.m
    public String h() {
        CharSequence text = ((TextView) this.d).getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // au0.g4
    public void i(float f) {
        this.f266768g = new au0.b(f);
        L(f);
    }

    @Override // ix0.m
    public void j(ix0.l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((MaskedTextInputEditText) this.f266766b).addTextChangedListener(new v(listener, 0));
    }

    @Override // ix0.m
    public void k(int i) {
        ((MaskedTextInputEditText) this.f266766b).setTextColor(i);
    }

    @Override // ix0.m
    public void l(String str) {
        ((TextView) this.f266765a).setText(str);
        ihm.f fVar = (ihm.f) this.f;
        if (str == null) {
            str = "";
        }
        fVar.onNext(str);
    }

    @Override // ix0.m
    public void m(boolean z) {
        ((MaskedTextInputEditText) this.f266766b).setKeyboardSuggestionsAlwaysOn(z);
    }

    @Override // ix0.m
    public r n() {
        ihm.f fVar = (ihm.f) this.f;
        String strW = w();
        if (strW == null) {
            strW = "";
        }
        r rVarStartWith = fVar.startWith(strW);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    @Override // ix0.m
    public ihm.f o() {
        return ((MaskedTextInputEditText) this.f266766b).f59127s;
    }

    @Override // ix0.m
    public void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
    }

    @Override // au0.g4
    public void q(boolean z) {
        ((SearchButton) this.f266765a).setReflectiveOuterBorderEnabled$ui_kit_components_release(z);
        ((AvatarView) this.f266766b).setReflectiveOuterBorderEnabled$ui_kit_components_release(z);
        ((com.revolut.core.ui_kit.internal.views.navbar.d) this.f266767c).d(z);
        ((NavBarNavigationButtonView) this.e).setReflectiveOuterBorderEnabled$ui_kit_components_release(z);
    }

    @Override // ix0.m
    public void r(TextClause equalsClause, TextClause prefixClause, TextClause formattedResultClause) {
        Intrinsics.checkNotNullParameter(equalsClause, "equalsClause");
        Intrinsics.checkNotNullParameter(prefixClause, "prefixClause");
        Intrinsics.checkNotNullParameter(formattedResultClause, "formattedResultClause");
        ty0.c.b((ty0.c) this.e, yoj.b.w(yoj.b.w(equalsClause, prefixClause), formattedResultClause), (TextView) this.f266767c, null, null, 12);
    }

    @Override // au0.g4
    public void reset() {
        this.f266768g = au0.c.f9154a;
        M();
    }

    @Override // ix0.m
    public void s(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        ty0.c.b((ty0.c) this.e, clause, (MaskedTextInputEditText) this.f266766b, null, null, 12);
    }

    @Override // ix0.m
    public void t(String str) {
        ((MaskedTextInputEditText) this.f266766b).setHint(str);
    }

    @Override // ix0.m
    public yz0.b u() {
        return ((MaskedTextInputEditText) this.f266766b).getMaskingDelegate();
    }

    @Override // ix0.m
    public void v(boolean z) {
        ((TextView) this.d).setVisibility(z ? 0 : 8);
    }

    @Override // ix0.m
    public String w() {
        CharSequence text = ((TextView) this.f266765a).getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // ix0.m
    public void x(boolean z) {
        ((TextView) this.f266767c).setVisibility(z ? 0 : 8);
    }

    @Override // ix0.m
    public String y() {
        Editable text = ((MaskedTextInputEditText) this.f266766b).getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // ix0.m
    public String z() {
        CharSequence text = ((TextView) this.f266767c).getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public f(SearchButton searchButton, AvatarView avatarView, com.revolut.core.ui_kit.internal.views.navbar.d navBarMenu, View navBarView, NavBarNavigationButtonView navigationButton) {
        Intrinsics.checkNotNullParameter(searchButton, "searchButton");
        Intrinsics.checkNotNullParameter(avatarView, "avatarView");
        Intrinsics.checkNotNullParameter(navBarMenu, "navBarMenu");
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(navigationButton, "navigationButton");
        this.f266765a = searchButton;
        this.f266766b = avatarView;
        this.f266767c = navBarMenu;
        this.d = navBarView;
        this.e = navigationButton;
        this.f = navBarView.getContext();
        this.f266768g = au0.c.f9154a;
        aw0.t1 t1Var = v1.Companion;
        Context context = navBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t1Var.getClass();
        this.f266769h = aw0.t1.a(context);
    }

    public f(h0 commonDataSource, m1 juniorDataSource, ynf.e giroDirectDebitWarningMapper, flf.f giroDirectDebitWarningClickHandler, ylf.b masavDirectDebitWarningMapper, j masavDirectDebitWarningClickHandler, s0 retryableDirectDebitMapper, t retryableDirectDebitClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(giroDirectDebitWarningMapper, "giroDirectDebitWarningMapper");
        Intrinsics.checkNotNullParameter(giroDirectDebitWarningClickHandler, "giroDirectDebitWarningClickHandler");
        Intrinsics.checkNotNullParameter(masavDirectDebitWarningMapper, "masavDirectDebitWarningMapper");
        Intrinsics.checkNotNullParameter(masavDirectDebitWarningClickHandler, "masavDirectDebitWarningClickHandler");
        Intrinsics.checkNotNullParameter(retryableDirectDebitMapper, "retryableDirectDebitMapper");
        Intrinsics.checkNotNullParameter(retryableDirectDebitClickHandler, "retryableDirectDebitClickHandler");
        this.f266765a = commonDataSource;
        this.f266766b = juniorDataSource;
        this.f266767c = giroDirectDebitWarningMapper;
        this.d = giroDirectDebitWarningClickHandler;
        this.e = masavDirectDebitWarningMapper;
        this.f = masavDirectDebitWarningClickHandler;
        this.f266768g = retryableDirectDebitMapper;
        this.f266769h = retryableDirectDebitClickHandler;
    }

    public f(TextView amountInputPrefix, MaskedTextInputEditText amountInputText, TextView amountInputResult, TextView amountInputSuffix, ty0.c clauseDisplayer) {
        Intrinsics.checkNotNullParameter(amountInputPrefix, "amountInputPrefix");
        Intrinsics.checkNotNullParameter(amountInputText, "amountInputText");
        Intrinsics.checkNotNullParameter(amountInputResult, "amountInputResult");
        Intrinsics.checkNotNullParameter(amountInputSuffix, "amountInputSuffix");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        this.f266765a = amountInputPrefix;
        this.f266766b = amountInputText;
        this.f266767c = amountInputResult;
        this.d = amountInputSuffix;
        this.e = clauseDisplayer;
        this.f = v0.a.d("create(...)");
        this.f266768g = v0.a.d("create(...)");
        this.f266769h = v0.a.d("create(...)");
    }

    public f(py3.b ratingEligibilityChecker, yta.b ratingActionHandler, x deeplinkHandler, yp.b appStoreNavigationFactory, dqk.f ratingPromptConfiguration, gte.a featureToggleInteractor, toh.d appRatingShownDateValidator, cua.a appRatingDisplayer) {
        Intrinsics.checkNotNullParameter(ratingEligibilityChecker, "ratingEligibilityChecker");
        Intrinsics.checkNotNullParameter(ratingActionHandler, "ratingActionHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        Intrinsics.checkNotNullParameter(ratingPromptConfiguration, "ratingPromptConfiguration");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(appRatingShownDateValidator, "appRatingShownDateValidator");
        Intrinsics.checkNotNullParameter(appRatingDisplayer, "appRatingDisplayer");
        this.f266765a = ratingEligibilityChecker;
        this.f266766b = ratingActionHandler;
        this.f266767c = deeplinkHandler;
        this.d = appStoreNavigationFactory;
        this.e = ratingPromptConfiguration;
        this.f = featureToggleInteractor;
        this.f266768g = appRatingShownDateValidator;
        this.f266769h = appRatingDisplayer;
    }

    public f(f01.c uiKitResources, ImmutableMap caches, u3a.r contactFilterInteractor, u3a.v searchableItemsUtil) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(caches, "caches");
        Intrinsics.checkNotNullParameter(contactFilterInteractor, "contactFilterInteractor");
        Intrinsics.checkNotNullParameter(searchableItemsUtil, "searchableItemsUtil");
        this.f266765a = uiKitResources;
        this.f266766b = caches;
        this.f266767c = contactFilterInteractor;
        this.d = searchableItemsUtil;
        final int i = 0;
        this.e = yhm.j.b(new Function0(this) { // from class: u3a.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sz5.f f276880b;

            {
                this.f276880b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_banks);
                    case 1:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_cards);
                    case 2:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_crypto);
                    default:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_groups);
                }
            }
        });
        final int i2 = 1;
        this.f = yhm.j.b(new Function0(this) { // from class: u3a.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sz5.f f276880b;

            {
                this.f276880b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_banks);
                    case 1:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_cards);
                    case 2:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_crypto);
                    default:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_groups);
                }
            }
        });
        final int i3 = 2;
        this.f266768g = yhm.j.b(new Function0(this) { // from class: u3a.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sz5.f f276880b;

            {
                this.f276880b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_banks);
                    case 1:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_cards);
                    case 2:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_crypto);
                    default:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_groups);
                }
            }
        });
        final int i5 = 3;
        this.f266769h = yhm.j.b(new Function0(this) { // from class: u3a.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sz5.f f276880b;

            {
                this.f276880b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_banks);
                    case 1:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_cards);
                    case 2:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_crypto);
                    default:
                        return this.f276880b.P(R$string.who_to_pay_searchable_keyword_groups);
                }
            }
        });
    }

    public f(e9h.d performanceAssetsTransformer, jbh.e performanceAssetMapper, tsk.t topMoversInteractor, adh.a performanceCalculator, ugh.a navigationProvider, g9h.c assetDetailsNotAvailableProvider, rul.e metaCollectionInstrumentsInteractor, gte.a featureToggleInteractor, g9h.e topMoversDestinationProvider) {
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(topMoversInteractor, "topMoversInteractor");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(assetDetailsNotAvailableProvider, "assetDetailsNotAvailableProvider");
        Intrinsics.checkNotNullParameter(metaCollectionInstrumentsInteractor, "metaCollectionInstrumentsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(topMoversDestinationProvider, "topMoversDestinationProvider");
        this.f266765a = performanceAssetsTransformer;
        this.f266766b = topMoversInteractor;
        this.f266767c = performanceCalculator;
        this.d = navigationProvider;
        this.e = assetDetailsNotAvailableProvider;
        this.f = metaCollectionInstrumentsInteractor;
        this.f266768g = featureToggleInteractor;
        this.f266769h = topMoversDestinationProvider;
    }

    public f(dsh.g holderBuilder, fsh.c providerTransformer, j39.e lifestyleToNearbyContextAdapter, j39.c lifestyleToEsimContextAdapter, j39.d lifestyleToGiftCardsContextAdapter, j39.b lifestyleToAsftContextAdapter, j39.f lifestyleToRevPointsRimContextAdapter, j39.a lifestyleToAirportLoungesContextAdapter, j39.g lifestyleToTripItineraryContextAdapter, ImmutableMap lifestyleProviders, ImmutableMap nearbyRewardsProviders, ImmutableMap esimWidgetProviders, ImmutableMap giftCardsProviders, ImmutableMap asftProviders, ImmutableMap revPointsRimWidgetProviders, ImmutableMap airportLoungesProviders, ImmutableMap tripItineraryWidgetProviders) {
        Intrinsics.checkNotNullParameter(holderBuilder, "holderBuilder");
        Intrinsics.checkNotNullParameter(providerTransformer, "providerTransformer");
        Intrinsics.checkNotNullParameter(lifestyleToNearbyContextAdapter, "lifestyleToNearbyContextAdapter");
        Intrinsics.checkNotNullParameter(lifestyleToEsimContextAdapter, "lifestyleToEsimContextAdapter");
        Intrinsics.checkNotNullParameter(lifestyleToGiftCardsContextAdapter, "lifestyleToGiftCardsContextAdapter");
        Intrinsics.checkNotNullParameter(lifestyleToAsftContextAdapter, "lifestyleToAsftContextAdapter");
        Intrinsics.checkNotNullParameter(lifestyleToRevPointsRimContextAdapter, "lifestyleToRevPointsRimContextAdapter");
        Intrinsics.checkNotNullParameter(lifestyleToAirportLoungesContextAdapter, "lifestyleToAirportLoungesContextAdapter");
        Intrinsics.checkNotNullParameter(lifestyleToTripItineraryContextAdapter, "lifestyleToTripItineraryContextAdapter");
        Intrinsics.checkNotNullParameter(lifestyleProviders, "lifestyleProviders");
        Intrinsics.checkNotNullParameter(nearbyRewardsProviders, "nearbyRewardsProviders");
        Intrinsics.checkNotNullParameter(esimWidgetProviders, "esimWidgetProviders");
        Intrinsics.checkNotNullParameter(giftCardsProviders, "giftCardsProviders");
        Intrinsics.checkNotNullParameter(asftProviders, "asftProviders");
        Intrinsics.checkNotNullParameter(revPointsRimWidgetProviders, "revPointsRimWidgetProviders");
        Intrinsics.checkNotNullParameter(airportLoungesProviders, "airportLoungesProviders");
        Intrinsics.checkNotNullParameter(tripItineraryWidgetProviders, "tripItineraryWidgetProviders");
        this.f266765a = lifestyleProviders;
        this.f266766b = nearbyRewardsProviders;
        this.f266767c = esimWidgetProviders;
        this.d = giftCardsProviders;
        this.e = asftProviders;
        this.f = revPointsRimWidgetProviders;
        this.f266768g = airportLoungesProviders;
        this.f266769h = tripItineraryWidgetProviders;
    }

    public f(an0.c cVar, ee0.a aVar, nj0.a aVar2) {
        this.f266765a = aVar;
        this.f266766b = cVar;
        this.f266767c = aVar2;
        int i = 15;
        this.d = e4m.b.b(new sac.a(this, 1, i));
        this.e = e4m.b.b(new sac.a(this, 2, i));
        this.f = e4m.b.b(new sac.a(this, 0, i));
        this.f266768g = e4m.b.b(new sac.a(this, 4, i));
        e4m.b.b(new sac.a(this, 3, i));
        this.f266769h = e4m.b.b(new sac.a(this, 6, i));
        e4m.b.b(new sac.a(this, 5, i));
        e4m.b.b(new sac.a(this, 7, i));
    }
}
