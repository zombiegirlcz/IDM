package androidx.compose.foundation.text;

import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7095b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f7094a = i;
        this.f7095b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7094a) {
            case 0:
                return AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1.measure_3p2s80s$lambda$1((ArrayList) this.f7095b, (Placeable.PlacementScope) obj2);
            case 1:
                return CoreTextFieldKt$TextFieldCursorHandle$2$1.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0((TextFieldSelectionManager) this.f7095b, (Offset) obj2);
            default:
                return TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.invoke$lambda$0((State) this.f7095b, (Offset) obj2);
        }
    }
}
