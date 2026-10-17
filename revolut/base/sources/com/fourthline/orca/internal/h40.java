package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.jq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.xf;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h40 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jq0 f29134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe1 f29135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg f29136c;
    private final v10 d;
    private final boolean e;
    private final er f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f29137g;

    public h40(jq0 analytics, fe1 viewNavigator, bg documentAnalysisDataBundle, v10 imageServiceLocator, boolean z) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f29134a = analytics;
        this.f29135b = viewNavigator;
        this.f29136c = documentAnalysisDataBundle;
        this.d = imageServiceLocator;
        this.e = z;
        this.f = er.g.f28242a;
        this.f29137g = yhm.j.b(new ul1(this, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(h40 h40Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(h40Var.d.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_unsupported_issuing_country_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_change_issuing_country, 0, 2, null)), h40Var.e ? new kd1.n(c81.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)) : null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public er b() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.f29137g.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f29134a.track(new jq0.a.C0230a(b()));
        this.f29135b.b(new xf.b(b()));
    }
}
