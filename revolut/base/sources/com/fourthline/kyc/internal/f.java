package com.fourthline.kyc.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class f {
    public static final e a(String root, Function1 init) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(init, "init");
        e eVar = new e(root);
        init.invoke(eVar);
        return eVar;
    }
}
