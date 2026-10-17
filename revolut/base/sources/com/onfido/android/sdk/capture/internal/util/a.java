package com.onfido.android.sdk.capture.internal.util;

import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.play.core.splitinstall.SplitInstallException;
import kfm.c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements FragmentResultListener, OnFailureListener, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f49974a;

    public /* synthetic */ a(Function2 function2) {
        this.f49974a = function2;
    }

    @Override // kfm.c
    public Object apply(Object _a, Object _b) {
        Intrinsics.checkNotNullParameter(_a, "_a");
        Intrinsics.checkNotNullParameter(_b, "_b");
        return this.f49974a.invoke(_a, _b);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        SplitInstallException splitInstallException = exception instanceof SplitInstallException ? (SplitInstallException) exception : null;
        this.f49974a.invoke(exception, splitInstallException != null ? c8g.a.B(splitInstallException.a()) : null);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        this.f49974a.invoke(str, bundle);
    }
}
