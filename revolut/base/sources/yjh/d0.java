package yjh;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ k0 B;
    public int C;
    public WealthAction u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f314464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f314465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f314466y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.B = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.c3(null, null, null, this);
    }
}
