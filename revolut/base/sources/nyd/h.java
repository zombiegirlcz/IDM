package nyd;

import com.revolut.feature.statements.api.models.StatementUrlState;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public String u;
    public StatementUrlState.InPreparation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f220852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f220853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f220854y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f220854y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f220853x = obj2;
        this.z |= Integer.MIN_VALUE;
        return k.a(this.f220854y, null, this);
    }
}
