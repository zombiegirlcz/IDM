package g4a;

import gim.c;
import jq9.k;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f140425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f140426x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f140425w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f140426x |= Integer.MIN_VALUE;
        return this.f140425w.a(null, this);
    }
}
