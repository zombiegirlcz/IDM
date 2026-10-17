package v1;

import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import knd.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f285035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f285036c;
    public final /* synthetic */ long d;

    public /* synthetic */ l0(long j2, Float f, Function2 function2) {
        this.f285034a = 0;
        this.d = j2;
        this.f285035b = f;
        this.f285036c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f285034a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return TextFieldImplKt.Decoration_euL9pac$lambda$0(this.d, (Float) this.f285035b, (Function2) this.f285036c, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return TextFieldImplKt.Decoration_euL9pac$lambda$0$0((Float) this.f285035b, (Function2) this.f285036c, this.d, (Composer) obj2, iIntValue2);
            default:
                m1 m1Var = (m1) this.f285035b;
                lzi.i iVar = (lzi.i) this.f285036c;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new ind.d(m1Var.f186113a, iVar, this.d);
        }
    }

    public /* synthetic */ l0(Object obj2, Object obj3, long j2, int i) {
        this.f285034a = i;
        this.f285035b = obj2;
        this.f285036c = obj3;
        this.d = j2;
    }
}
