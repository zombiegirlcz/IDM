package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes23.dex */
public abstract class l1 implements e4m.e {
    public static TimestampProvider a(s0 s0Var) {
        TimestampProvider timestampProviderProvideTimestampProvider = s0Var.provideTimestampProvider();
        vc.s.k(timestampProviderProvideTimestampProvider);
        return timestampProviderProvideTimestampProvider;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
