package kqd;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f188373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f188374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f188375c;
    public final z1 d;
    public final z1 e;
    public final z1 f;

    public e(g6e.d subaccountInteractor) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        this.f188373a = subaccountInteractor;
        this.f188374b = vkm.q.b(0, 7, null);
        this.f188375c = vkm.q.b(0, 7, null);
        this.d = vkm.q.b(0, 7, null);
        this.e = vkm.q.b(0, 7, null);
        this.f = vkm.q.b(0, 7, null);
    }

    public final Object a(Set set, gim.i iVar) throws Throwable {
        Object objEmit = this.f188374b.emit(d0.d1(set), iVar);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }
}
