package l98;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ f B;
    public int C;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b93.b f193106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public NaviCommand f193107x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f193108y;
    public c13.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, gim.c cVar) {
        super(cVar);
        this.B = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, null, null, null, this);
    }
}
