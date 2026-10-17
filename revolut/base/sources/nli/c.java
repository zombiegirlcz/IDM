package nli;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ e C;
    public int D;
    public List u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f217140w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Serializable f217141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Collection f217142y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.C = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, null, this);
    }
}
