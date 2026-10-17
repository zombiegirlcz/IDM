package ho;

import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f154150a;

    public c0(ImmutableSet delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f154150a = delegates;
    }

    @Override // ho.z
    public final void pause() {
        Iterator it8 = this.f154150a.iterator();
        while (it8.hasNext()) {
            ((z) it8.next()).pause();
        }
    }

    @Override // ho.z
    public final void resume() {
        Iterator it8 = this.f154150a.iterator();
        while (it8.hasNext()) {
            ((z) it8.next()).resume();
        }
    }
}
