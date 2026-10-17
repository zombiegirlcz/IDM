package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission;

import hx7.i;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f50088b;

    public /* synthetic */ c(File file, int i) {
        this.f50087a = i;
        this.f50088b = file;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f50087a) {
        }
        return i.b0(this.f50088b);
    }
}
