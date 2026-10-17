package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class mm implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f31220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final er.c f31221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f31222c;

    public mm(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f31220a = imageServiceLocator;
        this.f31221b = er.c.f28234a;
        this.f31222c = yhm.j.b(new ko1(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(mm mmVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(mmVar.f31220a.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_no_document_details_detected_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_retake, 0, 2, null)), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public er.c b() {
        return this.f31221b;
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.f31222c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        popupType.d().invoke();
    }
}
