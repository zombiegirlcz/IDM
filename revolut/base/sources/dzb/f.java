package dzb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.l0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f121304b;

    public /* synthetic */ f(i iVar, int i) {
        this.f121303a = i;
        this.f121304b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121303a) {
            case 0:
                l0 activated = (l0) obj2;
                Intrinsics.checkNotNullParameter(activated, "activated");
                this.f121304b.C2(new c(activated.f201384a));
                return Unit.f186387a;
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f121304b.J2(w4l.j.f294644c);
                return Unit.f186387a;
            default:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                i iVar = this.f121304b;
                pyb.c cVar = iVar.f121310r;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                iVar.X1(cVar.f240739a.f("CLAIM_REWARD_DIALOG_ID", error));
                return Boolean.TRUE;
        }
    }
}
