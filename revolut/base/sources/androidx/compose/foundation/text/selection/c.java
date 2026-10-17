package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7136b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f7135a = i;
        this.f7136b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7135a) {
            case 0:
                return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$0((TextFieldSelectionManager) this.f7136b);
            case 1:
                return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$1((TextFieldSelectionManager) this.f7136b);
            case 2:
                return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$2((TextFieldSelectionManager) this.f7136b);
            case 3:
                return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$3((TextFieldSelectionManager) this.f7136b);
            case 4:
                return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$4((TextFieldSelectionManager) this.f7136b);
            default:
                return SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.invokeSuspend$lambda$0((State) this.f7136b);
        }
    }
}
