package com.hcaptcha.sdk;

import a41.h0;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaDialogFragment;
import com.hcaptcha.sdk.HCaptchaError;
import com.hcaptcha.sdk.HCaptchaException;
import com.revolut.revolut.feature_fourthline_impl.R;
import ii.e;
import ii.k;
import r10.q;

/* JADX INFO: loaded from: classes17.dex */
public final class HCaptchaDialogFragment extends DialogFragment implements k {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public q f49845a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public HCaptchaStateListener f49846b0;
    public LinearLayout c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f49847d0 = 0.6f;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f49848e0 = false;

    public static HCaptchaDialogFragment A(HCaptchaConfig hCaptchaConfig, e eVar, HCaptcha$1 hCaptcha$1) {
        if (eVar == null) {
            throw new NullPointerException("internalConfig is marked non-null but is null");
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("hCaptchaConfig", hCaptchaConfig);
        bundle.putSerializable("hCaptchaInternalConfig", eVar);
        bundle.putParcelable("hCaptchaDialogListener", hCaptcha$1);
        HCaptchaDialogFragment hCaptchaDialogFragment = new HCaptchaDialogFragment();
        hCaptchaDialogFragment.setArguments(bundle);
        return hCaptchaDialogFragment;
    }

    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, final HCaptchaConfig hCaptchaConfig) {
        View viewInflate = layoutInflater.inflate(R.layout.hcaptcha_fragment, viewGroup, false);
        viewInflate.setFocusableInTouchMode(true);
        viewInflate.requestFocus();
        viewInflate.setOnKeyListener(new View.OnKeyListener() { // from class: ii.d
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                HCaptchaDialogFragment hCaptchaDialogFragment = this.f161492a;
                if (!hCaptchaDialogFragment.f49848e0 && Boolean.FALSE.equals(hCaptchaConfig.getLoading())) {
                    return true;
                }
                q qVar = hCaptchaDialogFragment.f49845a0;
                if (qVar == null) {
                    return false;
                }
                HCaptchaException hCaptchaException = new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED, null);
                HCaptchaConfig hCaptchaConfig2 = (HCaptchaConfig) qVar.f250849b;
                ((a) hCaptchaConfig2.getRetryPredicate()).getClass();
                return HCaptchaConfig.lambda$$default$retryPredicate$41a513e9$1(hCaptchaConfig2, hCaptchaException);
            }
        });
        return viewInflate;
    }

    public final HCaptchaWebView C(View view, HCaptchaConfig hCaptchaConfig) {
        HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) view.findViewById(R.id.webView);
        if (Boolean.FALSE.equals(hCaptchaConfig.getLoading())) {
            hCaptchaWebView.setOnTouchListener(new gzl.b(this, 1));
        }
        return hCaptchaWebView;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // ji.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.hcaptcha.sdk.HCaptchaException r3) {
        /*
            r2 = this;
            r10.q r0 = r2.f49845a0
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.f250849b
            com.hcaptcha.sdk.HCaptchaConfig r0 = (com.hcaptcha.sdk.HCaptchaConfig) r0
            ii.j r1 = r0.getRetryPredicate()
            ii.a r1 = (ii.a) r1
            r1.getClass()
            boolean r0 = com.hcaptcha.sdk.HCaptchaConfig.a(r0, r3)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            boolean r1 = r2.isAdded()
            if (r1 == 0) goto L25
            if (r0 != 0) goto L25
            r2.dismissAllowingStateLoss()
        L25:
            r10.q r1 = r2.f49845a0
            if (r1 == 0) goto L3a
            if (r0 == 0) goto L35
            java.lang.Object r3 = r1.d
            com.hcaptcha.sdk.HCaptchaWebView r3 = (com.hcaptcha.sdk.HCaptchaWebView) r3
            java.lang.String r0 = "javascript:resetAndExecute();"
            r3.loadUrl(r0)
            return
        L35:
            com.hcaptcha.sdk.HCaptchaStateListener r0 = r2.f49846b0
            r0.a(r3)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hcaptcha.sdk.HCaptchaDialogFragment.a(com.hcaptcha.sdk.HCaptchaException):void");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        a(new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED, null));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.HCaptchaDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle arguments = getArguments();
            this.f49846b0 = (HCaptchaStateListener) pyd.c.y(arguments);
            int i = Build.VERSION.SDK_INT;
            HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) (i >= 33 ? h0.l(arguments, "hCaptchaConfig", HCaptchaConfig.class) : arguments.getSerializable("hCaptchaConfig"));
            e eVar = (e) (i >= 33 ? h0.l(arguments, "hCaptchaInternalConfig", e.class) : arguments.getSerializable("hCaptchaInternalConfig"));
            try {
                if (this.f49846b0 == null || hCaptchaConfig == null || eVar == null) {
                    throw new AssertionError();
                }
                if (layoutInflater == null) {
                    throw new InflateException("inflater is null");
                }
                View viewB = B(layoutInflater, viewGroup, hCaptchaConfig);
                HCaptchaWebView hCaptchaWebViewC = C(viewB, hCaptchaConfig);
                LinearLayout linearLayout = (LinearLayout) viewB.findViewById(R.id.loadingContainer);
                this.c0 = linearLayout;
                linearLayout.setVisibility(Boolean.TRUE.equals(hCaptchaConfig.getLoading()) ? 0 : 8);
                this.f49845a0 = new q(new Handler(Looper.getMainLooper()), requireContext(), hCaptchaConfig, eVar, this, hCaptchaWebViewC);
                this.f49848e0 = false;
                return viewB;
            } catch (BadParcelableException | InflateException | AssertionError | ClassCastException unused) {
            }
        } catch (BadParcelableException | InflateException | AssertionError | ClassCastException unused2) {
        }
        dismiss();
        HCaptchaStateListener hCaptchaStateListener = this.f49846b0;
        if (hCaptchaStateListener != null) {
            hCaptchaStateListener.a(new HCaptchaException(HCaptchaError.ERROR, null));
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        q qVar = this.f49845a0;
        if (qVar != null) {
            HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) qVar.d;
            hCaptchaWebView.removeJavascriptInterface("JSInterface");
            hCaptchaWebView.removeJavascriptInterface("JSDI");
            ViewParent parent = hCaptchaWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(hCaptchaWebView);
            }
            hCaptchaWebView.destroy();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || this.f49845a0 == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.f49847d0 = window.getAttributes().dimAmount;
        if (Boolean.FALSE.equals(((HCaptchaConfig) this.f49845a0.f250849b).getLoading())) {
            window.clearFlags(2);
            window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // ji.c
    public final void onSuccess(Object obj2) {
        String str = (String) obj2;
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
        this.f49846b0.c(str);
    }

    @Override // ii.k
    public final void w() {
        if (((HCaptchaConfig) this.f49845a0.f250849b).getSize() != HCaptchaSize.INVISIBLE) {
            this.f49848e0 = true;
            z();
        }
    }

    @Override // ii.k
    public final void x(Activity activity) {
        FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("HCaptchaDialogFragment");
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
            try {
                show(supportFragmentManager, "HCaptchaDialogFragment");
            } catch (IllegalStateException e) {
                e.getMessage();
                if (this.f49845a0 != null) {
                    this.f49846b0.a(new HCaptchaException(HCaptchaError.ERROR, null));
                }
            }
        }
    }

    @Override // ji.b
    public final void y() {
        if (((HCaptchaConfig) this.f49845a0.f250849b).getSize() == HCaptchaSize.INVISIBLE) {
            z();
        }
        this.f49848e0 = true;
        this.f49846b0.b();
    }

    public final void z() {
        q qVar = this.f49845a0;
        if (qVar != null && Boolean.TRUE.equals(((HCaptchaConfig) qVar.f250849b).getLoading())) {
            this.c0.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(200L).setListener(new aq0.k(this, 4));
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().addFlags(2);
            dialog.getWindow().setDimAmount(this.f49847d0);
        }
    }
}
