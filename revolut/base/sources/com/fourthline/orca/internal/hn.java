package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.dn;
import com.fourthline.orca.internal.kd1;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hn implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dn f29340a;

    public hn(p70 documentReadyLottieSource, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(documentReadyLottieSource, "documentReadyLottieSource");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        c81.a aVar = c81.f27404a;
        this.f29340a = new dn(documentReadyLottieSource, c81.a.a(aVar, R.string.step_document_ready_header, 0, 2, null), c81.a.a(aVar, R.string.step_document_ready_title, 0, 2, null), c81.a.a(aVar, R.string.step_document_ready_message, 0, 2, null), new kd1.d(null, 1, null), new kd1.a(c81.a.a(aVar, R.string.shared_button_back, 0, 2, null)), zhm.v.k(new dn.a(imageServiceLocator.a(r10.T0), c81.a.a(aVar, R.string.shared_dialog_action_ready_document_hint1, 0, 2, null)), new dn.a(imageServiceLocator.a(r10.U0), c81.a.a(aVar, R.string.shared_dialog_action_ready_document_hint2, 0, 2, null)), new dn.a(imageServiceLocator.a(r10.V0), c81.a.a(aVar, R.string.shared_dialog_action_ready_document_hint3, 0, 2, null))));
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public dn getInitialState() {
        return this.f29340a;
    }
}
