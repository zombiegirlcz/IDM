package ssa;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import gim.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {
    public PushToCardTransferData u;
    public kqa.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f265360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p56.a f265361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f265362y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p56.a aVar, c cVar) {
        super(cVar);
        this.f265361x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f265360w = obj2;
        this.f265362y |= Integer.MIN_VALUE;
        return this.f265361x.f(null, this);
    }
}
