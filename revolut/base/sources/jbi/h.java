package jbi;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import j7b.m;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import vkm.j2;
import vkm.q;
import vkm.t0;
import wkm.l;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends x7a.d {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvh.a f172643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f172644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f172645c;
    public final l d;

    public h(jvh.a workflowInteractor, i mapper) {
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f172643a = workflowInteractor;
        this.f172644b = mapper;
        j2 j2VarC = q.c(null);
        this.f172645c = j2VarC;
        this.d = q.Q(t1.d(new t0(j2VarC, 1), 300L), new iw6.l((Continuation) null, this, 11));
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new c((String) d0.a0(ids));
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        return (List) iii.c.f(data, new j7b.l(21), new m(11), new eog.a(this.f172644b, selectedIds));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (obj2 instanceof String) {
            e eVar = new e((String) obj2, query);
            j2 j2Var = this.f172645c;
            j2Var.getClass();
            j2Var.g(null, eVar);
        }
        return this.d;
    }
}
