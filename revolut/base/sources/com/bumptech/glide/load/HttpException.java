package com.bumptech.glide.load;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class HttpException extends IOException {
    public HttpException(String str, int i, IOException iOException) {
        super(a.k(i, str, ", status code: "), iOException);
    }
}
