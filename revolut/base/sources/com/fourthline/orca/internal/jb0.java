package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class jb0 {
    public static final ib0 a(String baseUrl, mb.d networkEnvironment) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        return i70.a(new x40(baseUrl, networkEnvironment));
    }
}
