package b1k;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends c {
    @Override // b1k.e
    public final CompositeClause e(d1k.c cVar) {
        d1k.b trendPreview = (d1k.b) cVar;
        Intrinsics.checkNotNullParameter(trendPreview, "trendPreview");
        return xqi.a.c(c.g(trendPreview.f110658b), false, false, false, false, false, CertificateBody.profileType);
    }
}
