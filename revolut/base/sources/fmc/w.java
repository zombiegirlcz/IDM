package fmc;

import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.c {
    public FeatureCommand u;
    public qka.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f136362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f136363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f136364y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, gim.c cVar) {
        super(cVar);
        this.f136363x = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f136362w = obj2;
        this.f136364y |= Integer.MIN_VALUE;
        return this.f136363x.a(null, this);
    }
}
