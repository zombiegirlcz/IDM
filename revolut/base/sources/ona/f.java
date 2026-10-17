package ona;

import e7l.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f226923b;

    public /* synthetic */ f(i iVar, int i) {
        this.f226922a = i;
        this.f226923b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f226922a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return ((ik3.g) this.f226923b.f226927q).a(g.a.f123406a, false);
            default:
                yp.b bVar = this.f226923b.f226926p;
                int i = g.f226924a[((qla.a) obj2).ordinal()];
                if (i == 1) {
                    return bVar.a(cj9.c.j(ui0.b.Companion));
                }
                if (i == 2) {
                    Intrinsics.checkNotNullParameter(ui0.b.Companion, "<this>");
                    return bVar.a(new ui0.b("com.revolut.retail.india", null));
                }
                if (i == 3) {
                    return bVar.a(cj9.c.k(ui0.b.Companion));
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
