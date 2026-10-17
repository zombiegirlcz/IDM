package eh3;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a f125733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125734x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar, gim.c cVar) {
        super(cVar);
        this.f125733w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f125734x |= Integer.MIN_VALUE;
        return com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a.J2(this.f125733w, null, this);
    }
}
