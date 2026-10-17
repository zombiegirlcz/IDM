package com.fourthline.orca.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/fourthline/orca/core/ProductPresentationStep;", "RESULT_TYPE", "", "present", "", "onProductCompleted", "Lcom/fourthline/orca/core/OnProductCompleted;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductPresentationStep<RESULT_TYPE> {
    void present(@NotNull OnProductCompleted<RESULT_TYPE> onProductCompleted);
}
