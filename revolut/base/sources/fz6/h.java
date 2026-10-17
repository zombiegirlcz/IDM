package fz6;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceTemplate f139111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9d.b f139112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139113c;
    public final List d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f139114g;

    public h(InvoiceTemplate template, u9d.b bVar, String str, List customFields, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        this.f139111a = template;
        this.f139112b = bVar;
        this.f139113c = str;
        this.d = customFields;
        this.e = str2;
        this.f = str3;
        this.f139114g = z;
    }

    public static h a(h hVar, InvoiceTemplate invoiceTemplate, u9d.b bVar, String str, ArrayList arrayList, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            invoiceTemplate = hVar.f139111a;
        }
        InvoiceTemplate template = invoiceTemplate;
        if ((i & 2) != 0) {
            bVar = hVar.f139112b;
        }
        u9d.b bVar2 = bVar;
        if ((i & 4) != 0) {
            str = hVar.f139113c;
        }
        String str4 = str;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = hVar.d;
        }
        List customFields = list;
        if ((i & 16) != 0) {
            str2 = hVar.e;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = hVar.f;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            z = hVar.f139114g;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        return new h(template, bVar2, str4, customFields, str5, str6, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f139111a, hVar.f139111a) && this.f139112b == hVar.f139112b && Intrinsics.f(this.f139113c, hVar.f139113c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && this.f139114g == hVar.f139114g;
    }

    public final int hashCode() {
        int iHashCode = this.f139111a.hashCode() * 31;
        u9d.b bVar = this.f139112b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f139113c;
        int iD = p.a.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode3 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.f139114g) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
