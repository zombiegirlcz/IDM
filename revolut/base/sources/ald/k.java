package ald;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.c {
    public int A;
    public Function2 u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f6230w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6231x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6232y;
    public final /* synthetic */ r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, gim.c cVar) {
        super(cVar);
        this.z = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f6232y = obj2;
        this.A |= Integer.MIN_VALUE;
        return r.a(this.z, null, null, this);
    }
}
