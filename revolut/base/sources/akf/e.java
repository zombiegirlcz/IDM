package akf;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public int A;
    public a3 u;
    public ApmContact v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5828x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f5829y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f5829y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c3(null, null, null, this);
    }
}
