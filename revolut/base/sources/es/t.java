package es;

import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public final class t extends gim.c {
    public String u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f128770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.flow.launcher.d f128771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f128772y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, gim.c cVar) {
        super(cVar);
        this.f128771x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f128770w = obj2;
        this.f128772y |= Integer.MIN_VALUE;
        return com.revolut.biometric_verification.impl.ui.flow.launcher.d.O2(this.f128771x, null, this);
    }
}
