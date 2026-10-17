package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarContentCenterView f9273b;

    public m2(boolean z, NavBarContentCenterView navBarContentCenterView) {
        this.f9272a = z;
        this.f9273b = navBarContentCenterView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intrinsics.h(view);
        if (this.f9272a) {
            NavBarContentCenterView.a(this.f9273b, view);
        }
    }
}
