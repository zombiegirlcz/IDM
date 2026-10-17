package vha;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public final class i1 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ k1 B;
    public int C;
    public com.revolut.feature.tab.accounts.models.spaces.f[] u;
    public pie.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProductSpaceIdentifier.Pro f289378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextLocalisedClause f289379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.revolut.feature.tab.accounts.models.spaces.f[] f289380y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, gim.c cVar) {
        super(cVar);
        this.B = k1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return k1.b(this.B, this);
    }
}
