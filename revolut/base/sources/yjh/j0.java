package yjh;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 extends gim.c {
    public WealthAction u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f314486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k0 f314487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f314488y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.f314487x = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f314486w = obj2;
        this.f314488y |= Integer.MIN_VALUE;
        return this.f314487x.b3(null, this);
    }
}
