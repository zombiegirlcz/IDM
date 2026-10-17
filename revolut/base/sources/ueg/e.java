package ueg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lk0.h;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i9g.h0 f279381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i9g.b0 f279382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f279383c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    public e(i9g.h0 travelSearchParamsInteractor, i9g.b0 travelHotelsPropertyInteractor, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(travelSearchParamsInteractor, "travelSearchParamsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f279381a = travelSearchParamsInteractor;
        this.f279382b = travelHotelsPropertyInteractor;
        this.f279383c = j6.a.h("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    public final void a() {
        ihm.b bVar = this.f279383c;
        lk0.g gVar = (lk0.g) bVar.f();
        if (gVar != null) {
            List list = gVar.f196174a;
            if (list.isEmpty() || ((lk0.e) zhm.d0.m0(list)).e == null) {
                gVar = null;
            }
            if (gVar != null) {
                List list2 = gVar.f196174a;
                if (list2.size() == 1) {
                    this.e.onNext(((vfi.a) ((lk0.e) zhm.d0.m0(list2)).f196172b).f288659a);
                } else {
                    bVar.onNext(lk0.g.a(list2.subList(0, list2.size() - 1)));
                    this.d.onNext(h.b.f196176a);
                }
            }
        }
    }
}
