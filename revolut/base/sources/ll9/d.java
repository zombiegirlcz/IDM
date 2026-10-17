package ll9;

import com.revolut.feature.transfer.models.ScannedBillDetails;
import il9.v;
import il9.y;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ f B;
    public int C;
    public y u;
    public ScannedBillDetails v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v f196675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public il9.c f196676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f196677y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.B = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return f.b3(this.B, null, null, this);
    }
}
