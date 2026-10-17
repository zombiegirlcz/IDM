package zbj;

import com.revolut.core.ui_kit.models.AppTipUIModel;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends gim.c {
    public AppTipUIModel u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f320902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f320903x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.f320902w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f320903x |= Integer.MIN_VALUE;
        return this.f320902w.Z2(null, null, this);
    }
}
