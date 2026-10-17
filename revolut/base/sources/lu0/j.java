package lu0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardSearchView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199993a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f199993a) {
            case 0:
                ReactionsKeyboardSearchView.a aVar = ReactionsKeyboardSearchView.Companion;
                break;
            case 1:
                NavBarLargeCentred.a aVar2 = NavBarLargeCentred.Companion;
                break;
            default:
                NavBarWithToolbar.a aVar3 = NavBarWithToolbar.Companion;
                break;
        }
    }
}
