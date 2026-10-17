package bg0;

import cg0.i0;
import cg0.x;
import cg0.y;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.model.faq.FaqAction;
import com.revolut.core.model.faq.FaqNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zf0.f;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static final aj0.c a(zf0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f321823a;
        String str2 = bVar.f321824b;
        String str3 = bVar.f321825c;
        String str4 = bVar.d;
        String str5 = bVar.e;
        List<zf0.a> list = bVar.f321828j;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (zf0.a aVar : list) {
            arrayList.add(new FaqAction(aVar.f321820a, aVar.f321821b, aVar.f321822c, true));
        }
        String str6 = bVar.k;
        List list2 = bVar.f321829l;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        return new aj0.c(str, str2, str3, str4, str5, arrayList, str6, list2, bVar.f321830m);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v9, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final FaqNode b(x xVar, String str, String str2) {
        ?? arrayList;
        ?? arrayList2;
        switch (str.hashCode()) {
            case 69366:
                if (str.equals("FAQ")) {
                    String key = xVar.getKey();
                    String title = xVar.getTitle();
                    String contentStyle = xVar.getContentStyle();
                    if (str2 == null) {
                        str2 = "";
                    }
                    return new FaqNode.Article(key, title, contentStyle, str2);
                }
                break;
            case 80008463:
                if (str.equals("TOPIC")) {
                    String key2 = xVar.getKey();
                    String title2 = xVar.getTitle();
                    String contentStyle2 = xVar.getContentStyle();
                    String str3 = str2 == null ? "" : str2;
                    List children = xVar.getChildren();
                    if (children != null) {
                        List<y> list = children;
                        arrayList = new ArrayList(w.t(list, 10));
                        for (y yVar : list) {
                            String key3 = xVar.getKey();
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            arrayList.add(b(yVar.getValue(), yVar.getType(), key3));
                        }
                    } else {
                        arrayList = f0.f322471a;
                    }
                    return new FaqNode.Topic(key2, title2, contentStyle2, str3, arrayList);
                }
                break;
            case 833137918:
                if (str.equals("CATEGORY")) {
                    String key4 = xVar.getKey();
                    String title3 = xVar.getTitle();
                    String contentStyle3 = xVar.getContentStyle();
                    List children2 = xVar.getChildren();
                    if (children2 != null) {
                        List<y> list2 = children2;
                        arrayList2 = new ArrayList(w.t(list2, 10));
                        for (y yVar2 : list2) {
                            String key5 = xVar.getKey();
                            Intrinsics.checkNotNullParameter(yVar2, "<this>");
                            arrayList2.add(b(yVar2.getValue(), yVar2.getType(), key5));
                        }
                    } else {
                        arrayList2 = f0.f322471a;
                    }
                    return new FaqNode.Category(key4, title3, contentStyle3, xVar.getIconUri(), arrayList2);
                }
                break;
            case 1411860198:
                if (str.equals("DEEPLINK")) {
                    String key6 = xVar.getKey();
                    String title4 = xVar.getTitle();
                    String contentStyle4 = xVar.getContentStyle();
                    String deeplink = xVar.getDeeplink();
                    return new FaqNode.Deeplink(key6, title4, contentStyle4, deeplink == null ? "" : deeplink, str2 == null ? "" : str2);
                }
                break;
        }
        throw new IllegalArgumentException("Unknown type of FAQ node: ".concat(str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final FaqNode c(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f321840a;
        switch (str.hashCode()) {
            case 69366:
                if (str.equals("FAQ")) {
                    return new FaqNode.Article(fVar.f321841b, fVar.f321842c, fVar.e, fVar.d);
                }
                break;
            case 80008463:
                if (str.equals("TOPIC")) {
                    return new FaqNode.Topic(fVar.f321841b, fVar.f321842c, fVar.e, fVar.d, f0.f322471a);
                }
                break;
            case 833137918:
                if (str.equals("CATEGORY")) {
                    return new FaqNode.Category(fVar.f321841b, fVar.f321842c, fVar.e, fVar.i, f0.f322471a);
                }
                break;
            case 1411860198:
                if (str.equals("DEEPLINK")) {
                    return new FaqNode.Deeplink(fVar.f321841b, fVar.f321842c, fVar.e, fVar.f, fVar.d);
                }
                break;
        }
        throw new IllegalArgumentException(j6.a.q("Unknown type of FAQ node: ", fVar.f321840a));
    }

    public static final hj0.b d(i0 i0Var) {
        hj0.a aVar;
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        String key = i0Var.getKey();
        String title = i0Var.getTitle();
        String hyperlink = i0Var.getHyperlink();
        String deeplink = i0Var.getDeeplink();
        cg0.a shortDescription = i0Var.getShortDescription();
        if (shortDescription != null) {
            Intrinsics.checkNotNullParameter(shortDescription, "<this>");
            aVar = new hj0.a(shortDescription.getTitle(), shortDescription.getDetails());
        } else {
            aVar = null;
        }
        return new hj0.b(key, title, hyperlink, deeplink, aVar);
    }

    public static final zf0.b e(aj0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f5340a;
        String str2 = cVar.f5341b;
        String str3 = cVar.f5342c;
        String str4 = str3 == null ? "" : str3;
        String str5 = cVar.d;
        String str6 = str5 == null ? "" : str5;
        String str7 = cVar.e;
        Iterable<FaqAction> iterable = (Iterable) cVar.f;
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        for (FaqAction faqAction : iterable) {
            arrayList.add(new zf0.a(faqAction.f51416a, faqAction.f51417b, faqAction.f51418c));
        }
        return new zf0.b(str, str2, str4, str6, str7, arrayList, cVar.f5343g, cVar.f5344h, cVar.i, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
    }
}
