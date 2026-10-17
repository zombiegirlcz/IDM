package k1;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CacheWindowLogic f180071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CacheWindowScope f180072c;

    public /* synthetic */ b(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i) {
        this.f180070a = i;
        this.f180071b = cacheWindowLogic;
        this.f180072c = cacheWindowScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f180070a;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return CacheWindowLogic.getItemSizeOrPrefetch$lambda$4(this.f180071b, this.f180072c, iIntValue, iIntValue2);
            default:
                return CacheWindowLogic.scheduleNextItemIfNeeded$lambda$1(this.f180071b, this.f180072c, iIntValue, iIntValue2);
        }
    }
}
