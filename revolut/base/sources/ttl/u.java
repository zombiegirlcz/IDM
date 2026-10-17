package ttl;

import java.time.LocalDate;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends gim.c {
    public int A;
    public s u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocalDate f274470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v60.g f274471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f274472y;
    public final /* synthetic */ x z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, gim.c cVar) {
        super(cVar);
        this.z = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f274472y = obj2;
        this.A |= Integer.MIN_VALUE;
        return x.I2(this.z, null, this);
    }
}
