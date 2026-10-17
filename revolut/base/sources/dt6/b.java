package dt6;

import gim.c;
import gim.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {
    public Object u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f117392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o7.b f117393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f117394y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o7.b bVar, c cVar) {
        super(cVar);
        this.f117393x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f117392w = obj2;
        this.f117394y |= Integer.MIN_VALUE;
        return this.f117393x.x(null, null, this);
    }
}
