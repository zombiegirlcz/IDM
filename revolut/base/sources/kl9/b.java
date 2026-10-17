package kl9;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public int A;
    public File u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f185406w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f185407x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f185408y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f185408y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, this);
    }
}
