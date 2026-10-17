package tb;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class t extends kotlin.jvm.internal.u implements Function1 {
    public final /* synthetic */ Function1 f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f269412h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f269413j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Function1 function1, u uVar, int i, int i2, int i3) {
        super(1);
        this.f = function1;
        this.f269412h = uVar;
        this.i = i;
        this.f269413j = i2;
        this.k = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Density offset = (Density) obj2;
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        u uVar = this.f269412h;
        Integer numValueOf = Integer.valueOf(uVar.f269414a.b());
        float fIntValue = ((((Number) r1.invoke(Integer.valueOf(r5.b() + ((int) Math.signum(r2))))).intValue() - r0) * Math.abs(((Number) uVar.f269414a.e.getValue()).floatValue())) + ((Number) this.f.invoke(numValueOf)).intValue();
        int i = this.i - 1;
        if (i < 0) {
            i = 0;
        }
        return IntOffset.m3328boximpl(IntOffsetKt.IntOffset(0, (int) ((this.f269413j + this.k) * kotlin.ranges.f.f(fIntValue, BitmapDescriptorFactory.HUE_RED, i))));
    }
}
