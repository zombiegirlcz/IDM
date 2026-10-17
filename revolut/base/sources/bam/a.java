package bam;

import android.view.KeyEvent;
import android.webkit.WebView;
import aza.g;
import dam.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f14116a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s transact) {
        super(transact.f112589b);
        Intrinsics.checkNotNullParameter(transact, "transact");
        this.f14116a = transact;
    }

    @NotNull
    public final s getTransact() {
        return this.f14116a;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i != 125 || !canGoForward()) {
                return super.onKeyDown(i, keyEvent);
            }
            goForward();
            return true;
        }
        if (canGoBack()) {
            goBack();
            return true;
        }
        e0.C(this.f14116a.f112593j, null, null, new g(this, null, 8), 3);
        return true;
    }
}
