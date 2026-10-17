package n1;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f211066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f211067c;

    public /* synthetic */ a(long j2, Object obj2, int i) {
        this.f211065a = i;
        this.f211066b = j2;
        this.f211067c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f211065a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AndroidCursorHandle_androidKt.CursorHandle_USBMPiE$lambda$1(this.f211066b, (Modifier) this.f211067c, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return FloatingActionButtonKt.FloatingActionButton_bogVsAg$lambda$2(this.f211066b, (Function2) this.f211067c, (Composer) obj2, iIntValue2);
        }
    }
}
