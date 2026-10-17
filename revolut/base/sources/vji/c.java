package vji;

import androidx.view.OnBackPressedCallback;
import com.revolut.kompot.entry_point.fragment.KompotFragment;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KompotFragment f289753a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(KompotFragment kompotFragment) {
        super(true);
        this.f289753a = kompotFragment;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.view.OnBackPressedCallback
    public final void handleOnBackPressed() {
        setEnabled(false);
        ((uji.b) this.f289753a.f98377b0.getValue()).b().b();
        setEnabled(true);
    }
}
