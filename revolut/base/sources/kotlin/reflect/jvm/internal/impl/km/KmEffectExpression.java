package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmEffectExpression {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186779b = new ArrayList(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f186780c = new ArrayList(0);

    @NotNull
    public final List<KmEffectExpression> getAndArguments() {
        return this.f186779b;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186778a;
    }

    @NotNull
    public final List<KmEffectExpression> getOrArguments() {
        return this.f186780c;
    }

    public final void setConstantValue(KmConstantValue kmConstantValue) {
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186778a = i;
    }

    public final void setInstanceType(KmType kmType) {
    }

    public final void setParameterIndex(Integer num) {
    }
}
