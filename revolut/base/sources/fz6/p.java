package fz6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v9d.a f139129b;

    public /* synthetic */ p(v9d.a aVar, int i) {
        this.f139128a = i;
        this.f139129b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139128a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, null, this.f139129b.f287018a, null, null, null, null, false, ISO781611.SMT_TAG);
            default:
                yy6.l update2 = (yy6.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return yy6.l.a(update2, null, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a.a(update2.f317848c, null, null, false, false, null, this.f139129b.f287018a, null, null, 1791), 11);
        }
    }
}
