package dam;

import financial.atomic.transact.activity.TransactActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f112585h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, int i) {
        super(0);
        this.f = i;
        this.f112585h = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                s sVar = this.f112585h;
                return new z9m.k(sVar, (cam.b) sVar.f.getValue(), sVar.d.f112573p);
            case 1:
                return new cam.b(((cam.g) this.f112585h.e.getValue()).f22678a);
            case 2:
                s sVar2 = this.f112585h;
                TransactActivity transactActivity = sVar2.f112589b;
                sVar2.d.getClass();
                return new cam.g(transactActivity);
            case 3:
                return new y9m.e(this.f112585h);
            default:
                s sVar3 = this.f112585h;
                return ((cam.b) sVar3.f.getValue()).a(new bam.b(sVar3));
        }
    }
}
