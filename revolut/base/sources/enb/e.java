package enb;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public String u;
    public InputStream v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f127793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f127794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f127795y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f127794x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127793w = obj2;
        this.f127795y |= Integer.MIN_VALUE;
        return this.f127794x.c(null, this);
    }
}
