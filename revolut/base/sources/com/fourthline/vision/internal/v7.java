package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class v7 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t7 f36999a;

    public v7(@NotNull t7 isSteadyDataSource) {
        Intrinsics.checkNotNullParameter(isSteadyDataSource, "isSteadyDataSource");
        this.f36999a = isSteadyDataSource;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((List<? extends h6>) obj2, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void stop() {
        super.stop();
    }

    public Object process(@NotNull List<? extends h6> list, @NotNull Continuation<? super List<? extends SelfieScannerWarning>> continuation) {
        if (v7.class.isAnonymousClass()) {
            String name = v7.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        Objects.toString(list);
        boolean zBooleanValue = this.f36999a.get().booleanValue();
        if (v7.class.isAnonymousClass()) {
            String name2 = v7.class.getName();
            if (name2.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        }
        return zBooleanValue ? zhm.f0.f322471a : zhm.u.c(SelfieScannerWarning.DEVICE_NOT_STEADY);
    }
}
