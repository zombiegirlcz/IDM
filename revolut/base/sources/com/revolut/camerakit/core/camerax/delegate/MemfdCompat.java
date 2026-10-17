package com.revolut.camerakit.core.camerax.delegate;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/camerakit/core/camerax/delegate/MemfdCompat;", "", "<init>", "()V", "", "name", "", "flags", "nativeMemfdCreate", "(Ljava/lang/String;I)I", "camera_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MemfdCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MemfdCompat f50735a = new MemfdCompat();

    static {
        System.loadLibrary("camerakit_memfd_compat");
    }

    private MemfdCompat() {
    }

    public final native int nativeMemfdCreate(@NotNull String name, int flags);
}
