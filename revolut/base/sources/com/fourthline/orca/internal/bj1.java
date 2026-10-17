package com.fourthline.orca.internal;

import android.net.Uri;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bj1 implements ActivityResultCallback, ulm.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27142b;

    public /* synthetic */ bj1(Object obj2, int i) {
        this.f27141a = i;
        this.f27142b = obj2;
    }

    @Override // ulm.l0
    public ulm.m0 a(ylm.q qVar) {
        return jg0.a((jg0) this.f27142b, (Call) qVar);
    }

    @Override // androidx.view.result.ActivityResultCallback
    public void onActivityResult(Object obj2) {
        switch (this.f27141a) {
            case 0:
                af.a((af) this.f27142b, (Uri) obj2);
                break;
            default:
                j8.a((Function0) this.f27142b, (ActivityResult) obj2);
                break;
        }
    }
}
