package com.fourthline.vision.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public interface d2 {
    Object get();

    default void subscribe(Function2<Object, ? super Continuation<? super Unit>, ? extends Object> function2) {
    }
}
