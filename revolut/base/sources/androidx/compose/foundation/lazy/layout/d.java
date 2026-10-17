package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f7072b;

    public /* synthetic */ d(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i) {
        this.f7071a = i;
        this.f7072b = lazyLayoutSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7071a) {
            case 0:
                return Float.valueOf(LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues$lambda$0(this.f7072b));
            case 1:
                return Float.valueOf(LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues$lambda$1(this.f7072b));
            default:
                return LazyLayoutSemanticsModifierNode.applySemantics$lambda$1(this.f7072b);
        }
    }
}
