package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7083c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f7081a = i;
        this.f7082b = obj2;
        this.f7083c = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7081a) {
            case 0:
                return PagerCacheWindowScope.schedulePrefetch$lambda$0((Function2) this.f7082b, (PagerCacheWindowScope) this.f7083c, (LazyLayoutPrefetchState.PrefetchResultScope) obj2);
            default:
                return PagerWrapperFlingBehavior.performFling$lambda$0$0((PagerWrapperFlingBehavior) this.f7082b, (ScrollScope) this.f7083c, ((Float) obj2).floatValue());
        }
    }
}
