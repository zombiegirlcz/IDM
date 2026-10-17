package r05;

import com.revolut.feature.credit.health.api.models.CreditScore;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f250700a = new c();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CreditScore creditScore = (CreditScore) obj2;
        Intrinsics.checkNotNullParameter(creditScore, "creditScore");
        return new g05.a(creditScore.f69952a);
    }
}
