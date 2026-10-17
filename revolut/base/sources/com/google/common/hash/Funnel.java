package com.google.common.hash;

import com.google.common.annotations.Beta;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface Funnel<T> extends Serializable {
    void funnel(@ParametricNullness T t2, PrimitiveSink primitiveSink);
}
