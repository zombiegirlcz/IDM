package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7318b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f7317a = i;
        this.f7318b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7317a) {
            case 0:
                ((Function0) this.f7318b).invoke();
                break;
            default:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$0((AndroidComposeViewAccessibilityDelegateCompat) this.f7318b);
                break;
        }
    }
}
