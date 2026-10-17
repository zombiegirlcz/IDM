package com.google.common.graph;

import com.google.common.annotations.Beta;

/* JADX INFO: loaded from: classes17.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface SuccessorsFunction<N> {
    Iterable<? extends N> successors(N n3);
}
