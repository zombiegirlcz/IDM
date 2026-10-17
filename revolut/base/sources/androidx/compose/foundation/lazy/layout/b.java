package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7068b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f7067a = i;
        this.f7068b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7067a) {
            case 0:
                return LazyLayoutItemContentFactory.CachedItemContent.createContentLambda$lambda$0$0$0((LazyLayoutItemContentFactory.CachedItemContent) this.f7068b, (DisposableEffectScope) obj2);
            case 1:
                return LazyLayoutPinnableItemKt.LazyLayoutPinnableItem$lambda$1$0((LazyLayoutPinnableItem) this.f7068b, (DisposableEffectScope) obj2);
            case 2:
                return Boolean.valueOf(LazySaveableStateHolder._init_$lambda$0((SaveableStateRegistry) this.f7068b, obj2));
            default:
                return PrefetchHandleProvider.HandleAndRequestImpl.resolveNestedPrefetchStates$lambda$1((Ref$ObjectRef) this.f7068b, (TraversableNode) obj2);
        }
    }
}
