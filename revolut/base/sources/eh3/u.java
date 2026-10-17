package eh3;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f125729w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f125729w |= Integer.MIN_VALUE;
        return com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a.I2(this.v, null, this);
    }
}
