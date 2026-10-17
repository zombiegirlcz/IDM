package psa;

import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import opf.z;
import xpa.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public f u;
    public z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TransferMoneyPocket f239452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f239453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f239454y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f239454y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f239453x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f239454y.a(null, this);
    }
}
