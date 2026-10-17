package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.jq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.xf;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ml0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jq0 f31215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe1 f31216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f31217c;
    private final er d;
    private final Lazy e;

    public ml0(Function0 minPersonAgeFactory, jq0 analytics, fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(minPersonAgeFactory, "minPersonAgeFactory");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f31215a = analytics;
        this.f31216b = viewNavigator;
        this.f31217c = imageServiceLocator;
        this.d = er.j.f28248a;
        this.e = yhm.j.b(new vp1(minPersonAgeFactory, this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(Function0 function0, ml0 ml0Var) {
        return new zp0.e(ml0Var.f31217c.a(r10.D0), c81.f27404a.a(R.string.shared_dialog_error_underage_title, String.valueOf(((Number) function0.invoke()).intValue())), new kd1.f(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public er b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.e.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f31215a.track(new jq0.a.C0230a(b()));
        this.f31216b.b(new xf.c(b()));
    }
}
