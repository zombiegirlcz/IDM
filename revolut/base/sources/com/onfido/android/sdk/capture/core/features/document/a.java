package com.onfido.android.sdk.capture.core.features.document;

import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;
import androidx.view.result.ActivityResultCallback;
import com.onfido.android.sdk.capture.core.config.Flow;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements ActivityResultCallback, FragmentResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DocumentCaptureFlowFragment f49904a;

    public /* synthetic */ a(DocumentCaptureFlowFragment documentCaptureFlowFragment) {
        this.f49904a = documentCaptureFlowFragment;
    }

    @Override // androidx.view.result.ActivityResultCallback
    public void onActivityResult(Object obj2) {
        DocumentCaptureFlowFragment.onfidoLauncher$lambda$0(this.f49904a, (Flow.Result) obj2);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        DocumentCaptureFlowFragment.onCreate$lambda$1(this.f49904a, str, bundle);
    }
}
