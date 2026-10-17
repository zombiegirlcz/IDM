package ztf;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public ManualTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f325110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f325111x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f325110w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f325111x |= Integer.MIN_VALUE;
        return this.f325110w.d(this);
    }
}
