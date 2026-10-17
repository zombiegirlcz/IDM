package av5;

import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu5.a f9924a;

    public n(xu5.a cryptoTransactionFilterItemMapperDelegate) {
        Intrinsics.checkNotNullParameter(cryptoTransactionFilterItemMapperDelegate, "cryptoTransactionFilterItemMapperDelegate");
        this.f9924a = cryptoTransactionFilterItemMapperDelegate;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List filters = domainState.f9916b;
        List list = domainState.f9915a;
        if (filters == null) {
            filters = list;
        }
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new j(this.f9924a.a(filters), domainState.f9917c == i.CURRENCY && list.size() >= 10);
    }
}
