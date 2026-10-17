package com.revolut.feature.freelancer.impl.ui.invoice.templates.details;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C0491a Companion = new C0491a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f73949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73950c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f73951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f73952h;
    public final u9d.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f73953j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f73954l;

    /* JADX INFO: renamed from: com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a$a, reason: collision with other inner class name */
    public static final class C0491a {
        private C0491a() {
        }
    }

    public a() {
        this(0);
    }

    public static a a(a aVar, String str, String str2, boolean z, boolean z3, ArrayList arrayList, u9d.b bVar, String str3, String str4, int i) {
        String str5 = aVar.f73948a;
        boolean z4 = aVar.f73949b;
        if ((i & 4) != 0) {
            str = aVar.f73950c;
        }
        String templateName = str;
        if ((i & 8) != 0) {
            str2 = aVar.d;
        }
        String invoiceTitle = str2;
        boolean z6 = aVar.e;
        boolean z11 = (i & 32) != 0 ? aVar.f : z;
        boolean z12 = (i & 64) != 0 ? aVar.f73951g : z3;
        List customFields = (i & 128) != 0 ? aVar.f73952h : arrayList;
        u9d.b language = (i & 256) != 0 ? aVar.i : bVar;
        String str6 = (i & 512) != 0 ? aVar.f73953j : str3;
        String str7 = (i & 1024) != 0 ? aVar.k : str4;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(templateName, "templateName");
        Intrinsics.checkNotNullParameter(invoiceTitle, "invoiceTitle");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        Intrinsics.checkNotNullParameter(language, "language");
        return new a(str5, z4, templateName, invoiceTitle, z6, z11, z12, customFields, language, str6, str7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f73948a, aVar.f73948a) && this.f73949b == aVar.f73949b && Intrinsics.f(this.f73950c, aVar.f73950c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.f73951g == aVar.f73951g && Intrinsics.f(this.f73952h, aVar.f73952h) && this.i == aVar.i && Intrinsics.f(this.f73953j, aVar.f73953j) && Intrinsics.f(this.k, aVar.k);
    }

    public final int hashCode() {
        String str = this.f73948a;
        int iHashCode = (this.i.hashCode() + p.a.d(j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f73949b), 31, this.f73950c), 31, this.d), 31, this.e), 31, this.f), 31, this.f73951g), 31, this.f73952h)) * 31;
        String str2 = this.f73953j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public a(String str, boolean z, String templateName, String invoiceTitle, boolean z3, boolean z4, boolean z6, List customFields, u9d.b language, String str2, String str3) {
        Intrinsics.checkNotNullParameter(templateName, "templateName");
        Intrinsics.checkNotNullParameter(invoiceTitle, "invoiceTitle");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        Intrinsics.checkNotNullParameter(language, "language");
        this.f73948a = str;
        this.f73949b = z;
        this.f73950c = templateName;
        this.d = invoiceTitle;
        this.e = z3;
        this.f = z4;
        this.f73951g = z6;
        this.f73952h = customFields;
        this.i = language;
        this.f73953j = str2;
        this.k = str3;
        this.f73954l = str != null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i) {
        this(null, false, "", "", false, false, false, u.c(new InvoiceTemplate.CustomField("", "")), u9d.b.ENGLISH_UK, null, null);
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        m70.a.c(t0Var);
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
    }
}
