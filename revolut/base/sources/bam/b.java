package bam;

import android.view.KeyEvent;
import android.webkit.WebView;
import dam.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f14117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s transact) {
        super(transact.f112589b);
        Intrinsics.checkNotNullParameter(transact, "transact");
        this.f14117a = transact;
        this.f14118b = true;
    }

    public final boolean getNavigable() {
        return this.f14118b;
    }

    @NotNull
    public final s getTransact() {
        return this.f14117a;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && canGoBack()) {
            if (this.f14118b) {
                goBack();
            }
            return true;
        }
        if (i != 125 || !canGoForward()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f14118b) {
            goForward();
        }
        return true;
    }

    public final void setNavigable(boolean z) {
        this.f14118b = z;
    }
}
