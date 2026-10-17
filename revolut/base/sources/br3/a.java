package br3;

import elm.f;
import eo0.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lpl.c;
import m9d.y0;
import mri.w;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17874b;

    public a(gbb.b loginBackgroundTracker) {
        this.f17873a = 3;
        Intrinsics.checkNotNullParameter(loginBackgroundTracker, "loginBackgroundTracker");
        this.f17874b = loginBackgroundTracker;
    }

    @Override // eo0.b
    public final Object a(Continuation continuation) throws Throwable {
        Continuation continuation2 = null;
        switch (this.f17873a) {
            case 0:
                bf5.a aVar = new bf5.a(this, continuation2, 27);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(f.f127540b, aVar, continuation);
                if (objJ != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                c cVar = new c(this, continuation2, 24);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(f.f127540b, cVar, continuation);
                if (objJ2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                y0 y0Var = new y0(this, continuation2, 28);
                p0 p0Var3 = p0.f264001a;
                Object objJ3 = e0.J(f.f127540b, y0Var, continuation);
                if (objJ3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                ((hbb.b) ((gbb.b) this.f17874b).get()).init();
                break;
        }
        return Unit.f186387a;
    }

    @Override // eo0.b
    public final /* bridge */ /* synthetic */ eo0.a c() {
        switch (this.f17873a) {
        }
        return eo0.a.f127858a;
    }

    public a(w jobInteractor, int i) {
        this.f17873a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(jobInteractor, "jobInteractor");
                this.f17874b = jobInteractor;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(jobInteractor, "jobInteractor");
                this.f17874b = jobInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(jobInteractor, "jobInteractor");
                this.f17874b = jobInteractor;
                break;
        }
    }
}
