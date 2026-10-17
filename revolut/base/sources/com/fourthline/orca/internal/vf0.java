package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hd0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vf0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f34350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id0 f34351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hd0.d f34352c;

    public vf0(v10 imageServiceLocator, id0 skippableProvider) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(skippableProvider, "skippableProvider");
        this.f34350a = imageServiceLocator;
        this.f34351b = skippableProvider;
        this.f34352c = hd0.d.a.a(hd0.d.f29229c, "not_set", null, 2, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void a(hq0.c cVar) {
        super.a(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public hd0.d b() {
        return this.f34352c;
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        c81.a aVar = c81.f27404a;
        return new zp0.e(this.f34350a.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_nfc_timeout_title, 0, 2, null), new kd1.k(null, 1, null), this.f34351b.a(b()) ? new kd1.n(c81.a.a(aVar, R.string.shared_button_skip_nfc, 0, 2, null)) : null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }
}
