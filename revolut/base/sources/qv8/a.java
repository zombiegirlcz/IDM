package qv8;

import gim.c;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f249540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f249541x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f249540w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f249541x |= Integer.MIN_VALUE;
        return this.f249540w.b(this, null, null);
    }
}
