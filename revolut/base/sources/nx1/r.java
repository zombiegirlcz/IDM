package nx1;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import skm.k0;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f220078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Throwable f220079x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.u;
        Throwable th10 = (Throwable) obj3;
        ((Number) obj4).longValue();
        Continuation continuation = (Continuation) obj5;
        switch (i) {
            case 0:
                r rVar = new r(4, 0, continuation);
                rVar.f220079x = th10;
                return rVar.invokeSuspend(Unit.f186387a);
            default:
                r rVar2 = new r(4, 1, continuation);
                rVar2.f220079x = th10;
                return rVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06;
        ?? r09;
        switch (this.u) {
            case 0:
                Throwable th10 = this.f220079x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f220078w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ?? r010 = th10 instanceof l;
                    r06 = r010;
                    if (r010 != 0) {
                        this.f220079x = null;
                        this.v = r010;
                        this.f220078w = 1;
                        r06 = r010;
                        if (k0.b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = this.v;
                    yhm.o.b(obj2);
                    r06 = i2;
                }
                return Boolean.valueOf(r06 != 0);
            default:
                Throwable th11 = this.f220079x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f220078w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ?? r011 = th11 instanceof px1.f;
                    r09 = r011;
                    if (r011 != 0) {
                        this.f220079x = null;
                        this.v = r011;
                        this.f220078w = 1;
                        r09 = r011;
                        if (k0.b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = this.v;
                    yhm.o.b(obj2);
                    r09 = i5;
                }
                return Boolean.valueOf(r09 != 0);
        }
    }
}
