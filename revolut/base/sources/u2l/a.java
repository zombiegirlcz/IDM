package u2l;

import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import com.revolut.feature.deeplink.impl.ui.external.ExternalDeeplinkRoutingActivity;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.legacy_ui.fragment.BaseFragment;
import iri.m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends BaseDelegatesActivity implements dri.a {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BaseFragment f276709r0;

    public a() {
        new Handler();
    }

    public boolean D0() {
        return !(this instanceof ExternalDeeplinkRoutingActivity);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        return Z0();
    }

    public abstract w2l.a Z0();

    public int b1() {
        return -1;
    }

    public abstract int c1();

    public m d1() {
        return null;
    }

    public final BaseFragment f1() {
        BaseFragment baseFragment = this.f276709r0;
        if (baseFragment == null) {
            return null;
        }
        if (baseFragment.isVisible() && this.f276709r0.isAdded()) {
            return this.f276709r0;
        }
        int iB1 = b1();
        if (iB1 != -1) {
            this.f276709r0 = (BaseFragment) getSupportFragmentManager().findFragmentById(iB1);
        }
        BaseFragment baseFragment2 = this.f276709r0;
        if (baseFragment2 != null && baseFragment2.isVisible() && this.f276709r0.isAdded()) {
            return this.f276709r0;
        }
        return null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (f1() == null || !f1().onBackPressed()) {
            if (f1() != null) {
                FragmentManager childFragmentManager = f1().getChildFragmentManager();
                if (childFragmentManager.getBackStackEntryCount() > 0) {
                    childFragmentManager.popBackStack();
                    return;
                }
            }
            if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
                getSupportFragmentManager().popBackStack();
            } else {
                finishAfterTransition();
            }
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int iC1 = c1();
        if (iC1 != 0) {
            setContentView(iC1);
        }
        int iB1 = b1();
        if (iB1 != -1) {
            this.f276709r0 = (BaseFragment) getSupportFragmentManager().findFragmentById(iB1);
        }
    }
}
