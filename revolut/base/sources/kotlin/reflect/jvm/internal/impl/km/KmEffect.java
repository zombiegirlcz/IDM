package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f186777a;

    public KmEffect(@NotNull KmEffectType type, KmEffectInvocationKind kmEffectInvocationKind) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f186777a = new ArrayList(1);
    }

    @NotNull
    public final List<KmEffectExpression> getConstructorArguments() {
        return this.f186777a;
    }

    public final void setConclusion(KmEffectExpression kmEffectExpression) {
    }
}
