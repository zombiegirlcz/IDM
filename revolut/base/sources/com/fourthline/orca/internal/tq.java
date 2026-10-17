package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.mq;
import com.fourthline.orca.internal.oq;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class tq implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f33829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe1 f33830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qg0 f33831c;
    private final v10 d;
    private final hq0 e;
    private final Lazy f;

    public tq(Function0 unsupportedDocuments, fe1 viewNavigator, qg0 analytics, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(unsupportedDocuments, "unsupportedDocuments");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f33829a = unsupportedDocuments;
        this.f33830b = viewNavigator;
        this.f33831c = analytics;
        this.d = imageServiceLocator;
        this.e = qq.f32508a;
        this.f = yhm.j.b(new xr1(this, 9));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f33831c.track(new mq.a.b((List) this.f33829a.invoke()));
        this.f33830b.b(new oq.b(KycError.DocumentTypeNotSupported.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(tq tqVar) {
        return new zp0.e(tqVar.d.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_exit, 0, 2, null), new kd1.f(null, 1, null), new kd1.a(null, 1, null), false, 16, null);
    }
}
