package wol;

import com.revolut.sso.impl.domain.models.Challenge;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.c {
    public Challenge u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f298974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f298975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f298976y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, gim.c cVar) {
        super(cVar);
        this.f298975x = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f298974w = obj2;
        this.f298976y |= Integer.MIN_VALUE;
        return t.I2(this.f298975x, null, this);
    }
}
