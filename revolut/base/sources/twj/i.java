package twj;

import do3.s;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import z9h.n;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f275044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f275045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f275046c;

    public i(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f275044a = storage;
        j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.f275045b = jVarD;
        j jVarD2 = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD2, "toSerialized(...)");
        this.f275046c = jVarD2;
    }

    public final void a() {
        c(null);
        b(null);
    }

    public final void b(Boolean bool) {
        ue0.c cVar = this.f275044a;
        if (bool != null) {
            com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, cVar, "requires_onboarding", bool);
        } else {
            cVar.I0("requires_onboarding");
        }
        od0.i.Companion.getClass();
        this.f275046c.onNext(od0.h.a(bool));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void c(s sVar) {
        ue0.c cVar = this.f275044a;
        if (sVar != null) {
            n.l(String.class, cVar, "user_state", u1.g(sVar, mwj.a.f209484a));
        } else {
            cVar.I0("user_state");
        }
        od0.i.Companion.getClass();
        this.f275045b.onNext(od0.h.a(sVar));
    }
}
