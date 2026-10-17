package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.fourthline.orca.internal.lz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class b61 implements lz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27006a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27007a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final CountryNetworkModel f27008b = new CountryNetworkModel("NLD", zhm.v.k(new CountryNetworkModel.Document(DocumentType.PASSPORT, zhm.u.c("NLD"), null, null, 12, null), new CountryNetworkModel.Document(DocumentType.DRIVERS_LICENSE, zhm.u.c("NLD"), null, null, 12, null)));

        private a() {
        }

        public final CountryNetworkModel a() {
            return f27008b;
        }
    }

    public b61(String validationCode, boolean z) {
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        String upperCase = (kotlin.text.d0.W(validationCode) ? "IDVandQESandBAV" : validationCode).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        List<String> listN0 = kotlin.text.d0.n0(upperCase, new String[]{"AND"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (String str : listN0) {
            int iHashCode = str.hashCode();
            if (iHashCode != 65527) {
                if (iHashCode != 72347) {
                    if (iHashCode == 80063 && str.equals("QES")) {
                        arrayList.addAll(c());
                    }
                } else if (str.equals("IDV")) {
                    arrayList.addAll(b());
                }
            } else if (str.equals("BAV")) {
                arrayList.addAll(a());
            }
        }
        if (z) {
            zhm.a0.G(arrayList);
        }
        this.f27006a = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List b() {
        List listD = d();
        char c2 = 1;
        dj djVar = new dj(null, null, null, true, null, null, new qh(true), new wf(false, 18, 0L, 0L), new km(true, "Default", (gd0) null, 4, (DefaultConstructorMarker) null), listD, false, 1079, null);
        djVar.a(VideoDuration.DEFAULT.INSTANCE);
        Unit unit = Unit.f186387a;
        Pair pair = new Pair("document", djVar);
        Pair pair2 = new Pair("person", new dk0(18));
        Pair pair3 = new Pair("tin", new j91(x71.d, (Boolean) null, (j9) null, 4, (DefaultConstructorMarker) null));
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Pair pair4 = new Pair("biometrics", new n01(null, new p21(true, (Integer) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new n11(true, new o11(false)), null, 9, null));
        Pair pair5 = new Pair("geolocation", new e60());
        EnumEntries enumEntriesD = uo0.d();
        ArrayList arrayList = new ArrayList(zhm.w.t(enumEntriesD, 10));
        Iterator<E> it8 = enumEntriesD.iterator();
        while (it8.hasNext()) {
            arrayList.add(new wo0((uo0) it8.next(), (Integer) null, 2, (DefaultConstructorMarker) null));
        }
        return zhm.v.k(pair, pair2, pair3, pair4, pair5, new Pair("poa", new an0((j9) (objArr2 == true ? 1 : 0), (List) arrayList, (int) (c2 == true ? 1 : 0), (DefaultConstructorMarker) (objArr == true ? 1 : 0))), new Pair("address", new n0()), new Pair("contact", new cc()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List c() {
        boolean z = true;
        j9 j9Var = null;
        it0 it0Var = new it0(new ew0(z, new p21(true, (Integer) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), j9Var, 4, (DefaultConstructorMarker) null), new n11(true, new o11(false)), new ev0(true));
        it0Var.a(sx0.f33154c);
        return zhm.u.c(new Pair("qes", it0Var));
    }

    private final List d() {
        return zhm.u.c(a.f27007a.a());
    }

    @Override // com.fourthline.orca.internal.lz
    public Object a(lz.a aVar, Continuation continuation) {
        Pair pair = (Pair) zhm.a0.G(this.f27006a);
        lz.c c0245c = pair != null ? new lz.c.C0245c((String) pair.f186385a, (ny) pair.f186386b) : lz.c.a.f30793a;
        m.Companion companion = yhm.m.INSTANCE;
        return new lz.b(c0245c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List a() {
        return zhm.u.c(new Pair("bav", new c4(null, zhm.u.c(new t5(v6.f34254b, false, 10)), 1, 0 == true ? 1 : 0)));
    }

    public /* synthetic */ b61(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
