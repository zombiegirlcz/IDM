package u4j;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public ConfirmationResult u;
    public f5j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f277374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f277375x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f277376y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f277376y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f277375x = obj2;
        this.z |= Integer.MIN_VALUE;
        return f.I2(this.f277376y, null, null, this);
    }
}
