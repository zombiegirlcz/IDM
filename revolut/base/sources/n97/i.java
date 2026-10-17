package n97;

import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public int A;
    public g u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f213597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a97.g f213598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f213599y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213599y = obj2;
        this.A |= Integer.MIN_VALUE;
        return k.m(this.z, null, null, this);
    }
}
