package nka;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f216798b;

    public q(String articleId, Map substitutionData) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
        this.f216797a = articleId;
        this.f216798b = substitutionData;
    }

    public final String a() throws IOException {
        String strK0;
        Map map = this.f216798b;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            strK0 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(entry.getKey() + "=" + entry.getValue());
            }
            strK0 = d0.k0(arrayList, null, null, null, 0, null, 63);
        }
        return a0.d.s("PRODUCT_ARTICLE_KEY_PREFIX-", this.f216797a, "-", strK0);
    }

    public final String b() {
        return j6.a.q("V2_", a());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f216797a, qVar.f216797a) && Intrinsics.f(this.f216798b, qVar.f216798b);
    }

    public final int hashCode() {
        return this.f216798b.hashCode() + (this.f216797a.hashCode() * 31);
    }
}
