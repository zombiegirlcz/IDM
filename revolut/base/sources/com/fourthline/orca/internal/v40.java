package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jlm.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes23.dex */
public abstract class v40 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ab0.b.values().length];
            try {
                iArr[ab0.b.f26759a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ab0.b.f26760b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ab0.b.f26761c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(fem.d dVar, ab0.a request, String metricsRequestId) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(metricsRequestId, "metricsRequestId");
        for (Pair pair : request.d()) {
            String key = (String) pair.f186385a;
            String str = (String) pair.f186386b;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            if (str != null) {
                dVar.f134657a.f183210j.d(key, str.toString());
            }
        }
        kem.y yVarA = a(request.c());
        dVar.getClass();
        kem.s sVar = dVar.f134659c;
        Intrinsics.checkNotNullParameter(yVarA, "<set-?>");
        dVar.f134658b = yVarA;
        jn1 block = new jn1(metricsRequestId, request, 21);
        oem.a aVar = fem.f.f134664a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(sVar);
        Set setKeySet = request.b().keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            kem.i type = kem.e.f183196a;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(type, "type");
            List list = kem.u.f183239a;
            String value = type.toString();
            sVar.getClass();
            Intrinsics.checkNotNullParameter("Content-Type", "name");
            Intrinsics.checkNotNullParameter(value, "value");
            sVar.i(value);
            List listF = sVar.f("Content-Type");
            listF.clear();
            listF.add(value);
        } else {
            Iterator it8 = setKeySet.iterator();
            while (it8.hasNext()) {
                if (kotlin.text.a0.z((String) it8.next(), "Content-Type", true)) {
                    break;
                }
            }
            kem.i type2 = kem.e.f183196a;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(type2, "type");
            List list2 = kem.u.f183239a;
            String value2 = type2.toString();
            sVar.getClass();
            Intrinsics.checkNotNullParameter("Content-Type", "name");
            Intrinsics.checkNotNullParameter(value2, "value");
            sVar.i(value2);
            List listF2 = sVar.f("Content-Type");
            listF2.clear();
            listF2.add(value2);
        }
        byte[] bArrB = request.a().b();
        KType kTypeB = null;
        if (bArrB == null) {
            nem.a aVar2 = nem.a.f214640a;
            Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
            dVar.d = aVar2;
            KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(byte[].class);
            try {
                kTypeB = kotlin.jvm.internal.o0.b(byte[].class);
            } catch (Throwable unused) {
            }
            dVar.a(new tem.a(kClassB, kTypeB));
            return;
        }
        if (bArrB instanceof nem.c) {
            Intrinsics.checkNotNullParameter(bArrB, "<set-?>");
            dVar.d = bArrB;
            dVar.a(null);
        } else {
            Intrinsics.checkNotNullParameter(bArrB, "<set-?>");
            dVar.d = bArrB;
            KClass kClassB2 = kotlin.jvm.internal.o0.f186429a.b(byte[].class);
            try {
                kTypeB = kotlin.jvm.internal.o0.b(byte[].class);
            } catch (Throwable unused2) {
            }
            dVar.a(new tem.a(kClassB2, kTypeB));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, ab0.a aVar, kem.s headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        headers.d("X-Fl-Network-Metrics-Request-Id", str);
        for (Map.Entry entry : aVar.b().entrySet()) {
            headers.d((String) entry.getKey(), (String) entry.getValue());
        }
        return Unit.f186387a;
    }

    public static final void a(fem.d dVar, ab0.c request, String metricsRequestId) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(metricsRequestId, "metricsRequestId");
        for (Pair pair : request.c()) {
            String key = (String) pair.f186385a;
            String str = (String) pair.f186386b;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            if (str != null) {
                dVar.f134657a.f183210j.d(key, str.toString());
            }
        }
        jn1 block = new jn1(metricsRequestId, request, 22);
        oem.a aVar = fem.f.f134664a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(dVar.f134659c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, ab0.c cVar, kem.s headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        headers.d("X-Fl-Network-Metrics-Request-Id", str);
        for (Map.Entry entry : cVar.b().entrySet()) {
            headers.d((String) entry.getKey(), (String) entry.getValue());
        }
        return Unit.f186387a;
    }

    public static final List a(ab0.c cVar) {
        nem.g eVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        final int i = 0;
        ss1 block = new ss1(cVar, i);
        Intrinsics.checkNotNullParameter(block, "block");
        gem.a aVar = new gem.a();
        block.invoke(aVar);
        gem.d[] dVarArr = (gem.d[]) aVar.f143314a.toArray(new gem.d[0]);
        gem.d[] values = (gem.d[]) Arrays.copyOf(dVarArr, dVarArr.length);
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList();
        for (gem.d dVar : values) {
            String strB = dVar.f143318a;
            final Object obj2 = dVar.f143319b;
            kem.t tVar = dVar.f143320c;
            kem.s sVar = new kem.s();
            List list = kem.u.f183239a;
            StringBuilder sb6 = new StringBuilder("form-data; name=");
            Set set = kem.p.f183223a;
            Intrinsics.checkNotNullParameter(strB, "<this>");
            if (kem.p.a(strB)) {
                strB = kem.p.b(strB);
            }
            sb6.append(strB);
            sVar.d("Content-Disposition", sb6.toString());
            sVar.e(tVar);
            if (obj2 instanceof String) {
                eVar = new nem.f((String) obj2, new aem.v(20), sVar.j());
            } else if (obj2 instanceof Number) {
                eVar = new nem.f(obj2.toString(), new aem.v(21), sVar.j());
            } else if (obj2 instanceof Boolean) {
                eVar = new nem.f(String.valueOf(((Boolean) obj2).booleanValue()), new aem.v(22), sVar.j());
            } else if (obj2 instanceof byte[]) {
                sVar.d("Content-Length", String.valueOf(((byte[]) obj2).length));
                eVar = new nem.e(new Function0() { // from class: gem.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() throws Exception {
                        switch (i) {
                            case 0:
                                byte[] array = (byte[]) obj2;
                                int length = array.length;
                                Intrinsics.checkNotNullParameter(array, "array");
                                jlm.a aVar2 = new jlm.a();
                                aVar2.k(length, array);
                                return aVar2;
                            case 1:
                                return ((k) obj2).peek();
                            default:
                                ((k) obj2).close();
                                return Unit.f186387a;
                        }
                    }
                }, new aem.v(23), sVar.j());
            } else if (obj2 instanceof jlm.k) {
                if (obj2 instanceof jlm.a) {
                    sVar.d("Content-Length", String.valueOf(a1m.e.x((jlm.k) obj2)));
                }
                final int i2 = 1;
                final int i3 = 2;
                eVar = new nem.e(new Function0() { // from class: gem.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() throws Exception {
                        switch (i2) {
                            case 0:
                                byte[] array = (byte[]) obj2;
                                int length = array.length;
                                Intrinsics.checkNotNullParameter(array, "array");
                                jlm.a aVar2 = new jlm.a();
                                aVar2.k(length, array);
                                return aVar2;
                            case 1:
                                return ((k) obj2).peek();
                            default:
                                ((k) obj2).close();
                                return Unit.f186387a;
                        }
                    }
                }, new Function0() { // from class: gem.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() throws Exception {
                        switch (i3) {
                            case 0:
                                byte[] array = (byte[]) obj2;
                                int length = array.length;
                                Intrinsics.checkNotNullParameter(array, "array");
                                jlm.a aVar2 = new jlm.a();
                                aVar2.k(length, array);
                                return aVar2;
                            case 1:
                                return ((k) obj2).peek();
                            default:
                                ((k) obj2).close();
                                return Unit.f186387a;
                        }
                    }
                }, sVar.j());
            } else {
                throw new IllegalStateException(("Unknown form content type: " + obj2).toString());
            }
            arrayList.add(eVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ab0.c cVar, gem.a formData) {
        Intrinsics.checkNotNullParameter(formData, "$this$formData");
        for (ab0.c.a aVar : cVar.a()) {
            String key = aVar.b();
            byte[] value = aVar.c().b();
            kem.s sVar = new kem.s();
            for (Map.Entry entry : aVar.a().entrySet()) {
                sVar.d((String) entry.getKey(), (String) entry.getValue());
            }
            Unit unit = Unit.f186387a;
            kem.t headers = sVar.j();
            formData.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(headers, "headers");
            formData.f143314a.add(new gem.d(key, value, headers));
        }
        return Unit.f186387a;
    }

    public static final kem.y a(ab0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = a.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i == 1) {
            kem.y.Companion.getClass();
            return kem.y.f183240b;
        }
        if (i == 2) {
            kem.y.Companion.getClass();
            return kem.y.f183241c;
        }
        if (i == 3) {
            kem.y.Companion.getClass();
            return kem.y.d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
