package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.orca.internal.eh0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ja {
    public final p71 a(Function0 resourcesFactory) {
        Intrinsics.checkNotNullParameter(resourcesFactory, "resourcesFactory");
        return new ej0(resourcesFactory);
    }

    public final ce1 b(Function0 resourcesFactory) {
        Intrinsics.checkNotNullParameter(resourcesFactory, "resourcesFactory");
        return new de1(resourcesFactory);
    }

    public final eh0 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        eh0.a aVar = eh0.f28134b;
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        return aVar.a(assets);
    }

    public final g8 a(ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        return new g8(contentResolver);
    }

    public final qx a(Context context, ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        return new qx(context, contentResolver);
    }

    public final DeviceMetadata a() {
        return new DeviceMetadata(null, null, null, null, null, null, null, false, 255, null);
    }
}
