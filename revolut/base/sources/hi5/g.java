package hi5;

import ec5.i;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public i u;
    public Function0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f152502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f152503x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f152504y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f152503x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f152502w = obj2;
        this.f152504y |= Integer.MIN_VALUE;
        return this.f152503x.Z2(null, null, this);
    }
}
