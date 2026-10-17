package d4;

import android.os.Bundle;
import androidx.content.NavHostController;
import androidx.content.fragment.NavHostFragment;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.os.SavedStateRegistry;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f111222b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f111221a = i;
        this.f111222b = obj2;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        switch (this.f111221a) {
            case 0:
                return SavedStateHandleImpl.savedStateProvider$lambda$0((SavedStateHandleImpl) this.f111222b);
            case 1:
                return NavHostFragment.navHostController_delegate$lambda$6$lambda$5$lambda$2((NavHostController) this.f111222b);
            default:
                return NavHostFragment.navHostController_delegate$lambda$6$lambda$5$lambda$4((NavHostFragment) this.f111222b);
        }
    }
}
