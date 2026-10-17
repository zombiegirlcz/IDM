package i7i;

import com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public AutomationLaunchMode.EditingAutomation u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f159317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f159318x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f159317w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f159318x |= Integer.MIN_VALUE;
        return this.f159317w.d(null, this);
    }
}
