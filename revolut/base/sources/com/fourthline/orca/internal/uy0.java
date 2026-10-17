package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class uy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ty0 f34221a;

    public uy0(ty0 remoteAssetsConfig) {
        Intrinsics.checkNotNullParameter(remoteAssetsConfig, "remoteAssetsConfig");
        this.f34221a = remoteAssetsConfig;
    }

    public final v10 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f34221a.getEnabled() ? new w10(ContextExtensionsKt.getAssetsFourthlineDirectory(context)) : new x10();
    }

    public final l70 b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f34221a.getEnabled() ? new m70(ContextExtensionsKt.getAssetsFourthlineDirectory(context)) : new n70();
    }

    public final mf0 c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f34221a.getEnabled() ? new nf0(context, new ud1(new sd1(ContextExtensionsKt.getAssetsFourthlineDirectory(context)))) : new of0(context);
    }
}
