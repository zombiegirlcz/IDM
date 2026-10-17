package zc0;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.dialogs.AlertDialogDisplayer$Button;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendFlowBinary;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.tracking.v3.IdContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f321000b;

    public /* synthetic */ a0(y2 y2Var, int i) {
        this.f320999a = i;
        this.f321000b = y2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        pfm.a aVar;
        String f63230b;
        String f63230b2;
        Image imageA;
        switch (this.f320999a) {
            case 0:
                rp0.o0 clickData = (rp0.o0) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                return ((qc0.f1) this.f321000b.i).u(clickData.f256144a);
            case 1:
                this.f321000b.f321163j.setVisible(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 2:
                BackendScreen screen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                if ((screen instanceof HtmlPromptScreen) || (screen instanceof BottomPromptScreen)) {
                    efm.k kVarFirstElement = ((opi.b) this.f321000b.f321169r).R().filter(new b0(new z(9), 12)).firstElement();
                    b0 b0Var = new b0(new z(10), 13);
                    kVarFirstElement.getClass();
                    return new rfm.m(kVarFirstElement, b0Var, 1);
                }
                if ((screen instanceof PromptScreen) || (screen instanceof StatusDialogScreen) || (screen instanceof DeeplinkScreen) || (screen instanceof FormScreen) || (screen instanceof SummaryScreen) || (screen instanceof StoriesScreen) || (screen instanceof TutorialScreen)) {
                    return rfm.h.f253943a;
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                nc0.f fVar = (nc0.f) this.f321000b.f321171t;
                efm.k kVarFirstElement2 = fVar.f214117g.filter(new nae.a(new n8i.q0(15), 18)).firstElement();
                nae.a aVar2 = new nae.a(new nc0.b(fVar, 3), 22);
                kVarFirstElement2.getClass();
                rfm.m mVar = new rfm.m(kVarFirstElement2, aVar2, 1);
                Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
                return mVar;
            case 4:
                k3l.j result = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result.a().getF104385a(), "PREFETCH_ITEMS_ERROR_DIALOG_ID") || !(result instanceof k3l.g)) {
                    return pfm.m.f235744a;
                }
                y2 y2Var = this.f321000b;
                return y2Var.f321162h.w0().flatMapCompletable(new b0(new a0(y2Var, 14), 11));
            case 5:
                Action it8 = (Action) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((qc0.f1) this.f321000b.i).m(it8);
            case 6:
                final LargeActionButtonDelegate.Model it9 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.i;
                String str = it9.f52613a;
                boolean z = obj3 instanceof EntitiesListItem;
                y2 y2Var2 = this.f321000b;
                if (z) {
                    return ((qc0.f1) y2Var2.i).t((EntitiesListItem) obj3);
                }
                if (Intrinsics.f(str, "DateInput_DatePicker")) {
                    final int i = 0;
                    aVar = new pfm.a(new rfm.o(new Callable() { // from class: zc0.s
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i) {
                                case 0:
                                    Object obj4 = it9.i;
                                    if (obj4 instanceof e3) {
                                        return (e3) obj4;
                                    }
                                    return null;
                                default:
                                    Object obj5 = it9.i;
                                    if (obj5 instanceof Action) {
                                        return (Action) obj5;
                                    }
                                    return null;
                            }
                        }
                    }), new n(new t(y2Var2, i), 8), 3);
                } else {
                    if (!kotlin.text.a0.H(str, "LIST_ID_BOTTOM_PROMPT_ACTION_", false)) {
                        return pfm.m.f235744a;
                    }
                    final int i2 = 1;
                    aVar = new pfm.a(new rfm.o(new Callable() { // from class: zc0.s
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i2) {
                                case 0:
                                    Object obj4 = it9.i;
                                    if (obj4 instanceof e3) {
                                        return (e3) obj4;
                                    }
                                    return null;
                                default:
                                    Object obj5 = it9.i;
                                    if (obj5 instanceof Action) {
                                        return (Action) obj5;
                                    }
                                    return null;
                            }
                        }
                    }), new n(new t(y2Var2, i2), 10), 3);
                }
                return aVar;
            case 7:
                od0.i image = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(image, "image");
                xpi.g gVar = this.f321000b.f321165m;
                Image image2 = (Image) image.f224257a;
                NavBarWithToolbar navBarWithToolbar = ((xpi.c) gVar).f307974j;
                if (navBarWithToolbar != null) {
                    navBarWithToolbar.setNavigationButtonImage(image2);
                    return Unit.f186387a;
                }
                Intrinsics.r("navBarWithToolbarView");
                throw null;
            case 8:
                BackendScreen screen2 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen2, "screen");
                if (!(screen2 instanceof PromptScreen)) {
                    if ((screen2 instanceof StatusDialogScreen) || (screen2 instanceof DeeplinkScreen) || (screen2 instanceof FormScreen) || (screen2 instanceof SummaryScreen) || (screen2 instanceof StoriesScreen) || (screen2 instanceof BottomPromptScreen) || (screen2 instanceof HtmlPromptScreen) || (screen2 instanceof TutorialScreen)) {
                        return rfm.h.f253943a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c cVar = this.f321000b.k;
                PromptScreen screen3 = (PromptScreen) screen2;
                List list = screen3.f63588g;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(screen3, "screen");
                yc0.q imageItemMapper = cVar.f321027q;
                yc0.p htmlStringItemMapper = cVar.f321028r;
                Intrinsics.checkNotNullParameter(screen3, "<this>");
                Intrinsics.checkNotNullParameter(imageItemMapper, "imageItemMapper");
                Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
                TextClause textClause = new TextClause(screen3.f63586b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                HtmlClause htmlClauseA = yc0.p.a(htmlStringItemMapper, screen3.f63587c);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                ImageItem imageItem = screen3.d;
                TextClause textClause2 = null;
                Image resourceImage2 = (imageItem == null || (imageA = imageItemMapper.a(imageItem, null)) == null) ? new ResourceImage(com.revolut.uicomponent.R$drawable.empty, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : imageA;
                Action action = list != null ? (Action) zhm.d0.e0(0, list) : null;
                TextClause textClause3 = (action == null || (f63230b2 = action.getF63230b()) == null) ? null : new TextClause(f63230b2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Action action2 = list != null ? (Action) zhm.d0.e0(1, list) : null;
                if (action2 != null && (f63230b = action2.getF63230b()) != null) {
                    textClause2 = new TextClause(f63230b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                AnalyticsContext analyticsContext = new AnalyticsContext(kii.e.d(IdContext.newBuilder(), screen3.f63585a, AnalyticsContext.INSTANCE));
                return efm.k.g(textClause3 != null ? textClause2 == null ? new cqi.b(textClause, htmlClauseA, resourceImage, resourceImage2, textClause3, screen3, analyticsContext) : new cqi.d(textClause, htmlClauseA, resourceImage, resourceImage2, textClause3, textClause2, screen3, null, analyticsContext, 644) : new cqi.e(textClause, htmlClauseA, resourceImage, resourceImage2, screen3));
            case 9:
                String url2 = (String) obj2;
                Intrinsics.checkNotNullParameter(url2, "url");
                return ((qc0.f1) this.f321000b.i).u(url2);
            case 10:
                BackendScreen screen4 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen4, "screen");
                if (screen4 instanceof PromptScreen) {
                    efm.r map = ((cqi.j) this.f321000b.f321170s).i.f256147a.f().map(new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(23), 21));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    efm.k kVarFirstElement3 = map.firstElement();
                    b0 b0Var2 = new b0(new z(11), 16);
                    kVarFirstElement3.getClass();
                    return new rfm.m(kVarFirstElement3, b0Var2, 1);
                }
                if ((screen4 instanceof StatusDialogScreen) || (screen4 instanceof DeeplinkScreen) || (screen4 instanceof FormScreen) || (screen4 instanceof SummaryScreen) || (screen4 instanceof StoriesScreen) || (screen4 instanceof BottomPromptScreen) || (screen4 instanceof HtmlPromptScreen) || (screen4 instanceof TutorialScreen)) {
                    return rfm.h.f253943a;
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                BackendScreen screen5 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen5, "screen");
                if (screen5 instanceof FormScreen) {
                    List list2 = ((FormScreen) screen5).f63468b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list2) {
                        if (obj4 instanceof BackendFlowUploadItem) {
                            arrayList.add(obj4);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it10 = arrayList.iterator();
                    while (it10.hasNext()) {
                        zhm.a0.x(((BackendFlowUploadItem) it10.next()).getE(), arrayList2);
                    }
                    ArrayList<BackendFlowBinary> arrayList3 = new ArrayList();
                    for (Object obj5 : arrayList2) {
                        if (((BackendFlowFile) ((BackendFlowBinary) obj5)).f == xl2.e.UPLOAD_ERROR) {
                            arrayList3.add(obj5);
                        }
                    }
                    for (BackendFlowBinary backendFlowBinary : arrayList3) {
                        if (!(backendFlowBinary instanceof BackendFlowFile)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y2 y2Var3 = this.f321000b;
                        pfm.a aVarA0 = y2Var3.f321162h.a0(new xu.i(((BackendFlowFile) backendFlowBinary).f63281g));
                        Function1 function1K = y2Var3.K();
                        pfm.a aVar3 = new pfm.a(aVarA0, new nii.o0(28, new x2(new BreadcrumbException(), 0)), 2);
                        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                        te0.w.j0(y2Var3.f239031a, z9h.n.k(function1K, aVar3, new yzc.p(7, w2.f321147a), "subscribe(...)"));
                    }
                } else if (!(screen5 instanceof DeeplinkScreen) && !(screen5 instanceof StatusDialogScreen) && !(screen5 instanceof SummaryScreen) && !(screen5 instanceof StoriesScreen) && !(screen5 instanceof BottomPromptScreen) && !(screen5 instanceof PromptScreen) && !(screen5 instanceof HtmlPromptScreen) && !(screen5 instanceof TutorialScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                return pfm.m.f235744a;
            case 12:
                c cVar2 = this.f321000b.k;
                BackendScreen screen6 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen6, "screen");
                if (screen6 instanceof BottomPromptScreen) {
                    BottomPromptScreen screen7 = (BottomPromptScreen) screen6;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(screen7, "screen");
                    return efm.k.g(rp0.y.a(cVar2.i.b(screen7), "BACKEND_SCREEN_DELEGATES_KEY"));
                }
                if (screen6 instanceof HtmlPromptScreen) {
                    HtmlPromptScreen screen8 = (HtmlPromptScreen) screen6;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(screen8, "screen");
                    return efm.k.g(rp0.y.a(cVar2.f321022j.a(screen8), "BACKEND_SCREEN_DELEGATES_KEY"));
                }
                if ((screen6 instanceof PromptScreen) || (screen6 instanceof StatusDialogScreen) || (screen6 instanceof DeeplinkScreen) || (screen6 instanceof FormScreen) || (screen6 instanceof SummaryScreen) || (screen6 instanceof StoriesScreen) || (screen6 instanceof TutorialScreen)) {
                    return rfm.h.f253943a;
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                y2 y2Var4 = this.f321000b;
                g gVar2 = y2Var4.f321162h;
                qc0.j jVar = y2Var4.i;
                rp0.c dialogResult = (rp0.c) obj2;
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                String str2 = dialogResult.f256050a;
                AlertDialogDisplayer$Button alertDialogDisplayer$Button = dialogResult.f256052c;
                int iHashCode = str2.hashCode();
                pfm.m mVar2 = pfm.m.f235744a;
                if (iHashCode == -2016873071) {
                    if (!str2.equals("EXIT_DIALOG_ID") || alertDialogDisplayer$Button != AlertDialogDisplayer$Button.POSITIVE) {
                        return mVar2;
                    }
                    qc0.f1 f1Var = (qc0.f1) jVar;
                    f1Var.getClass();
                    return f1Var.p(new FinishCommand(1609, null, null, 6));
                }
                if (iHashCode != -1011142021) {
                    if (iHashCode != 420973826 || !str2.equals("PERMISSION_DIALOG_ID")) {
                        return mVar2;
                    }
                    if (alertDialogDisplayer$Button != AlertDialogDisplayer$Button.POSITIVE) {
                        return jVar.goBack();
                    }
                    qc0.f1 f1Var2 = (qc0.f1) jVar;
                    f1Var2.getClass();
                    pfm.h hVar = new pfm.h(new qc0.a1(f1Var2, 2), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar;
                }
                if (!str2.equals("RETRY_DIALOG_ID")) {
                    return mVar2;
                }
                Object obj6 = dialogResult.f256051b;
                BackendFlowBinary backendFlowBinary2 = obj6 instanceof BackendFlowBinary ? (BackendFlowBinary) obj6 : null;
                if (backendFlowBinary2 == null) {
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                if (alertDialogDisplayer$Button == AlertDialogDisplayer$Button.POSITIVE) {
                    if (backendFlowBinary2 instanceof BackendFlowFile) {
                        return gVar2.a0(new xu.i(((BackendFlowFile) backendFlowBinary2).f63281g));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                BackendFlowFile backendFlowFile = (BackendFlowFile) backendFlowBinary2;
                efm.b bVarU = mo3.a.u(gVar2.m1(backendFlowFile.f63279b, backendFlowFile.d), y2Var4.f321168q, true);
                Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                return bVarU;
            case 14:
                BackendScreen screen9 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen9, "screen");
                boolean z3 = screen9 instanceof FormScreen;
                y2 y2Var5 = this.f321000b;
                return z3 ? y2Var5.i.goBack() : screen9 instanceof BottomPromptScreen ? new pfm.h(new c2i.b(y2Var5.f321169r, 2), 2) : pfm.m.f235744a;
            default:
                BackendScreen backendScreen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(backendScreen, "backendScreen");
                if (backendScreen instanceof FormScreen) {
                    return new rfm.o(new wf6.w(this.f321000b, backendScreen, 9));
                }
                if ((backendScreen instanceof StoriesScreen) || (backendScreen instanceof BottomPromptScreen) || (backendScreen instanceof PromptScreen) || (backendScreen instanceof HtmlPromptScreen) || (backendScreen instanceof StatusDialogScreen)) {
                    return rfm.h.f253943a;
                }
                if ((backendScreen instanceof SummaryScreen) || (backendScreen instanceof DeeplinkScreen) || (backendScreen instanceof TutorialScreen)) {
                    return efm.k.g(zhm.f0.f322471a);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
