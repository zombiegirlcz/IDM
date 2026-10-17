package bn2;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public BackgroundKey u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public km2.j f17015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f17016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f17017y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, gim.c cVar) {
        super(cVar);
        this.f17017y = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f17016x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f17017y.e(null, null, null, this);
    }
}
