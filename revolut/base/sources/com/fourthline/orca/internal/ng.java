package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ng implements e4m.e {
    public static bh a(eg egVar, TimestampProvider timestampProvider, List list, to toVar) {
        bh bhVarA = egVar.a(timestampProvider, list, toVar);
        vc.s.k(bhVarA);
        return bhVarA;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
