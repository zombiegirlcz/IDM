package p96;

import aim.f;
import android.content.Context;
import android.graphics.Matrix;
import android.provider.Settings;
import bi.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardAdministrationFeeMapper;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardStatementSectionMapper;
import com.youTransactor.uCube.rpc.Constants;
import dr3.i;
import dr3.j;
import grj.h;
import ht3.c0;
import ht3.d0;
import ht3.s;
import ht3.t;
import igm.p;
import imk.e;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kw4.w;
import pkm.g;
import r7.l;
import st3.k;
import vh.d;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements bi.b, OnFailureListener, d, ca5.a, g8.a, o, el.b, igm.o, p, pkm.b, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234276a;

    public /* synthetic */ a(int i) {
        this.f234276a = i;
    }

    public static yh.b e(int i, byte[][] bArr) {
        int i2 = i * 2;
        int length = bArr[0].length + i2;
        int length2 = bArr.length + i2;
        yh.b bVar = new yh.b(length, length2);
        int[] iArr = bVar.d;
        int length3 = iArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            iArr[i3] = 0;
        }
        int i5 = (length2 - i) - 1;
        int i6 = 0;
        while (i6 < bArr.length) {
            byte[] bArr2 = bArr[i6];
            for (int i21 = 0; i21 < bArr[0].length; i21++) {
                if (bArr2[i21] == 1) {
                    bVar.b(i21 + i, i5);
                }
            }
            i6++;
            i5--;
        }
        return bVar;
    }

    public static LinkedHashMap f(String str, String str2, String str3, Map accountFieldsValues) {
        Intrinsics.checkNotNullParameter(accountFieldsValues, "accountFieldsValues");
        f builder = new f();
        if (str != null) {
            builder.put("COMPANY_NAME", str);
            builder.put("FIRST_NAME", str);
        }
        if (str2 != null) {
            builder.put("LAST_NAME", str2);
        }
        if (str3 != null) {
            builder.put("EMAIL", str3);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return r0.p(accountFieldsValues, builder.b());
    }

    public static s4j.b h(u2j.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = c4j.a.f21302a[type.ordinal()];
        if (i == 1) {
            return s4j.b.Personal;
        }
        if (i == 2) {
            return s4j.b.Business;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static i7.a i(Context context) {
        if (context != null) {
            Matrix matrix = l.f251966a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == BitmapDescriptorFactory.HUE_RED) {
                return i7.a.REDUCED_MOTION;
            }
        }
        return i7.a.STANDARD_MOTION;
    }

    public static byte[][] l(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // pkm.b
    public kotlin.time.d a() {
        g gVar = kotlin.time.d.Companion;
        long jCurrentTimeMillis = System.currentTimeMillis();
        gVar.getClass();
        long j2 = jCurrentTimeMillis / 1000;
        if ((jCurrentTimeMillis ^ 1000) < 0 && j2 * 1000 != jCurrentTimeMillis) {
            j2--;
        }
        long j3 = jCurrentTimeMillis % 1000;
        return j2 < -31557014167219200L ? kotlin.time.d.f187925c : j2 > 31556889864403199L ? kotlin.time.d.d : g.a((int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * ((long) 1000000)), j2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f234276a) {
            case 14:
                return h.f146035a.invoke(obj2);
            case 21:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length != 6) {
                    throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
                }
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                Object obj5 = objArr[2];
                Object obj6 = objArr[3];
                Object obj7 = objArr[4];
                Object obj8 = objArr[5];
                throw null;
            default:
                return w.f.invoke(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0427 A[LOOP:14: B:201:0x0425->B:202:0x0427, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0449  */
    @Override // vh.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yh.b b(java.lang.String r27, vh.a r28, int r29, int r30, aim.f r31) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instruction units count: 1279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p96.a.b(java.lang.String, vh.a, int, int, aim.f):yh.b");
    }

    @Override // g8.a
    public File c(c8.g gVar) {
        return null;
    }

    @Override // g8.a
    public void clear() {
    }

    @Override // g8.a
    public void d(c8.g gVar, mp.p pVar) {
    }

    @Override // bi.b
    public void g(c cVar) {
        StringBuilder sb6;
        StringBuilder sb9 = new StringBuilder();
        sb9.append((char) 0);
        while (true) {
            boolean zB = cVar.b();
            sb6 = cVar.f15342c;
            if (!zB) {
                break;
            }
            sb9.append(cVar.a());
            int i = cVar.d + 1;
            cVar.d = i;
            if (ksj.b.t(cVar.f15340a, i, 5) != 5) {
                cVar.e = 0;
                break;
            }
        }
        int length = sb9.length() - 1;
        int length2 = sb6.length() + length + 1;
        cVar.c(length2);
        boolean z = cVar.f.f15348b - length2 > 0;
        if (cVar.b() || z) {
            if (length <= 249) {
                sb9.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb9.setCharAt(0, (char) ((length / Constants.TAG_SUPPORTED_LOCALE_LIST) + Constants.TAG_RESOURCE_FILE_VERSION));
                sb9.insert(1, (char) (length % Constants.TAG_SUPPORTED_LOCALE_LIST));
            }
        }
        int length3 = sb9.length();
        for (int i2 = 0; i2 < length3; i2++) {
            int length4 = (((sb6.length() + 1) * 149) % 255) + 1 + sb9.charAt(i2);
            if (length4 > 255) {
                length4 -= 256;
            }
            cVar.d((char) length4);
        }
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        return new hl.a();
    }

    public BeneficiaryRouteDetails j(List details, Map accountFieldsValues) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(accountFieldsValues, "accountFieldsValues");
        Set definitionTypes = accountFieldsValues.keySet();
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(definitionTypes, "definitionTypes");
        List list = details;
        int iB = q0.b(zhm.w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list) {
            ArrayList arrayList = ((BeneficiaryRouteDetails) obj2).f60287a.f60284a;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((BankFieldDefinition) it8.next()).f60271a);
            }
            linkedHashMap.put(arrayList2, obj2);
        }
        Set setKeySet = linkedHashMap.keySet();
        e eVar = new e(14, definitionTypes);
        Iterator it9 = setKeySet.iterator();
        Object obj3 = null;
        if (it9.hasNext()) {
            Object next = it9.next();
            Comparable comparable = (Comparable) eVar.invoke(next);
            boolean z = true;
            while (it9.hasNext()) {
                Object next2 = it9.next();
                Comparable comparable2 = (Comparable) eVar.invoke(next2);
                if (comparable2.compareTo(comparable) > 0) {
                    z = true;
                    next = next2;
                    comparable = comparable2;
                } else if (comparable2.compareTo(comparable) == 0) {
                    z = false;
                }
            }
            if (z) {
                obj3 = next;
            }
        }
        BeneficiaryRouteDetails beneficiaryRouteDetails = (BeneficiaryRouteDetails) linkedHashMap.get((List) obj3);
        return beneficiaryRouteDetails == null ? n4j.c.a(details) : beneficiaryRouteDetails;
    }

    public d0 k(st3.p dto, Function1 mapActionToDomain) {
        d0 sVar;
        d0 d0VarA;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(mapActionToDomain, "mapActionToDomain");
        if (dto instanceof k) {
            return j.a((k) dto, mapActionToDomain);
        }
        if (dto instanceof st3.o) {
            st3.o dto2 = (st3.o) dto;
            Intrinsics.checkNotNullParameter(dto2, "dto");
            return new c0(dto2.getText());
        }
        if (dto instanceof st3.e) {
            return dr3.b.a((st3.e) dto);
        }
        if (dto instanceof st3.f) {
            st3.f dto3 = (st3.f) dto;
            Intrinsics.checkNotNullParameter(dto3, "dto");
            return new s(dto3.getTitle(), dto3.getValue());
        }
        if (dto instanceof st3.j) {
            return i.a((st3.j) dto);
        }
        if (!(dto instanceof st3.g)) {
            throw new NoWhenBranchMatchedException();
        }
        st3.g dto4 = (st3.g) dto;
        Intrinsics.checkNotNullParameter(dto4, "dto");
        Intrinsics.checkNotNullParameter(mapActionToDomain, "mapActionToDomain");
        String strB = dto4.getTitle();
        ArrayList<st3.p> arrayListZ = zhm.d0.Z(dto4.getItems());
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListZ, 10));
        for (st3.p pVar : arrayListZ) {
            if (pVar instanceof st3.g) {
                throw new UnsupportedOperationException("GroupItem cannot be nested inside another GroupItem");
            }
            if (pVar instanceof st3.e) {
                d0VarA = dr3.b.a((st3.e) pVar);
            } else {
                if (pVar instanceof st3.o) {
                    st3.o dto5 = (st3.o) pVar;
                    Intrinsics.checkNotNullParameter(dto5, "dto");
                    sVar = new c0(dto5.getText());
                } else if (pVar instanceof k) {
                    d0VarA = j.a((k) pVar, mapActionToDomain);
                } else if (pVar instanceof st3.j) {
                    d0VarA = i.a((st3.j) pVar);
                } else {
                    if (!(pVar instanceof st3.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    st3.f dto6 = (st3.f) pVar;
                    Intrinsics.checkNotNullParameter(dto6, "dto");
                    sVar = new s(dto6.getTitle(), dto6.getValue());
                }
                d0VarA = sVar;
            }
            arrayList.add(d0VarA);
        }
        return new t(strB, arrayList);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc2) {
    }

    @Override // igm.p
    public boolean test(Object obj2) {
        return false;
    }

    public a(CreditCardStatementSectionMapper creditCardStatementSectionMapper, CreditCardAdministrationFeeMapper creditCardAdministrationFeeMapper) {
        this.f234276a = 26;
        Intrinsics.checkNotNullParameter(creditCardStatementSectionMapper, "creditCardStatementSectionMapper");
        Intrinsics.checkNotNullParameter(creditCardAdministrationFeeMapper, "creditCardAdministrationFeeMapper");
    }

    public a(fra.b luhnErrorMapper, fra.a eligibilityErrorMapper) {
        this.f234276a = 12;
        Intrinsics.checkNotNullParameter(luhnErrorMapper, "luhnErrorMapper");
        Intrinsics.checkNotNullParameter(eligibilityErrorMapper, "eligibilityErrorMapper");
    }

    public a(gte.a featureToggleInteractor) {
        this.f234276a = 18;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
    }

    public a(ang.f userInteractor, bqf.d trustInteractor, bqf.g trustedPayeeChecker) {
        this.f234276a = 3;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(trustedPayeeChecker, "trustedPayeeChecker");
    }

    public a(mra.a additionalFieldDtoMapper) {
        this.f234276a = 28;
        Intrinsics.checkNotNullParameter(additionalFieldDtoMapper, "additionalFieldDtoMapper");
    }

    public a(n4j.c beneficiaryCreationUtils) {
        this.f234276a = 5;
        Intrinsics.checkNotNullParameter(beneficiaryCreationUtils, "beneficiaryCreationUtils");
    }

    public a(o53.b cardPersonalisationRepository) {
        this.f234276a = 29;
        Intrinsics.checkNotNullParameter(cardPersonalisationRepository, "cardPersonalisationRepository");
    }

    public a(j rowItemDtoMapper, dr3.k textItemDtoMapper, dr3.b carouselItemDtoMapper, dr3.c cellDetailsItemDtoMapper, i labeledRowItemDtoMapper, he2.b groupItemDtoMapper) {
        this.f234276a = 9;
        Intrinsics.checkNotNullParameter(rowItemDtoMapper, "rowItemDtoMapper");
        Intrinsics.checkNotNullParameter(textItemDtoMapper, "textItemDtoMapper");
        Intrinsics.checkNotNullParameter(carouselItemDtoMapper, "carouselItemDtoMapper");
        Intrinsics.checkNotNullParameter(cellDetailsItemDtoMapper, "cellDetailsItemDtoMapper");
        Intrinsics.checkNotNullParameter(labeledRowItemDtoMapper, "labeledRowItemDtoMapper");
        Intrinsics.checkNotNullParameter(groupItemDtoMapper, "groupItemDtoMapper");
    }
}
