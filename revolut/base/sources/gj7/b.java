package gj7;

import android.graphics.RectF;
import com.google.android.gms.common.Feature;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.model.BillInput;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.store.api.model.StoreLogoBadge;
import com.revolut.feature.store.api.model.StoreMegaOfferListItem;
import com.revolut.otp.input.flow.push.common.BaseOtpPushContract$InputData;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimProfileLock;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPorting;
import d2e.j;
import dej.j3;
import dej.t1;
import dej.x1;
import dej.y2;
import dj0.d;
import e8h.k;
import efm.r;
import f2e.g2;
import f2e.h3;
import f2e.k3;
import foh.i;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jj7.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import le.u1;
import lzi.c;
import lzi.e;
import lzi.h;
import nii.y0;
import nii.z;
import tfm.n4;
import xzg.w;
import xzg.x;
import xzg.y;
import yhm.m;
import yhm.n;
import yhm.o;
import yji.l;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zim.c2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final boolean A(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return (hVar instanceof c) || (hVar instanceof e);
    }

    public static final boolean B(t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        return C(t1Var) || u(t1Var);
    }

    public static final boolean C(t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        j3 j3Var = t1Var.f113651b;
        return j3Var == j3.PENDING || j3Var == j3.ORDERED;
    }

    public static final boolean D(t1 t1Var, String portingPhoneNumber) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        Intrinsics.checkNotNullParameter(portingPhoneNumber, "portingPhoneNumber");
        Iterable iterable = t1Var.K;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable<EsimSubscriptionPhoneNumber> iterable2 = iterable;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            return false;
        }
        for (EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber : iterable2) {
            if (Intrinsics.f(esimSubscriptionPhoneNumber.f100472c, portingPhoneNumber)) {
                EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = esimSubscriptionPhoneNumber.i;
                if ((esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f100491g : null) == y2.ELIGIBLE) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean E(t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        return t1Var.f113651b == j3.SUSPENDED;
    }

    public static final Flow F(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return lVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.help_center_faq_article_error_title, null, null, 14), new TextLocalisedClause(R$string.help_center_faq_article_error_subtitle, null, null, 14), new TextLocalisedClause(R$string.help_center_faq_article_error_button_text, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map G(kotlinx.serialization.json.JsonObject r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.Map r9 = r9.f187951a
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L16:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
            boolean r4 = r2 instanceof kotlinx.serialization.json.b
            r5 = 0
            if (r4 == 0) goto L4f
            kotlinx.serialization.json.b r2 = (kotlinx.serialization.json.b) r2
            boolean r4 = r2.b()
            if (r4 == 0) goto L41
            java.lang.String r2 = r2.a()
            goto Laa
        L41:
            java.lang.Integer r4 = rlm.j.i(r2)
            if (r4 == 0) goto L4d
            java.lang.Integer r2 = rlm.j.i(r2)
            goto Laa
        L4d:
            r2 = r5
            goto Laa
        L4f:
            boolean r4 = r2 instanceof kotlinx.serialization.json.JsonObject
            if (r4 == 0) goto L4d
            kotlinx.serialization.json.JsonObject r2 = (kotlinx.serialization.json.JsonObject) r2
            java.lang.String r4 = "amount"
            java.lang.Object r4 = r2.get(r4)
            boolean r6 = r4 instanceof kotlinx.serialization.json.b
            if (r6 == 0) goto L62
            kotlinx.serialization.json.b r4 = (kotlinx.serialization.json.b) r4
            goto L63
        L62:
            r4 = r5
        L63:
            if (r4 == 0) goto L4d
            qlm.j0 r6 = rlm.j.f255110a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r6 = rlm.j.m(r4)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L73
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L73
            goto L74
        L73:
            r4 = r5
        L74:
            if (r4 == 0) goto L4d
            long r6 = r4.longValue()
            java.lang.String r4 = "currency"
            java.lang.Object r2 = r2.get(r4)
            boolean r4 = r2 instanceof kotlinx.serialization.json.b
            if (r4 == 0) goto L87
            kotlinx.serialization.json.b r2 = (kotlinx.serialization.json.b) r2
            goto L88
        L87:
            r2 = r5
        L88:
            if (r2 == 0) goto L4d
            boolean r4 = r2.b()
            if (r4 == 0) goto L91
            goto L92
        L91:
            r2 = r5
        L92:
            if (r2 == 0) goto L4d
            java.lang.String r2 = r2.a()
            if (r2 != 0) goto L9b
            goto L4d
        L9b:
            dj0.d r4 = new dj0.d
            xi0.a r8 = xi0.b.Companion
            r8.getClass()
            xi0.b r2 = xi0.a.a(r2)
            r4.<init>(r6, r2)
            r2 = r4
        Laa:
            if (r2 == 0) goto Lb1
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r3, r2)
        Lb1:
            if (r5 == 0) goto L16
            r1.add(r5)
            goto L16
        Lb8:
            java.util.Map r9 = zhm.r0.t(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gj7.b.G(kotlinx.serialization.json.JsonObject):java.util.Map");
    }

    public static final String H(k kVar) {
        String strConcat;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        xzg.z zVar = kVar.f123701a;
        if (zVar instanceof y) {
            x xVar = ((y) zVar).f310037a;
            int i = xVar == null ? -1 : c7h.a.f21981b[xVar.ordinal()];
            if (i == -1) {
                str2 = "NO_SECURITY_TYPE";
            } else {
                if (i != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "SecurityType.CFD";
            }
            strConcat = "STOCK_".concat(str2);
        } else {
            if (!Intrinsics.f(zVar, w.f310036a)) {
                throw new NoWhenBranchMatchedException();
            }
            strConcat = "CRYPTO";
        }
        int i2 = c7h.a.f21980a[kVar.f123702b.ordinal()];
        if (i2 == 1) {
            str = "OneDay";
        } else if (i2 == 2) {
            str = "OneWeek";
        } else if (i2 == 3) {
            str = "OneMonth";
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "OneYear";
        }
        return p.a.p("MOST_TRADED_", strConcat, str);
    }

    public static final StoreMegaOfferListItem J(k3 k3Var) {
        Intrinsics.checkNotNullParameter(k3Var, "<this>");
        String str = k3Var.f131642a;
        String str2 = k3Var.f131643b;
        String str3 = k3Var.f131644c;
        String str4 = k3Var.d;
        g2 g2Var = k3Var.e;
        StoreLogoBadge storeLogoBadgeB = g2Var != null ? g4i.a.B(g2Var) : null;
        h3 h3Var = k3Var.f;
        return new StoreMegaOfferListItem(str, str2, str3, str4, storeLogoBadgeB, h3Var != null ? j.a(h3Var) : null);
    }

    public static final gl4.a K(fn4.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strE = aVar.getId();
        d dVarO = mo3.a.o(aVar.getAmount());
        LocalDate localDateD = aVar.getDueDate();
        String strB = aVar.getBillNumber();
        String strF = aVar.getQrCode();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(aVar.getCreatedAt());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return new gl4.a(strE, dVarO, localDateD, strB, strF, instantOfEpochMilli);
    }

    public static final gl4.c M(fn4.b bVar) throws Throwable {
        Object objA;
        gl4.b bVar2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String eligibilityStatus = bVar.getEligibilityStatus();
        Enum r06 = gl4.b.INELIGIBLE;
        try {
            m.Companion companion = m.INSTANCE;
            gl4.b[] bVarArrValues = gl4.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar2 = null;
                    break;
                }
                gl4.b bVar3 = bVarArrValues[i];
                if (a0.z(bVar3.name(), eligibilityStatus, true)) {
                    bVar2 = bVar3;
                    break;
                }
                i++;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (bVar2 == null) {
            throw new IllegalStateException("Unsupported enum value: " + eligibilityStatus + " for " + o0.f186429a.b(gl4.b.class).m());
        }
        objA = bVar2;
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        Enum r110 = (Enum) (objA instanceof n ? null : objA);
        if (r110 != null) {
            r06 = r110;
        }
        return new gl4.c((gl4.b) r06);
    }

    public static final hm8.b N(lm8.c cVar) {
        hm8.a aVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f196905a;
        hm8.a[] aVarArrValues = hm8.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = hm8.a.INELIGIBLE;
        }
        return new hm8.b(aVar);
    }

    public static final jc8.a P(a98.c cVar) {
        String strE = cVar.getId();
        e93.b bVar = (e93.b) u1.u(cVar.getBrand(), hx7.l.j());
        b93.b bVar2 = new b93.b(cVar.getDesignCode());
        a98.b bVarC = cVar.getCustomisation();
        return new jc8.a(strE, bVar, bVar2, bVarC != null ? new jc8.b(bVarC.getBase64Image(), bVarC.getImageUrl()) : null, cVar.getVirtual(), cVar.getCardProfileId());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final ti7.j R(w0 w0Var) {
        String strA = w0Var.getTitle();
        if (strA == null) {
            strA = "";
        }
        return new ti7.j(strA, w0Var.getUrl(), (vi7.a) u1.u(w0Var.getType(), ij7.b.f161721a));
    }

    public static final gp1.a S(BillInput billInput) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(billInput, "<this>");
        String str = billInput.f61298a;
        String str2 = billInput.f61299b;
        List list = billInput.f61300c;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(S((BillInput) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return new gp1.a(str, str2, arrayList);
    }

    public static final JsonObject U(Map map) {
        JsonElement jsonObject;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iB = q0.b(zhm.w.t(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jsonObject = rlm.j.c((String) value);
            } else if (value instanceof Number) {
                jsonObject = rlm.j.b((Number) value);
            } else if (value instanceof d) {
                d dVar = (d) value;
                jsonObject = new JsonObject(r0.k(new Pair("amount", rlm.j.b(Long.valueOf(dVar.f115082a))), new Pair("currency", rlm.j.c(dVar.f115083b.f306286a))));
            } else {
                jsonObject = null;
            }
            linkedHashMap.put(str, jsonObject);
        }
        return new JsonObject(i.f(linkedHashMap));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V(kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function1 r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof isf.a
            if (r0 == 0) goto L13
            r0 = r6
            isf.a r0 = (isf.a) r0
            int r1 = r0.f168247w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168247w = r1
            goto L18
        L13:
            isf.a r0 = new isf.a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168247w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.functions.Function1 r4 = r0.u
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4b
        L2b:
            r5 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            yhm.o.b(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2b
            r4.invoke(r6)     // Catch: java.lang.Throwable -> L2b
            r6 = r4
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6     // Catch: java.lang.Throwable -> L2b
            r0.u = r6     // Catch: java.lang.Throwable -> L2b
            r0.f168247w = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.invoke(r5)
            return r6
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.invoke(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gj7.b.V(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public static Feature[] X(qh.c cVar) {
        if (cVar.c()) {
            return ch.k.f24030a;
        }
        switch (cVar.e()) {
            case 2:
                return new Feature[]{ch.k.e};
            case 3:
                return new Feature[]{ch.k.f24033g};
            case 4:
                return new Feature[]{ch.k.f24034h};
            case 5:
                return new Feature[]{ch.k.i};
            case 6:
            case 7:
            case 8:
                return new Feature[]{ch.k.f};
            default:
                return new Feature[]{ch.k.d};
        }
    }

    public static void Y(ClassLoader classLoader, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            hashSet2.add(((File) it8.next()).getParentFile());
        }
        Field fieldL = hb9.b.L(classLoader, "pathList");
        try {
            Object objCast = Object.class.cast(fieldL.get(classLoader));
            ufm.d dVar = new ufm.d(objCast, hb9.b.L(objCast, "nativeLibraryDirectories"), List.class);
            synchronized (vc.o.class) {
                ArrayList arrayList = new ArrayList((Collection) dVar.n());
                hashSet2.removeAll(arrayList);
                arrayList.addAll(hashSet2);
                dVar.o(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] objArr = (Object[]) hb9.b.K(objCast, "makePathElements", Object[].class, List.class, new ArrayList(hashSet2));
            if (arrayList2.isEmpty()) {
                synchronized (vc.o.class) {
                    hb9.b.I("nativeLibraryPathElements", Object.class, objCast).q(Arrays.asList(objArr));
                }
                return;
            }
            zzbh zzbhVar = new zzbh("Error in makePathElements");
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i));
                } catch (Exception unused) {
                }
            }
            throw zzbhVar;
        } catch (Exception e) {
            String name = fieldL.getName();
            String name2 = classLoader.getClass().getName();
            String name3 = Object.class.getName();
            StringBuilder sbM = v0.a.m("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            sbM.append(name3);
            throw new zzbl(sbM.toString(), e);
        }
    }

    public static final Data a(Data data, Comparator comparator) {
        List list = (List) data.getContent();
        return Data.copy$default(data, list != null ? d0.P0(list, comparator) : null, null, false, 6, null);
    }

    public static final void b(String toAppend, StringBuilder sb6) {
        Intrinsics.checkNotNullParameter(sb6, "<this>");
        Intrinsics.checkNotNullParameter(toAppend, "toAppend");
        if (sb6.length() == 0) {
            return;
        }
        sb6.append(toAppend);
        Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
    }

    public static final boolean c(xni.a aVar, BaseOtpPushContract$InputData inputData, String otpCodeOnUI) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(otpCodeOnUI, "otpCodeOnUI");
        if (aVar.p0()) {
            return true;
        }
        if (aVar.y0().length() == 0 && otpCodeOnUI.length() == 0) {
            return false;
        }
        return (Intrinsics.f(inputData.getF98526a(), aVar.y0()) && Intrinsics.f(inputData.getF98526a(), otpCodeOnUI)) ? false : true;
    }

    public static final void d(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public static final r e(n4 a7, r b4, r c2, r d) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        return nim.a.w(kli.a.h(kli.a.h(a7, b4), kli.a.h(c2, d)), new a82.l(20));
    }

    public static final c2 f(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KotlinType kotlinType = ((c2) type).f322615a;
        if (!(kotlinType instanceof SimpleType)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = kotlinType.getConstructor().mo3795getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo3795getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor : null;
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
        }
        SimpleType simpleType = (SimpleType) kotlinType;
        FqName onlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtilsKt.getFqNameUnsafe(classDescriptor));
        if (onlyToMutable == null) {
            throw new IllegalArgumentException("Not a readonly collection: " + classDescriptor);
        }
        ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(classDescriptor).getBuiltInClassByFqName(onlyToMutable);
        Intrinsics.checkNotNullExpressionValue(builtInClassByFqName, "getBuiltInClassByFqName(...)");
        TypeConstructor typeConstructor = builtInClassByFqName.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return new c2(KotlinTypeFactory.simpleType$default(simpleType, (TypeAttributes) null, typeConstructor, (List) null, false, 26, (Object) null), null);
    }

    public static final c2 h(KType lowerBound, KType upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        KotlinType kotlinType = ((c2) lowerBound).f322615a;
        Intrinsics.i(kotlinType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinType2 = ((c2) upperBound).f322615a;
        Intrinsics.i(kotlinType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new c2(KotlinTypeFactory.flexibleType((SimpleType) kotlinType, (SimpleType) kotlinType2), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer i(int r10, int r11, com.revolut.core.ui_kit.internal.views.diagram.TrendView r12, java.util.List r13) {
        /*
            java.lang.String r0 = "plot"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            float r0 = r12.s(r10)
            r1 = 0
        Lf:
            int r2 = r10 - r1
            r3 = 0
            if (r2 >= 0) goto L1c
            int r4 = r10 + r1
            int r5 = r13.size()
            if (r4 >= r5) goto L41
        L1c:
            int r4 = r10 + r1
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r2 < 0) goto L2a
            float r6 = r12.s(r2)
            float r6 = r0 - r6
            goto L2b
        L2a:
            r6 = r5
        L2b:
            int r7 = r13.size()
            if (r4 >= r7) goto L37
            float r7 = r12.s(r4)
            float r7 = r7 - r0
            goto L38
        L37:
            r7 = r5
        L38:
            float r8 = (float) r11
            int r9 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r9 <= 0) goto L42
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto L42
        L41:
            return r3
        L42:
            java.lang.Object r8 = zhm.d0.e0(r2, r13)
            hw0.k r8 = (hw0.k) r8
            if (r8 == 0) goto L4d
            iw0.a r8 = r8.d
            goto L4e
        L4d:
            r8 = r3
        L4e:
            if (r8 == 0) goto L5a
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 <= 0) goto L5a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = r6
            goto L5b
        L5a:
            r2 = r3
        L5b:
            java.lang.Object r6 = zhm.d0.e0(r4, r13)
            hw0.k r6 = (hw0.k) r6
            if (r6 == 0) goto L65
            iw0.a r3 = r6.d
        L65:
            if (r3 == 0) goto L6f
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L6f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
        L6f:
            if (r2 == 0) goto L72
            return r2
        L72:
            int r1 = r1 + 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: gj7.b.i(int, int, com.revolut.core.ui_kit.internal.views.diagram.TrendView, java.util.List):java.lang.Integer");
    }

    public static final boolean k(t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        x1 x1Var = t1Var.f113659p;
        return x1Var != null && x1Var.f113689a;
    }

    public static final Object l(Optional optional, Object obj2) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? optional.get() : obj2;
    }

    public static final Object m(Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }

    public static final Map n() {
        return r0.k(new Pair("TRAVEL", ti7.i.TRAVEL), new Pair("EVERYDAY_PROTECTION", ti7.i.EVERYDAY_PROTECTION), new Pair("CFAC", ti7.i.CFAC));
    }

    public static final d o(e3k.d dVar) {
        z1k.i iVarA;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        z1k.o oVarP = p(dVar);
        z1k.j jVar = (oVarP == null || (iVarA = e3k.a.a(oVarP)) == null) ? null : iVarA.f318866c;
        if (jVar == null) {
            return null;
        }
        long j2 = jVar.f;
        if (j2 > 0) {
            return new d(j2, jVar.f318871h);
        }
        return null;
    }

    public static final z1k.o p(e3k.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        e3k.b bVar = dVar instanceof e3k.b ? (e3k.b) dVar : null;
        if (bVar != null) {
            return bVar.f122337b;
        }
        return null;
    }

    public static final boolean q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (B((t1) it8.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(List list, EsimCoverage esimCoverage, String str, Function1 function1) {
        List<t1> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (t1 t1Var : list2) {
            if (((Boolean) function1.invoke(t1Var)).booleanValue() && t1Var.f113653g == dej.m.DATA_PLAN && (str == null || Intrinsics.f(t1Var.e.f100440a, str))) {
                if (t1Var.d.equals(esimCoverage)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean s(String str, String query) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() != 0) {
            m70.a.t(t0.f186434a);
            List listN0 = kotlin.text.d0.n0(str, new String[]{" "}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listN0) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    if (a0.H((String) it8.next(), query, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean t(RectF rectF, RectF other) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.isEmpty()) {
            return false;
        }
        return rectF.intersects(other.left, other.top, other.right, other.bottom);
    }

    public static final boolean u(t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        return t1Var.f113651b == j3.ACTIVE;
    }

    public static final boolean v(t1 t1Var, dm0.b deviceId, List list) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return (gc0.c.o(t1Var.e, list) || gc0.c.n(t1Var.e, deviceId)) ? false : true;
    }

    public static final boolean w(t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        EsimProfileLock esimProfileLock = t1Var.e.i;
        return esimProfileLock != null && esimProfileLock.f100447a;
    }

    public static final boolean x(t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        j3 j3Var = t1Var.f113651b;
        return j3Var == j3.EXPIRED || j3Var == j3.INACTIVE;
    }

    public static final boolean y(t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        return t1Var.f113651b == j3.GRACE;
    }
}
