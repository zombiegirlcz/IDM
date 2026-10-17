package eki;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g extends yji.l implements n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f127171l = yhm.j.c(yhm.k.NONE, new e58.e(this, 15));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zji.d f127172m = new zji.d();

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public static void r2(g gVar, String str) {
        ?? r3 = gVar.f127171l;
        Object objD0 = d0.d0(((MutableSharedFlow) r3.getValue()).d());
        if (objD0 == null) {
            throw new IllegalStateException("steps must be initialised");
        }
        List steps = ((fki.c) objD0).f135844a;
        Intrinsics.checkNotNullParameter(steps, "steps");
        ((MutableSharedFlow) r3.getValue()).k(new fki.c(steps, str, true));
    }

    public abstract fki.b q2();
}
