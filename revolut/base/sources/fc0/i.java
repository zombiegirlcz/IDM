package fc0;

import f23.y;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oc0.n;
import vkm.v1;
import w4l.k;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f133606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9l.g f133607b;

    public i(n repository, t9l.g sharedTransactionInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(sharedTransactionInteractor, "sharedTransactionInteractor");
        this.f133606a = repository;
        this.f133607b = sharedTransactionInteractor;
    }

    public final Flow a(String formId, String itemId, String str, long j2, String str2, Set excludeTransactionIds, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(excludeTransactionIds, "excludeTransactionIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new y(this, loadingStrategy, (Continuation) null, 2), new v1(new h(j2, this, formId, itemId, str, str2, excludeTransactionIds, null)));
    }
}
