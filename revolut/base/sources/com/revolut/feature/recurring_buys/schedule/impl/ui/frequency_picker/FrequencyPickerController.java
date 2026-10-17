package com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.recurring_buys.schedule.api.R$string;
import com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.FrequencyPickerContract$InputData;
import com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.FrequencyPickerController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nua.b;
import nua.c;
import nua.e;
import nua.f;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurring_buys/schedule/impl/ui/frequency_picker/FrequencyPickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnua/b;", "Ldli/a;", "Lnua/c;", "feature_recurring_buys_schedule_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FrequencyPickerController extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FrequencyPickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final FrequencyPickerContract$InputData K;
    public final Object L;
    public final Object M;
    public final h N;
    public final int O;
    public final Object P;
    public final Object Q;

    public FrequencyPickerController(FrequencyPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nua.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FrequencyPickerController f219271b;

            {
                this.f219271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FrequencyPickerController frequencyPickerController = this.f219271b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FrequencyPickerController.R;
                        return (h) ((kua.a) frequencyPickerController.M.getValue()).f189762b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FrequencyPickerController.R;
                        phm.a aVar = (phm.a) ue0.e.j(frequencyPickerController.m2()).a().get(kua.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kua.b.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.di.FrequencyPickerControllerInjector");
                        kua.b bVar = ((kua.b) objB).f189763a;
                        FrequencyPickerContract$InputData frequencyPickerContract$InputData = frequencyPickerController.K;
                        frequencyPickerContract$InputData.getClass();
                        return new kua.a(bVar, frequencyPickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FrequencyPickerController.R;
                        FrequencyPickerController frequencyPickerController2 = this.f219271b;
                        return dli.f.a(frequencyPickerController2, (h) frequencyPickerController2.L.getValue(), u.c((SingleChoiceDelegate) frequencyPickerController2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nua.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FrequencyPickerController f219271b;

            {
                this.f219271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FrequencyPickerController frequencyPickerController = this.f219271b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FrequencyPickerController.R;
                        return (h) ((kua.a) frequencyPickerController.M.getValue()).f189762b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FrequencyPickerController.R;
                        phm.a aVar = (phm.a) ue0.e.j(frequencyPickerController.m2()).a().get(kua.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kua.b.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.di.FrequencyPickerControllerInjector");
                        kua.b bVar = ((kua.b) objB).f189763a;
                        FrequencyPickerContract$InputData frequencyPickerContract$InputData = frequencyPickerController.K;
                        frequencyPickerContract$InputData.getClass();
                        return new kua.a(bVar, frequencyPickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FrequencyPickerController.R;
                        FrequencyPickerController frequencyPickerController2 = this.f219271b;
                        return dli.f.a(frequencyPickerController2, (h) frequencyPickerController2.L.getValue(), u.c((SingleChoiceDelegate) frequencyPickerController2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, e.f);
        this.O = R$layout.screen_recycler_navbar_bottomsheet;
        this.P = w.y0(new ns1.a(17));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: nua.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FrequencyPickerController f219271b;

            {
                this.f219271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FrequencyPickerController frequencyPickerController = this.f219271b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FrequencyPickerController.R;
                        return (h) ((kua.a) frequencyPickerController.M.getValue()).f189762b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FrequencyPickerController.R;
                        phm.a aVar = (phm.a) ue0.e.j(frequencyPickerController.m2()).a().get(kua.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kua.b.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.di.FrequencyPickerControllerInjector");
                        kua.b bVar = ((kua.b) objB).f189763a;
                        FrequencyPickerContract$InputData frequencyPickerContract$InputData = frequencyPickerController.K;
                        frequencyPickerContract$InputData.getClass();
                        return new kua.a(bVar, frequencyPickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FrequencyPickerController.R;
                        FrequencyPickerController frequencyPickerController2 = this.f219271b;
                        return dli.f.a(frequencyPickerController2, (h) frequencyPickerController2.L.getValue(), u.c((SingleChoiceDelegate) frequencyPickerController2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (kua.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (nua.h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.cryptobuysell_recurring_buy_order_frequency, null, null, 14), null, null, null, false, 30));
        ViewController.P2(this, rd0.e.b(((SingleChoiceDelegate) this.P.getValue()).p()), new f(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
