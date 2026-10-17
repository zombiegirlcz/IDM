package j6h;

import c1l.e;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public List u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f171766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f171767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f171768y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f171767x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f171766w = obj2;
        this.f171768y |= Integer.MIN_VALUE;
        return this.f171767x.b(null, this);
    }
}
