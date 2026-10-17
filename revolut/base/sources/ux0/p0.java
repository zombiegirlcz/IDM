package ux0;

import android.view.View;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;

/* JADX INFO: loaded from: classes20.dex */
public final class p0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountsNavBarContentView f283795b;

    public /* synthetic */ p0(AccountsNavBarContentView accountsNavBarContentView, int i) {
        this.f283794a = i;
        this.f283795b = accountsNavBarContentView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        switch (this.f283794a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                AccountsNavBarContentView accountsNavBarContentView = this.f283795b;
                accountsNavBarContentView.i(accountsNavBarContentView.i.h());
                accountsNavBarContentView.u.g();
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                AccountsNavBarContentView accountsNavBarContentView2 = this.f283795b;
                accountsNavBarContentView2.i(accountsNavBarContentView2.i.h());
                break;
        }
    }
}
