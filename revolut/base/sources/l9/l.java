package l9;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvj;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesPassActivityFilter;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesPassActivityFilterItem;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutFee;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import eel.m;
import ft3.d1;
import ft3.j1;
import ggc.b0;
import ggc.q;
import ggc.y;
import gwi.e4;
import gwi.h4;
import gwi.k4;
import gwi.n4;
import gwi.q4;
import gwi.u4;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.text.a0;
import kotlin.text.d0;
import le.u1;
import m1c.f1;
import m1c.h1;
import org.joda.time.DateTime;
import q6c.n;
import svi.a1;
import svi.t0;
import svi.u0;
import svi.v0;
import svi.w0;
import svi.x0;
import svi.z0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;
import zim.o2;
import zm3.o;

/* JADX INFO: loaded from: classes16.dex */
public abstract class l {
    public static final z0 A(u4 u4Var) {
        u0 u0Var;
        String str;
        Iterator it8;
        String str2;
        x0 w0Var;
        a1 a1Var;
        a1 a1Var2;
        a1 a1Var3;
        a1 a1Var4;
        String str3 = "<this>";
        Intrinsics.checkNotNullParameter(u4Var, "<this>");
        List list = u4Var.f147532a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            h4 h4Var = (h4) it9.next();
            Intrinsics.checkNotNullParameter(h4Var, str3);
            String str4 = h4Var.f147410a;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(h4Var.f147411b);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            String str5 = h4Var.f147412c;
            e4 e4Var = h4Var.d;
            if (e4Var != null) {
                Intrinsics.checkNotNullParameter(e4Var, str3);
                String str6 = e4Var.f147379a;
                String str7 = e4Var.f147380b;
                if (str7 != null) {
                    a1[] a1VarArrValues = a1.values();
                    int length = a1VarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            a1Var4 = null;
                            break;
                        }
                        a1Var4 = a1VarArrValues[i];
                        if (a0.z(a1Var4.name(), str7, true)) {
                            break;
                        }
                        i++;
                    }
                    a1Var3 = a1Var4;
                } else {
                    a1Var3 = null;
                }
                u0Var = new u0(str6, a1Var3);
            } else {
                u0Var = null;
            }
            String str8 = h4Var.e;
            String str9 = h4Var.f;
            String str10 = h4Var.f147413g;
            k4 k4Var = h4Var.f147414h;
            if (k4Var != null) {
                Intrinsics.checkNotNullParameter(k4Var, str3);
                String str11 = k4Var.f147442c;
                String str12 = k4Var.f147441b;
                if (str11 != null) {
                    a1[] a1VarArrValues2 = a1.values();
                    str = str3;
                    int length2 = a1VarArrValues2.length;
                    it8 = it9;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            a1Var2 = null;
                            break;
                        }
                        a1Var2 = a1VarArrValues2[i2];
                        int i3 = length2;
                        int i5 = i2;
                        if (a0.z(a1Var2.name(), str11, true)) {
                            break;
                        }
                        i2 = i5 + 1;
                        length2 = i3;
                    }
                    a1Var = a1Var2;
                } else {
                    str = str3;
                    it8 = it9;
                    a1Var = null;
                }
                String str13 = k4Var.f147440a;
                str2 = str9;
                w0Var = Intrinsics.f(str13, "TEXT") ? new w0(str12, a1Var) : Intrinsics.f(str13, "ICON") ? new v0(str12, a1Var) : null;
            } else {
                str = str3;
                it8 = it9;
                str2 = str9;
                w0Var = null;
            }
            arrayList.add(new t0(str4, instantOfEpochMilli, str5, u0Var, str8, str2, str10, w0Var));
            str3 = str;
            it9 = it8;
        }
        return new z0(u4Var.f147533b, arrayList);
    }

    public static final uel.a B(kdl.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        List<kdl.i> list = fVar.f182909a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (kdl.i iVar : list) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            arrayList.add(new uel.b(iVar.f182911a, iVar.f182912b, iVar.f182913c, iVar.d));
        }
        return new uel.a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final xvg.a C(uvg.w r12, com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.l.C(uvg.w, com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart, java.lang.String):xvg.a");
    }

    public static final Class D(DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.isInlineClass(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class clsJ = o2.j(classDescriptor);
        if (clsJ != null) {
            return clsJ;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.getClassId((ClassifierDescriptor) declarationDescriptor) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static final Class E(KotlinType kotlinType) {
        KotlinType kotlinTypeUnsubstitutedUnderlyingType;
        Class clsD = D(kotlinType.getConstructor().mo3795getDeclarationDescriptor());
        if (clsD == null) {
            return null;
        }
        if (TypeUtils.isNullableType(kotlinType) && ((kotlinTypeUnsubstitutedUnderlyingType = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType)) == null || TypeUtils.isNullableType(kotlinTypeUnsubstitutedUnderlyingType) || KotlinBuiltIns.isPrimitiveType(kotlinTypeUnsubstitutedUnderlyingType))) {
            return null;
        }
        return clsD;
    }

    public static final String F(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters, "<this>");
        ClassId classId = DescriptorUtilsKt.getClassId(classifierDescriptorWithTypeParameters);
        Intrinsics.h(classId);
        return ClassMapperLite.mapClass(classId.asString());
    }

    public static final MsBarcode G(fh.a aVar) {
        String strZzl;
        MsBarcodeType msBarcodeType;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        hh.k kVar = aVar.f135117a;
        String strA = kVar.a();
        switch (kVar.f152211a) {
            case 0:
                strZzl = ((zzvj) kVar.f152212b).zzl();
                break;
            default:
                strZzl = ((zzu) kVar.f152212b).f42464zzc;
                break;
        }
        switch (kVar.b()) {
            case 0:
                msBarcodeType = MsBarcodeType.UNKNOWN;
                break;
            case 1:
                msBarcodeType = MsBarcodeType.CONTACT_INFO;
                break;
            case 2:
                msBarcodeType = MsBarcodeType.EMAIL;
                break;
            case 3:
                msBarcodeType = MsBarcodeType.ISBN;
                break;
            case 4:
                msBarcodeType = MsBarcodeType.PHONE;
                break;
            case 5:
                msBarcodeType = MsBarcodeType.PRODUCT;
                break;
            case 6:
                msBarcodeType = MsBarcodeType.SMS;
                break;
            case 7:
                msBarcodeType = MsBarcodeType.TEXT;
                break;
            case 8:
                msBarcodeType = MsBarcodeType.URL;
                break;
            case 9:
                msBarcodeType = MsBarcodeType.WIFI;
                break;
            case 10:
                msBarcodeType = MsBarcodeType.GEO;
                break;
            case 11:
                msBarcodeType = MsBarcodeType.CALENDAR_EVENT;
                break;
            case 12:
                msBarcodeType = MsBarcodeType.DRIVER_LICENSE;
                break;
            default:
                msBarcodeType = MsBarcodeType.UNKNOWN;
                break;
        }
        return new MsBarcode(strA, strZzl, msBarcodeType);
    }

    public static final List H(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList();
        for (String str2 : d0.n0(str, new String[]{","}, 0, 6)) {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            Integer numValueOf = null;
            for (Object obj2 : d0.n0(str2, new String[]{"-"}, 0, 6)) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                String str3 = (String) obj2;
                if (i == 0) {
                    numValueOf = Integer.valueOf(Integer.parseInt(str3));
                } else {
                    arrayList2.add(new Child(Integer.valueOf(Integer.parseInt(str3))));
                }
                i = i2;
            }
            if (numValueOf != null) {
                arrayList.add(new HotelsPropertyRoomOccupancy(numValueOf.intValue(), arrayList2));
            }
        }
        return zhm.d0.d1(arrayList);
    }

    public static final n I(String str) {
        n nVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        n[] nVarArrValues = n.values();
        int length = nVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                nVar = null;
                break;
            }
            nVar = nVarArrValues[i];
            if (a0.z(nVar.name(), str, true)) {
                break;
            }
            i++;
        }
        return nVar == null ? n.UNKNOWN : nVar;
    }

    public static final d1 J(fs3.a aVar, fs3.b type) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        switch (fs3.c.f137577a[type.ordinal()]) {
            case 1:
                return new d1(j1.FIXED_TERM_CREDIT, gt3.d.LOAN, null);
            case 2:
                return new d1(j1.FIXED_TERM_CREDIT, gt3.d.REFINANCING, null);
            case 3:
                return new d1(j1.FIXED_TERM_CREDIT, gt3.d.HOME_IMPROVEMENT, null);
            case 4:
                return mif.a.m(d1.Companion, j1.MORTGAGE, null);
            case 5:
                return mif.a.m(d1.Companion, j1.REFINANCING_MORTGAGE, null);
            case 6:
            case 7:
            case 8:
            case 9:
                return mif.a.m(d1.Companion, j1.CREDIT_CARD, null);
            case 10:
                return mif.a.m(d1.Companion, j1.BUY_NOW_PAY_LATER, null);
            case 11:
                return mif.a.m(d1.Companion, j1.OVERDRAFT, null);
            case 12:
                throw new IllegalStateException((aVar + " is not a credit application product").toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public static final y K(sgc.a aVar) {
        q qVar;
        b0 b0Var;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f262636a;
        String str2 = aVar.f262637b;
        String str3 = aVar.f262638c;
        String str4 = aVar.d;
        if (str4 == null || (qVar = (q) u1.v(str4, hhc.c.f152383a)) == null) {
            qVar = q.ONLINE;
        }
        q qVar2 = qVar;
        Integer num = aVar.e;
        ggc.a0 a0Var = new ggc.a0(aVar.f);
        String str5 = aVar.f262639g;
        if (str5 == null || (b0Var = (b0) u1.v(str5, hhc.a.f152381a)) == null) {
            b0Var = b0.UNKNOWN;
        }
        return new y(str, str2, str3, qVar2, num, a0Var, b0Var);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final sgc.a L(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return new sgc.a(yVar.f143672a, yVar.e, yVar.f143673b, yVar.f143674c, u1.h(yVar.d, hhc.c.f152383a), yVar.f.f143608a, yVar.f143675g.name());
    }

    public static final WealthAccountType M(tih.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (plh.h.f237407a[dVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return WealthAccountType.SECURITIES;
            case 7:
                return WealthAccountType.TAA;
            case 8:
                return WealthAccountType.TAA;
            case 9:
                return WealthAccountType.TAA;
            case 10:
                return WealthAccountType.TAA;
            case 11:
                return WealthAccountType.ROBO;
            case 12:
                return WealthAccountType.MARGIN;
            case 13:
                return WealthAccountType.COMMODITIES;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CompositeClause N(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.FLOOR);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return xqi.a.c(scale, false, false, false, false, false, 123);
    }

    public static String a(int i, String str) {
        StringBuilder sb6 = new StringBuilder(i);
        sb6.append(str);
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String b(zm3.a aVar) throws Throwable {
        Iterable iterableK;
        if (aVar instanceof zm3.e) {
            zm3.e eVar = (zm3.e) aVar;
            iterableK = v.k(eVar.f323342c, eVar.d, eVar.e, eVar.f323340a);
        } else if (aVar instanceof zm3.f) {
            zm3.f fVar = (zm3.f) aVar;
            iterableK = v.k(fVar.f323347c, fVar.d, fVar.e, fVar.f323345a);
        } else if (aVar instanceof zm3.i) {
            zm3.i iVar = (zm3.i) aVar;
            zm3.f fVar2 = iVar.e;
            iterableK = v.k(fVar2.f323347c, fVar2.d, fVar2.e, fVar2.f323345a, iVar.f323354h);
        } else if (aVar instanceof zm3.j) {
            zm3.j jVar = (zm3.j) aVar;
            iterableK = v.k(jVar.f323360b, jVar.f323361c, jVar.f323362g, jVar.f323359a);
        } else {
            if (!(aVar instanceof zm3.n) && !(aVar instanceof o)) {
                throw new NoWhenBranchMatchedException();
            }
            wp5.y.B("VirtualContact is not allowed here");
            iterableK = f0.f322471a;
        }
        return zhm.d0.k0(iterableK, "|", null, null, 0, new u3a.g(14), 30);
    }

    public static final void c(Bundle bundle, String str, Object obj2) {
        if (obj2 == null) {
            bundle.putString(str, null);
            return;
        }
        if (obj2 instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj2).booleanValue());
            return;
        }
        if (obj2 instanceof Byte) {
            bundle.putByte(str, ((Number) obj2).byteValue());
            return;
        }
        if (obj2 instanceof Character) {
            bundle.putChar(str, ((Character) obj2).charValue());
            return;
        }
        if (obj2 instanceof Double) {
            bundle.putDouble(str, ((Number) obj2).doubleValue());
            return;
        }
        if (obj2 instanceof Float) {
            bundle.putFloat(str, ((Number) obj2).floatValue());
            return;
        }
        if (obj2 instanceof Integer) {
            bundle.putInt(str, ((Number) obj2).intValue());
            return;
        }
        if (obj2 instanceof Long) {
            bundle.putLong(str, ((Number) obj2).longValue());
            return;
        }
        if (obj2 instanceof Short) {
            bundle.putShort(str, ((Number) obj2).shortValue());
            return;
        }
        if (obj2 instanceof Bundle) {
            bundle.putBundle(str, (Bundle) obj2);
            return;
        }
        if (obj2 instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj2);
            return;
        }
        if (obj2 instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj2);
            return;
        }
        if (obj2 instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj2);
            return;
        }
        if (obj2 instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj2);
            return;
        }
        if (obj2 instanceof char[]) {
            bundle.putCharArray(str, (char[]) obj2);
            return;
        }
        if (obj2 instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj2);
            return;
        }
        if (obj2 instanceof float[]) {
            bundle.putFloatArray(str, (float[]) obj2);
            return;
        }
        if (obj2 instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj2);
            return;
        }
        if (obj2 instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj2);
            return;
        }
        if (obj2 instanceof short[]) {
            bundle.putShortArray(str, (short[]) obj2);
            return;
        }
        if (!(obj2 instanceof Object[])) {
            if (obj2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj2);
                return;
            }
            if (obj2 instanceof Binder) {
                bundle.putBinder(str, (IBinder) obj2);
                return;
            } else if (obj2 instanceof Size) {
                bundle.putSize(str, (Size) obj2);
                return;
            } else {
                if (obj2 instanceof SizeF) {
                    bundle.putSizeF(str, (SizeF) obj2);
                    return;
                }
                return;
            }
        }
        Class<?> componentType = obj2.getClass().getComponentType();
        if (componentType == null) {
            throw new IllegalArgumentException(v0.a.h(obj2, "ComponentType for ", " is null"));
        }
        if (Parcelable.class.isAssignableFrom(componentType)) {
            bundle.putParcelableArray(str, (Parcelable[]) obj2);
            return;
        }
        if (String.class.isAssignableFrom(componentType)) {
            bundle.putStringArray(str, (String[]) obj2);
        } else if (CharSequence.class.isAssignableFrom(componentType)) {
            bundle.putCharSequenceArray(str, (CharSequence[]) obj2);
        } else {
            if (!Serializable.class.isAssignableFrom(componentType)) {
                throw new IllegalArgumentException(j6.a.s("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
            }
            bundle.putSerializable(str, (Serializable) obj2);
        }
    }

    public static final dj0.d d(dj0.d balance, BigDecimal netInterestRate) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(netInterestRate, "netInterestRate");
        xi0.b bVar = balance.f115083b;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(366);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        long jLongValue = (bigDecimalValueOf.divide(netInterestRate, RoundingMode.CEILING).longValue() * ((long) 100)) - balance.f115082a;
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        return new dj0.d(jLongValue, bVar);
    }

    public static final TextLocalisedClause e(Clause clause, int i) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        return new TextLocalisedClause(i, u.c(clause), null, 12);
    }

    public static final Object f(Object obj2, CallableMemberDescriptor descriptor) {
        KotlinType kotlinTypeI;
        Class clsE;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (((descriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((VariableDescriptor) descriptor)) || (kotlinTypeI = i(descriptor)) == null || (clsE = E(kotlinTypeI)) == null) ? obj2 : j(clsE, descriptor).invoke(obj2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ajm.i g(ajm.i r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4, boolean r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(r4)
            if (r0 != 0) goto L9c
            java.util.List r0 = r4.getContextReceiverParameters()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L2b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            goto L49
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) r1
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClassType(r1)
            if (r1 == 0) goto L2f
            goto L9c
        L49:
            java.util.List r0 = r4.getValueParameters()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L62
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L62
            goto L80
        L62:
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r1
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClassType(r1)
            if (r1 == 0) goto L66
            goto L9c
        L80:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r4.getReturnType()
            r1 = 1
            if (r0 == 0) goto L8e
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(r0)
            if (r0 != r1) goto L8e
            goto L9c
        L8e:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = i(r4)
            if (r0 == 0) goto L9b
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClassType(r0)
            if (r0 != r1) goto L9b
            goto L9c
        L9b:
            return r3
        L9c:
            ajm.f0 r0 = new ajm.f0
            r0.<init>(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.l.g(ajm.i, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean):ajm.i");
    }

    public static final fs3.g h(fs3.a aVar, fs3.b type) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        switch (fs3.c.f137577a[type.ordinal()]) {
            case 1:
                return new fs3.g(null, R$string.credit_get_credit_loan_title, R$string.credit_get_credit_loan_description, 10);
            case 2:
                return new fs3.g(null, R$string.credit_get_credit_refinancing_loan_title, R$string.credit_get_credit_refinancing_loan_description, 10);
            case 3:
                return new fs3.g(null, R$string.credit_get_credit_home_improvement_title, R$string.credit_get_credit_home_improvement_description, 10);
            case 4:
                return new fs3.g(null, R$string.credit_get_credit_mortgage_title, R$string.credit_get_credit_mortgage_description, 10);
            case 5:
                return new fs3.g(null, R$string.credit_get_credit_refinancing_mortgage_title, R$string.credit_get_credit_refinancing_mortgage_description, 10);
            case 6:
                return new fs3.g(null, R$string.credit_get_credit_credit_card_title, R$string.credit_get_credit_credit_card_description, 10);
            case 7:
                return new fs3.g(u.c(""), R$string.credit_get_credit_balance_transfer_title, R$string.credit_get_credit_balance_transfer_description, 2);
            case 8:
                return new fs3.g(null, R$string.credit_get_credit_secured_credit_card_title, R$string.credit_get_credit_secured_credit_card_description, 10);
            case 9:
                return new fs3.g(null, R$string.credit_get_credit_credit_builder_card_title, R$string.credit_get_credit_credit_builder_card_description, 10);
            case 10:
                return new fs3.g(null, R$string.credit_get_credit_pay_later_title, R$string.credit_get_credit_pay_later_description, 10);
            case 11:
                return new fs3.g(null, R$string.credit_get_credit_overdraft_title, R$string.credit_get_credit_overdraft_description, 10);
            case 12:
                return new fs3.g(null, R$string.credit_get_credit_credit_health_title, R$string.credit_get_credit_credit_health_description, 10);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final KotlinType i(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return dispatchReceiverParameter.getType();
        }
        DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getDefaultType();
        }
        return null;
    }

    public static final Method j(Class cls, CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            Intrinsics.h(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final ArrayList k(SimpleType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayListL = l(TypeSubstitutionKt.asSimpleType(type));
        if (arrayListL == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(w.t(arrayListL, 10));
        Iterator it8 = arrayListL.iterator();
        while (it8.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it8.next()));
        }
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = type.getConstructor().mo3795getDeclarationDescriptor();
        Intrinsics.i(classifierDescriptorMo3795getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsJ = o2.j((ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor);
        Intrinsics.h(clsJ);
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it9.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final ArrayList l(SimpleType simpleType) {
        ?? C;
        if (!InlineClassesUtilsKt.needsMfvcFlattening(simpleType)) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = simpleType.getConstructor().mo3795getDeclarationDescriptor();
        Intrinsics.i(classifierDescriptorMo3795getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentation = DescriptorUtilsKt.getMultiFieldValueClassRepresentation((ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor);
        Intrinsics.h(multiFieldValueClassRepresentation);
        Iterable<Pair> underlyingPropertyNamesToTypes = multiFieldValueClassRepresentation.getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : underlyingPropertyNamesToTypes) {
            Name name = (Name) pair.f186385a;
            ArrayList arrayListL = l((SimpleType) pair.f186386b);
            if (arrayListL != null) {
                C = new ArrayList(w.t(arrayListL, 10));
                Iterator it8 = arrayListL.iterator();
                while (it8.hasNext()) {
                    C.add(name.getIdentifier() + CoreConstants.DASH_CHAR + ((String) it8.next()));
                }
            } else {
                C = u.c(name.getIdentifier());
            }
            zhm.a0.x((Iterable) C, arrayList);
        }
        return arrayList;
    }

    public static final int m(bh0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (bi0.h.f15368a[aVar.ordinal()]) {
            case 1:
                return -1;
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 4;
            case 6:
                return 8;
            case 7:
                return 16;
            case 8:
                return 32;
            case 9:
                return 64;
            case 10:
                return 128;
            case 11:
                return 256;
            case 12:
                return 512;
            case 13:
                return 1024;
            case 14:
                return 2048;
            case 15:
                return 4096;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Map n() {
        return r0.k(new Pair("REGULAR", m.REGULAR), new Pair("EXTENDED", m.EXTENDED));
    }

    public static final yt8.f o(yt8.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        for (yt8.f fVar : cVar.f316663b) {
            if (fVar.f316668b == yt8.j.IDENTITY) {
                return fVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final dj0.d p(dj0.d dVar, dj0.d maxCap) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(maxCap, "maxCap");
        dj0.d dVar2 = new dj0.d(0L, dVar.f115083b);
        return dVar.i(dVar2) ? dVar2 : dVar.f(maxCap) ? maxCap : dVar;
    }

    public static final List q(List list, List newElements, Function1 keySelector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(newElements, "newElements");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        List list2 = list;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list2) {
            linkedHashMap.put(keySelector.invoke(obj2), obj2);
        }
        LinkedHashMap linkedHashMapZ = r0.z(linkedHashMap);
        for (Object obj3 : newElements) {
            linkedHashMapZ.put(keySelector.invoke(obj3), obj3);
        }
        return zhm.d0.d1(linkedHashMapZ.values());
    }

    public static final yt8.f r(yt8.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        for (yt8.f fVar : cVar.f316663b) {
            if (fVar.f316668b == yt8.j.RIGHT_TO_REMAIN) {
                return fVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final TextLocalisedClause s(int i, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextLocalisedClause(i, u.c(new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public static final cfl.n t(tih.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (plh.h.f237407a[dVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return cfl.m.f23746a;
            case 4:
                return cfl.l.f23745a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final PerformanceChartPoint u(uvg.v vVar, String str) {
        Object next;
        DateTime dateTimeD = vVar.getTimestamp();
        float fC = vVar.getReturns();
        float fE = vVar.getTotalReturns();
        List listA = vVar.getBenchmarks();
        Float fValueOf = null;
        if (listA != null) {
            Iterator it8 = listA.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((uvg.e) next).getRef(), str)) {
                    break;
                }
            }
            uvg.e eVar = (uvg.e) next;
            if (eVar != null) {
                fValueOf = Float.valueOf(eVar.getPercentage());
            }
        }
        return new PerformanceChartPoint(dateTimeD, fC, fE, fValueOf, mo3.a.o(vVar.getPnl()));
    }

    public static final EsimPhoneNumberCheckoutFee v(kfj.z0 z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        dj0.d dVarO = mo3.a.o(z0Var.getAmount());
        String strC = z0Var.getPeriod();
        Period period = strC != null ? Period.parse(strC) : null;
        kfj.t0 t0VarB = z0Var.getHighestPointsOption();
        return new EsimPhoneNumberCheckoutFee(dVarO, period, t0VarB != null ? ksj.b.y(t0VarB) : null);
    }

    public static final ArrayList w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<n4> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (n4 n4Var : list2) {
            Intrinsics.checkNotNullParameter(n4Var, "<this>");
            String str = n4Var.f147476a;
            String str2 = n4Var.f147477b;
            List<q4> list3 = n4Var.f147478c;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (q4 q4Var : list3) {
                Intrinsics.checkNotNullParameter(q4Var, "<this>");
                arrayList2.add(new AirportLoungesPassActivityFilterItem(q4Var.f147501a, q4Var.f147502b));
            }
            arrayList.add(new AirportLoungesPassActivityFilter(str, str2, arrayList2));
        }
        return arrayList;
    }

    public static final k59.a x(e8l.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new k59.a(kVar.getRate(), kVar.getPercentage());
    }

    public static final h1 y(ixb.b bVar) {
        f1 f1Var;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strB = bVar.getProduct();
        f1[] f1VarArrValues = f1.values();
        int length = f1VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                f1Var = null;
                break;
            }
            f1Var = f1VarArrValues[i];
            if (a0.z(f1Var.name(), strB, true)) {
                break;
            }
            i++;
        }
        if (f1Var == null) {
            f1Var = f1.UNKNOWN;
        }
        return new h1(f1Var, bVar.getEarning(), bVar.getRedeeming());
    }

    public static final h1 z(vxb.w wVar) {
        f1 f1Var;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        String strB = wVar.getProduct();
        f1[] f1VarArrValues = f1.values();
        int length = f1VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                f1Var = null;
                break;
            }
            f1Var = f1VarArrValues[i];
            if (a0.z(f1Var.name(), strB, true)) {
                break;
            }
            i++;
        }
        if (f1Var == null) {
            f1Var = f1.UNKNOWN;
        }
        return new h1(f1Var, wVar.getEarning(), wVar.getRedeeming());
    }
}
