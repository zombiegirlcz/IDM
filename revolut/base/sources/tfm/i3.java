package tfm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i3 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270533a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f270534b;

    public i3(tyl.a function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f270534b = function;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f270533a) {
            case 0:
                ((efm.y) this.f270534b).onComplete();
                break;
            default:
                ((tyl.a) this.f270534b).invoke();
                break;
        }
    }

    public i3(efm.y yVar) {
        this.f270534b = yVar;
    }
}
