package iki;

import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import skm.a2;
import skm.b0;
import skm.e0;
import skm.g1;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zkm.d f161978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f161979b;

    public d() {
        p0 p0Var = p0.f264001a;
        this.f161978a = jh.d.a(o.f323119a);
        this.f161979b = new LinkedHashSet();
    }

    public final void a(String tag2) {
        Sequence<Job> children;
        CoroutineContext coroutineContext;
        b0 b0Var;
        String strM;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Job job2 = (Job) this.f161978a.f323100a.get(g1.f263979a);
        if (job2 == null || (children = job2.getChildren()) == null) {
            return;
        }
        for (Job job3 : children) {
            CoroutineScope coroutineScope = job3 instanceof CoroutineScope ? (CoroutineScope) job3 : null;
            if (coroutineScope != null && (coroutineContext = coroutineScope.getF74819h()) != null && (b0Var = (b0) coroutineContext.get(b0.f263956c)) != null && (strM = b0Var.m()) != null && strM.equals(tag2)) {
                job3.f(null);
            }
        }
    }

    public final void b(String tag2, Function1 action) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(action, "action");
        mki.j.a("NavActionsScheduler");
        a2 a2VarC = e0.C(this.f161978a, new b0(tag2), null, new hsd.c((Object) this, (Object) action, false, (Continuation) null, 18), 2);
        this.f161979b.add(a2VarC);
        a2VarC.k(new ijg.c(this, a2VarC, 3));
    }
}
