package fbm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import uam.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends u implements Function1 {
    public final /* synthetic */ float f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f133560h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(double d, float f) {
        super(1);
        this.f = f;
        this.f133560h = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        i it8 = (i) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        int i2 = it8.f278698a;
        float f = Float.NaN;
        if (i2 != 0 && (i = it8.f278699b) != 0) {
            f = i2 / i;
        }
        return Boolean.valueOf(((double) Math.abs(this.f - f)) <= this.f133560h);
    }
}
