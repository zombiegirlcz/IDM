package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ps implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f32032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kh0 f32033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f32034c;

    public ps(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f32032a = imageServiceLocator;
        this.f32033b = new re1.b("");
        this.f32034c = yhm.j.b(new ko1(this, 23));
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void a(hq0.c cVar) {
        super.a(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f32034c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(ps psVar) {
        return new zp0.e(psVar.f32032a.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new kd1.f(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.f32033b;
    }
}
