package ofj;

import com.revolut.retail.feature.esim.api.model.EsimIcon;
import kfj.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g {
    public static final EsimIcon a(f0.Companion companion, String url2, String id10) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        EsimIcon.INSTANCE.getClass();
        if (url2 != null) {
            Intrinsics.checkNotNullParameter(url2, "url");
        } else {
            url2 = null;
        }
        if (url2 != null) {
            return new EsimIcon.Url(url2);
        }
        if (id10 != null) {
            Intrinsics.checkNotNullParameter(id10, "id");
        } else {
            id10 = null;
        }
        if (id10 != null) {
            return new EsimIcon.Id(id10);
        }
        return null;
    }

    public static final EsimIcon b(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return a(f0.INSTANCE, f0Var.getUrl(), f0Var.getId());
    }

    public static final f0 c(EsimIcon esimIcon) {
        Intrinsics.checkNotNullParameter(esimIcon, "<this>");
        if (esimIcon instanceof EsimIcon.Url) {
            return new f0(null, ((EsimIcon.Url) esimIcon).f100282a);
        }
        if (esimIcon instanceof EsimIcon.Id) {
            return new f0(((EsimIcon.Id) esimIcon).f100281a, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
