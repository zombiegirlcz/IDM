package wkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes13.dex */
public final class j extends gim.c {
    public k u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Job f298315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f298316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f298317y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation continuation) {
        super(continuation);
        this.f298317y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f298316x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f298317y.emit(null, this);
    }
}
