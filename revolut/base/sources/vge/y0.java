package vge;

import com.revolut.feature.tab.accounts.api.model.AccountContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f289062a = new y0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        AccountContent accountContent = (AccountContent) obj2;
        Intrinsics.checkNotNullParameter(accountContent, "accountContent");
        return accountContent.f89475b.getF89505g();
    }
}
