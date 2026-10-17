package vqc;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.TextData f291381b;

    public /* synthetic */ l(InputTextDelegate.TextData textData, int i) {
        this.f291380a = i;
        this.f291381b = textData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291380a) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, null, this.f291381b.f52598b.toString(), 1);
            case 1:
                h3g.a it8 = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(this.f291381b.f52597a, it8.f149114a.b()) && it8.f149114a.f92761a.f92790c != myf.f.DATE);
            case 2:
                y4g.i update2 = (y4g.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return y4g.i.a(update2, y4g.g.a(update2.f310926b, this.f291381b.f52598b.toString(), null, 2), false, null, 13);
            case 3:
                ye1.i update3 = (ye1.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ye1.i.a(update3, null, null, 0L, this.f291381b.f52598b.toString(), null, null, od1.b.DESCRIPTION, null, null, null, false, 3959);
            case 4:
                yy6.l update4 = (yy6.l) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return yy6.l.a(update4, null, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a.a(update4.f317848c, this.f291381b.f52598b.toString(), null, false, false, null, null, null, null, 2043), 11);
            case 5:
                yy6.l update5 = (yy6.l) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return yy6.l.a(update5, null, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a.a(update5.f317848c, null, this.f291381b.f52598b.toString(), false, false, null, null, null, null, 2039), 11);
            case 6:
                yy6.l update6 = (yy6.l) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return yy6.l.a(update6, null, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a.a(update6.f317848c, null, null, false, false, null, null, this.f291381b.f52598b.toString(), null, 1535), 11);
            default:
                yy6.l update7 = (yy6.l) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return yy6.l.a(update7, null, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a.a(update7.f317848c, null, null, false, false, null, null, null, this.f291381b.f52598b.toString(), 1023), 11);
        }
    }
}
