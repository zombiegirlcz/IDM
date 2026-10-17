package rkd;

import gld.a0;
import gld.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f254827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f254828b;

    public m(c cVar, d dVar) {
        this.f254827a = dVar;
        this.f254828b = cVar;
    }

    public final f0 a(mkd.g view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a0 a0VarA = this.f254828b.a(view);
        g gVar = (g) this.f254827a.f254797a.f251552c;
        return new f0(a0VarA, (bld.j) gVar.C.get(), (jld.f) gVar.D.get());
    }
}
