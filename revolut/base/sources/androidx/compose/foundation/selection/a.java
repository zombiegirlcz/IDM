package androidx.compose.foundation.selection;

import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SemanticsPropertyReceiver f7090b;

    public /* synthetic */ a(int i, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.f7089a = i;
        this.f7090b = semanticsPropertyReceiver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean zApplyAdditionalSemantics$lambda$1;
        switch (this.f7089a) {
            case 0:
                zApplyAdditionalSemantics$lambda$1 = ToggleableNode.applyAdditionalSemantics$lambda$1(this.f7090b, (FillableData) obj2);
                break;
            default:
                zApplyAdditionalSemantics$lambda$1 = TriStateToggleableNode.applyAdditionalSemantics$lambda$1(this.f7090b, (FillableData) obj2);
                break;
        }
        return Boolean.valueOf(zApplyAdditionalSemantics$lambda$1);
    }
}
