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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h80 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jq0 f29175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe1 f29176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29177c;
    private final v10 d;
    private final er e;
    private final Lazy f;

    public h80(jq0 analytics, fe1 viewNavigator, boolean z, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f29175a = analytics;
        this.f29176b = viewNavigator;
        this.f29177c = z;
        this.d = imageServiceLocator;
        this.e = er.i.f28246a;
        this.f = yhm.j.b(new ul1(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(h80 h80Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(h80Var.d.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_document_nationality_not_supported_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_change_document, 0, 2, null)), h80Var.f29177c ? new kd1.f(null, 1, null) : null, false, 16, null);
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
        if (this.f29177c) {
            this.f29175a.track(new jq0.a.b(b()));
            this.f29176b.b(new xf.c(b()));
        }
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f29175a.track(new jq0.a.C0230a(b()));
        this.f29176b.b(new xf.e(b()));
    }

    public /* synthetic */ h80(jq0 jq0Var, fe1 fe1Var, boolean z, v10 v10Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jq0Var, fe1Var, (i & 4) != 0 ? false : z, v10Var);
    }
}
