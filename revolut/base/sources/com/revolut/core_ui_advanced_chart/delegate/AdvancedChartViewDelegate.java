package com.revolut.core_ui_advanced_chart.delegate;

import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core_ui_advanced_chart.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ihm.f;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nkm.t;
import org.jetbrains.annotations.NotNull;
import rwg.e0;
import ryd.k;
import ryd.l;
import s01.c;
import s01.h;
import s01.j;
import t01.b;
import te0.w;
import u01.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0002\u0007\b\t\n\u0003\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core_ui_advanced_chart/delegate/AdvancedChartViewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Ls01/h;", "Ls01/j;", "<init>", "()V", "Companion", "s01/i", "s01/g", "s01/d", "s01/t", "a", "core_ui_advanced_chart_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdvancedChartViewDelegate extends BaseRecyclerViewDelegate<h, j> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f60098c;
    public final f d;
    public final Handler e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f60099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f60100h;
    public final c9i.b i;

    public static final class a {
        private a() {
        }
    }

    public AdvancedChartViewDelegate() {
        super(R$layout.advanced_chart_view, new l(16));
        this.d = v0.a.d("create(...)");
        this.e = new Handler(Looper.getMainLooper());
        this.f = w.y0(new e0(18));
        this.f60099g = w.y0(new e0(19));
        this.f60100h = v0.a.d("create(...)");
        this.i = new c9i.b(this, 9);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        j jVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = this.f98535a;
        try {
            jVar = new j(s.r(parent, i));
        } catch (InflateException e) {
            if (Build.VERSION.SDK_INT == 36) {
                Iterator it8 = t.g(e, new k(16)).iterator();
                while (it8.hasNext()) {
                    if (((Throwable) it8.next()) instanceof Resources.NotFoundException) {
                        jVar = new j(s.r(parent, i));
                    }
                }
            }
            throw e;
        }
        WebView webView = jVar.f258785g;
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setTextZoom(100);
        webView.addJavascriptInterface(new v(this.e, new s01.b(this, 1), new s01.a(this, 2), new s01.a(this, 3), new c(this, 0), new c(this, 1), new c(this, 2), new s01.a(this, 0), new s01.a(this, 1), new s01.b(this, 0)), "Android");
        webView.setWebViewClient(this.i);
        return jVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(s01.j r17, av1.c r18) {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core_ui_advanced_chart.delegate.AdvancedChartViewDelegate.p(s01.j, av1.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x034a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x034c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0368 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03a8 A[LOOP:1: B:254:0x03a2->B:256:0x03a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03cd A[LOOP:2: B:258:0x03c7->B:260:0x03cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x043b A[LOOP:3: B:278:0x0435->B:280:0x043b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(s01.j r41, s01.h r42, int r43, java.util.List r44) {
        /*
            Method dump skipped, instruction units count: 1219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core_ui_advanced_chart.delegate.AdvancedChartViewDelegate.p(s01.j, s01.h, int, java.util.List):void");
    }
}
