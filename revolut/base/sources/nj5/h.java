package nj5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.receive_widget.impl.R$string;
import com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationController;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.CurrencyChooserFlow;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.youTransactor.uCube.rpc.Constants;
import dsh.j;
import dsh.n;
import dsh.q;
import efm.r;
import h6i.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements csh.e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fkg.a f216375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f216376c;
    public final xh5.a d;
    public final dsh.e e;

    public h(com.revolut.feature.crypto.remittance.api.navigation.a cryptoRemittanceCurrencyChooserFlowProvider, fkg.a qrCodeGenerator, xoj.a featuresInteractor, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(cryptoRemittanceCurrencyChooserFlowProvider, "cryptoRemittanceCurrencyChooserFlowProvider");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f216375b = qrCodeGenerator;
        this.f216376c = featuresInteractor;
        this.d = cryptoFeatureEnabledInteractor;
        dsh.e.Companion.getClass();
        this.e = dsh.d.a();
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof nj5.e
            if (r6 == 0) goto L13
            r6 = r7
            nj5.e r6 = (nj5.e) r6
            int r0 = r6.f216371w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f216371w = r0
            goto L1a
        L13:
            nj5.e r6 = new nj5.e
            gim.c r7 = (gim.c) r7
            r6.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f216371w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r7)
            goto L73
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            xoj.a r7 = r5.f216376c
            yoj.c r1 = yoj.c.CRYPTO_DEPOSITS
            efm.r r7 = xoj.a.d(r7, r1)
            nhg.f0 r1 = new nhg.f0
            r3 = 8
            r1.<init>(r3)
            nd3.a r3 = new nd3.a
            r4 = 19
            r3.<init>(r1, r4)
            efm.r r7 = r7.map(r3)
            java.lang.String r1 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            xh5.a r1 = r5.d
            ji5.e r1 = (ji5.e) r1
            efm.r r1 = r1.f()
            efm.r r7 = kli.a.h(r7, r1)
            nhg.f0 r1 = new nhg.f0
            r3 = 9
            r1.<init>(r3)
            efm.r r7 = nim.a.w(r7, r1)
            r6.f216371w = r2
            java.lang.Object r7 = nim.a.c(r7, r6)
            if (r7 != r0) goto L73
            return r0
        L73:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Object r6 = r7.getContent()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nj5.h.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "ReceiveSmall")) {
            return new ActionWidgetLoadingDelegate.Model(id10);
        }
        throw new IllegalArgumentException(j6.a.q("Invalid widgetType: ", widgetType));
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (!Intrinsics.f(widgetType, "ReceiveSmall")) {
            super.h(widgetContext2, widgetType, inputConfig);
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_home_feed_widget_receive_config_select_crypto, null, null, 14);
        CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData = new CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData((CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies) null, new TextLocalisedClause(R$string.crypto_home_feed_widget_catalog_receive_title, null, null, 14), (CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint) CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.DepositWidget.f70939a, (pj5.a) null, (TextLocalisedClause) null, false, false, Constants.TAG_F5);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CurrencyChooserFlow currencyChooserFlow = new CurrencyChooserFlow(inputData);
        Intrinsics.checkNotNullParameter(currencyChooserFlow, "<this>");
        return new j(textLocalisedClause, new n(new CryptoReceiveWidgetCustomizationController(currencyChooserFlow), new q(inputConfig, 4)), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext r6, java.lang.String r7, java.lang.String r8, dsh.e r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof nj5.d
            if (r0 == 0) goto L13
            r0 = r10
            nj5.d r0 = (nj5.d) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            nj5.d r0 = new nj5.d
            gim.c r10 = (gim.c) r10
            r0.<init>(r5, r10)
        L1a:
            java.lang.Object r10 = r0.f216370y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r8 = r0.f216369x
            java.lang.String r7 = r0.f216368w
            com.revolut.feature.crypto_feed.models.CryptoWidgetContext r6 = r0.v
            nj5.h r9 = r0.u
            yhm.o.b(r10)
            goto L55
        L40:
            yhm.o.b(r10)
            if (r9 != 0) goto L58
            r0.u = r5
            r0.v = r6
            r0.f216368w = r7
            r0.f216369x = r8
            r0.A = r4
            dsh.e r10 = r5.e
            if (r10 != r1) goto L54
            goto L6f
        L54:
            r9 = r5
        L55:
            dsh.e r10 = (dsh.e) r10
            goto L5a
        L58:
            r10 = r9
            r9 = r5
        L5a:
            kotlinx.coroutines.flow.Flow r6 = r9.g(r6, r7, r8, r10)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f216368w = r7
            r0.f216369x = r7
            r0.A = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nj5.h.f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(CryptoWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        wk5.a aVar;
        wk5.a aVar2;
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        String strA = config.a("RECEIVE_CRYPTO_WIDGET_CRYPTOCURRENCY");
        String strA2 = config.a("RECEIVE_CRYPTO_WIDGET_ADDRESS");
        String strA3 = config.a("RECEIVE_CRYPTO_WIDGET_BLOCKCHAIN");
        if (strA3 != null) {
            wk5.a[] aVarArrValues = wk5.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar2 = null;
                    break;
                }
                aVar2 = aVarArrValues[i];
                if (a0.z(aVar2.name(), strA3, true)) {
                    break;
                }
                i++;
            }
            aVar = aVar2;
        } else {
            aVar = null;
        }
        if (strA == null || strA2 == null) {
            return new go.g(new ActionWidgetDelegate.Model(id10, new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorAccentNeutral_10), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_qr, Integer.valueOf(R$attr.uikit_colorAccentNeutral), 12.0f, 12.0f, 12.0f, 12.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), new TextLocalisedClause(R$string.crypto_home_feed_widget_receive_placeholder, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccentNeutral), false, false, 254), 10)), 2);
        }
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a(strA);
        r rVarX = fkg.a.m(this.f216375b, strA2, new h90.a(4, 4), i80.c.M, 20).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rd0.e.e(new z(rd0.e.b(rVarX), this, strA2, bVarA, strA, aVar, id10, 2), h0.f322473a, new g(this, id10, null));
    }
}
