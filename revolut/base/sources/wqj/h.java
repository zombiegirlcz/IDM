package wqj;

import java.time.LocalDate;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public int A;
    public LocalDate u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocalDate f299469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f299470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f299471y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f299471y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
