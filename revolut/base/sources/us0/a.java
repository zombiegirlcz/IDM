package us0;

import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f282375b;

    public /* synthetic */ a(f fVar, int i) {
        this.f282374a = i;
        this.f282375b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f282374a) {
            case 0:
                c cVar = c.OVERVIEW;
                f fVar = this.f282375b;
                fVar.f282379c = cVar;
                fVar.invalidateRoot();
                break;
            default:
                f fVar2 = this.f282375b;
                AccessibilityNodeProviderCompat accessibilityNodeProvider = fVar2.getAccessibilityNodeProvider(fVar2.f282377a);
                if (accessibilityNodeProvider != null) {
                    accessibilityNodeProvider.performAction(0, 64, null);
                }
                break;
        }
    }
}
