package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7066c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f7064a = i;
        this.f7065b = obj2;
        this.f7066c = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f7064a) {
            case 0:
                return LazyLayoutItemContentFactory.CachedItemContent.createContentLambda$lambda$0((LazyLayoutItemContentFactory) this.f7065b, (LazyLayoutItemContentFactory.CachedItemContent) this.f7066c, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$1((Function3) this.f7065b, (LazySaveableStateHolder) this.f7066c, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
