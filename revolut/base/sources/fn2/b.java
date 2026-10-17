package fn2;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public BackgroundKey u;
    public GlobalThemeDeclaration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f136513w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f136514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f136515y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f136514x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f136513w = obj2;
        this.f136515y |= Integer.MIN_VALUE;
        return this.f136514x.n(null, null, this);
    }
}
