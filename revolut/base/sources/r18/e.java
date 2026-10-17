package r18;

import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f250917a;

    public e(Set set) {
        this.f250917a = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        x08.i feedState = (x08.i) obj2;
        Intrinsics.checkNotNullParameter(feedState, "feedState");
        return new a18.a(feedState, new FeedFilter.ByAssetFilter(this.f250917a));
    }
}
