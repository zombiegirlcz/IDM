package b7c;

import ad0.v;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.SummarySectionItem;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.external_accounts.impl.repository.network.MandateService;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination;
import com.revolut.feature.revolutpay.api.shared.deeplink.RevolutPayOrderParameters;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import ft3.s;
import ft3.u0;
import h93.f0;
import i93.e;
import i93.k;
import io3.l;
import ip0.ck0;
import ip0.yj0;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import od0.h;
import ood.o0;
import oq3.d;
import oq3.f;
import oq3.m;
import org.jmrtd.lds.LDSFile;
import ufm.i;
import uh6.o;
import uyl.q;
import v6l.b1;
import zc0.y2;
import zhm.d0;
import zhm.u;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12991c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.f12989a = i;
        this.f12991c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f12990b = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        i93.c cVar;
        k kVarC;
        Image lottieImage;
        String strValueOf;
        int i = this.f12989a;
        int i2 = 5;
        int i3 = 6;
        o oVar = null;
        Object obj2 = null;
        f0VarB = null;
        f0VarB = null;
        f0 f0VarB = null;
        boolean z = this.f12990b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f12991c;
        switch (i) {
            case 0:
                return new RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination(c.c((c) obj5, (RevolutPayOrderParameters) obj4, false, ((jf0.c) obj3).f173627a, null, this.f12990b, 8));
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                String str = (String) obj4;
                xi0.b bVar = (xi0.b) obj3;
                l lVar = l.CURRENT;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((xi0.b) it8.next()).f306286a);
                }
                Set setI1 = d0.i1(arrayList2);
                aim.o oVar2 = new aim.o();
                oVar2.add(k1j.a.POCKETS);
                oVar2.add(k1j.a.CRYPTO);
                oVar2.add(k1j.a.VAULTS);
                if (z) {
                    oVar2.add(k1j.a.COMMODITIES);
                }
                oVar2.add(k1j.a.REVOLUT_X_FIAT);
                return vhi.c.c(new CurrencyChooserFlowDestination(new CurrencyChooserFlowDestination.StartType.BalancePicker(str, bVar, lVar, setI1, (Set) null, (Set) y0.a(oVar2), new TextLocalisedClause(R$string.fx_orders_balance_picker_buy_title, null, null, 14), true, (Integer) 323, (Set) null, 1064)), yhi.b.POPUP, 323, false, 8);
            case 2:
                m mVar = (m) obj4;
                return new pfm.a(((ft3.y0) obj5) instanceof u0 ? te0.w.j(s.INSTANCE) : new i(mVar.c(), new f(i2, new o0(23)), 1), new f(i3, new d(mVar, z, (oq3.i) obj3, 3)), 4);
            case 3:
                th6.w wVar = (th6.w) obj5;
                String str2 = (String) obj4;
                MandateService mandateService = wVar.f271298a;
                jo3.a aVarP = mo3.a.p((dj0.d) obj3);
                if (z) {
                    sh6.a aVar = wVar.f271300c;
                    boolean z3 = aVar.f263440c.a().k;
                    int i5 = Settings.System.getInt(aVar.d.f213187a.getContentResolver(), "screen_brightness", 0);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    String RELEASE = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                    OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
                    Intrinsics.h(offsetDateTimeNow);
                    int totalSeconds = offsetDateTimeNow.getOffset().getTotalSeconds() / 60;
                    String strT = m72.b.t(new Object[]{Integer.valueOf(totalSeconds / 60), Integer.valueOf(Math.abs(totalSeconds % 60))}, 2, Locale.US, "%+03d:%02d", "format(...)");
                    String language = ((s80.b) aVar.f263438a).b().getLanguage();
                    Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
                    c90.c cVar2 = aVar.f263439b;
                    oVar = new o(z3, i5, jElapsedRealtime, strT, language, new uh6.m(cVar2.f22265a.getResources().getDisplayMetrics().heightPixels, cVar2.c()));
                }
                uh6.k kVar = new uh6.k(str2, aVarP, oVar);
                MandateService.Companion aVar2 = MandateService.INSTANCE;
                return mandateService.topUpWithMandate(kVar, new wj0.b("TOPUP_IDEMPOTENCY_TAG"));
            case 4:
                tyd.d dVar = (tyd.d) obj4;
                tyd.f fVar = (tyd.f) obj3;
                NaviCommand featureCommand = new FeatureCommand(new AccountsStatementFeatureConfig(dVar != null ? tyd.f.b(dVar) : null, AccountStatementProduct.PersonalCurrent.f88237a, y0.b(z92.f.l((io3.d) obj5)), (dVar != null ? dVar.f275557c : null) == tyd.c.AUTOSTART));
                if (z) {
                    featureCommand = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), featureCommand);
                }
                fVar.f275562c.c(featureCommand);
                return Boolean.TRUE;
            case 5:
                e eVar = (e) obj3;
                h hVar = od0.i.Companion;
                f0 f0VarF = ((b1) obj5).f((String) obj4);
                if (f0VarF != null && (cVar = f0VarF.f150113g) != null && (kVarC = cVar.f159551c) != null) {
                    Boolean boolValueOf = eVar == e.LOCATION ? Boolean.valueOf(z) : null;
                    Boolean boolValueOf2 = eVar == e.ECOMMERCE ? Boolean.valueOf(!z) : null;
                    boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : cVar.f159549a;
                    boolean zBooleanValue2 = boolValueOf2 != null ? boolValueOf2.booleanValue() : cVar.f159550b;
                    i93.i iVarB = kVarC.b(eVar);
                    if (iVarB != null) {
                        kVarC = kVarC.c(eVar, i93.i.a(iVarB, z, null, 13));
                    }
                    f0VarB = f0.b(f0VarF, i93.c.a(cVar, zBooleanValue, zBooleanValue2, kVarC, 504));
                }
                hVar.getClass();
                return h.a(f0VarB);
            case 6:
                vli.d dVar2 = (vli.d) obj5;
                NaviCommand naviCommandB = dVar2.b((String) obj4, (jf0.c) obj3);
                sri.m mVar2 = dVar2.f290453a;
                if (z) {
                    naviCommandB = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6))), naviCommandB);
                }
                mVar2.c(naviCommandB);
                return Unit.f186387a;
            default:
                BackendScreen backendScreen = (BackendScreen) obj5;
                zc0.c cVar3 = ((y2) obj4).k;
                String str3 = (String) obj3;
                if (uc0.b.d(backendScreen)) {
                    if (!(backendScreen instanceof FormScreen)) {
                        return zhm.f0.f322471a;
                    }
                    Iterator it9 = ((FormScreen) backendScreen).f63468b.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next = it9.next();
                            if (((BackendItem) next) instanceof WidgetProgressionItem) {
                                obj2 = next;
                            }
                        }
                    }
                    BackendItem backendItem = (BackendItem) obj2;
                    return backendItem != null ? cVar3.F(u.c(backendItem), false) : iii.c.c(5);
                }
                Intrinsics.h(str3);
                if (backendScreen instanceof FormScreen) {
                    FormScreen formScreen = (FormScreen) backendScreen;
                    ArrayList arrayListF = cVar3.F(formScreen.f63468b, !ue0.e.n(formScreen.e) || foh.i.n(formScreen).size() >= 2);
                    return (!z || str3.length() <= 0) ? arrayListF : cVar3.d(str3, arrayListF);
                }
                if (!(backendScreen instanceof SummaryScreen)) {
                    if (!(backendScreen instanceof TutorialScreen)) {
                        if ((backendScreen instanceof StoriesScreen) || (backendScreen instanceof StatusDialogScreen) || (backendScreen instanceof BottomPromptScreen) || (backendScreen instanceof PromptScreen) || (backendScreen instanceof HtmlPromptScreen) || (backendScreen instanceof DeeplinkScreen)) {
                            return zhm.f0.f322471a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    TutorialScreen screen = (TutorialScreen) backendScreen;
                    cVar3.getClass();
                    Intrinsics.checkNotNullParameter(screen, "screen");
                    v vVar = cVar3.f321026p;
                    Intrinsics.checkNotNullParameter(screen, "screen");
                    ImageItem imageItem = screen.f63715h;
                    String str4 = screen.f;
                    if (imageItem == null || (lottieImage = vVar.f3228a.a(imageItem, 300)) == null) {
                        lottieImage = new LottieImage(new SourceUrl(screen.f63714g, null), (List) null, LDSFile.EF_DG4_TAG);
                    }
                    q qVar = new q("LIST_ID_LOTTIE", lottieImage);
                    TextClause textClause = new TextClause(screen.e, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124);
                    yj0 yj0Var = yj0.CENTER_HORIZONTAL;
                    Object[] elements = {qVar, new TextDelegate.Model("LIST_ID_TITLE", textClause, false, new ck0(yj0Var), null, null, R$attr.uikit_dp32, (str4 == null || kotlin.text.d0.W(str4)) ? R$attr.uikit_dp32 : R$attr.uikit_dp0, 0, 0, 1652), str4 != null ? new TextDelegate.Model("LIST_ID_SUBTITLE", new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(yj0Var), null, null, R$attr.uikit_dp8, R$attr.uikit_dp32, 0, 0, 1652) : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    return kotlin.collections.d.L(elements);
                }
                List list = ((SummaryScreen) backendScreen).f63668b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list) {
                    if (obj6 instanceof SummarySectionItem) {
                        arrayList3.add(obj6);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj7 : arrayList3) {
                    String str5 = ((SummarySectionItem) obj7).d;
                    Object objO = linkedHashMap.get(str5);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str5);
                    }
                    ((List) objO).add(obj7);
                }
                ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String string = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    if (string.length() > 0) {
                        StringBuilder sb6 = new StringBuilder();
                        char cCharAt = string.charAt(0);
                        if (Character.isLowerCase(cCharAt)) {
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            strValueOf = CharsKt.f(cCharAt, locale);
                        } else {
                            strValueOf = String.valueOf(cCharAt);
                        }
                        sb6.append((Object) strValueOf);
                        String strSubstring = string.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        sb6.append(strSubstring);
                        string = sb6.toString();
                    }
                    String title = string;
                    cVar3.getClass();
                    Intrinsics.checkNotNullParameter(title, "title");
                    arrayList4.add(d0.E0(cVar3.F(list2, false), u.c(new ListSubheaderDelegate.Model(title, (Image) null, (Clause) new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp16, 0, 0, 57338))));
                }
                return w.u(arrayList4);
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.f12989a = i;
        this.f12991c = obj2;
        this.d = obj3;
        this.f12990b = z;
        this.e = obj4;
    }

    public /* synthetic */ b(vli.d dVar, jf0.c cVar, String str, boolean z) {
        this.f12989a = 6;
        this.f12991c = dVar;
        this.e = cVar;
        this.d = str;
        this.f12990b = z;
    }
}
