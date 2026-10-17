package com.trustdockekyc.core.backend;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.startup.Initializer;
import elm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import u07.b;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/trustdockekyc/core/backend/SdkInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SdkInitializer implements Initializer<Unit> {
    @Override // androidx.startup.Initializer
    public final Unit create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(ProcessLifecycleOwner.INSTANCE.get());
        p0 p0Var = p0.f264001a;
        e0.C(lifecycleScope, f.f127540b, null, new b(context, null, 3), 2);
        return Unit.f186387a;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return f0.f322471a;
    }
}
