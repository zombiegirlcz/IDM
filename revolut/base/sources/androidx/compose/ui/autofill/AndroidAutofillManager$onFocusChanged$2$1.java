package androidx.compose.ui.autofill;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.u;
import oim.n;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "l", "", "t", "r", "b", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidAutofillManager$onFocusChanged$2$1 extends u implements n {
    final /* synthetic */ int $semanticsId;
    final /* synthetic */ AndroidAutofillManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAutofillManager$onFocusChanged$2$1(AndroidAutofillManager androidAutofillManager, int i) {
        super(4);
        this.this$0 = androidAutofillManager;
        this.$semanticsId = i;
    }

    @Override // oim.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
        return Unit.f186387a;
    }

    public final void invoke(int i, int i2, int i3, int i5) {
        this.this$0.getPlatformAutofillManager().notifyViewEntered(this.this$0.view, this.$semanticsId, new Rect(i, i2, i3, i5));
    }
}
