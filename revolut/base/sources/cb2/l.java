package cb2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.c {
    public TextLocalisedClause u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f22713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22714x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f22713w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f22714x |= Integer.MIN_VALUE;
        return m.I2(this.f22713w, null, this);
    }
}
