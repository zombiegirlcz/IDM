package ztf;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import mga.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public a0 A;
    public boolean B;
    public boolean C;
    public /* synthetic */ Object D;
    public final /* synthetic */ f E;
    public int F;
    public nrf.c u;
    public ManualTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f325105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dj0.d f325106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dj0.d f325107y;
    public n9l.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.E = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.g(null, null, this);
    }
}
