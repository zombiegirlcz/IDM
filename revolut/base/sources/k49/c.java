package k49;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public Function2 u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f180847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f180848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f180849y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, Continuation continuation) {
        super(continuation);
        this.f180849y = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180848x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f180849y.d3(null, this);
    }
}
