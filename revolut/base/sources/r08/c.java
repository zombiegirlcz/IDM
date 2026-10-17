package r08;

import com.google.firebase.messaging.t;
import f08.e;
import fx7.f;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import tm.g;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f250722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f250723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f250724c;

    public c(f petInteractor, e state, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f250722a = petInteractor;
        this.f250723b = state;
        this.f250724c = j.b(new qvf.a(actionDelegateFactory, this, 8));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        a action = (a) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return ((g) this.f250724c.getValue()).a(action);
    }
}
