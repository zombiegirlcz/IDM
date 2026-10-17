package u1;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f276227b;

    public /* synthetic */ f(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.f276226a = i;
        this.f276227b = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f276226a) {
            case 0:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$0(this.f276227b);
            case 1:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$1(this.f276227b);
            case 2:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$2(this.f276227b);
            case 3:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$3(this.f276227b);
            case 4:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$4(this.f276227b);
            case 5:
                return Boolean.valueOf(TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$0(this.f276227b));
            case 6:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$1(this.f276227b);
            default:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$2(this.f276227b);
        }
    }
}
