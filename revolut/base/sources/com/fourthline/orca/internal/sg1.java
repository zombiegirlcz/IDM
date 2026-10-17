package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cf1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sg1 implements xq0 {
    @Override // com.fourthline.orca.internal.xq0
    public kh0 a() {
        return cf1.a.d;
    }

    @Override // com.fourthline.orca.internal.xq0
    public kh0 a(kh0 cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        cf1.h.a aVar = cf1.h.f;
        String message = cause.getMessage();
        if (message == null) {
            message = "FL Developer error. Throwable message was not provided";
        }
        return cf1.h.a.a(aVar, message, null, 2, null);
    }
}
