package gl9;

import com.revolut.feature.transfer.models.ScannedBillDetails;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public il9.f u;
    public ScannedBillDetails v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f144576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f144577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f144578y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f144577x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f144576w = obj2;
        this.f144578y |= Integer.MIN_VALUE;
        return this.f144577x.b3(null, null, this);
    }
}
