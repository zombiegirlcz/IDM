package ki5;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public NaviCommand u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f184180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f184181x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f184182y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(continuation);
        this.f184181x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f184180w = obj2;
        this.f184182y |= Integer.MIN_VALUE;
        return this.f184181x.c(null, this);
    }
}
