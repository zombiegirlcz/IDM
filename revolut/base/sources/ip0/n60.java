package ip0;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PromptContentDelegate.Model f165459b;

    public /* synthetic */ n60(PromptContentDelegate.Model model, int i) {
        this.f165458a = i;
        this.f165459b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f165458a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f165459b;
    }
}
