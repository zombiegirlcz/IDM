package x94;

import android.net.Uri;
import aw0.o9;
import com.revolut.core.model.FileExtension;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerActivity;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerContract$Configuration;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FileOpenActivityDestination;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import ip0.ck0;
import ip0.cp0;
import ip0.yj0;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import org.jmrtd.lds.LDSFile;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f303556b;

    public /* synthetic */ l(s sVar, int i) {
        this.f303555a = i;
        this.f303556b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f303555a;
        int i2 = 2;
        s sVar = this.f303556b;
        switch (i) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return okl.m.w(null, null, null, 7, ((t) sVar.f303566m).f303573a);
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h hVar = (h) sVar.L();
                if (hVar != null) {
                    ((CreditApplicationDocumentViewerActivity) hVar).setItems(v.k(new TextDelegate.Model("id_retry_description", new TextLocalisedClause(R$string.credit_legal_button_retry_description, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036), new LargeActionButtonDelegate.Model("id_retry_button", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.credit_legal_button_retry_title, null, null, 14), false, null, null, null, null, 1000)));
                }
                return Unit.f186387a;
            case 2:
                su3.a document = (su3.a) obj2;
                Intrinsics.checkNotNullParameter(document, "document");
                hk0.a aVar = sVar.f303569q;
                String str = document.f265636b;
                if (str != null) {
                    return aVar.b(str, true, FileExtension.Pdf.f51406b);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 3:
                CreditApplicationDocumentViewerContract$Configuration creditApplicationDocumentViewerContract$Configuration = sVar.i;
                File file = (File) obj2;
                Intrinsics.checkNotNullParameter(file, "file");
                e eVar = sVar.f303566m;
                Uri uri2 = ((a80.h) sVar.f303570r).i(file);
                Intrinsics.checkNotNullParameter(file, "file");
                String strD = o80.c.d(file);
                List flags = v.k(1, 1073741824);
                if (!sVar.f303571s.a(strD, uri2, flags)) {
                    tqi.c message = new tqi.c(a0.d.r(creditApplicationDocumentViewerContract$Configuration.f67566b, ".pdf"), null, new tqi.b(a0.d.r(creditApplicationDocumentViewerContract$Configuration.f67566b, ".pdf"), lim.m.d(file)), null, LDSFile.EF_DG2_TAG);
                    t tVar = (t) eVar;
                    tVar.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    return tVar.f303573a.a(tVar.f303574b.h(message));
                }
                t tVar2 = (t) eVar;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter("android.intent.action.VIEW", "intentAction");
                Intrinsics.checkNotNullParameter(uri2, "uri");
                Intrinsics.checkNotNullParameter(flags, "flags");
                return tVar2.f303573a.a(new ActivityNavigateCommand(new FileOpenActivityDestination("android.intent.action.VIEW", uri2, strD, flags), null, null, null, 0, null, null, null, null, false, 1022));
            case 4:
                y94.b bVar = sVar.f303567n;
                Intrinsics.h((Boolean) obj2);
                bVar.getClass();
                return Unit.f186387a;
            case 5:
                String url2 = (String) obj2;
                Intrinsics.checkNotNullParameter(url2, "it");
                rz3.b bVar2 = sVar.f303572t;
                ln.a aVar2 = bVar2.f258501b;
                Intrinsics.checkNotNullParameter(url2, "url");
                if (!a0.H(url2, "revolut", false)) {
                    return (a0.H(url2, "https", false) || a0.H(url2, "http", false)) ? aVar2.a(new FeatureCommand(new WebViewFeatureConfig(url2, null, 0, false, true, true, 65438))) : aVar2.a(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, Uri.parse(url2), 14), null, null, null, 0, null, null, null, null, false, 1022));
                }
                if (url2.equals("revolut://app/credit/credit-registers")) {
                    t tVar3 = (t) bVar2.f258500a;
                    return tVar3.f303573a.a(tVar3.f303575c.b());
                }
                "Not supported url ".concat(url2);
                return pfm.m.f235744a;
            case 6:
                LargeActionButtonDelegate.Model it10 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                sVar.Q();
                return Unit.f186387a;
            case 7:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                d0 d0VarJ3 = sVar.f303564j.j3(sVar.i.f67566b);
                x8i.g gVar = new x8i.g(19, new l(sVar, i2));
                d0VarJ3.getClass();
                ufm.i iVar = new ufm.i(d0VarJ3, gVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                pfm.a aVar3 = new pfm.a(mo3.a.w(o70.a.i(iVar), sVar.o), new x8i.g(20, new l(sVar, 3)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return hx7.a.L(aVar3, sVar.f303568p, false, null, 24);
            case 8:
                ((iqi.b) sVar.k).setVisible(false);
                return Unit.f186387a;
            case 9:
                ((iqi.b) sVar.k).setVisible(false);
                return Unit.f186387a;
            case 10:
                su3.a doc2 = (su3.a) obj2;
                y94.b bVar3 = sVar.f303567n;
                Intrinsics.h(doc2);
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(doc2, "doc");
                ((iqi.b) bVar3.f311751j).setVisible(bVar3.f311750h.f67565a.f66360c != ju3.b.INVISIBLE);
                return Unit.f186387a;
            default:
                su3.a aVar4 = (su3.a) obj2;
                h hVar2 = (h) sVar.L();
                if (hVar2 != null) {
                    Intrinsics.h(aVar4);
                    String str2 = aVar4.f265635a;
                    bk0.e eVar2 = sVar.u;
                    CreditApplicationDocumentViewerContract$Configuration creditApplicationDocumentViewerContract$Configuration2 = sVar.i;
                    kj kjVar = new kj("id_web_view", creditApplicationDocumentViewerContract$Configuration2.f67565a.f66359b ? new mj(str2, r0.p(eVar2.a(str2), eVar2.e())) : new mj(str2, null), new cp0(true, (String) eVar2.f().f186386b, null, null, 124), Constants.TAG_FULL_SVPP_IDENTIFICATION);
                    int i3 = n.f303558b[creditApplicationDocumentViewerContract$Configuration2.f67565a.f.ordinal()];
                    if (i3 == 1) {
                        yp0.b.l(kjVar, 0, R$attr.uikit_dp48, 0, 0, null, false, 61);
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i5 = R$attr.uikit_dp0;
                        yp0.b.p(kjVar, i5, R$attr.uikit_dp48, i5, i5);
                    }
                    m70.a.c(t0.f186434a);
                    ((CreditApplicationDocumentViewerActivity) hVar2).setItems(v.k(kjVar, new TextDelegate.Model("id_anchor_item_id", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036)));
                }
                return Unit.f186387a;
        }
    }
}
