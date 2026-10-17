package s6j;

import akg.n;
import e7l.g;
import kotlin.jvm.internal.Intrinsics;
import l6j.b;
import n6j.c;
import rd0.e;
import w4l.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f260370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f260371b;

    public a(c repository, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f260370a = repository;
        this.f260371b = configurationInteractor;
    }

    public final n a() {
        return nim.a.v(e.b(((ik3.c) this.f260371b).l(g.b.f123407a, h.f294642c)), new s6e.g(12));
    }
}
