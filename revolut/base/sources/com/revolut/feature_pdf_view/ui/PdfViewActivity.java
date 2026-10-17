package com.revolut.feature_pdf_view.ui;

import android.os.Bundle;
import android.view.View;
import com.bumptech.glide.c;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_pdf_view.R$id;
import com.revolut.feature_pdf_view.R$layout;
import com.revolut.feature_pdf_view.ui.PdfViewActivity;
import com.revolut.feature_pdf_view.ui.PdfViewContract$Configuration;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import g9i.f;
import g9i.n;
import g9i.u;
import in0.h;
import jo0.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import no.d1;
import od0.i;
import org.jetbrains.annotations.NotNull;
import pri.e;
import vc.s;
import yhm.d;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/feature_pdf_view/ui/PdfViewActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lg9i/e;", "Lg9i/f;", "Lin0/g;", "Lno/d1;", "Ldri/a;", "Lin0/h;", "<init>", "()V", "Companion", "a", "feature_pdf_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class PdfViewActivity extends BaseDelegatesActivity implements f, d1, dri.a, h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f97446x0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lazy f97447r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public e9i.d f97448s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final j90.a f97449t0 = u1.w(this, R$id.toolbar);
    public final j90.a u0 = u1.w(this, R$id.root);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public n f97450v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Lazy f97451w0;

    /* JADX INFO: renamed from: com.revolut.feature_pdf_view.ui.PdfViewActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        h0 h0Var = new h0(PdfViewActivity.class, "toolbar", "getToolbar()Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar;", 0);
        p0 p0Var = o0.f186429a;
        f97446x0 = new KProperty[]{p0Var.j(h0Var), p.a.y(PdfViewActivity.class, "root", "getRoot()Landroid/view/View;", 0, p0Var)};
        INSTANCE = new Companion();
    }

    public PdfViewActivity() {
        final int i = 0;
        this.f97447r0 = j.b(new Function0(this) { // from class: g9i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PdfViewActivity f141882b;

            {
                this.f141882b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PdfViewActivity pdfViewActivity = this.f141882b;
                switch (i2) {
                    case 0:
                        PdfViewActivity.Companion companion = PdfViewActivity.INSTANCE;
                        return ((PdfViewContract$Configuration) pdfViewActivity.G0()).d;
                    default:
                        PdfViewActivity.Companion companion2 = PdfViewActivity.INSTANCE;
                        return (PdfViewContract$Configuration) pdfViewActivity.G0();
                }
            }
        });
        final int i2 = 1;
        this.f97451w0 = j.b(new Function0(this) { // from class: g9i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PdfViewActivity f141882b;

            {
                this.f141882b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PdfViewActivity pdfViewActivity = this.f141882b;
                switch (i22) {
                    case 0:
                        PdfViewActivity.Companion companion = PdfViewActivity.INSTANCE;
                        return ((PdfViewContract$Configuration) pdfViewActivity.G0()).d;
                    default:
                        PdfViewActivity.Companion companion2 = PdfViewActivity.INSTANCE;
                        return (PdfViewContract$Configuration) pdfViewActivity.G0();
                }
            }
        });
    }

    @Override // in0.h
    public final boolean C0() {
        return true;
    }

    @Override // dri.a
    public final boolean D0() {
        return Z0().f97454c;
    }

    @Override // nri.b
    public final e F0() {
        e9i.d dVar = this.f97448s0;
        if (dVar != null) {
            return (g9i.e) dVar.f124019p.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF82699s0() {
        return (String) this.f97447r0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        e9i.d dVar = this.f97448s0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    public final PdfViewContract$Configuration Z0() {
        return (PdfViewContract$Configuration) this.f97451w0.getValue();
    }

    public final n b1() {
        n nVar = this.f97450v0;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.r("state");
        throw null;
    }

    public final BasicNavBar c1() {
        return (BasicNavBar) this.f97449t0.getValue(this, f97446x0[0]);
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        e9i.e eVar = ((e9i.e) c.l(this).b(null, getF82699s0())).d;
        this.f97448s0 = new e9i.d(eVar, rd0.e.g(this, bundle, Integer.valueOf(com.revolut.retail.common.ui.R$id.fragment_container)));
        s.j(eVar.f124020a.o());
        this.f97450v0 = (n) eVar.f124023g.get();
        ((u) b1()).y0().set(Z0().f97452a);
        ((u) b1()).z0().set(Boolean.valueOf(Z0().f97454c));
        u uVar = (u) b1();
        te0.j jVar = uVar.f;
        KProperty[] kPropertyArr = u.f141900l;
        jVar.getValue(uVar, kPropertyArr[4]).set(Boolean.valueOf(Z0().e));
        u uVar2 = (u) b1();
        uVar2.f141903g.getValue(uVar2, kPropertyArr[5]).set(Z0().f);
        AnalyticsProduct analyticsProduct = Z0().f97455g;
        if (analyticsProduct != null) {
            u uVar3 = (u) b1();
            uVar3.f141904h.getValue(uVar3, kPropertyArr[6]).set(analyticsProduct);
        }
        AnalyticsContext analyticsContext = Z0().f97456h;
        if (analyticsContext != null) {
            w0 w0Var = analyticsContext.f50296a;
            te0.e eVarW0 = ((u) b1()).w0();
            od0.h hVar = i.Companion;
            AnalyticsContext analyticsContext2 = new AnalyticsContext(w0Var);
            hVar.getClass();
            eVarW0.set(od0.h.a(analyticsContext2));
        }
        Clause clause = Z0().f97453b;
        if (clause != null) {
            u uVar4 = (u) b1();
            uVar4.f141905j.getValue(uVar4, kPropertyArr[8]).set(clause);
        }
        super.onCreate(bundle);
        setContentView(R$layout.activity_pdf_view);
        Clause clause2 = Z0().f97453b;
        if (clause2 != null) {
            c1().setTitle(clause2);
        }
        c1().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        ((View) this.u0.getValue(this, f97446x0[1])).setFitsSystemWindows(true ^ ((Boolean) g.f176835s.getValue()).booleanValue());
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return Z0().i;
    }
}
