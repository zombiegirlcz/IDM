package g4i;

import android.widget.TextView;
import b79.i;
import b9.f2;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.revolut.core.ui_kit.R$id;
import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationTypeDto;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.pix.api.model.PixAuthorisationFrequency;
import com.revolut.feature.pix.api.model.PixQrCodeAdditionalInformation;
import com.revolut.feature.pix.api.model.PixQrCodeAgent;
import com.revolut.feature.pix.api.model.PixQrCodeAmount;
import com.revolut.feature.pix.api.model.PixQrCodeBill;
import com.revolut.feature.pix.api.model.PixQrCodeChange;
import com.revolut.feature.pix.api.model.PixQrCodeCreditor;
import com.revolut.feature.pix.api.model.PixQrCodeDataDetails;
import com.revolut.feature.pix.api.model.PixQrCodeDebtor;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeFailureReason;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeResult;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeStatus;
import com.revolut.feature.pix.api.model.PixQrCodeIdentification;
import com.revolut.feature.pix.api.model.PixQrCodeImplementation;
import com.revolut.feature.pix.api.model.PixQrCodeMoneyBreakdown;
import com.revolut.feature.pix.api.model.PixQrCodeParty;
import com.revolut.feature.pix.api.model.PixQrCodeReferences;
import com.revolut.feature.pix.api.model.PixQrCodeRetryPolicy;
import com.revolut.feature.pix.api.model.PixQrCodeWithdrawal;
import com.revolut.feature.pix.impl.data.model.PixQrCodeDecodeStatusDto;
import com.revolut.feature.push_to_card.api.data.Card;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.store.api.model.StoreLogoBadge;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import efm.r;
import f2e.g2;
import h93.w;
import h93.x;
import h93.y;
import hw0.g;
import hw0.j;
import hx7.e;
import igm.q;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.f;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.a0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import l8a.b0;
import l8a.c0;
import l8a.e0;
import l8a.f0;
import l8a.g0;
import l8a.i0;
import l8a.j0;
import l8a.k0;
import l8a.l0;
import l8a.p0;
import le.u1;
import mlm.h;
import n14.k;
import n8a.z;
import p6l.l;
import slm.t;
import so3.c;
import sra.b;
import tof.x1;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.q0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final CardOwner A(b bVar) {
        wpa.a aVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f265151a;
        String str2 = bVar.f265152b;
        String str3 = bVar.f265153c;
        String str4 = bVar.d;
        String str5 = bVar.e;
        String str6 = bVar.f;
        wpa.a[] aVarArrValues = wpa.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), str6, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = wpa.a.OTHER;
        }
        wpa.a aVar2 = aVar;
        sra.a aVar3 = bVar.f265154g;
        Intrinsics.checkNotNullParameter(aVar3, "<this>");
        String lastFour = aVar3.getLastFour();
        String billingCurrency = aVar3.getBillingCurrency();
        String scheme = aVar3.getScheme();
        String issuerName = aVar3.getIssuerName();
        String issuerCountry = aVar3.getIssuerCountry();
        c address = aVar3.getAddress();
        return new CardOwner(str, str2, str3, str4, str5, aVar2, new Card(lastFour, billingCurrency, scheme, issuerName, issuerCountry, address != null ? to3.a.a(address) : null, aVar3.getCity(), aVar3.getLogoUrl()), bVar.f265155h);
    }

    public static final StoreLogoBadge B(g2 g2Var) {
        Object objA;
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        String str = g2Var.f131599a;
        String str2 = g2Var.f131600b;
        dw0.a aVar = null;
        if (str2 != null) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = dw0.a.valueOf(str2);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            aVar = (dw0.a) (objA instanceof n ? null : objA);
        }
        return new StoreLogoBadge(str, aVar);
    }

    public static final BeneficiaryIdentificationType C(BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDto) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentificationTypeDto, "<this>");
        int i = z.f213359b[beneficiaryIdentificationTypeDto.ordinal()];
        if (i == 1) {
            return BeneficiaryIdentificationType.BR_CPF;
        }
        if (i == 2) {
            return BeneficiaryIdentificationType.BR_CNPJ;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final y D(l lVar) {
        Object next;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        w wVar = x.Companion;
        String name = lVar.getChangeStatus();
        wVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<E> it8 = x.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((x) next).name(), name, true)) {
                break;
            }
        }
        x xVar = (x) next;
        if (xVar == null) {
            xVar = x.NONE;
        }
        return new y(xVar);
    }

    public static final ArrayList E(List list) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            b6l.b bVar = (b6l.b) it8.next();
            try {
                m.Companion companion = m.INSTANCE;
                objA = F(bVar);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                e.n(thA);
            }
            if (objA instanceof n) {
                objA = null;
            }
            w5l.a aVar = (w5l.a) objA;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static final w5l.a F(b6l.b bVar) {
        w5l.b bVar2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        w5l.c cVar = (w5l.c) u1.u(bVar.getState(), k.k());
        String strI = bVar.getYouthId();
        String strF = bVar.getId();
        String strE = bVar.getDesignCode();
        e93.b bVar3 = (e93.b) u1.u(bVar.getBrand(), n14.e.j());
        b6l.a aVarD = bVar.getCustomisation();
        if (aVarD != null) {
            Intrinsics.checkNotNullParameter(aVarD, "<this>");
            bVar2 = new w5l.b(aVarD.getImageUrl(), aVarD.getBase64Image());
        } else {
            bVar2 = null;
        }
        return new w5l.a(strF, strI, strE, bVar3, cVar, bVar2, bVar.getVirtual(), bVar.getCardProfileId(), bVar.getCardName());
    }

    public static final g2 G(StoreLogoBadge storeLogoBadge) {
        Intrinsics.checkNotNullParameter(storeLogoBadge, "<this>");
        String str = storeLogoBadge.f88533a;
        dw0.a aVar = storeLogoBadge.f88534b;
        return new g2(str, aVar != null ? aVar.name() : null);
    }

    public static final b6l.b H(w5l.a aVar) {
        b6l.a aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strG = u1.g(aVar.e, k.k());
        String str = aVar.f295351b;
        String str2 = aVar.f295350a;
        String str3 = aVar.f295352c;
        String strG2 = u1.g(aVar.d, n14.e.j());
        w5l.b bVar = aVar.f;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            aVar2 = new b6l.a(bVar.f295355a, bVar.f295356b);
        } else {
            aVar2 = null;
        }
        return new b6l.b(strG, str, str2, str3, strG2, aVar2, aVar.f295353g, aVar.f295354h, aVar.i);
    }

    public static final ArrayList I(List list) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            w5l.a aVar = (w5l.a) it8.next();
            try {
                m.Companion companion = m.INSTANCE;
                objA = H(aVar);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                e.n(thA);
            }
            if (objA instanceof n) {
                objA = null;
            }
            b6l.b bVar = (b6l.b) objA;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static final b J(CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "<this>");
        String str = cardOwner.f81490a;
        String str2 = cardOwner.f81491b;
        String str3 = cardOwner.f81492c;
        String str4 = cardOwner.d;
        String str5 = cardOwner.e;
        String strName = cardOwner.f.name();
        Card card = cardOwner.f81493g;
        Intrinsics.checkNotNullParameter(card, "<this>");
        String str6 = card.f81485a;
        String str7 = card.f81486b;
        String str8 = card.f81487c;
        String str9 = card.d;
        String str10 = card.e;
        Address address = card.f;
        return new b(str, str2, str3, str4, str5, strName, new sra.a(str6, str7, str8, str9, str10, address != null ? oc.c.D(address) : null, card.f81488g, card.f81489h), cardOwner.f81494h);
    }

    public static final String K(Coordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "<this>");
        return coordinates.f97948a + "," + coordinates.f97949b;
    }

    public static boolean L(Object obj2, igm.o oVar, fgm.b bVar) {
        CompletableSource completableSource;
        if (!(obj2 instanceof q)) {
            return false;
        }
        try {
            Object obj3 = ((q) obj2).get();
            if (obj3 != null) {
                Object objApply = oVar.apply(obj3);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                completableSource = (CompletableSource) objApply;
            } else {
                completableSource = null;
            }
            if (completableSource != null) {
                completableSource.c(bVar);
                return true;
            }
            bVar.onSubscribe(jgm.c.INSTANCE);
            bVar.onComplete();
            return true;
        } catch (Throwable th10) {
            ce9.m.F(th10);
            bVar.onSubscribe(jgm.c.INSTANCE);
            bVar.onError(th10);
            return true;
        }
    }

    public static boolean M(Object obj2, igm.o oVar, fgm.l lVar) {
        MaybeSource maybeSource;
        if (!(obj2 instanceof q)) {
            return false;
        }
        try {
            Object obj3 = ((q) obj2).get();
            if (obj3 != null) {
                Object objApply = oVar.apply(obj3);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                maybeSource = (MaybeSource) objApply;
            } else {
                maybeSource = null;
            }
            if (maybeSource == null) {
                jgm.c.a(lVar);
                return true;
            }
            maybeSource.c(new qgm.k(lVar, 0));
            return true;
        } catch (Throwable th10) {
            ce9.m.F(th10);
            jgm.c.c(th10, lVar);
            return true;
        }
    }

    public static boolean N(Object obj2, igm.o oVar, fgm.l lVar) {
        SingleSource singleSource;
        if (!(obj2 instanceof q)) {
            return false;
        }
        try {
            Object obj3 = ((q) obj2).get();
            if (obj3 != null) {
                Object objApply = oVar.apply(obj3);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                singleSource = (SingleSource) objApply;
            } else {
                singleSource = null;
            }
            if (singleSource == null) {
                jgm.c.a(lVar);
                return true;
            }
            singleSource.c(new qgm.k(lVar, 1));
            return true;
        } catch (Throwable th10) {
            ce9.m.F(th10);
            jgm.c.c(th10, lVar);
            return true;
        }
    }

    public static final JsonElement O(Json json, Object obj2, h serializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new t(json, new i(ref$ObjectRef, 11), 1).encodeSerializableValue(serializer, obj2);
        Object obj3 = ref$ObjectRef.f186409a;
        if (obj3 != null) {
            return (JsonElement) obj3;
        }
        Intrinsics.r("result");
        throw null;
    }

    public static final boolean a(j jVar, int i) {
        return ((jVar == null || !l(jVar) || i <= 0) ? 0 : d(jVar, i)) <= p(jVar, i);
    }

    public static final r c(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        r map = rVar.map(new xg6.k(new xif.c(29), 24));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r map2 = map.map(new xg6.k(new an9.t(linkedHashSet, 17), 23));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    public static final int d(j jVar, int i) {
        if (jVar instanceof hw0.h) {
            return f.g(((hw0.h) jVar).f156004a, 0, i - 1) + 1;
        }
        if (jVar instanceof g) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != '@') {
                String strSubstring = str.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    public static final List f(rzj.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof rzj.a) {
            return ((rzj.a) fVar).f258689b;
        }
        rzj.j[] elements = {fVar.a(), fVar.e()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.L(elements);
    }

    public static rh.f g(qh.c cVar) {
        rh.g gVar = (rh.g) ch.h.c().a(rh.g.class);
        rh.a aVar = (rh.a) gVar.f254285a.get(cVar);
        ch.d dVar = gVar.f254286b;
        Executor executorI = cVar.i();
        if (executorI != null) {
            dVar.getClass();
        } else {
            executorI = (Executor) dVar.f24016a.get();
        }
        return new rh.f(aVar, executorI, zzun.zzb(cVar.a()), cVar);
    }

    public static int h(cm.a aVar, int i) {
        int i2;
        int i3;
        if (aVar == null) {
            return 0;
        }
        cm.b bVarB = aVar.b();
        cm.b bVar = cm.b.HORIZONTAL;
        if (bVarB == bVar) {
            if (aVar.b() == bVar) {
                i2 = i(aVar, i);
            } else {
                i2 = aVar.f25087a;
                if (aVar.a() == zl.a.DROP) {
                    i2 *= 3;
                }
            }
            i3 = aVar.f25089c;
        } else {
            if (aVar.b() == bVar) {
                i2 = aVar.f25087a;
                if (aVar.a() == zl.a.DROP) {
                    i2 *= 3;
                }
            } else {
                i2 = i(aVar, i);
            }
            i3 = aVar.d;
        }
        return i2 + i3;
    }

    public static int i(cm.a aVar, int i) {
        int i2 = aVar.f25097q;
        int i3 = aVar.f25087a;
        int i5 = aVar.f25090g;
        int i6 = aVar.f25088b;
        int iC = 0;
        for (int i21 = 0; i21 < i2; i21++) {
            int i22 = i5 / 2;
            int i32 = i3 + i22 + iC;
            if (i == i21) {
                return i32;
            }
            iC = a10.b.C(i3, i6, i22, i32);
        }
        return aVar.a() == zl.a.DROP ? (i3 * 2) + iC : iC;
    }

    public static final is0.a j(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Object tag2 = textView.getTag(R$id.internal_typeface_companion);
        is0.a aVar = tag2 instanceof is0.a ? (is0.a) tag2 : null;
        if (aVar != null) {
            return aVar;
        }
        is0.a aVar2 = new is0.a(textView);
        textView.setTag(R$id.internal_typeface_companion, aVar2);
        return aVar2;
    }

    public static final EsimPhoneNumberSelections k(String mobilePlanId, List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((EsimPhoneNumberSelections) next).f100407a.contains(mobilePlanId)) {
                break;
            }
        }
        return (EsimPhoneNumberSelections) next;
    }

    public static final boolean l(j jVar) {
        return (jVar != null ? jVar.a() : null) == hw0.i.HIDDEN_LINE;
    }

    public static final boolean m(x1 x1Var) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        x1[] elements = {x1.NPP, x1.NPP_OSKO, x1.NPP_SINGLE_CREDIT_TRANSFER, x1.DE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.y0(elements).contains(x1Var);
    }

    public static final boolean n(io3.d pocket, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        ArrayList arrayListA0 = d0.A0(list, pocket);
        if (arrayListA0.isEmpty()) {
            return true;
        }
        Iterator it8 = arrayListA0.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((io3.d) it8.next()).f163147c, pocket.f163147c)) {
                return false;
            }
        }
        return true;
    }

    public static final int o(j jVar, int i) {
        if (jVar instanceof hw0.h) {
            return i - 1;
        }
        if (jVar instanceof g) {
            return f.g(((g) jVar).f156002a, 0, i - 1) - 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int p(j jVar, int i) {
        return (jVar == null || !l(jVar) || i <= 0) ? i - 1 : o(jVar, i);
    }

    public static final Object q(ra0.h hVar, String str, Map map, gim.c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), u.c((String) entry.getValue()));
        }
        return hVar.c(str, linkedHashMap, cVar);
    }

    public static final long s(long j2, long j3) {
        return (((j3 / ((long) 2)) + j2) / j3) * j3;
    }

    public static final ClassId t(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean zH = a0.H(str, ".", false);
        if (zH) {
            str = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        return new ClassId(new FqName(a0.E(kotlin.text.d0.B0('/', str, ""), '/', CoreConstants.DOT)), new FqName(kotlin.text.d0.w0('/', str, str)), zH);
    }

    public static final PixQrCodeAmount u(l8a.z zVar) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Boolean overridable = zVar.getOverridable();
        Long amount = zVar.getAmount();
        String currency = zVar.getCurrency();
        if (amount == null || currency == null) {
            dVar = null;
        } else {
            long jLongValue = amount.longValue();
            xi0.b.Companion.getClass();
            dVar = new dj0.d(jLongValue, xi0.a.a(currency));
        }
        return new PixQrCodeAmount(dVar, overridable);
    }

    public static final PixQrCodeBill v(l8a.a0 a0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown;
        xi0.b bVarA;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Long lB = a0Var.getCreatedDate();
        Long lE = a0Var.getExpirationDate();
        String strF = a0Var.getLastSchedulableDate();
        String strD = a0Var.getDueDate();
        String strH = a0Var.getPaymentInstruction();
        e0 e0VarC = a0Var.getDebtor();
        PixQrCodeDebtor pixQrCodeDebtorY = e0VarC != null ? y(e0VarC) : null;
        List listA = a0Var.getAdditionalInformation();
        if (listA != null) {
            List<l8a.x> list = listA;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
            for (l8a.x xVar : list) {
                Intrinsics.checkNotNullParameter(xVar, "<this>");
                arrayList3.add(new PixQrCodeAdditionalInformation(xVar.getName(), xVar.getValue()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        j0 j0VarG = a0Var.getMoneyBreakdown();
        if (j0VarG != null) {
            Intrinsics.checkNotNullParameter(j0VarG, "<this>");
            String currency = j0VarG.getCurrency();
            if (currency != null) {
                xi0.b.Companion.getClass();
                bVarA = xi0.a.a(currency);
            } else {
                bVarA = null;
            }
            Long original = j0VarG.getOriginal();
            dj0.d dVar2 = (original == null || bVarA == null) ? null : new dj0.d(original.longValue(), bVarA);
            Long rebate = j0VarG.getRebate();
            dj0.d dVar3 = (rebate == null || bVarA == null) ? null : new dj0.d(rebate.longValue(), bVarA);
            Long discount = j0VarG.getDiscount();
            dj0.d dVar4 = (discount == null || bVarA == null) ? null : new dj0.d(discount.longValue(), bVarA);
            Long fines = j0VarG.getFines();
            dj0.d dVar5 = (fines == null || bVarA == null) ? null : new dj0.d(fines.longValue(), bVarA);
            Long interest = j0VarG.getInterest();
            if (interest == null || bVarA == null) {
                arrayList2 = arrayList;
                dVar = null;
            } else {
                arrayList2 = arrayList;
                dVar = new dj0.d(interest.longValue(), bVarA);
            }
            Long l2 = j0VarG.getFinal();
            pixQrCodeMoneyBreakdown = new PixQrCodeMoneyBreakdown(dVar2, dVar3, dVar4, dVar5, dVar, (l2 == null || bVarA == null) ? null : new dj0.d(l2.longValue(), bVarA), bVarA);
        } else {
            arrayList2 = arrayList;
            pixQrCodeMoneyBreakdown = null;
        }
        return new PixQrCodeBill(lB, lE, strF, strD, null, strH, pixQrCodeDebtorY, arrayList2, pixQrCodeMoneyBreakdown);
    }

    public static final PixQrCodeCreditor w(c0 c0Var) {
        PixQrCodeParty pixQrCodeParty;
        PixQrCodeIdentification pixQrCodeIdentification;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        k0 k0VarB = c0Var.getParty();
        PixQrCodeAgent pixQrCodeAgent = null;
        if (k0VarB != null) {
            Intrinsics.checkNotNullParameter(k0VarB, "<this>");
            String strC = k0VarB.getLegalName();
            i0 i0VarB = k0VarB.getIdentification();
            if (i0VarB != null) {
                Intrinsics.checkNotNullParameter(i0VarB, "<this>");
                BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDtoA = i0VarB.getType();
                pixQrCodeIdentification = new PixQrCodeIdentification(beneficiaryIdentificationTypeDtoA != null ? C(beneficiaryIdentificationTypeDtoA) : null, i0VarB.getValue());
            } else {
                pixQrCodeIdentification = null;
            }
            no3.b bVarA = k0VarB.getAddress();
            pixQrCodeParty = new PixQrCodeParty(strC, pixQrCodeIdentification, bVarA != null ? oo3.a.a(bVarA) : null);
        } else {
            pixQrCodeParty = null;
        }
        l8a.y yVarA = c0Var.getAgent();
        if (yVarA != null) {
            Intrinsics.checkNotNullParameter(yVarA, "<this>");
            pixQrCodeAgent = new PixQrCodeAgent(yVarA.getInstitutionName(), yVarA.getLogo());
        }
        return new PixQrCodeCreditor(pixQrCodeParty, pixQrCodeAgent);
    }

    public static final PixQrCodeDataDetails x(l8a.d0 d0Var) {
        PixQrCodeImplementation pixQrCodeImplementation;
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy;
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy2;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        String strC = d0Var.getCountry();
        String strK = d0Var.getImplementation();
        if (strK != null) {
            PixQrCodeImplementation[] pixQrCodeImplementationArrValues = PixQrCodeImplementation.values();
            int length = pixQrCodeImplementationArrValues.length;
            for (int i = 0; i < length; i++) {
                pixQrCodeImplementation = pixQrCodeImplementationArrValues[i];
                if (a0.z(pixQrCodeImplementation.name(), strK, true)) {
                    break;
                }
            }
            pixQrCodeImplementation = null;
        } else {
            pixQrCodeImplementation = null;
        }
        l8a.z zVarA = d0Var.getAmount();
        PixQrCodeAmount pixQrCodeAmountU = zVarA != null ? u(zVarA) : null;
        c0 c0VarD = d0Var.getCreditor();
        PixQrCodeCreditor pixQrCodeCreditorW = c0VarD != null ? w(c0VarD) : null;
        l8a.a0 a0VarB = d0Var.getBill();
        PixQrCodeBill pixQrCodeBillV = a0VarB != null ? v(a0VarB) : null;
        String strN = d0Var.getRecurrenceId();
        PixQrCodeCreditor pixQrCodeCreditor = pixQrCodeCreditorW;
        PixQrCodeBill pixQrCodeBill = pixQrCodeBillV;
        String strI = d0Var.getExpectedStartDate();
        int i2 = 0;
        PixQrCodeImplementation pixQrCodeImplementation2 = pixQrCodeImplementation;
        String strH = d0Var.getEndDate();
        String strJ = d0Var.getFrequency();
        PixAuthorisationFrequency pixAuthorisationFrequencyH = strJ != null ? foh.i.H(strJ) : null;
        String strO = d0Var.getRetryPolicy();
        if (strO != null) {
            PixQrCodeRetryPolicy[] pixQrCodeRetryPolicyArrValues = PixQrCodeRetryPolicy.values();
            int length2 = pixQrCodeRetryPolicyArrValues.length;
            while (true) {
                if (i2 >= length2) {
                    pixQrCodeRetryPolicy2 = null;
                    break;
                }
                pixQrCodeRetryPolicy2 = pixQrCodeRetryPolicyArrValues[i2];
                if (a0.z(pixQrCodeRetryPolicy2.name(), strO, true)) {
                    break;
                }
                i2++;
            }
            pixQrCodeRetryPolicy = pixQrCodeRetryPolicy2;
        } else {
            pixQrCodeRetryPolicy = null;
        }
        e0 e0VarE = d0Var.getDebtor();
        PixQrCodeDebtor pixQrCodeDebtorY = e0VarE != null ? y(e0VarE) : null;
        String strG = d0Var.getDocumentNumber();
        String strF = d0Var.getDocumentDescription();
        l8a.z zVarM = d0Var.getMinimumAmount();
        return new PixQrCodeDataDetails(strC, pixQrCodeImplementation2, pixQrCodeAmountU, pixQrCodeCreditor, pixQrCodeBill, strN, strI, strH, pixAuthorisationFrequencyH, pixQrCodeRetryPolicy, pixQrCodeDebtorY, strG, strF, zVarM != null ? u(zVarM) : null, d0Var.getMessage());
    }

    public static final PixQrCodeDebtor y(e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        String strB = e0Var.getLegalName();
        i0 i0VarA = e0Var.getIdentification();
        PixQrCodeIdentification pixQrCodeIdentification = null;
        if (i0VarA != null) {
            Intrinsics.checkNotNullParameter(i0VarA, "<this>");
            BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDtoA = i0VarA.getType();
            pixQrCodeIdentification = new PixQrCodeIdentification(beneficiaryIdentificationTypeDtoA != null ? C(beneficiaryIdentificationTypeDtoA) : null, i0VarA.getValue());
        }
        return new PixQrCodeDebtor(strB, pixQrCodeIdentification);
    }

    public static final PixQrCodeDecodeResult z(g0 g0Var) {
        PixQrCodeDecodeStatus pixQrCodeDecodeStatus;
        Object next;
        String str;
        PixQrCodeDecodeData pixQrCodeDecodeData;
        PixQrCodeImplementation pixQrCodeImplementation;
        PixQrCodeWithdrawal pixQrCodeWithdrawal;
        PixQrCodeChange pixQrCodeChange;
        PixQrCodeReferences pixQrCodeReferences;
        f0 f0Var;
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy;
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy2;
        PixQrCodeImplementation pixQrCodeImplementation2;
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        String strD = g0Var.getId();
        PixQrCodeDecodeStatusDto pixQrCodeDecodeStatusDtoF = g0Var.getStatus();
        Intrinsics.checkNotNullParameter(pixQrCodeDecodeStatusDtoF, "<this>");
        int i = z.f213358a[pixQrCodeDecodeStatusDtoF.ordinal()];
        if (i == 1) {
            pixQrCodeDecodeStatus = PixQrCodeDecodeStatus.CREATED;
        } else if (i == 2) {
            pixQrCodeDecodeStatus = PixQrCodeDecodeStatus.COMPLETED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pixQrCodeDecodeStatus = PixQrCodeDecodeStatus.FAILED;
        }
        String strE = g0Var.getPaymentDate();
        String strB = g0Var.getEncodedValue();
        Iterator<E> it8 = PixQrCodeDecodeFailureReason.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(g0Var.getFailureReason(), ((PixQrCodeDecodeFailureReason) next).name())) {
                break;
            }
        }
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason = (PixQrCodeDecodeFailureReason) next;
        f0 f0VarA = g0Var.getData();
        if (f0VarA != null) {
            Intrinsics.checkNotNullParameter(f0VarA, "<this>");
            String strD2 = f0VarA.getCountry();
            String strL = f0VarA.getImplementation();
            if (strL != null) {
                PixQrCodeImplementation[] pixQrCodeImplementationArrValues = PixQrCodeImplementation.values();
                int length = pixQrCodeImplementationArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        pixQrCodeImplementation2 = null;
                        break;
                    }
                    pixQrCodeImplementation2 = pixQrCodeImplementationArrValues[i2];
                    if (a0.z(pixQrCodeImplementation2.name(), strL, true)) {
                        break;
                    }
                    i2++;
                }
                pixQrCodeImplementation = pixQrCodeImplementation2;
            } else {
                pixQrCodeImplementation = null;
            }
            String strN = f0VarA.getMessage();
            l8a.z zVarA = f0VarA.getAmount();
            PixQrCodeAmount pixQrCodeAmountU = zVarA != null ? u(zVarA) : null;
            c0 c0VarE = f0VarA.getCreditor();
            PixQrCodeCreditor pixQrCodeCreditorW = c0VarE != null ? w(c0VarE) : null;
            p0 p0VarT = f0VarA.getWithdrawal();
            if (p0VarT != null) {
                Intrinsics.checkNotNullParameter(p0VarT, "<this>");
                l8a.z zVarA2 = p0VarT.getAmount();
                pixQrCodeWithdrawal = new PixQrCodeWithdrawal(zVarA2 != null ? u(zVarA2) : null);
            } else {
                pixQrCodeWithdrawal = null;
            }
            b0 b0VarC = f0VarA.getChange();
            if (b0VarC != null) {
                Intrinsics.checkNotNullParameter(b0VarC, "<this>");
                l8a.z zVarA3 = b0VarC.getAmount();
                pixQrCodeChange = new PixQrCodeChange(zVarA3 != null ? u(zVarA3) : null);
            } else {
                pixQrCodeChange = null;
            }
            l8a.a0 a0VarB = f0VarA.getBill();
            PixQrCodeBill pixQrCodeBillV = a0VarB != null ? v(a0VarB) : null;
            l0 l0VarR = f0VarA.getReferences();
            if (l0VarR != null) {
                Intrinsics.checkNotNullParameter(l0VarR, "<this>");
                pixQrCodeReferences = new PixQrCodeReferences(l0VarR.getTransactionId());
            } else {
                pixQrCodeReferences = null;
            }
            String strQ = f0VarA.getRecurrenceId();
            String strJ = f0VarA.getExpectedStartDate();
            String strI = f0VarA.getEndDate();
            String strK = f0VarA.getFrequency();
            PixAuthorisationFrequency pixAuthorisationFrequencyH = strK != null ? foh.i.H(strK) : null;
            String strS = f0VarA.getRetryPolicy();
            if (strS != null) {
                PixQrCodeRetryPolicy[] pixQrCodeRetryPolicyArrValues = PixQrCodeRetryPolicy.values();
                int length2 = pixQrCodeRetryPolicyArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        f0Var = f0VarA;
                        str = strD;
                        pixQrCodeRetryPolicy2 = null;
                        break;
                    }
                    pixQrCodeRetryPolicy2 = pixQrCodeRetryPolicyArrValues[i3];
                    f0Var = f0VarA;
                    str = strD;
                    if (a0.z(pixQrCodeRetryPolicy2.name(), strS, true)) {
                        break;
                    }
                    i3++;
                    f0VarA = f0Var;
                    strD = str;
                }
                pixQrCodeRetryPolicy = pixQrCodeRetryPolicy2;
            } else {
                f0Var = f0VarA;
                str = strD;
                pixQrCodeRetryPolicy = null;
            }
            e0 e0VarF = f0Var.getDebtor();
            PixQrCodeDebtor pixQrCodeDebtorY = e0VarF != null ? y(e0VarF) : null;
            String strH = f0Var.getDocumentNumber();
            String strG = f0Var.getDocumentDescription();
            l8a.z zVarO = f0Var.getMinimumAmount();
            PixQrCodeAmount pixQrCodeAmountU2 = zVarO != null ? u(zVarO) : null;
            l8a.d0 d0VarM = f0Var.getInstantPayment();
            PixQrCodeDataDetails pixQrCodeDataDetailsX = d0VarM != null ? x(d0VarM) : null;
            l8a.d0 d0VarP = f0Var.getRecurrence();
            pixQrCodeDecodeData = new PixQrCodeDecodeData(strD2, pixQrCodeImplementation, strN, pixQrCodeAmountU, pixQrCodeCreditorW, pixQrCodeWithdrawal, pixQrCodeChange, pixQrCodeBillV, pixQrCodeReferences, strQ, strJ, strI, pixAuthorisationFrequencyH, pixQrCodeRetryPolicy, pixQrCodeDebtorY, strH, strG, pixQrCodeAmountU2, pixQrCodeDataDetailsX, d0VarP != null ? x(d0VarP) : null);
        } else {
            str = strD;
            pixQrCodeDecodeData = null;
        }
        return new PixQrCodeDecodeResult(str, pixQrCodeDecodeStatus, strE, strB, pixQrCodeDecodeFailureReason, pixQrCodeDecodeData);
    }

    public boolean b(f2 f2Var) {
        return true;
    }

    public abstract void r(String str);
}
