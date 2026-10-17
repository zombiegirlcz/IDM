package bc8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import gim.c;
import pf8.h;
import zm3.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {
    public final /* synthetic */ b A;
    public int B;
    public l u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f14391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextLocalisedClause f14392x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextLocalisedClause f14393y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.A = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, null, null, null, this);
    }
}
