package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class IgnoreResultKt$IgnoreResult$$inlined$GlanceNode$1 extends u implements Function0<EmittableIgnoreResult> {
    final /* synthetic */ Function0 $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgnoreResultKt$IgnoreResult$$inlined$GlanceNode$1(Function0 function0) {
        super(0);
        this.$factory = function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.glance.appwidget.EmittableIgnoreResult, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final EmittableIgnoreResult invoke() {
        return this.$factory.invoke();
    }
}
