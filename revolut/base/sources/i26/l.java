package i26;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import c36.n;
import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.feature.defi.common.models.domain.DeFiFiatAmount;
import com.revolut.feature.in_app_calls.wrapper.VoiceCallInvite;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.transport.models.fields.TransportDetailsField;
import com.revolut.feature.transport.models.fields.TransportDetailsFieldValue;
import efm.r;
import ix7.c0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import le.u1;
import lim.q;
import mel.i0;
import nkm.p;
import nkm.x;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import rlm.m;
import ru.z;
import skm.e0;
import ulm.b1;
import ulm.r1;
import ulm.s1;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zw7.h1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static RewardTargetAccount A(tu.h hVar) {
        String strA = hVar.getAccountType();
        if (strA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        z type = z.valueOf(strA);
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return new RewardTargetAccount(hVar.getId(), hVar.getName(), hVar.getUsername(), type);
    }

    public static final Object B(Object obj2, Map mapping, Enum r62) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Object objV = u1.v(obj2, mapping);
        if (objV != null) {
            return objV;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.m(obj2, "There is no value corresponding to the key = "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, "Map: " + mapping, illegalArgumentException, h0Var);
        return r62;
    }

    public static final tu.h C(RewardTargetAccount rewardTargetAccount) {
        Intrinsics.checkNotNullParameter(rewardTargetAccount, "<this>");
        return new tu.h(rewardTargetAccount.f50671a, rewardTargetAccount.f50672b, rewardTargetAccount.f50673c, rewardTargetAccount.d.name());
    }

    public static final boolean D(wd6.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return hVar == wd6.h.MARKET || hVar == wd6.h.RECURRING;
    }

    public static final void E(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            ((qv0.l) d0.b0(list)).R0(qv0.k.Single);
            return;
        }
        if (list.size() > 1) {
            ((qv0.l) d0.b0(list)).R0(qv0.k.Top);
            int iJ = v.j(list);
            for (int i = 1; i < iJ; i++) {
                ((qv0.l) list.get(i)).R0(qv0.k.Middle);
            }
            ((qv0.l) d0.m0(list)).R0(qv0.k.Bottom);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View a(ah0.g gVar, Integer num) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        View view = (View) gVar;
        if (num != null) {
            view.setId(num.intValue());
        }
        return view;
    }

    public static final rlm.i b(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        rlm.i iVar = decoder instanceof rlm.i ? (rlm.i) decoder : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException(h30.l.t(o0.f186429a, decoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static final m c(Encoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        m mVar = encoder instanceof m ? (m) encoder : null;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException(h30.l.t(o0.f186429a, encoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final aim.e d(qv0.l header, AbstractList items, qv0.l showMoreItem, int i) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(showMoreItem, "showMoreItem");
        aim.e eVarB = u.b();
        header.R0(qv0.k.Header);
        eVarB.add(header);
        aim.e eVarB2 = u.b();
        eVarB2.addAll(d0.V0(items, i));
        if (items.size() > i) {
            eVarB2.add(showMoreItem);
        }
        aim.e eVarA = u.a(eVarB2);
        E(eVarA);
        eVarB.addAll(eVarA);
        return u.a(eVarB);
    }

    public static final aim.e e(qv0.l header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        aim.e eVarB = u.b();
        header.R0(qv0.k.Header);
        eVarB.add(header);
        E(items);
        eVarB.addAll(items);
        return u.a(eVarB);
    }

    public static final ShippingContact f(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ShippingContact) next).f84742c == nec.a.ACCOUNT) {
                break;
            }
        }
        ShippingContact shippingContact = (ShippingContact) next;
        return shippingContact == null ? (ShippingContact) d0.d0(list) : shippingContact;
    }

    public static final r g(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        r rVarFilter = rVar.filter(new km2.b(21, new knd.a(28)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return rVarFilter;
    }

    public static final UUID h(VoiceCallInvite voiceCallInvite) {
        Intrinsics.checkNotNullParameter(voiceCallInvite, "<this>");
        String str = (String) voiceCallInvite.f74841c.get("callId");
        if (str != null) {
            return UUID.fromString(str);
        }
        return null;
    }

    public static final q i(Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        return p.b(new x(th10, null));
    }

    public static final boolean j(of8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar == of8.a.ENABLED;
    }

    public static final zme.l k(List list, wi0.b countryCode) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((zme.l) next).f323500a, countryCode)) {
                break;
            }
        }
        zme.l lVar = (zme.l) next;
        if (lVar != null) {
            return lVar;
        }
        Iterator it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (Intrinsics.f(((zme.l) next2).f323500a.f297794a, "DEFAULTTEMPLATE")) {
                obj2 = next2;
                break;
            }
        }
        zme.l lVar2 = (zme.l) obj2;
        if (lVar2 == null) {
            throw new IllegalStateException(j6.a.q("Tax residency rule not found for user country: ", countryCode.f297794a));
        }
        boolean z = lVar2.f323501b;
        boolean z3 = lVar2.f323502c;
        zme.g gVar = lVar2.d;
        List requiredTaxForms = lVar2.e;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(requiredTaxForms, "requiredTaxForms");
        return new zme.l(countryCode, z, z3, gVar, requiredTaxForms);
    }

    public static final dj0.d l(fo3.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new dj0.d(Math.max(0L, cVar.h() - cVar.e), cVar.d);
    }

    public static final r1 m(HttpException httpException) {
        ResponseBody responseBodyErrorBody;
        mmm.h hVarClone;
        Intrinsics.checkNotNullParameter(httpException, "<this>");
        Response<?> response = httpException.response();
        if (response == null || (responseBodyErrorBody = response.errorBody()) == null) {
            return null;
        }
        try {
            hVarClone = responseBodyErrorBody.source().getBuffer().clone();
        } catch (IllegalStateException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            hVarClone = null;
        }
        if (hVarClone == null) {
            return null;
        }
        try {
            s1 s1Var = ResponseBody.Companion;
            b1 b1VarContentType = responseBodyErrorBody.contentType();
            long jContentLength = responseBodyErrorBody.contentLength();
            s1Var.getClass();
            return s1.b(hVarClone, b1VarContentType, jContentLength);
        } catch (Exception e2) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
            return null;
        }
    }

    public static final void n(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        View view = fragment.requireView();
        Intrinsics.checkNotNullExpressionValue(view, "requireView(...)");
        Intrinsics.checkNotNullParameter(contextRequireContext, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Object systemService = contextRequireContext.getSystemService("input_method");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final boolean o(zme.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (!lVar.f323502c) {
            return false;
        }
        zme.g gVar = lVar.d;
        return (gVar != null ? gVar.f323486b : null) != zme.b.DISCLOSURE_OPTIONAL;
    }

    public static final boolean p(wd6.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return hVar == wd6.h.MARKET;
    }

    public static final long q(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return bigInteger.longValueExact();
        }
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        throw new ArithmeticException("Out of range");
    }

    public static final us3.a r(it3.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (iv3.a.f168706a[fVar.ordinal()]) {
            case 1:
                return us3.a.INCOME_FETCH_READY;
            case 2:
                return us3.a.INCOME_FETCH_STARTED;
            case 3:
                return us3.a.INCOME_FETCH_FINISHED;
            case 4:
                return us3.a.INCOME_FETCH_FAILED;
            case 5:
                return us3.a.INCOME_FETCH_BLOCKED;
            case 6:
                return us3.a.INCOME_CHECK_PASSED;
            case 7:
                return us3.a.INCOME_CHECK_FAILED;
            case 8:
                return us3.a.INCOME_CHECK_SKIPPED;
            default:
                throw new IllegalStateException("Can't support this status " + fVar);
        }
    }

    public static final void s(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (drawable instanceof AnimatedVectorDrawable) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            animatedVectorDrawable.reset();
            animatedVectorDrawable.start();
        }
        if (drawable instanceof AnimatedVectorDrawableCompat) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawable;
            animatedVectorDrawableCompat.stop();
            animatedVectorDrawableCompat.start();
        }
    }

    public static final void t(qam.e eVar, qam.b cameraDevice) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        cameraDevice.f244056a.getClass();
        nd.k.k();
        Camera camera = cameraDevice.f244059g;
        if (camera == null) {
            Intrinsics.r("camera");
            throw null;
        }
        camera.stopPreview();
        cameraDevice.f244056a.getClass();
        nd.k.k();
        Surface surface = cameraDevice.f;
        if (surface == null) {
            Intrinsics.r("surface");
            throw null;
        }
        surface.release();
        Camera camera2 = cameraDevice.f244059g;
        if (camera2 == null) {
            Intrinsics.r("camera");
            throw null;
        }
        camera2.release();
        eVar.getClass();
        eVar.f244071h = e0.b();
    }

    public static final DeFiFiatAmount u(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        BigDecimal bigDecimal = new BigDecimal(nVar.f20907a);
        xi0.a aVar = xi0.b.Companion;
        String str = nVar.f20908b;
        aVar.getClass();
        return new DeFiFiatAmount(bigDecimal, xi0.a.a(str));
    }

    public static final TransportDetailsField v(avf.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String strA = eVar.getCode();
        String strB = eVar.getLabel();
        avf.f fVarC = eVar.getValue();
        Intrinsics.checkNotNullParameter(fVarC, "<this>");
        return new TransportDetailsField(strA, strB, new TransportDetailsFieldValue(fVarC.getValue(), fVarC.getLabel()));
    }

    public static final ArrayList w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<g9f.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (g9f.c cVar : list2) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new TransferBroker(cVar.f141546a, cVar.f141547b, io3.h.H(cVar.f141548c)));
        }
        return arrayList;
    }

    public static final i0 x(m2l.i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        mel.q qVarValueOf = mel.q.valueOf(i0Var.f202208a);
        List<m2l.h0> list = i0Var.f202209b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (m2l.h0 h0Var : list) {
            Intrinsics.checkNotNullParameter(h0Var, "<this>");
            arrayList.add(new mel.h0(h0Var.f202202a, mel.q.valueOf(h0Var.f202203b), h0Var.f202204c));
        }
        List<m2l.h0> list2 = i0Var.f202210c;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (m2l.h0 h0Var2 : list2) {
            Intrinsics.checkNotNullParameter(h0Var2, "<this>");
            arrayList2.add(new mel.h0(h0Var2.f202202a, mel.q.valueOf(h0Var2.f202203b), h0Var2.f202204c));
        }
        return new i0(qVarValueOf, arrayList, arrayList2, hx7.i.S(i0Var.d));
    }

    public static final ro1.c y(wn1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.getTransactionId() == null) {
            String standingOrderId = aVar.getStandingOrderId();
            return new ro1.d(standingOrderId != null ? standingOrderId : "");
        }
        String transactionId = aVar.getTransactionId();
        String counterpartyId = aVar.getCounterpartyId();
        return new ro1.e(transactionId, counterpartyId != null ? counterpartyId : "");
    }

    public static final ArrayList z(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<c0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (c0 c0Var : list2) {
            Intrinsics.checkNotNullParameter(c0Var, "<this>");
            String strD = c0Var.getId();
            String strE = c0Var.getMonthlyPayment();
            String strC = c0Var.getExcess();
            String strA = c0Var.getCoPayment();
            ix7.g gVarB = c0Var.getDiscount();
            dj0.d dVarO = null;
            zw7.l lVar = gVarB != null ? new zw7.l(gVarB.getMonthlyPayment(), gVarB.getDurationMonths()) : null;
            jo3.a aVarF = c0Var.getPaymentDelta();
            if (aVarF != null) {
                dVarO = mo3.a.o(aVarF);
            }
            arrayList.add(new h1(strD, strE, strC, strA, lVar, dVarO));
        }
        return arrayList;
    }
}
