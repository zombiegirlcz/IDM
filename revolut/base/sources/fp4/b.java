package fp4;

import ang.f;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import et6.u1;
import fk4.r;
import go.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import w4l.j;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements am4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f137047a;

    public b(f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f137047a = userInteractor;
    }

    @Override // pfe.i
    public final Flow t(ProductAccountDescriptor$Value descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return !(descriptor.getF89728b().f89730b instanceof CreditAccountType.CreditCard) ? new g(f0.f322471a, 2) : new u1(mo3.a.g(this.f137047a.j(j.f294644c), null, new r(29), 1), this, 10);
    }
}
