package y45;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f310791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w4l.k f310792c;

    public /* synthetic */ c(f fVar, w4l.k kVar, int i) {
        this.f310790a = i;
        this.f310791b = fVar;
        this.f310792c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Loan it8 = (Loan) obj2;
        switch (this.f310790a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return rd0.e.b(osg.b.o(this.f310791b.f310797g, it8.f70123x, io3.l.CURRENT, null, null, this.f310792c, 60));
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return osg.b.o(this.f310791b.f310797g, it8.f70123x, null, null, null, this.f310792c, 62);
        }
    }
}
