package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes23.dex */
public interface s10 {
    Object a(g51 g51Var, Continuation continuation);

    default void a() {
        getName();
    }

    default void b() {
        getName();
    }

    String getName();
}
