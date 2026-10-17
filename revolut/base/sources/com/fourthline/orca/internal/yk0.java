package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class yk0 implements e4m.e {
    public static xl0 a(fk0 fk0Var, ek0 ek0Var, wl0 wl0Var, tl0 tl0Var, ol0 ol0Var, TimestampProvider timestampProvider, wd1 wd1Var, aq0 aq0Var, CoroutineScope coroutineScope) {
        xl0 xl0VarA = fk0Var.a(ek0Var, wl0Var, tl0Var, ol0Var, timestampProvider, wd1Var, aq0Var, coroutineScope);
        vc.s.k(xl0VarA);
        return xl0VarA;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
