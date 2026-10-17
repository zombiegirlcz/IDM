package com.fourthline.vision.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class v9 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37002a;

    public v9(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37002a = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    @Override // com.fourthline.vision.internal.d2
    public /* bridge */ void subscribe(Function2<? super Boolean, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super.subscribe(function2);
    }

    @Override // com.fourthline.vision.internal.d2
    @NotNull
    public Boolean get() {
        return Boolean.valueOf(this.f37002a);
    }
}
