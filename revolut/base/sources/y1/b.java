package y1;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f310241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextStyle f310242c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ b(long j2, TextStyle textStyle, Function2 function2, int i, int i2) {
        this.f310240a = i2;
        this.f310241b = j2;
        this.f310242c = textStyle;
        this.d = function2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f310240a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ProvideContentColorTextStyleKt.ProvideContentColorTextStyle_3J_VO9M$lambda$0(this.f310241b, this.f310242c, this.d, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return TextFieldImplKt.Decoration_3J_VO9M$lambda$20(this.f310241b, this.f310242c, this.d, this.e, (Composer) obj2, iIntValue2);
        }
    }
}
