package cam;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public f u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f22674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f22675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f22676y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(continuation);
        this.f22676y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f22675x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f22676y.h(null, this);
    }
}
