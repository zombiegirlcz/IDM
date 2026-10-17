package cok;

import a5h.g;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import gim.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {
    public GlobalThemeDeclaration u;
    public GlobalThemeDeclaration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f25569x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f25570y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, c cVar) {
        super(cVar);
        this.f25569x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f25568w = obj2;
        this.f25570y |= Integer.MIN_VALUE;
        return this.f25569x.K0(null, null, this);
    }
}
