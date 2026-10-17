package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractFuture abstractFuture, long j2, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j2, obj2, obj3)) {
            if (unsafe.getObject(abstractFuture, j2) != obj2) {
                return false;
            }
        }
        return true;
    }
}
