package mr7;

import com.revolut.feature.insurance_common.data.model.Document;
import com.revolut.feature.insurance_common.data.model.DocumentsGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import le.u1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f208068a = r0.k(new Pair("PDF", nr7.a.PDF), new Pair("WEBPAGE", nr7.a.WEBPAGE));

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public static final Document a(kr7.a aVar, String baseUrl) {
        String link;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        boolean zF = Intrinsics.f(aVar.getLinkType(), "RELATIVE");
        String title = aVar.getTitle();
        String description = aVar.getDescription();
        if (zF) {
            link = com.google.android.gms.internal.mlkit_vision_face.a.o(d0.g0(baseUrl, "/"), "/", d0.e0(aVar.getLink(), "/"));
        } else {
            link = aVar.getLink();
        }
        String str = link;
        nr7.a aVar2 = (nr7.a) u1.t(aVar.getType(), nr7.a.WEBPAGE, f208068a);
        String code = aVar.getCode();
        if (code == null) {
            code = "";
        }
        return new Document(title, description, code, str, aVar2, zF);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final Document b(lr7.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String title = aVar.getTitle();
        String description = aVar.getDescription();
        String link = aVar.getLink();
        boolean requiresAuth = aVar.getRequiresAuth();
        nr7.a aVar2 = (nr7.a) u1.u(aVar.getType(), f208068a);
        String code = aVar.getCode();
        if (code == null) {
            code = "";
        }
        return new Document(title, description, code, link, aVar2, requiresAuth);
    }

    public static final DocumentsGroup c(kr7.b bVar, String baseUrl) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        String title = bVar.getTitle();
        List documents = bVar.getDocuments();
        ArrayList arrayList = new ArrayList(w.t(documents, 10));
        Iterator it8 = documents.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((kr7.a) it8.next(), baseUrl));
        }
        return new DocumentsGroup(title, arrayList);
    }
}
