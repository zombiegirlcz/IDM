package cli;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f25025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25026c;
    public volatile boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j initialState, n stateMapper, boolean z) {
        super(initialState);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f25025b = stateMapper;
        this.f25026c = z;
    }

    public final Flow F() {
        j2 j2Var = (j2) this.f22677a;
        if (this.f25026c) {
            return vkm.q.B(new ck7.j(this, null, 2), j2Var);
        }
        return new ba4.x(j2Var, this.f25025b, 26);
    }
}
