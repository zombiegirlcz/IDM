package pkg;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pkf.x;
import vkm.q;
import vkm.q0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements jkg.d {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f237177a;

    public j(ImmutableSet dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        this.f237177a = dataSources;
    }

    public static List b(int i, List list, boolean z) {
        ArrayList arrayListU = w.u(d0.Z(list));
        Comparator iVar = new i();
        if (!z) {
            iVar = iVar.reversed();
            Intrinsics.checkNotNullExpressionValue(iVar, "reversed(...)");
        }
        return d0.V0(d0.P0(arrayListU, iVar), i);
    }

    @Override // jkg.d
    public final Flow a(Flow paginationEvents) {
        Intrinsics.checkNotNullParameter(paginationEvents, "paginationEvents");
        return q.Q(paginationEvents, new x(null, this, 5));
    }

    public final q0 c(ikg.f fVar, ikg.e eVar) {
        boolean z = eVar.f161968a instanceof ikg.a;
        Comparator iVar = new i();
        if (!z) {
            iVar = iVar.reversed();
            Intrinsics.checkNotNullExpressionValue(iVar, "reversed(...)");
        }
        return new q0(rd0.e.n(fVar.a(eVar), h0.f322473a), new a9h.c(this, iVar, fVar.getClass().getSimpleName(), eVar, (Continuation) null, 5), 1);
    }
}
