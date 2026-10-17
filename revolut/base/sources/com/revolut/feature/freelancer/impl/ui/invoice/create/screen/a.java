package com.revolut.feature.freelancer.impl.ui.invoice.create.screen;

import cli.j;
import com.revolut.data.model.Data;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0490a f73837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f73838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f73839c;
    public final Map d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f73840g;

    /* JADX INFO: renamed from: com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a$a, reason: collision with other inner class name */
    public static final class C0490a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f73842b;

        public C0490a() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0490a)) {
                return false;
            }
            C0490a c0490a = (C0490a) obj2;
            return Intrinsics.f(this.f73841a, c0490a.f73841a) && this.f73842b == c0490a.f73842b;
        }

        public final int hashCode() {
            String str = this.f73841a;
            return Boolean.hashCode(this.f73842b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public /* synthetic */ C0490a(int i) {
            this(null, false);
        }

        public C0490a(String str, boolean z) {
            this.f73841a = str;
            this.f73842b = z;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Data f73843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f73844b;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f73843a, bVar.f73843a) && this.f73844b == bVar.f73844b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f73844b) + (this.f73843a.hashCode() * 31);
        }

        public b(Data processingSettingsData, boolean z) {
            Intrinsics.checkNotNullParameter(processingSettingsData, "processingSettingsData");
            this.f73843a = processingSettingsData;
            this.f73844b = z;
        }

        public /* synthetic */ b(int i) {
            this(new Data(null, null, true, 3, null), false);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f73845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73847c;
        public final String d;

        /* JADX WARN: Illegal instructions before constructor call */
        public c() {
            String str = null;
            this(str, str, str, 15);
        }

        public static c a(c cVar, boolean z, String str, String str2, String str3, int i) {
            if ((i & 1) != 0) {
                z = cVar.f73845a;
            }
            if ((i & 2) != 0) {
                str = cVar.f73846b;
            }
            if ((i & 4) != 0) {
                str2 = cVar.f73847c;
            }
            if ((i & 8) != 0) {
                str3 = cVar.d;
            }
            return new c(z, str, str2, str3);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.f73845a == cVar.f73845a && Intrinsics.f(this.f73846b, cVar.f73846b) && Intrinsics.f(this.f73847c, cVar.f73847c) && Intrinsics.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f73845a) * 31;
            String str = this.f73846b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f73847c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public /* synthetic */ c(String str, String str2, String str3, int i) {
            this((i & 1) == 0, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public c(boolean z, String str, String str2, String str3) {
            this.f73845a = z;
            this.f73846b = str;
            this.f73847c = str2;
            this.d = str3;
        }
    }

    public a() {
        this(0);
    }

    public static a a(a aVar, C0490a c0490a, b bVar, Data data, LinkedHashMap linkedHashMap, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            c0490a = aVar.f73837a;
        }
        C0490a additionalOptions = c0490a;
        if ((i & 2) != 0) {
            bVar = aVar.f73838b;
        }
        b banner = bVar;
        if ((i & 4) != 0) {
            data = aVar.f73839c;
        }
        Data invoice = data;
        Map map = linkedHashMap;
        if ((i & 8) != 0) {
            map = aVar.d;
        }
        Map itemInfo = map;
        if ((i & 16) != 0) {
            data2 = aVar.e;
        }
        Data legalEntityContext = data2;
        boolean z = (i & 32) != 0 ? aVar.f : true;
        if ((i & 64) != 0) {
            data3 = aVar.f73840g;
        }
        Data taxRates = data3;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(additionalOptions, "additionalOptions");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
        return new a(additionalOptions, banner, invoice, itemInfo, legalEntityContext, z, taxRates);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f73837a, aVar.f73837a) && Intrinsics.f(this.f73838b, aVar.f73838b) && Intrinsics.f(this.f73839c, aVar.f73839c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && Intrinsics.f(this.f73840g, aVar.f73840g);
    }

    public final int hashCode() {
        return this.f73840g.hashCode() + j6.a.c(kii.e.c(this.e, p.a.e(kii.e.c(this.f73839c, (this.f73838b.hashCode() + (this.f73837a.hashCode() * 31)) * 31, 31), 31, this.d), 31), 31, this.f);
    }

    public a(C0490a additionalOptions, b banner, Data invoice, Map itemInfo, Data legalEntityContext, boolean z, Data taxRates) {
        Intrinsics.checkNotNullParameter(additionalOptions, "additionalOptions");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
        this.f73837a = additionalOptions;
        this.f73838b = banner;
        this.f73839c = invoice;
        this.d = itemInfo;
        this.e = legalEntityContext;
        this.f = z;
        this.f73840g = taxRates;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(int i) {
        int i2 = 0;
        this(new C0490a(i2), new b(i2), new Data(null, null, true, 3, null), r0.g(), new Data(null, null, true, 3, null), false, new Data(null, null, true, 3, null));
    }
}
