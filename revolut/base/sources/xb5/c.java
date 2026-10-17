package xb5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mb5.m;
import mb5.n;
import mb5.o;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f303995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f303996c;

    public /* synthetic */ c(String str, g gVar, int i) {
        this.f303994a = i;
        this.f303995b = str;
        this.f303996c = gVar;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f303994a;
        g gVar = this.f303996c;
        String str = this.f303995b;
        switch (i) {
            case 0:
                ub5.e it8 = (ub5.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                c buildUrl = new c(str, gVar, 1);
                Object obj3 = tb5.c.f269462a;
                Intrinsics.checkNotNullParameter(it8, "<this>");
                Intrinsics.checkNotNullParameter(buildUrl, "buildUrl");
                List<ub5.d> documents = it8.getDocuments();
                ArrayList arrayList = new ArrayList(w.t(documents, 10));
                for (ub5.d dVar : documents) {
                    String id10 = dVar.getId();
                    String name = dVar.getName();
                    String displayName = dVar.getDisplayName();
                    String str2 = (String) buildUrl.invoke(dVar);
                    o oVar = (o) u1.v(dVar.getType(), tb5.c.f269462a);
                    if (oVar == null) {
                        oVar = o.ORIGINAL;
                    }
                    o oVar2 = oVar;
                    n nVar = (n) u1.v(dVar.getState(), tb5.c.f269463b);
                    if (nVar == null) {
                        nVar = n.CREATED;
                    }
                    n nVar2 = nVar;
                    LocalDate localDate = LocalDate.parse(dVar.getCreatedDate());
                    Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                    long jF = oc.c.F(localDate);
                    m mVar = (m) u1.v(dVar.getFileType(), tb5.c.f269464c);
                    if (mVar == null) {
                        mVar = m.PDF;
                    }
                    arrayList.add(new mb5.f(id10, name, displayName, str2, oVar2, nVar2, jF, mVar));
                }
                return new mb5.d(arrayList);
            default:
                ub5.d document = (ub5.d) obj2;
                Intrinsics.checkNotNullParameter(document, "document");
                String id11 = document.getId();
                String fileType = document.getFileType();
                StringBuilder sbM = v0.a.m("/credit-application/credit-facility-v2/", str, "/agreement/", id11, "/");
                sbM.append(fileType);
                String string = r10.f.q(gVar.f303999c, sbM.toString()).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
        }
    }
}
