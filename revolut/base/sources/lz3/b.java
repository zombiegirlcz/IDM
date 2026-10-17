package lz3;

import com.revolut.feature.credit.models.CreditAccountType;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mri.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f200911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wie.a f200912b;

    public b(w revolutJobInteractor, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f200911a = revolutJobInteractor;
        this.f200912b = creditAccountDestinationResolver;
    }

    @Override // lz3.a
    public final Object a(it3.d dVar, Continuation continuation) {
        String str = dVar.f168330m;
        if (str == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "CreditCardExitDelegate", "facilityId is null after finishing the application", null, null, 16);
            return null;
        }
        ((nzl.a) this.f200911a).d(5L, str);
        return rie.b.a(this.f200912b, new CreditAccountType.CreditCard(str), (gim.c) continuation);
    }
}
