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
public final class nl implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jq0 f31441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe1 f31442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f31443c;
    private final boolean d;
    private final er e;
    private final Lazy f;

    public nl(jq0 analytics, fe1 viewNavigator, v10 imageServiceLocator, boolean z) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f31441a = analytics;
        this.f31442b = viewNavigator;
        this.f31443c = imageServiceLocator;
        this.d = z;
        this.e = er.d.f28236a;
        this.f = yhm.j.b(new ko1(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(nl nlVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(nlVar.f31443c.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_different_scanned_document_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_change_document, 0, 2, null)), nlVar.d ? new kd1.n(c81.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)) : null, false, 16, null);
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
    public void b(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f31441a.track(new jq0.a.C0230a(b()));
        this.f31442b.b(new xf.e(b()));
    }
}
