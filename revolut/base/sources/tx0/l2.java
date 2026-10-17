package tx0;

import android.view.View;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarWithAvatar f275187b;

    public /* synthetic */ l2(NavBarWithAvatar navBarWithAvatar, int i) {
        this.f275186a = i;
        this.f275187b = navBarWithAvatar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f275186a) {
            case 0:
                Intrinsics.h(view);
                NavBarWithAvatar navBarWithAvatar = this.f275187b;
                py0.f fVarN0 = or0.u.k(navBarWithAvatar).n0();
                Clause clauseO = ((bp0.y) or0.u.k(navBarWithAvatar).b0()).o(navBarWithAvatar.getToolbarDescription());
                fVarN0.a(navBarWithAvatar, navBarWithAvatar, clauseO != null ? new py0.c(clauseO) : null);
                navBarWithAvatar.f59343j.onNext(Unit.f186387a);
                break;
            default:
                Intrinsics.h(view);
                this.f275187b.f59338a.onNext(Unit.f186387a);
                break;
        }
    }
}
