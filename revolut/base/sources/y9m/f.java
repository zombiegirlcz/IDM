package y9m;

import cam.t;
import dam.i;
import dam.s;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends gim.c {
    public final /* synthetic */ s A;
    public int B;
    public cam.f u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f311878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t f311879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t f311880y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s sVar, gim.c cVar) {
        super(cVar);
        this.A = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return s.G(this.A, null, this);
    }
}
