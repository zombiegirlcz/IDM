package ztf;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import mga.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends gim.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ f C;
    public int D;
    public ManualTransferData u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f325102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dj0.d f325103x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n9l.a f325104y;
    public a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, gim.c cVar) {
        super(cVar);
        this.C = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.f(null, null, this);
    }
}
