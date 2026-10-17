package p5a;

import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import java.util.LinkedHashSet;
import opf.z;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ l C;
    public int D;
    public dj0.d u;
    public LinkedHashSet v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f233069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TransferMoneyPocket f233070x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String[] f233071y;
    public String[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.C = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(null, this);
    }
}
