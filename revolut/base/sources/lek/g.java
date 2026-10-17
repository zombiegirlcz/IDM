package lek;

import java.time.LocalDate;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ m B;
    public int C;
    public bek.g u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f194572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f194573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LocalDate f194574y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, gim.c cVar) {
        super(cVar);
        this.B = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(null, null, null, null, null, this);
    }
}
