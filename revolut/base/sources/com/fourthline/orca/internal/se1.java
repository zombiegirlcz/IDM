package com.fourthline.orca.internal;

import com.fourthline.orca.internal.re1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class se1 {
    public static final re1 a(Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        if (th10 instanceof re1) {
            return (re1) th10;
        }
        if (th10 instanceof ea0) {
            return re1.a.f32703a;
        }
        String message = th10.getMessage();
        if (message == null) {
            message = "Can't find a message in `Throwable.toWorkerError`";
        }
        return new re1.b(message);
    }
}
