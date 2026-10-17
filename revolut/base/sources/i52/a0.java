package i52;

import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApmFooterContent.TextOnly f158545b;

    public /* synthetic */ a0(ApmFooterContent.TextOnly textOnly, int i) {
        this.f158544a = i;
        this.f158545b = textOnly;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158544a) {
            case 0:
                b update = (b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b.a(update, null, this.f158545b.f62233a, 255);
            default:
                t42.b update2 = (t42.b) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return t42.b.a(update2, null, null, 0, this.f158545b.f62233a, CertificateBody.profileType);
        }
    }
}
