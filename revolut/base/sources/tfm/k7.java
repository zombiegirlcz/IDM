package tfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class k7 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270597h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f270598j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7(efm.r rVar, Object obj2, int i, int i2) {
        super(rVar);
        this.f270597h = i2;
        this.f270598j = obj2;
        this.i = i;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270597h) {
            case 0:
                j7 j7Var = new j7(yVar, this.i);
                yVar.onSubscribe(j7Var);
                ((efm.w) this.f270598j).subscribe(j7Var.f270573c);
                this.f270328g.subscribe(j7Var);
                break;
            default:
                this.f270328g.subscribe(new p7(yVar, this.i, (Callable) this.f270598j));
                break;
        }
    }
}
