package androidx.view;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6761b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f6760a = i;
        this.f6761b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6760a) {
            case 0:
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0$0((ComponentActivity) this.f6761b);
            default:
                return OnBackPressedDispatcher.eventInput_delegate$lambda$0((OnBackPressedDispatcher) this.f6761b);
        }
    }
}
