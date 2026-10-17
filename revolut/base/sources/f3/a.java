package f3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt;
import kem.y;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131854a;

    public /* synthetic */ a(int i) {
        this.f131854a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f131854a) {
            case 0:
                return ComposableSingletons$PreviewActivity_androidKt.lambda__426398407$lambda$0((Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                CharSequence s2 = (CharSequence) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(s2, "s");
                return Character.valueOf(s2.charAt(iIntValue));
            default:
                y m3 = (y) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(m3, "m");
                return Character.valueOf(m3.f183243a.charAt(iIntValue2));
        }
    }
}
