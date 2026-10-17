package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes23.dex */
public abstract class dc implements e4m.e {
    public static zd a(bb bbVar, TimestampProvider timestampProvider) {
        zd zdVarProvideTimeoutConsumer$fourthline_vision_release = bbVar.provideTimeoutConsumer$fourthline_vision_release(timestampProvider);
        vc.s.k(zdVarProvideTimeoutConsumer$fourthline_vision_release);
        return zdVarProvideTimeoutConsumer$fourthline_vision_release;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
