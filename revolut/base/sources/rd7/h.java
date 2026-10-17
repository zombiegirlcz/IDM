package rd7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public interface h {
    String a();

    default h b(String str) {
        if (this instanceof g) {
            g gVar = (g) this;
            String url2 = gVar.f253366a;
            Intrinsics.checkNotNullParameter(url2, "url");
            return new g(url2, gVar.f253367b, gVar.f253368c, str);
        }
        if (!(this instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        String filePath = ((f) this).f253364a;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new f(filePath, str);
    }
}
