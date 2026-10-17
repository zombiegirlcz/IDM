package nhi;

import aii.x;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public x u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f215494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f215495x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f215496y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f215495x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f215494w = obj2;
        this.f215496y |= Integer.MIN_VALUE;
        return this.f215495x.b(null, this);
    }
}
