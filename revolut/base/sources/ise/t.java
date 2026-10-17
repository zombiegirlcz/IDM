package ise;

import com.revolut.data.model.Data;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.c {
    public Data u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.three_ds_verification.impl.ui.sceen.d f168238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168239x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar, gim.c cVar) {
        super(cVar);
        this.f168238w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f168239x |= Integer.MIN_VALUE;
        return com.revolut.feature.three_ds_verification.impl.ui.sceen.d.I2(this.f168238w, this);
    }
}
