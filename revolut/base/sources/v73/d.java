package v73;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jg1.d f286532b;

    public /* synthetic */ d(jg1.d dVar, int i) {
        this.f286531a = i;
        this.f286532b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b baseCurrency = (xi0.b) obj2;
        switch (this.f286531a) {
            case 0:
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                return new f(((jg1.b) this.f286532b).f173897a, !Intrinsics.f(r1.f115083b, baseCurrency));
            default:
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                return new z63.l(((jg1.b) this.f286532b).f173897a, !Intrinsics.f(r1.f115083b, baseCurrency));
        }
    }
}
