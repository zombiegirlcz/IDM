package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f50084b;

    public /* synthetic */ a(Bitmap bitmap, int i) {
        this.f50083a = i;
        this.f50084b = bitmap;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.f50083a) {
            case 0:
                return CompressPoaDocumentUseCase.invoke$lambda$0(this.f50084b);
            default:
                Bitmap bitmap = this.f50084b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return Base64.encodeToString(byteArray, 2);
                } finally {
                }
        }
    }
}
