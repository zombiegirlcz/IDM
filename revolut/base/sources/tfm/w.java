package tfm;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270905h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f270906j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(efm.r rVar, Object obj2, Object obj3, int i) {
        super(rVar);
        this.f270905h = i;
        this.f270906j = obj2;
        this.i = obj3;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270905h) {
            case 0:
                this.f270328g.subscribe(new v(new bgm.d(yVar), (Callable) this.f270906j, (Callable) this.i));
                break;
            case 1:
                this.f270328g.subscribe(new v(new bgm.d(yVar), (Callable) this.i, (efm.w) this.f270906j));
                break;
            case 2:
                try {
                    Object objCall = ((Callable) this.i).call();
                    mfm.f.b(objCall, "The initialSupplier returned a null value");
                    this.f270328g.subscribe(new g0(yVar, objCall, (kfm.b) this.f270906j, 0));
                } catch (Throwable th10) {
                    lfm.e.d(th10, yVar);
                    return;
                }
                break;
            case 3:
                try {
                    Object objCall2 = ((Callable) this.i).call();
                    mfm.f.b(objCall2, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f270328g.subscribe(new o1(yVar, (kfm.o) this.f270906j, (Collection) objCall2));
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    lfm.e.d(th11, yVar);
                    return;
                }
                break;
            default:
                this.f270328g.subscribe(new t6(yVar, (TimeUnit) this.f270906j, (efm.c0) this.i));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(efm.r rVar, Callable callable, Object obj2, int i) {
        super(rVar);
        this.f270905h = i;
        this.i = callable;
        this.f270906j = obj2;
    }
}
