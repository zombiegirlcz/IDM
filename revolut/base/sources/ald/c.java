package ald;

import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f6219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6220x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, Continuation continuation) {
        super(continuation);
        this.f6219w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f6220x |= Integer.MIN_VALUE;
        return h.a(this.f6219w, null, this);
    }
}
