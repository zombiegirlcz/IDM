package fkg;

import a26.s;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreen;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import efm.x;
import fkd.f0;
import g2e.t;
import hx7.e;
import ie.l;
import igm.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import joh.a0;
import joh.w;
import kfm.o;
import kl.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import l80.h;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sf8.n;
import uqh.r;
import vkm.d;
import vkm.v1;
import w4l.k;
import yhm.m;
import zel.f;
import zel.g;
import zel.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements gkd.b, x, SuccessContinuation, Callback, el.b, zp0.c, oqh.a, ne0.a, o, p, oii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f135824b;

    public a(s function) {
        this.f135823a = 28;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f135824b = function;
    }

    public static /* synthetic */ i80.a l(a aVar, String str, h90.a aVar2, i80.c cVar, i80.b bVar, Integer num, int i) {
        if ((i & 8) != 0) {
            cVar = i80.c.M;
        }
        i80.c cVar2 = cVar;
        if ((i & 32) != 0) {
            num = null;
        }
        return aVar.j(str, aVar2, 0, cVar2, bVar, num);
    }

    public static ufm.c m(a aVar, String data, h90.a widthHeight, i80.c cVar, int i) {
        if ((i & 8) != 0) {
            cVar = i80.c.M;
        }
        i80.c errorCorrectionLevel = cVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        Intrinsics.checkNotNullParameter(errorCorrectionLevel, "errorCorrectionLevel");
        ufm.c cVar2 = new ufm.c(new a80.b((Object) aVar, data, (Serializable) widthHeight, (Object) errorCorrectionLevel, 4), 2);
        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
        return cVar2;
    }

    public static d v(a aVar, f screenerInstrumentGroup, List filters, g gVar, i iVar, int i, int i2) {
        if ((i2 & 16) != 0) {
            i = 1000;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(screenerInstrumentGroup, "screenerInstrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ugl.c.a((ugl.c) aVar.f135824b, sph.o.a(screenerInstrumentGroup), filters, gVar, iVar, Integer.valueOf(i), 96);
    }

    @Override // gkd.b
    public String a() throws Throwable {
        try {
            m.Companion companion = m.INSTANCE;
            throw new IllegalStateException("primary deeplink is not supported by SlotNoButtonsTodoTileDeeplinkExtractor");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            Throwable thA = m.a(yhm.o.a(th10));
            if (thA == null) {
                return null;
            }
            e.n(thA);
            return null;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f135823a) {
            case 25:
                return ((j2i.c) this.f135824b).invoke(obj2);
            default:
                return ((s) this.f135824b).invoke(obj2);
        }
    }

    @Override // oqh.a
    public oqh.b b(ViewController viewController, nqh.e eVar, r rVar, o5d.b bVar) {
        eVar.getClass();
        return new a0((w) this.f135824b, eVar, rVar, bVar);
    }

    @Override // oii.a
    public void c() {
        ((kmk.f) this.f135824b).e3(kmk.a.CANCELLED);
    }

    @Override // gkd.b
    public String d() throws Throwable {
        try {
            m.Companion companion = m.INSTANCE;
            throw new IllegalStateException("secondary deeplink is not supported by SlotNoButtonsTodoTileDeeplinkExtractor");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            Throwable thA = m.a(yhm.o.a(th10));
            if (thA == null) {
                return null;
            }
            e.n(thA);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof khb.a
            if (r0 == 0) goto L13
            r0 = r6
            khb.a r0 = (khb.a) r0
            int r1 = r0.f184084w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184084w = r1
            goto L18
        L13:
            khb.a r0 = new khb.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184084w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L51
        L27:
            r6 = move-exception
            goto L56
        L29:
            r6 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r6 = r5.f135824b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            fnc.s r6 = (fnc.s) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f184084w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            hy2.e r2 = new hy2.e     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r3 = 26
            r4 = 0
            r2.<init>(r6, r4, r3)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            skm.p0 r6 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            elm.f r6 = elm.f.f127540b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r6 != r1) goto L51
            return r1
        L51:
            lhb.b r6 = (lhb.b) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r6
        L56:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
            return r6
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fkg.a.f(gim.c):java.lang.Object");
    }

    @Override // oii.a
    public void g() {
        ((kmk.f) this.f135824b).e3(kmk.a.FINISHED);
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        SchedulersProvider schedulersProvider = (SchedulersProvider) ((il.g) this.f135824b).get();
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        return new OnfidoNavigation(schedulersProvider);
    }

    @Override // ne0.a
    public String getKey() {
        return (String) this.f135824b;
    }

    @Override // gkd.b
    public String h() {
        return ((f0) this.f135824b).f135763b.f135754h;
    }

    public v1 i(dv9.m mVar, long j2, boolean z) {
        return new v1(new jv9.g(j2, this, mVar, z, null));
    }

    public i80.a j(String data, h90.a widthHeight, int i, i80.c errorCorrectionLevel, i80.b format, Integer num) {
        gi.a aVar;
        vh.a aVar2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        Intrinsics.checkNotNullParameter(errorCorrectionLevel, "errorCorrectionLevel");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(errorCorrectionLevel, "errorCorrectionLevel");
        Intrinsics.checkNotNullParameter(format, "format");
        aim.f builder = new aim.f();
        builder.put(vh.b.MARGIN, Integer.valueOf(i));
        vh.b bVar = vh.b.ERROR_CORRECTION;
        int i2 = j80.d.f172077a[errorCorrectionLevel.ordinal()];
        if (i2 == 1) {
            aVar = gi.a.L;
        } else if (i2 == 2) {
            aVar = gi.a.M;
        } else if (i2 == 3) {
            aVar = gi.a.Q;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = gi.a.H;
        }
        builder.put(bVar, aVar);
        if (num != null) {
            builder.put(vh.b.QR_VERSION, num);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f fVarB = builder.b();
        int i3 = j80.b.f172076a[format.ordinal()];
        if (i3 == 1) {
            aVar2 = vh.a.QR_CODE;
        } else if (i3 == 2) {
            aVar2 = vh.a.CODE_39;
        } else if (i3 == 3) {
            aVar2 = vh.a.CODE_128;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = vh.a.EAN_13;
        }
        j80.a params = new j80.a(fVarB, aVar2);
        j80.e eVar = (j80.e) this.f135824b;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        yh.b bitMatrix = eVar.f172078a.b(data, aVar2, widthHeight.f150078a, widthHeight.f150079b, fVarB);
        Intrinsics.checkNotNullExpressionValue(bitMatrix, "encode(...)");
        Intrinsics.checkNotNullParameter(bitMatrix, "bitMatrix");
        int i5 = bitMatrix.f313679a;
        int i6 = bitMatrix.f313680b;
        int[][] iArr = new int[i5][];
        for (int i21 = 0; i21 < i5; i21++) {
            iArr[i21] = new int[i6];
        }
        int i22 = bitMatrix.f313679a;
        for (int i32 = 0; i32 < i22; i32++) {
            for (int i33 = 0; i33 < i6; i33++) {
                iArr[i32][i33] = bitMatrix.a(i32, i33) ? 1 : 0;
            }
        }
        return new i80.a(iArr);
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        com.revolut.feature.credit.autopay.ui.screen.amount.input.b bVar = (com.revolut.feature.credit.autopay.ui.screen.amount.input.b) ((InputAmountScreen) this.f135824b).e3();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        bVar.H2(bVar.f68613t, new je2.d(bVar, formattedValue, 20));
    }

    public Intent n(String dapAppUri, String str) {
        Intrinsics.checkNotNullParameter(dapAppUri, "dapAppUri");
        od0.a aVar = od0.a.f224253a;
        Intent intentO = o(dapAppUri, od0.a.e() ? "hu.gov.dap.app.uat" : "hu.gov.dap.app");
        if (intentO != null) {
            return intentO;
        }
        if (str != null) {
            return o(str, null);
        }
        return null;
    }

    public Intent o(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (str2 != null && !d0.W(str2)) {
            intent.setPackage(str2);
        }
        if (intent.resolveActivity(((z70.a) this.f135824b).getContext().getPackageManager()) != null) {
            return intent;
        }
        return null;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable t2) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t2, "t");
        ((Callback) this.f135824b).onFailure(call, t2);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        ((Callback) this.f135824b).onResponse(call, response);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.String r10, gim.c r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f135824b
            f2k.e r0 = (f2k.e) r0
            boolean r1 = r11 instanceof g5k.g
            if (r1 == 0) goto L17
            r1 = r11
            g5k.g r1 = (g5k.g) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.z = r2
            goto L1c
        L17:
            g5k.g r1 = new g5k.g
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r1.f140808x
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.z
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L42
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L34
            java.lang.String r10 = r1.f140807w
            wi0.b r0 = r1.v
            yhm.o.b(r11)
            goto L9c
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.String r10 = r1.u
            yhm.o.b(r11)
            goto L5e
        L42:
            yhm.o.b(r11)
            kotlinx.coroutines.flow.Flow r11 = r0.h()
            g5k.f r3 = new g5k.f
            r7 = 0
            r3.<init>(r7)
            jhi.b r11 = mo3.a.g(r11, r6, r3, r5)
            r1.u = r10
            r1.z = r5
            java.lang.Object r11 = vkm.q.x(r11, r1)
            if (r11 != r2) goto L5e
            goto L97
        L5e:
            d2k.i r11 = (d2k.i) r11
            java.util.List r11 = r11.f110881b
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L68:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r11.next()
            r5 = r3
            d2k.h r5 = (d2k.h) r5
            wi0.b r5 = r5.f110878a
            java.lang.String r5 = r5.f297794a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r10)
            if (r5 == 0) goto L68
            goto L81
        L80:
            r3 = r6
        L81:
            d2k.h r3 = (d2k.h) r3
            if (r3 == 0) goto La4
            wi0.b r10 = r3.f110878a
            java.lang.String r11 = r3.f110879b
            r1.u = r6
            r1.v = r10
            r1.f140807w = r11
            r1.z = r4
            java.io.Serializable r0 = r0.a(r10, r1)
            if (r0 != r2) goto L98
        L97:
            return r2
        L98:
            r8 = r0
            r0 = r10
            r10 = r11
            r11 = r8
        L9c:
            xi0.b r11 = (xi0.b) r11
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData r1 = new com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData
            r1.<init>(r0, r10, r11)
            return r1
        La4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Remittance country code "
            java.lang.String r1 = " not available"
            java.lang.String r10 = a10.b.s(r0, r10, r1)
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fkg.a.p(java.lang.String, gim.c):java.lang.Object");
    }

    public List q(p78.b selectionType, io3.d dVar) {
        ProductAccountListAction productAccountListAction;
        io3.d dVar2 = dVar;
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        sf8.m mVar = selectionType.f233573b;
        ProductAccountListAction productAccountListActionA = null;
        if (mVar.f262364h.contains(n.SHOW_PROFILE)) {
            productAccountListAction = new ProductAccountListAction(376, null, new TextLocalisedClause(R$string.junior_account_switcher_account_cell_settings_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), selectionType, "SWIPE_ACTION_SETTINGS", null, null, false, false);
        } else {
            productAccountListAction = null;
        }
        wa7.p pVar = (wa7.p) this.f135824b;
        ra7.b bVar = ra7.c.Companion;
        ProductAccountListAction productAccountListActionB = pVar.b(null, false, true);
        if (dVar2 != null) {
            String str = dVar2.f163145a;
            io3.d dVar3 = mVar.f262363g;
            if (Intrinsics.f(str, dVar3 != null ? dVar3.f163145a : null) || !mVar.i) {
                dVar2 = null;
            }
            if (dVar2 != null) {
                productAccountListActionA = ProductAccountListAction.a(sfe.d.e, null, false, dVar2, 383);
            }
        }
        ProductAccountListAction[] elements = {productAccountListAction, productAccountListActionB, productAccountListActionA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public Flow r(InvestOrdersParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return vrl.g.a((vrl.g) this.f135824b, params, 4);
    }

    public boolean s() {
        od0.a aVar = od0.a.f224253a;
        String str = od0.a.e() ? "hu.gov.dap.app.uat" : "hu.gov.dap.app";
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("eudi-openid4vp").authority("").build());
        intent.setPackage(str);
        return intent.resolveActivity(((z70.a) this.f135824b).getContext().getPackageManager()) != null;
    }

    public String t(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = (String[]) this.f135824b;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    @Override // igm.p
    public boolean test(Object obj2) {
        return ((Class) this.f135824b).isInstance(obj2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        switch (this.f135823a) {
            case 8:
                ((hh.a) this.f135824b).getClass();
                return Tasks.forResult((List) obj2);
            default:
                qe.b bVar = (qe.b) obj2;
                ie.n nVar = ((l) this.f135824b).e;
                return bVar == null ? Tasks.forResult(null) : Tasks.whenAll((Task<?>[]) new Task[]{ie.n.a(nVar), nVar.f160544m.n(null, nVar.e.f173167a)});
        }
    }

    public String toString() {
        switch (this.f135823a) {
            case 16:
                StringBuilder sb6 = new StringBuilder();
                int iW = w();
                for (int i = 0; i < iW; i++) {
                    sb6.append(t(i));
                    sb6.append(": ");
                    sb6.append(x(i));
                    sb6.append("\n");
                }
                return sb6.toString();
            default:
                return super.toString();
        }
    }

    public akg.n u(String productId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        eqb.b bVar = (eqb.b) this.f135824b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(bVar.d.b(productId, loadingStrategy), new gqa.a(1));
    }

    public int w() {
        return ((String[]) this.f135824b).length / 2;
    }

    public String x(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = (String[]) this.f135824b;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public /* synthetic */ a(hh.a aVar, int i, int i2) {
        this.f135823a = 8;
        this.f135824b = aVar;
    }

    public a(j2i.c function) {
        this.f135823a = 25;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f135824b = function;
    }

    @Override // efm.x
    public efm.w apply(efm.r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return pd.b.r(upstream, new h56.a(this, 5));
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f135823a = i;
        this.f135824b = obj2;
    }

    public a(f0 tile) {
        this.f135823a = 4;
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f135824b = tile;
    }

    public a(g90.a telephonyProvider) {
        this.f135823a = 9;
        Intrinsics.checkNotNullParameter(telephonyProvider, "telephonyProvider");
        this.f135824b = telephonyProvider;
    }

    public a(h systemTimeProvider) {
        this.f135823a = 12;
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f135824b = systemTimeProvider;
    }

    public a(Context defaultContext) {
        this.f135823a = 0;
        Intrinsics.checkNotNullParameter(defaultContext, "defaultContext");
        this.f135824b = defaultContext;
    }

    public a(fnc.s emailPayrollRepository) {
        this.f135823a = 27;
        Intrinsics.checkNotNullParameter(emailPayrollRepository, "emailPayrollRepository");
        this.f135824b = emailPayrollRepository;
    }

    public a(c0 juniorTasksRewardsQuoteRepository) {
        this.f135823a = 10;
        Intrinsics.checkNotNullParameter(juniorTasksRewardsQuoteRepository, "juniorTasksRewardsQuoteRepository");
        this.f135824b = juniorTasksRewardsQuoteRepository;
    }

    public a(j80.c paramsBuilder, j80.e encoder, j80.f matrixParser) {
        this.f135823a = 19;
        Intrinsics.checkNotNullParameter(paramsBuilder, "paramsBuilder");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(matrixParser, "matrixParser");
        this.f135824b = encoder;
    }

    public a(jv9.e endpointProvider) {
        this.f135823a = 22;
        Intrinsics.checkNotNullParameter(endpointProvider, "endpointProvider");
        this.f135824b = endpointProvider;
    }

    public a(f2k.e countryChooserInteractor) {
        this.f135823a = 1;
        Intrinsics.checkNotNullParameter(countryChooserInteractor, "countryChooserInteractor");
        this.f135824b = countryChooserInteractor;
    }

    public a(vrl.g investOrdersInteractor) {
        this.f135823a = 11;
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        this.f135824b = investOrdersInteractor;
    }

    public a(z70.a contextProvider) {
        this.f135823a = 23;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f135824b = contextProvider;
    }

    public a(tr.b mediaMetadataMapper) {
        this.f135823a = 18;
        Intrinsics.checkNotNullParameter(mediaMetadataMapper, "mediaMetadataMapper");
        this.f135824b = mediaMetadataMapper;
    }

    public a(ugl.c screenerInteractor, sph.o screenerInstrumentTypeMapper) {
        this.f135823a = 17;
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(screenerInstrumentTypeMapper, "screenerInstrumentTypeMapper");
        this.f135824b = screenerInteractor;
    }

    public a(eqb.b savingsUpgradesRepository) {
        this.f135823a = 5;
        Intrinsics.checkNotNullParameter(savingsUpgradesRepository, "savingsUpgradesRepository");
        this.f135824b = savingsUpgradesRepository;
    }

    public a(v60.g expiryDateTypesBuilder) {
        this.f135823a = 6;
        Intrinsics.checkNotNullParameter(expiryDateTypesBuilder, "expiryDateTypesBuilder");
        this.f135824b = expiryDateTypesBuilder;
    }

    public a(wa7.p hiddenAccountsActionsProvider) {
        this.f135823a = 2;
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        this.f135824b = hiddenAccountsActionsProvider;
    }

    public a(ybl.b instrumentTickerInteractor) {
        this.f135823a = 7;
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f135824b = instrumentTickerInteractor;
    }

    public a(t nextPageTokenSerializer) {
        this.f135823a = 3;
        Intrinsics.checkNotNullParameter(nextPageTokenSerializer, "nextPageTokenSerializer");
        this.f135824b = nextPageTokenSerializer;
    }

    public a(io.grpc.okhttp.internal.e eVar) {
        this.f135823a = 16;
        ArrayList arrayList = eVar.f163003a;
        this.f135824b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public a(l lVar, String str) {
        this.f135823a = 13;
        this.f135824b = lVar;
    }

    public a(String orderId) {
        this.f135823a = 24;
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f135824b = a0.d.v(new Object[]{orderId}, 1, "ORDER_ITEM_MEMORY_KEY_%s", "format(...)");
    }
}
