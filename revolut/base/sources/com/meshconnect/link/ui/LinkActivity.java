package com.meshconnect.link.ui;

import ajm.d;
import ajm.e;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mk.a;
import nk.c;
import nk.f;
import yhm.j;
import yhm.k;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/meshconnect/link/ui/LinkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "com/meshconnect/link/d/d", "com/meshconnect/link/d/e", "com/meshconnect/link/d/c", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LinkActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f49860d0 = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f49861a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f49862b0;
    public final ActivityResultLauncher c0;

    public LinkActivity() {
        k kVar = k.NONE;
        this.f49861a0 = j.c(kVar, new d(this, 26));
        this.f49862b0 = j.c(kVar, new e(this, new c(), 13));
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new rea.j(this, 22));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.c0 = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        ?? r06 = this.f49861a0;
        FrameLayout webViewContainer = ((a) r06.getValue()).f206138h;
        Intrinsics.checkNotNullExpressionValue(webViewContainer, "webViewContainer");
        if (webViewContainer.getVisibility() == 0) {
            ((a) r06.getValue()).f206138h.removeAllViews();
            ((a) r06.getValue()).f206138h.setVisibility(8);
            return;
        }
        WebView webView = ((a) r06.getValue()).f;
        if (webView.canGoBack()) {
            webView.evaluateJavascript("window.history.go(-1)", null);
        } else {
            finish();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.app.Activity
    public final void finish() {
        ?? r06 = this.f49862b0;
        List listD1 = d0.d1(((f) r06.getValue()).f216617r);
        if (listD1.isEmpty()) {
            Throwable th10 = ((f) r06.getValue()).f216618s;
            LinkExit linkExit = new LinkExit(th10 != null ? th10.getMessage() : null);
            Intent intent = new Intent();
            intent.putExtra("data", linkExit);
            Unit unit = Unit.f186387a;
            setResult(0, intent);
        } else {
            LinkSuccess linkSuccess = new LinkSuccess(listD1);
            Intent intent2 = new Intent();
            intent2.putExtra("data", linkSuccess);
            Unit unit2 = Unit.f186387a;
            setResult(-1, intent2);
        }
        super.finish();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meshconnect.link.ui.LinkActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((a) this.f49861a0.getValue()).f.onPause();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ?? r06 = this.f49861a0;
        ((a) r06.getValue()).f.onResume();
        ((a) r06.getValue()).f.resumeTimers();
    }
}
