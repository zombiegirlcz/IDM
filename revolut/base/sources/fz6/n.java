package fz6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f139124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f139125c;
    public final /* synthetic */ InputTextDelegate.TextData d;

    public /* synthetic */ n(int i, Function2 function2, InputTextDelegate.TextData textData, int i2) {
        this.f139123a = i2;
        this.f139124b = i;
        this.f139125c = function2;
        this.d = textData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139123a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ArrayList arrayListF1 = d0.f1(update.d);
                int i = this.f139124b;
                if (i >= 0 && i < update.d.size()) {
                    arrayListF1.set(i, this.f139125c.invoke(arrayListF1.get(i), this.d.f52598b.toString()));
                }
                return h.a(update, null, null, null, arrayListF1, null, null, false, 55);
            default:
                yy6.l update2 = (yy6.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ArrayList arrayListF12 = d0.f1(update2.f317848c.f73952h);
                int i2 = this.f139124b;
                arrayListF12.set(i2, this.f139125c.invoke(arrayListF12.get(i2), this.d.f52598b.toString()));
                return yy6.l.a(update2, null, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a.a(update2.f317848c, null, null, false, false, arrayListF12, null, null, null, 1919), 11);
        }
    }
}
