package com.fourthline.orca.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vy0 {
    public final uy0 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new uy0(mainRepository.f().getTenant().getRemoteAssets());
    }

    public final l70 b(Context context, uy0 remoteAssetsFeature) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteAssetsFeature, "remoteAssetsFeature");
        return remoteAssetsFeature.b(context);
    }

    public final mf0 c(Context context, uy0 remoteAssetsFeature) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteAssetsFeature, "remoteAssetsFeature");
        return remoteAssetsFeature.c(context);
    }

    public final v10 a(Context context, uy0 remoteAssetsFeature) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteAssetsFeature, "remoteAssetsFeature");
        return remoteAssetsFeature.a(context);
    }
}
