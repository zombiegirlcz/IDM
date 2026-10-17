package pyb;

import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;
import m1c.r1;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends fd0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f240748c;

    public q(s sVar) {
        this.f240748c = sVar;
    }

    @Override // fd0.b
    public final Object b(fd0.c cVar, Object obj2) {
        r1 key = (r1) cVar;
        o oVar = (o) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        if (oVar == null) {
            throw new IllegalArgumentException("Sync object must be always passed");
        }
        k71.q qVar = oVar.f240746a;
        fub.j jVar = fub.k.Companion;
        return this.f240748c.g(key, qVar, TimeClause.Format.TimeDefault.f57977b);
    }
}
