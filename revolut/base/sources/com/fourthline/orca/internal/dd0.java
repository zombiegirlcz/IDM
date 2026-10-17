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
public final class dd0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f27708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id0 f27709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hd0.a f27710c;

    public dd0(v10 imageServiceLocator, id0 skippableProvider) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(skippableProvider, "skippableProvider");
        this.f27708a = imageServiceLocator;
        this.f27709b = skippableProvider;
        this.f27710c = hd0.a.f29223a;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void a(hq0.c cVar) {
        super.a(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public hd0.a b() {
        return this.f27710c;
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        c81.a aVar = c81.f27404a;
        return new zp0.e(this.f27708a.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_nfc_connection_lost_title, 0, 2, null), new kd1.k(null, 1, null), this.f27709b.a(b()) ? new kd1.n(c81.a.a(aVar, R.string.shared_button_skip_nfc, 0, 2, null)) : null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }
}
