package uwd;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public xi0.b u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f283616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f283617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f283618y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, gim.c cVar) {
        super(cVar);
        this.f283617x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f283616w = obj2;
        this.f283618y |= Integer.MIN_VALUE;
        return this.f283617x.c(this);
    }
}
