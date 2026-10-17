package s8a;

import com.revolut.feature.pix.api.model.PixQrCodeScheduleData;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.c {
    public PixQrCodeScheduleData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f260957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260958x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.f260957w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260958x |= Integer.MIN_VALUE;
        return this.f260957w.b(null, this);
    }
}
