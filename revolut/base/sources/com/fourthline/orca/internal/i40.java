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
public final class i40 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jq0 f29486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe1 f29487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg f29488c;
    private final v10 d;
    private final er e;
    private final Lazy f;

    public i40(jq0 analytics, fe1 viewNavigator, bg documentAnalysisDataBundle, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f29486a = analytics;
        this.f29487b = viewNavigator;
        this.f29488c = documentAnalysisDataBundle;
        this.d = imageServiceLocator;
        this.e = er.h.f28244a;
        this.f = yhm.j.b(new ul1(this, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(i40 i40Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(i40Var.d.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_document_country_and_type_not_detected, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_choose_manually, 0, 2, null)), null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public er b() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.f.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f29486a.track(new jq0.a.C0230a(b()));
        bg bgVar = this.f29488c;
        gj gjVar = bgVar instanceof gj ? (gj) bgVar : null;
        if (gjVar != null) {
            gjVar.a((fd) null);
            gjVar.a((di) null);
        }
        this.f29487b.b(new xf.b(b()));
    }
}
