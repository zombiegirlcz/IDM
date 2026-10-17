package com.revolut.feature.cashback.impl.ui.yourcashback.withdraw;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import bc1.a;
import be3.c;
import be3.d;
import be3.g;
import be3.h;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.impl.R$id;
import com.revolut.feature.cashback.impl.R$layout;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.CashbackWithdrawMetalScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ihm.f;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import vc.s;
import wp5.y;
import yc3.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/withdraw/CashbackWithdrawMetalScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lbe3/h;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/withdraw/CashbackWithdrawMetalScreenContract$InputData;", "Laii/q;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashbackWithdrawMetalScreen extends BaseRecyclerViewScreen<h, CashbackWithdrawMetalScreenContract$InputData, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65736d0 = {o0.f186429a.j(new h0(CashbackWithdrawMetalScreen.class, "binding", "getBinding()Lcom/revolut/feature/cashback/impl/databinding/ScreenCashbackWithdrawMetalBinding;", 0))};
    public final int U;
    public final boolean V;
    public final ao.h W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65737a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65738b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackWithdrawMetalScreen(CashbackWithdrawMetalScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_cashback_withdraw_metal;
        this.V = true;
        this.W = s.t(this, c.f);
        this.X = R$id.cashbackWithdrawMetalScreen_recyclerView;
        this.Y = w.y0(new a(this, inputData, 2));
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: be3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackWithdrawMetalScreen f14652b;

            {
                this.f14652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                final int i3 = 1;
                final int i5 = 0;
                final CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen = this.f14652b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackWithdrawMetalScreen.f65736d0;
                        return (g) ((yc3.e) cashbackWithdrawMetalScreen.Y.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CashbackWithdrawMetalScreen.f65736d0;
                        return new AmountEditDelegate(new Function2() { // from class: be3.b
                            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i3;
                                CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen2 = cashbackWithdrawMetalScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr3 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data, "data");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = data.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar = (xi0.b) obj4;
                                        qd0.b bVarN = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN);
                                        return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data2, "data");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = data2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar2 = (xi0.b) obj5;
                                        qd0.b bVarN2 = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN2);
                                        return new zp0.d(editText2, bVar2, new u80.d(((s80.b) bVarN2).b()), null, null, false, false, 0, false, null, 1976);
                                }
                            }
                        });
                    case 2:
                        KProperty[] kPropertyArr3 = CashbackWithdrawMetalScreen.f65736d0;
                        return new CenteredAmountDelegate(new Function2() { // from class: be3.b
                            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i5;
                                CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen2 = cashbackWithdrawMetalScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr32 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data, "data");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = data.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar = (xi0.b) obj4;
                                        qd0.b bVarN = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN);
                                        return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data2, "data");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = data2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar2 = (xi0.b) obj5;
                                        qd0.b bVarN2 = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN2);
                                        return new zp0.d(editText2, bVar2, new u80.d(((s80.b) bVarN2).b()), null, null, false, false, 0, false, null, 1976);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                        return v.k((AmountEditDelegate) cashbackWithdrawMetalScreen.f65737a0.getValue(), (CenteredAmountDelegate) cashbackWithdrawMetalScreen.f65738b0.getValue());
                }
            }
        });
        final int i2 = 1;
        this.f65737a0 = w.y0(new Function0(this) { // from class: be3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackWithdrawMetalScreen f14652b;

            {
                this.f14652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                final int i3 = 1;
                final int i5 = 0;
                final CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen = this.f14652b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackWithdrawMetalScreen.f65736d0;
                        return (g) ((yc3.e) cashbackWithdrawMetalScreen.Y.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CashbackWithdrawMetalScreen.f65736d0;
                        return new AmountEditDelegate(new Function2() { // from class: be3.b
                            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i3;
                                CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen2 = cashbackWithdrawMetalScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr32 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data, "data");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = data.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar = (xi0.b) obj4;
                                        qd0.b bVarN = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN);
                                        return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data2, "data");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = data2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar2 = (xi0.b) obj5;
                                        qd0.b bVarN2 = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN2);
                                        return new zp0.d(editText2, bVar2, new u80.d(((s80.b) bVarN2).b()), null, null, false, false, 0, false, null, 1976);
                                }
                            }
                        });
                    case 2:
                        KProperty[] kPropertyArr3 = CashbackWithdrawMetalScreen.f65736d0;
                        return new CenteredAmountDelegate(new Function2() { // from class: be3.b
                            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i5;
                                CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen2 = cashbackWithdrawMetalScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr32 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data, "data");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = data.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar = (xi0.b) obj4;
                                        qd0.b bVarN = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN);
                                        return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data2, "data");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = data2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar2 = (xi0.b) obj5;
                                        qd0.b bVarN2 = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN2);
                                        return new zp0.d(editText2, bVar2, new u80.d(((s80.b) bVarN2).b()), null, null, false, false, 0, false, null, 1976);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                        return v.k((AmountEditDelegate) cashbackWithdrawMetalScreen.f65737a0.getValue(), (CenteredAmountDelegate) cashbackWithdrawMetalScreen.f65738b0.getValue());
                }
            }
        });
        final int i3 = 2;
        this.f65738b0 = w.y0(new Function0(this) { // from class: be3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackWithdrawMetalScreen f14652b;

            {
                this.f14652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                final int i32 = 1;
                final int i5 = 0;
                final CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen = this.f14652b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackWithdrawMetalScreen.f65736d0;
                        return (g) ((yc3.e) cashbackWithdrawMetalScreen.Y.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CashbackWithdrawMetalScreen.f65736d0;
                        return new AmountEditDelegate(new Function2() { // from class: be3.b
                            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i32;
                                CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen2 = cashbackWithdrawMetalScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr32 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data, "data");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = data.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar = (xi0.b) obj4;
                                        qd0.b bVarN = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN);
                                        return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data2, "data");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = data2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar2 = (xi0.b) obj5;
                                        qd0.b bVarN2 = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN2);
                                        return new zp0.d(editText2, bVar2, new u80.d(((s80.b) bVarN2).b()), null, null, false, false, 0, false, null, 1976);
                                }
                            }
                        });
                    case 2:
                        KProperty[] kPropertyArr3 = CashbackWithdrawMetalScreen.f65736d0;
                        return new CenteredAmountDelegate(new Function2() { // from class: be3.b
                            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i5;
                                CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen2 = cashbackWithdrawMetalScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr32 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data, "data");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = data.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar = (xi0.b) obj4;
                                        qd0.b bVarN = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN);
                                        return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data2, "data");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = data2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar2 = (xi0.b) obj5;
                                        qd0.b bVarN2 = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN2);
                                        return new zp0.d(editText2, bVar2, new u80.d(((s80.b) bVarN2).b()), null, null, false, false, 0, false, null, 1976);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                        return v.k((AmountEditDelegate) cashbackWithdrawMetalScreen.f65737a0.getValue(), (CenteredAmountDelegate) cashbackWithdrawMetalScreen.f65738b0.getValue());
                }
            }
        });
        final int i5 = 3;
        this.c0 = w.y0(new Function0(this) { // from class: be3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackWithdrawMetalScreen f14652b;

            {
                this.f14652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                final int i32 = 1;
                final int i59 = 0;
                final CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen = this.f14652b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackWithdrawMetalScreen.f65736d0;
                        return (g) ((yc3.e) cashbackWithdrawMetalScreen.Y.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CashbackWithdrawMetalScreen.f65736d0;
                        return new AmountEditDelegate(new Function2() { // from class: be3.b
                            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i32;
                                CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen2 = cashbackWithdrawMetalScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr32 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data, "data");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = data.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar = (xi0.b) obj4;
                                        qd0.b bVarN = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN);
                                        return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data2, "data");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = data2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar2 = (xi0.b) obj5;
                                        qd0.b bVarN2 = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN2);
                                        return new zp0.d(editText2, bVar2, new u80.d(((s80.b) bVarN2).b()), null, null, false, false, 0, false, null, 1976);
                                }
                            }
                        });
                    case 2:
                        KProperty[] kPropertyArr3 = CashbackWithdrawMetalScreen.f65736d0;
                        return new CenteredAmountDelegate(new Function2() { // from class: be3.b
                            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i59;
                                CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen2 = cashbackWithdrawMetalScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr32 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data, "data");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = data.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar = (xi0.b) obj4;
                                        qd0.b bVarN = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN);
                                        return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                                        Intrinsics.checkNotNullParameter(data2, "data");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = data2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        xi0.b bVar2 = (xi0.b) obj5;
                                        qd0.b bVarN2 = ((yc3.e) cashbackWithdrawMetalScreen2.Y.getValue()).f312479b.f312446r.n();
                                        s.j(bVarN2);
                                        return new zp0.d(editText2, bVar2, new u80.d(((s80.b) bVarN2).b()), null, null, false, false, 0, false, null, 1976);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr4 = CashbackWithdrawMetalScreen.f65736d0;
                        return v.k((AmountEditDelegate) cashbackWithdrawMetalScreen.f65737a0.getValue(), (CenteredAmountDelegate) cashbackWithdrawMetalScreen.f65738b0.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (e) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f304099c.f59338a), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f304098b.o), null, new d(this, continuation, 1), 3);
        ?? r87 = this.f65737a0;
        f fVar = ((AmountEditDelegate) r87.getValue()).d.f121375b;
        ?? r3 = this.f65738b0;
        com.revolut.kompot.navigable.a.g2(this, y.x(fVar, ((CenteredAmountDelegate) r3.getValue()).d.f121375b, "mergeWith(...)"), null, new be3.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, y.x(((AmountEditDelegate) r87.getValue()).i.f121375b, ((CenteredAmountDelegate) r3.getValue()).f51967l.f121375b, "mergeWith(...)"), null, new be3.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f304099c.f59343j), null, new d(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        xc3.b bVarH3 = h3();
        NavBarWithAvatar navBarWithAvatar = bVarH3.f304099c;
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.cashback_box_action_withdraw, null, null, 14));
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        bVarH3.f304098b.setText(new TextLocalisedClause(R$string.cashback_box_action_withdraw, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        xc3.b bVarH3 = h3();
        bVarH3.f304098b.setEnabled(uiState.f14660b);
        NavBarWithAvatar navBarWithAvatar = bVarH3.f304099c;
        navBarWithAvatar.setToolbarDescription(uiState.f14661c);
        navBarWithAvatar.setAvatarImage(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.U;
    }

    public final xc3.b h3() {
        ViewBinding value = this.W.getValue(this, f65736d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xc3.b) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
