package m1a;

import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public String u;
    public ItemizationReceiptDeletionData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f201302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f201303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f201304y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, gim.c cVar) {
        super(cVar);
        this.f201304y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f201303x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f201304y.a(null, null, null, this);
    }
}
