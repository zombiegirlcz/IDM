package a26;

import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroupsResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplitAccountsItemGroupsResult f674b;

    public /* synthetic */ f(SplitAccountsItemGroupsResult splitAccountsItemGroupsResult, int i) {
        this.f673a = i;
        this.f674b = splitAccountsItemGroupsResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f673a) {
            case 0:
                return c.a((c) obj2, this.f674b.getItems(), null, 2);
            default:
                return nje.f.a((nje.f) obj2, null, null, this.f674b.getItems(), null, null, null, null, 123);
        }
    }
}
