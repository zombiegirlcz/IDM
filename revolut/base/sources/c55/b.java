package c55;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21425c;

    public /* synthetic */ b(String str, String str2, int i) {
        this.f21423a = i;
        this.f21424b = str;
        this.f21425c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String id10;
        String fileType;
        String str;
        String fileType2;
        StringBuilder sbT;
        String str2;
        rx4.a document = (rx4.a) obj2;
        ux4.h type = (ux4.h) obj3;
        switch (this.f21423a) {
            case 0:
                Intrinsics.checkNotNullParameter(document, "document");
                Intrinsics.checkNotNullParameter(type, "type");
                int i = c.f21427a[type.ordinal()];
                String str3 = this.f21424b;
                String str4 = this.f21425c;
                if (i == 1) {
                    id10 = document.getId();
                    fileType = document.getFileType();
                    str = "/credit-application/loan-facility-v2/";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    id10 = document.getId();
                    fileType = document.getFileType();
                    str = "/credit-application/forbearance-loan-facility/";
                }
                return v0.a.i(p.a.t(str3, str, str4, "/agreement/", id10), "/", fileType);
            case 1:
                Intrinsics.checkNotNullParameter(document, "document");
                Intrinsics.checkNotNullParameter(type, "<unused var>");
                String id11 = document.getId();
                fileType2 = document.getFileType();
                sbT = p.a.t(this.f21424b, "/credit-application/credit-facility-v2/", this.f21425c, "/agreement/", id11);
                str2 = "/";
                break;
            default:
                Intrinsics.checkNotNullParameter(document, "document");
                Intrinsics.checkNotNullParameter(type, "<unused var>");
                String id12 = document.getId();
                fileType2 = document.getFileType();
                sbT = p.a.t(this.f21424b, "/credit-application/credit-facility-v2/", this.f21425c, "/agreement/", id12);
                str2 = "/";
                break;
        }
        return v0.a.i(sbT, str2, fileType2);
    }
}
