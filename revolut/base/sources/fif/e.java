package fif;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.Priority;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tif.q;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f135397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i7 f135398c;
    public final /* synthetic */ Priority d;
    public final /* synthetic */ BreadcrumbException e;

    public /* synthetic */ e(m mVar, i7 i7Var, Priority priority, BreadcrumbException breadcrumbException, int i) {
        this.f135396a = i;
        this.f135397b = mVar;
        this.f135398c = i7Var;
        this.d = priority;
        this.e = breadcrumbException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f135396a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                q qVar = (q) this.f135397b.f135410a;
                qVar.getClass();
                Priority priority = this.d;
                Intrinsics.checkNotNullParameter(priority, "priority");
                return qVar.e.f(priority, new tif.k(qVar, this.f135398c, this.e, 0));
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                q qVar2 = (q) this.f135397b.f135410a;
                qVar2.getClass();
                Priority priority2 = this.d;
                Intrinsics.checkNotNullParameter(priority2, "priority");
                return qVar2.e.e(priority2, new tif.k(qVar2, this.f135398c, this.e, 2)).p(new DateTime(0L));
        }
    }
}
