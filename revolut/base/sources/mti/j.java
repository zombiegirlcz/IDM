package mti;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public int A;
    public FlowCollector u;
    public Ref$ObjectRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f208855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f208856x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f208857y;
    public final /* synthetic */ l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.z = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f208857y = obj2;
        this.A |= Integer.MIN_VALUE;
        return l.a(this.z, null, null, 0L, 0L, this);
    }
}
