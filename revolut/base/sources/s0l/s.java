package s0l;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ryj.w;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends jki.g implements h {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0l.a f258992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r60.b f258993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mn3.a f258994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lyk.a f258995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f258996t;
    public final t u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r0l.a dialogsFactory, r60.b promptViewControllerExtension, mn3.a contactsChooserResultObservable, lyk.a spouseConsentInteractor, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
        Intrinsics.checkNotNullParameter(contactsChooserResultObservable, "contactsChooserResultObservable");
        Intrinsics.checkNotNullParameter(spouseConsentInteractor, "spouseConsentInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f258992p = dialogsFactory;
        this.f258993q = promptViewControllerExtension;
        this.f258994r = contactsChooserResultObservable;
        this.f258995s = spouseConsentInteractor;
        this.f258996t = new e(false, null, false);
        this.u = new t();
    }

    @Override // yji.l
    public final void I1() {
        s sVar;
        Continuation continuation = null;
        if (((e) t2()).f258976a) {
            sVar = this;
        } else {
            r60.d dVar = (r60.d) this.f258993q;
            yji.l.a1(this, rd0.e.b(dVar.d.d()), null, null, new l(this, null), 3);
            sVar = this;
            yji.l.a1(sVar, rd0.e.b(dVar.d.b()), null, null, new n(this, null), 3);
            yji.l.a1(sVar, rd0.e.b(dVar.d.c()), null, null, new p(this, null), 3);
        }
        yji.l.a1(sVar, new w(rd0.e.b(sVar.f258994r.f207359a), 3), null, null, new rt4.o(this, continuation, 17), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f258996t;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.u;
    }
}
