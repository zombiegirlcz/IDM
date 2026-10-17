package s6e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends gim.c {
    public List u;
    public Subaccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f260319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f260320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f260321y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, gim.c cVar) {
        super(cVar);
        this.f260320x = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f260319w = obj2;
        this.f260321y |= Integer.MIN_VALUE;
        return this.f260320x.C(this, null, null);
    }
}
