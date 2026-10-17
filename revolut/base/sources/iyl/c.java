package iyl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import aw0.d0;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import gyl.i;
import hyl.l;
import hyl.m;
import hyl.o;
import ip0.yc0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import qlm.v1;
import r10.w;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends UIKitFrameLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f169785s = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f169786h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f169787j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f169788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f169789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f169790n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f169791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f169792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WebView f169793r;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c(hyl.f command) throws IOException {
        String strP;
        w wVar = this.i;
        Json json = (Json) wVar.f250866b;
        Intrinsics.checkNotNullParameter(command, "command");
        if (command instanceof hyl.b) {
            m mVar = ((hyl.b) command).f156907a;
            l lVar = mVar.f156917a;
            List list = mVar.f156918b;
            List list2 = mVar.f156919c;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(wVar.w((o) it8.next()));
            }
            strP = t.e("\n            window.onCountrySelected(\n                function(countryCode) {\n                    window.Android.onCountrySelected(countryCode);\n                }\n            );\n            try {\n                window.onMarkerLabelSelected(\n                    function(labelData) {\n                        window.Android.onMarkerLabelSelected(JSON.stringify(labelData));\n                    }\n            );\n            } catch (error) {\n            }\n            try {\n                window.onGlobeError(\n                    function(error, context) {\n                        window.Android.onErrorCaught(error, context);\n                    }\n                );\n            } catch (error) {\n            }\n            window.load(\n                " + json.c(gyl.c.Companion.serializer(), new gyl.c(lVar, list, arrayList, mVar.d, mVar.e)) + ",\n                function(success) {\n                    if (success) {\n                        window.Android.onGlobeReady(true);\n                    } else {\n                        window.Android.onGlobeReady(false);\n                    }\n                }\n            );\n        ");
        } else if (command instanceof hyl.c) {
            List list3 = ((hyl.c) command).f156908a;
            json.getClass();
            strP = p.a.p("window.setActiveCountries(", json.c(new qlm.e(v1.f247718a), list3), ")");
        } else if (command instanceof hyl.e) {
            List list4 = ((hyl.e) command).f156910a;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                arrayList2.add(wVar.w((o) it9.next()));
            }
            json.getClass();
            strP = p.a.p("window.setMarkers(", json.c(new qlm.e(i.Companion.serializer()), arrayList2), ")");
        } else {
            if (!(command instanceof hyl.d)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((hyl.d) command).f156909a;
            json.getClass();
            strP = p.a.p("window.setFocusedCountry(", json.c(v1.f247718a, str), ")");
        }
        this.f169793r.evaluateJavascript(strP, null);
    }

    public final void d() {
        d dVar = this.f169787j;
        if (dVar == null) {
            return;
        }
        String str = dVar.e;
        List list = dVar.d;
        List list2 = dVar.f169796c;
        if (this.o && !this.f169791p) {
            m mVar = dVar.f169795b;
            this.f169791p = true;
            this.f169789m = mVar.f156918b;
            this.f169790n = mVar.f156919c;
            this.f169788l = mVar.d;
            c(new hyl.b(mVar));
        }
        if (this.f169792q) {
            if (!Intrinsics.f(list2, this.f169789m)) {
                this.f169789m = list2;
                c(new hyl.c(list2));
            }
            if (!Intrinsics.f(list, this.f169790n)) {
                this.f169790n = list;
                c(new hyl.e(list));
            }
            if (str == null || str.equals(this.f169788l)) {
                return;
            }
            this.f169788l = str;
            c(new hyl.d(str));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f169793r.onResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f169793r.onPause();
    }

    public final void setModel(@NotNull d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f169787j, model)) {
            return;
        }
        this.f169787j = model;
        String str = model.f169794a;
        if (str == null || str.equals(this.k)) {
            d();
            return;
        }
        this.k = str;
        this.o = false;
        this.f169791p = false;
        this.f169792q = false;
        this.f169789m = null;
        this.f169790n = null;
        this.f169788l = null;
        this.f169793r.loadUrl(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Handler handler = new Handler(Looper.getMainLooper());
        this.f169786h = v0.a.d("create(...)");
        this.i = new w(context, 18);
        WebView webView = new WebView(context);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f169793r = webView;
        setAspectRatio(new nt0.c(new d0(100, 85), ut0.a.ADJUST_HEIGHT, Integer.MAX_VALUE));
        addView(webView);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setCacheMode(-1);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new hyl.h(handler, new yc0(1, this, c.class, "onGlobeLoaded", "onGlobeLoaded(Z)V", 0, 4), new iyl.a(this, 0), new iyl.a(webView, this), new in1.a(this, 23)), "Android");
        webView.setWebViewClient(new hyl.t(new iyl.a(this, 2)));
        webView.setOnTouchListener(new b(webView, 0));
        webView.setBackgroundColor(0);
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
