package com.fourthline.orca.internal;

import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.z11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a3 implements oy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c80 f26686a = new c80("biometrics");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p80 f26687b = new p80(true, true, false, new sp0(new q80.w.b(null, 1, null), true, false, 4, null), 4, null);

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f26686a;
    }

    public abstract q80 a(z11.a aVar);

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return new q80.w.b(this.f26687b);
    }

    public final q80 c() {
        return new q80.w.b(this.f26687b);
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof z11.a) {
            return a((z11.a) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
