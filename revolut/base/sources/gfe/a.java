package gfe;

import bfe.d;
import gim.c;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends c {
    public final /* synthetic */ d A;
    public int B;
    public Collection u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f143393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f143394x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f143395y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(this);
    }
}
