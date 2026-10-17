package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ap0;
import ip0.bp0;
import ip0.cp0;
import ip0.dp0;
import ip0.fg0;
import ip0.qn0;
import ip0.xo0;
import ip0.zo0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0002\u0006\u0007\u0003\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WebViewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/kj;", "Lip0/bp0;", "<init>", "()V", "a", "ip0/zo0", "ip0/cp0", "ip0/ap0", "ip0/yo0", "ip0/xo0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebViewDelegate extends BaseRecyclerViewDelegate<kj, bp0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f53637c;
    public final ihm.b d;
    public final ihm.b e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f53638g;

    public static abstract class a {
        private a() {
        }
    }

    public WebViewDelegate() {
        super(R$layout.internal_delegate_web_view, new qn0(8));
        this.f53637c = j6.a.h("create(...)");
        this.d = j6.a.h("create(...)");
        this.e = j6.a.h("create(...)");
        this.f = v0.a.d("create(...)");
        this.f53638g = v0.a.d("create(...)");
    }

    public static void p(WebView webView, a aVar) {
        if (!(aVar instanceof mj)) {
            if (!(aVar instanceof lj)) {
                throw new NoWhenBranchMatchedException();
            }
            lj ljVar = (lj) aVar;
            webView.loadDataWithBaseURL(null, ljVar.f54447a, "text/html", ljVar.f54448b, null);
            return;
        }
        mj mjVar = (mj) aVar;
        String str = mjVar.f54487a;
        Map<String, String> map = mjVar.f54488b;
        if (map == null) {
            webView.loadUrl(str);
        } else {
            webView.loadUrl(str, map);
        }
    }

    public static void s(xo0 xo0Var, bp0 bp0Var) {
        int i;
        int i2 = dp0.f163936a[xo0Var.ordinal()];
        if (i2 == 1) {
            i = -1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = -2;
        }
        FrameLayout frameLayout = bp0Var.f;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "<get-webContainer>(...)");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i;
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new bp0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_web_view));
    }

    public final efm.r q() {
        efm.r rVarDistinctUntilChanged = this.d.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged2 = rVarDistinctUntilChanged.filter(new fg0(new ip0.za(27), 21)).map(new fg0(new ip0.za(28), 22)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged2;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(bp0 holder, kj data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        WebView webView = holder.f163653g;
        WebSettings settings = webView.getSettings();
        cp0 cp0Var = data.f54400c;
        a aVar = data.f54399b;
        settings.setJavaScriptEnabled(cp0Var.f163772a);
        WebSettings settings2 = webView.getSettings();
        cp0 cp0Var2 = data.f54400c;
        boolean z = cp0Var2.d;
        ap0 ap0Var = cp0Var2.f163775g;
        xo0 xo0Var = cp0Var2.f;
        settings2.setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(cp0Var2.f163774c);
        webView.getSettings().setDomStorageEnabled(cp0Var2.e);
        String str = cp0Var2.f163773b;
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
        webView.setWebChromeClient(new cam.r(this, 1));
        webView.setWebViewClient(new c9i.b(this, 2));
        if (payloads.isEmpty()) {
            s(xo0Var, holder);
            p(webView, aVar);
            webView.setLayerType(ap0Var.a(), null);
        } else {
            List list = payloads;
            ArrayList<zo0> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.WebViewDelegate.Payload");
                arrayList.add((zo0) obj2);
            }
            for (zo0 zo0Var : arrayList) {
                if (zo0Var.f167526b) {
                    s(xo0Var, holder);
                }
                if (zo0Var.f167525a) {
                    p(webView, aVar);
                }
                if (zo0Var.f167527c) {
                    webView.setLayerType(ap0Var.a(), null);
                }
            }
        }
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        webView.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context));
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 24);
    }
}
