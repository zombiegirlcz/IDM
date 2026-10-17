package ekg;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import xjg.j;
import xjg.m;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public int A;
    public GlobalThemeDeclaration u;
    public m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f127153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dkg.a f127154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f127155y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.z = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127155y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, this);
    }
}
