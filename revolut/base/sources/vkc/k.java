package vkc;

import com.revolut.feature.rfi_tool.impl.domain.model.Content;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public Content u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rfi_tool.impl.navigation.b f289910w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289911x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.rfi_tool.impl.navigation.b bVar, gim.c cVar) {
        super(cVar);
        this.f289910w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289911x |= Integer.MIN_VALUE;
        return this.f289910w.L2(this);
    }
}
