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
public final class nm implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jq0 f31450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe1 f31451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f31452c;
    private final boolean d;
    private final er e;
    private final Lazy f;

    public nm(jq0 analytics, fe1 viewNavigator, v10 imageServiceLocator, boolean z) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f31450a = analytics;
        this.f31451b = viewNavigator;
        this.f31452c = imageServiceLocator;
        this.d = z;
        this.e = er.e.f28238a;
        this.f = yhm.j.b(new ko1(this, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(nm nmVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(nmVar.f31452c.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_document_type_not_supported_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_change_document, 0, 2, null)), nmVar.d ? new kd1.n(c81.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)) : null, false, 16, null);
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
        this.f31450a.track(new jq0.a.C0230a(b()));
        this.f31451b.b(new xf.e(b()));
    }
}
