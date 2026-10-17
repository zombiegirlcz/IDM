package lz3;

import com.revolut.feature.credit.models.CreditAccountType;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wie.a f200924a;

    public h(wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f200924a = creditAccountDestinationResolver;
    }

    @Override // lz3.a
    public final Object a(it3.d dVar, Continuation continuation) {
        String str = dVar.f168330m;
        if (str != null) {
            return rie.b.a(this.f200924a, new CreditAccountType.Loan(str), (gim.c) continuation);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "FixedTermCreditExitDelegate", "facilityId is null after finishing the application", null, null, 16);
        return null;
    }
}
