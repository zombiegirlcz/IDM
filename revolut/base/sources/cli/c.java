package cli;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f25019a;

    public c(aim.e transitionStateLatches) {
        Intrinsics.checkNotNullParameter(transitionStateLatches, "transitionStateLatches");
        this.f25019a = transitionStateLatches;
        if (transitionStateLatches.isEmpty()) {
            throw new IllegalStateException("transitionStateLatches must not be empty");
        }
    }

    @Override // cli.r
    public final void a(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        aim.e eVar = this.f25019a;
        if (eVar.size() <= 0) {
            action.invoke();
        } else {
            ((r) eVar.get(0)).a(new b(this, 0, action));
        }
    }

    @Override // cli.r
    public final boolean b() {
        aim.e eVar = this.f25019a;
        if (eVar.isEmpty()) {
            return false;
        }
        Iterator<E> it8 = eVar.iterator();
        while (it8.hasNext()) {
            if (((r) it8.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f25019a.equals(((c) obj2).f25019a);
    }

    public final int hashCode() {
        return this.f25019a.hashCode();
    }
}
