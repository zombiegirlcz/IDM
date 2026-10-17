package com.fourthline.orca.internal;

import com.fourthline.orca.internal.si;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vm implements xq0 {
    @Override // com.fourthline.orca.internal.xq0
    public kh0 a() {
        return si.c.f33020a;
    }

    @Override // com.fourthline.orca.internal.xq0
    public kh0 a(kh0 cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        si.g.a aVar = si.g.f33025c;
        String message = cause.getMessage();
        if (message == null) {
            message = "FL Developer error. Throwable message was not provided";
        }
        return si.g.a.a(aVar, message, null, 2, null);
    }
}
