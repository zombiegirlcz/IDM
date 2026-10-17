package j7a;

import android.view.View;
import android.webkit.WebView;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oma.r;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f171880b;

    public /* synthetic */ h(k kVar, int i) {
        this.f171879a = i;
        this.f171880b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f171879a) {
            case 0:
                c model = (c) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                if (!(model instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                h7a.b bVar = this.f171880b.f171885j;
                b bVar2 = (b) model;
                String htmlDocument = bVar2.f171877a;
                String documentFileName = bVar2.f171878b;
                h7a.d dVar = (h7a.d) bVar;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(htmlDocument, "htmlDocument");
                Intrinsics.checkNotNullParameter(documentFileName, "documentFileName");
                if (!Intrinsics.f(htmlDocument, dVar.f149868l) || !documentFileName.equals(dVar.f149869m)) {
                    dVar.f149868l = htmlDocument;
                    dVar.f149869m = documentFileName;
                    dVar.f149870n = false;
                    View viewFindViewById = dVar.i.findViewById(dVar.f149866h.f149864a);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                    WebView webView = (WebView) viewFindViewById;
                    dVar.o = webView;
                    if (webView == null) {
                        Intrinsics.r("webView");
                        throw null;
                    }
                    webView.setWebViewClient(new ay8.a(dVar, documentFileName, 1));
                }
                WebView webView2 = dVar.o;
                if (webView2 != null) {
                    webView2.loadDataWithBaseURL(null, htmlDocument, "text/HTML", "UTF-8", null);
                    return Unit.f186387a;
                }
                Intrinsics.r("webView");
                throw null;
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f171880b.k.c(new FinishCommand(0, null, null, 6));
                gom.e.f145194a.e(it8);
                return Unit.f186387a;
            case 2:
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                ooa.d dVar2 = (ooa.d) this.f171880b.f171884h;
                dVar2.getClass();
                pfm.h hVar = new pfm.h(new r(dVar2, 1), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            default:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                k kVar = this.f171880b;
                d dVar3 = kVar.f171884h;
                m mVar = kVar.k;
                ooa.b bVar3 = (ooa.b) ((ooa.d) dVar3).f227022c;
                if (((Boolean) bVar3.f227016b.getValue(bVar3, ooa.b.d[0]).get()).booleanValue()) {
                    mVar.c(new FinishCommand(-1, null, null, 6));
                } else {
                    mVar.c(new FinishCommand(0, null, null, 6));
                }
                return Unit.f186387a;
        }
    }
}
