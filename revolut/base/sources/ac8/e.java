package ac8;

import java.util.List;
import qua.p;
import zm3.l;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public int A;
    public List u;
    public l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p f3099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f3100x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3101y;
    public final /* synthetic */ com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a aVar, gim.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f3101y = obj2;
        this.A |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a.I2(this.z, this);
    }
}
