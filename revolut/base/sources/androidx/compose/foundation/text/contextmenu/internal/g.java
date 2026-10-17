package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextContextMenuHelperApi28 f7114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7115c;
    public final /* synthetic */ int d;

    public /* synthetic */ g(TextContextMenuHelperApi28 textContextMenuHelperApi28, Object obj2, int i, int i2) {
        this.f7113a = i2;
        this.f7114b = textContextMenuHelperApi28;
        this.f7115c = obj2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f7113a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return TextContextMenuHelperApi28.IconBox$lambda$1(this.f7114b, (Icon) this.f7115c, this.d, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return TextContextMenuHelperApi28.IconBox$lambda$2(this.f7114b, (Icon) this.f7115c, this.d, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return TextContextMenuHelperApi28.IconBox$lambda$4(this.f7114b, (Drawable) this.f7115c, this.d, (Composer) obj2, iIntValue3);
        }
    }
}
