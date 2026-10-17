package im2;

import com.revolut.feature.backgroundpicker.models.EntityInfo;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.uipersonalisation.api.GlowThemeDeclaration;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public RetailBackgroundKey u;
    public GlowThemeDeclaration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EntityInfo f162282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f162283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f162284y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f162284y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f162283x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f162284y.a(null, null, this);
    }
}
