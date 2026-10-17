package com.fourthline.orca.internal;

import com.fourthline.orca.internal.q80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ff1 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f28490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c80 f28491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q80 f28492c;

    public ff1(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        this.f28490a = navigationChannel;
        this.f28491b = new c80("workflow_loading");
        this.f28492c = q80.z.a.f32350b;
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f28491b;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof vf1) {
            return new q80.k(null, ly.a(((vf1) navigationEffect).c()), 1, null);
        }
        if (navigationEffect instanceof uf1) {
            return new q80.l(((uf1) navigationEffect).c());
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.f28492c;
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(qf1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f28490a.mo3647trySendJP2dKIU(a((ee1) navigationEffect));
    }
}
