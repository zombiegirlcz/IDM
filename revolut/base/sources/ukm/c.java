package ukm;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends gim.c {
    public d u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f280799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f280800x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f280801y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(continuation);
        this.f280801y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280800x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f280801y.send(null, this);
    }
}
