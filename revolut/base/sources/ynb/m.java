package ynb;

import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import kotlin.coroutines.Continuation;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.c {
    public int A;
    public s u;
    public ZoomTransitionAnimation.Widgets v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r f315410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f315411x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f315412y;
    public final /* synthetic */ r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, Continuation continuation) {
        super(continuation);
        this.z = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f315412y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.k3(null, false, null, this);
    }
}
