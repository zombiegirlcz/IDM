package fkl;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import bjl.u;
import bjl.v;
import bjl.w;
import bjl.x;
import bjl.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f135860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f135861c;

    public /* synthetic */ d(Function0 function0, Function0 function02, int i) {
        this.f135859a = i;
        this.f135860b = function0;
        this.f135861c = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f135859a) {
            case 0:
                y it8 = (y) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if ((it8 instanceof u) || (it8 instanceof v)) {
                    this.f135860b.invoke();
                } else {
                    if (!(it8 instanceof x) && !(it8 instanceof w)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f135861c.invoke();
                }
                return Unit.f186387a;
            default:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0(this.f135860b, this.f135861c, (TextContextMenuSession) obj2);
        }
    }
}
