package wik;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kjk.t f297938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vjg.g f297939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ekg.g f297940c;
    public final q89.e d;

    public u(kjk.t repository, vjg.g themeCatalog, ekg.g uiPersonalisationInteractor, q89.e onboardingInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.f297938a = repository;
        this.f297939b = themeCatalog;
        this.f297940c = uiPersonalisationInteractor;
        this.d = onboardingInteractor;
    }

    public final void a(egk.b source) {
        Intrinsics.checkNotNullParameter(source, "source");
        kjk.t tVar = this.f297938a;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        ihm.b bVarA = tVar.a(source);
        od0.i.Companion.getClass();
        bVarA.onNext(od0.i.f224256b);
    }

    public final void b() {
        kjk.t tVar = this.f297938a;
        tVar.getClass();
        Iterator<E> it8 = egk.b.a().iterator();
        while (it8.hasNext()) {
            ihm.b bVarA = tVar.a((egk.b) it8.next());
            od0.i.Companion.getClass();
            bVarA.onNext(od0.i.f224256b);
        }
    }
}
