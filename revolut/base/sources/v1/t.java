package v1;

import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f285134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f285135c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f285136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f285137h;

    public /* synthetic */ t(Modifier modifier, long j2, float f, long j3, int i, int i2, int i3, int i5) {
        this.f285133a = i5;
        this.f285134b = modifier;
        this.f285135c = j2;
        this.d = f;
        this.e = j3;
        this.f = i;
        this.f285136g = i2;
        this.f285137h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f285133a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(this.f285134b, this.f285135c, this.d, this.e, this.f, this.f285136g, this.f285137h, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$30(this.f285134b, this.f285135c, this.d, this.e, this.f, this.f285136g, this.f285137h, (Composer) obj2, iIntValue2);
        }
    }
}
