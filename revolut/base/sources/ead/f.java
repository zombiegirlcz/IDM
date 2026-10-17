package ead;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f124194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f124196c;
    public final Data d;
    public final Data e;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 31);
    }

    public static f a(f fVar, String str, Data pdfFile, Data emailHtml, Data data, int i) {
        String selectedTabId = str;
        Set visibleTypes = fVar.f124194a;
        if ((i & 2) != 0) {
            selectedTabId = fVar.f124195b;
        }
        if ((i & 4) != 0) {
            pdfFile = fVar.f124196c;
        }
        if ((i & 8) != 0) {
            emailHtml = fVar.d;
        }
        if ((i & 16) != 0) {
            data = fVar.e;
        }
        Data paymentUrl = data;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(visibleTypes, "visibleTypes");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(pdfFile, "pdfFile");
        Intrinsics.checkNotNullParameter(emailHtml, "emailHtml");
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        Data data2 = emailHtml;
        return new f(visibleTypes, selectedTabId, pdfFile, data2, paymentUrl);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f124194a, fVar.f124194a) && Intrinsics.f(this.f124195b, fVar.f124195b) && Intrinsics.f(this.f124196c, fVar.f124196c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f124196c, p.a.c(this.f124194a.hashCode() * 31, 31, this.f124195b), 31), 31);
    }

    public f(Set visibleTypes, String selectedTabId, Data pdfFile, Data emailHtml, Data paymentUrl) {
        Intrinsics.checkNotNullParameter(visibleTypes, "visibleTypes");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(pdfFile, "pdfFile");
        Intrinsics.checkNotNullParameter(emailHtml, "emailHtml");
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        this.f124194a = visibleTypes;
        this.f124195b = selectedTabId;
        this.f124196c = pdfFile;
        this.d = emailHtml;
        this.e = paymentUrl;
    }

    public /* synthetic */ f(Set set, String str, int i) {
        this((i & 1) != 0 ? d0.i1(t9d.d.a()) : set, (i & 2) != 0 ? "Pdf" : str, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
