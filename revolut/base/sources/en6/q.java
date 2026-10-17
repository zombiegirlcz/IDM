package en6;

import com.revolut.domain.models.topup.TopUpContext;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ s B;
    public int C;
    public String u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TopUpContext f127752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f127753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e7l.f f127754y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, gim.c cVar) {
        super(cVar);
        this.B = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, false, null, null, this);
    }
}
