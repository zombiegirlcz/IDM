package mjf;

import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public List u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f206006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f206007x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ blj.t f206008y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(blj.t tVar, Continuation continuation) {
        super(continuation);
        this.f206008y = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f206007x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f206008y.a(null, this);
    }
}
