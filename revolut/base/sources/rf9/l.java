package rf9;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import grl.k9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rch.o;
import skm.a2;
import vkm.j2;
import vkm.q;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jg9.g f253728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gf9.b f253729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wo1.b f253730n;
    public final onh.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final of9.m f253731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f253732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f253733r;

    public l(jg9.g formExtension, gf9.b warningExtension, wo1.b billsInteractor, onh.b mapper, of9.m validator) {
        Intrinsics.checkNotNullParameter(formExtension, "formExtension");
        Intrinsics.checkNotNullParameter(warningExtension, "warningExtension");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f253728l = formExtension;
        this.f253729m = warningExtension;
        this.f253730n = billsInteractor;
        this.o = mapper;
        this.f253731p = validator;
        this.f253732q = q.c(new m(null, f0.f322471a, r0.g(), false));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o3(rf9.l r5, java.util.List r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof rf9.k
            if (r0 == 0) goto L13
            r0 = r7
            rf9.k r0 = (rf9.k) r0
            int r1 = r0.f253727w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253727w = r1
            goto L18
        L13:
            rf9.k r0 = new rf9.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253727w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            java.lang.Object r6 = zhm.d0.d0(r6)
            com.revolut.feature.apm.bills.core.api.model.BillFormField r6 = (com.revolut.feature.apm.bills.core.api.model.BillFormField) r6
            if (r6 != 0) goto L3d
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L3d:
            kotlinx.coroutines.flow.Flow r7 = r5.e3()
            qna.n r2 = new qna.n
            rf9.d r7 = (rf9.d) r7
            r4 = 11
            r2.<init>(r7, r6, r4)
            r0.f253727w = r3
            java.lang.Object r7 = vkm.q.x(r2, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            com.revolut.core.ui_kit.delegates.InputTextDelegate$Model r7 = (com.revolut.core.ui_kit.delegates.InputTextDelegate.Model) r7
            r5.k1(r7)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rf9.l.o3(rf9.l, java.util.List, gim.c):java.lang.Object");
    }

    public static xo1.g p3(wi0.b bVar) {
        wi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, wi0.b.y0)) {
            return xo1.g.DIAS_REFERENCE;
        }
        if (Intrinsics.f(bVar, wi0.b.y2)) {
            return xo1.g.MBREF;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Bills&Taxes: Unsupported country for generic case: ", bVar.f297794a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    @Override // xf9.a
    public final boolean Z2(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return true;
    }

    @Override // xf9.a
    public final Flow e3() {
        return new d(this.f253732q, this, 0);
    }

    @Override // xf9.a
    public final Unit f3() {
        wi0.b bVar = ((m) this.f253732q.getValue()).f253734a;
        xo1.g gVarP3 = bVar != null ? p3(bVar) : null;
        if (gVarP3 == null) {
            return Unit.f186387a;
        }
        T2(new f(this, gVarP3, null), new yi5.b(27));
        return Unit.f186387a;
    }

    @Override // xf9.a
    public final void g3(String listId, String extractedValue, String str) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        i2b.a.P(listId, extractedValue, str, new o(2, this, l.class, "updateFieldValue", "updateFieldValue(Ljava/lang/String;Ljava/lang/String;)V", 0, 1));
    }

    @Override // xf9.a
    public final void i3(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.P;
        BillFormField formField = obj2 instanceof BillFormField ? (BillFormField) obj2 : null;
        if (formField == null) {
            super.i3(model);
            return;
        }
        a onResult = new a(this, 0);
        jg9.l lVar = (jg9.l) this.f253728l;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (formField.f61276c == xo1.c.QRCODE_OR_BARCODE) {
            lVar.f173949l.getClass();
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.pay_bills_taxes_scanner_picker_title, null, null, 14), null, null, null, false, 30);
            List listK = v.k(tg9.d.a(R$string.pay_bills_taxes_scanner_picker_action_barcode, new GlyphImage(R$drawable.uikit_icn_24_scan_card, null, null, 6), tg9.c.BARCODE), tg9.d.a(R$string.pay_bills_taxes_scanner_picker_action_qrcode, new GlyphImage(R$drawable.uikit_icn_24_scan_qr, null, null, 6), tg9.c.QR));
            k9 k9Var = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            lVar.N2(new RowActionsBottomSheetController(new eii.c(aVar, null, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new j2c.o(lVar, 7, formField, onResult));
        }
    }

    @Override // xf9.a
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.P;
        BillFormField billFormField = obj2 instanceof BillFormField ? (BillFormField) obj2 : null;
        if (billFormField == null) {
            super.k1(model);
        } else {
            ((jg9.l) this.f253728l).c3(billFormField, new a(this, 1));
        }
    }

    @Override // xf9.a
    public final void m3(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        xo1.g gVarP3 = p3(countryCode);
        if (gVarP3 == null) {
            return;
        }
        while (true) {
            j2 j2Var = this.f253732q;
            Object value = j2Var.getValue();
            wi0.b bVar = countryCode;
            if (j2Var.h(value, m.a((m) value, bVar, null, null, false, 14))) {
                Continuation continuation = null;
                T2(new r83.g(this, gVarP3, continuation, 16), new yi5.b(27));
                this.f253733r = yji.n.j2(this, q.q(new d(j2Var, this, 1)), null, new h(this, continuation, 0), 3);
                return;
            }
            countryCode = bVar;
        }
    }

    @Override // xf9.a
    public final void n3(wi0.b countryCode) {
        j2 j2Var;
        Object value;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        do {
            j2Var = this.f253732q;
            value = j2Var.getValue();
        } while (!j2Var.h(value, m.a((m) value, null, null, null, false, 14)));
        a2 a2Var = this.f253733r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f253733r = null;
    }

    public final void q3(String str, String str2) {
        j2 j2Var;
        Object value;
        m mVar;
        do {
            j2Var = this.f253732q;
            value = j2Var.getValue();
            mVar = (m) value;
        } while (!j2Var.h(value, m.a(mVar, null, null, r0.q(mVar.f253736c, new Pair(str, str2)), false, 11)));
    }

    public final void r3(List list) {
        String str;
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            BillFormField billFormField = (BillFormField) it8.next();
            if (billFormField.f61276c == xo1.c.INFO && (str = billFormField.i) != null) {
                q3(billFormField.f61274a, str);
            }
        }
    }
}
