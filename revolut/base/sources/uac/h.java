package uac;

import android.content.Context;
import android.icu.text.MeasureFormat;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tsk.t;
import u45.w0;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingTrackingScreenContract$InputData f278580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f278581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f278582c;
    public final e4m.e d;
    public final e4m.e e;

    public h(f fVar, i iVar, ViewController viewController, ShippingTrackingScreenContract$InputData shippingTrackingScreenContract$InputData) {
        this.f278581b = fVar;
        this.f278580a = shippingTrackingScreenContract$InputData;
        this.f278582c = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.d = e4m.b.b(new w0(fVar, this, 1, i));
        this.e = e4m.b.b(new w0(fVar, this, 0, i));
    }

    public final tbc.b b() {
        Context context = this.f278581b.i;
        l.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Locale locale = jh.d.d(context);
        s.k(locale);
        Intrinsics.checkNotNullParameter(locale, "locale");
        MeasureFormat measureFormat = MeasureFormat.getInstance(locale, MeasureFormat.FormatWidth.SHORT);
        Intrinsics.checkNotNullExpressionValue(measureFormat, "getInstance(...)");
        s.k(measureFormat);
        return new tbc.b(new t(measureFormat));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
