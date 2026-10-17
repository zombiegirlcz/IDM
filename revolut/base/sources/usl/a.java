package usl;

import bul.o;
import gim.c;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends c {
    public Iterator u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f282991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f282992x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f282993y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, c cVar) {
        super(cVar);
        this.f282993y = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f282992x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f282993y.a(this);
    }
}
