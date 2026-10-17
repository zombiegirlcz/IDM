package ztf;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public ManualTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f325108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f325109x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f325108w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f325109x |= Integer.MIN_VALUE;
        return this.f325108w.a(this);
    }
}
