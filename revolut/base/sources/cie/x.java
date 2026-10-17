package cie;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.c {
    public int A;
    public int B;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ble.e1 f24531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f24532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f24533y;
    public ProductAccountDescriptor$Value z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ble.e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f24531w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f24531w.emit(null, this);
    }
}
