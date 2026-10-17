package com.revolut.core.ui_kit.effect.particles;

import a0.d;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/effect/particles/ParticlesEglException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ParticlesEglException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55804a;

    public ParticlesEglException(int i, boolean z) {
        super(d.n("Unable to swap particle EGL buffers: ", i));
        this.f55804a = z;
    }
}
