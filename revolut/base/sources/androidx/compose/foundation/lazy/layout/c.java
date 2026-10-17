package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f7070b;

    public /* synthetic */ c(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i) {
        this.f7069a = i;
        this.f7070b = lazyLayoutSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7069a) {
            case 0:
                return Integer.valueOf(LazyLayoutSemanticsModifierNode.indexForKeyMapping$lambda$0(this.f7070b, obj2));
            default:
                return Boolean.valueOf(LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues$lambda$2(this.f7070b, ((Integer) obj2).intValue()));
        }
    }
}
