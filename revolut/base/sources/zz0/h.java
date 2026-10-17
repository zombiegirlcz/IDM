package zz0;

import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends View.AccessibilityDelegate implements View.OnTouchListener {

    @NotNull
    public static final g Companion = new g();
    public static final a f = new a("Accessibility", true, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnTouchListener f326478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.AccessibilityDelegate f326479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f326480c;
    public long d;
    public c e;

    public h() {
        int i = Build.VERSION.SDK_INT;
        this.f326478a = null;
        this.f326479b = null;
        this.f326480c = i;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void addExtraDataToAccessibilityNodeInfo(View host, AccessibilityNodeInfo info, String extraDataKey, Bundle bundle) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
        View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
        if (accessibilityDelegate == null) {
            super.addExtraDataToAccessibilityNodeInfo(host, info, extraDataKey, bundle);
        } else if (this.f326480c >= 26) {
            accessibilityDelegate.addExtraDataToAccessibilityNodeInfo(host, info, extraDataKey, bundle);
        } else {
            super.addExtraDataToAccessibilityNodeInfo(host, info, extraDataKey, bundle);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        long j2 = this.d;
        if ((j2 & 8) == 8) {
            return false;
        }
        try {
            this.d = j2 | 8;
            View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
            boolean zDispatchPopulateAccessibilityEvent = accessibilityDelegate != null ? accessibilityDelegate.dispatchPopulateAccessibilityEvent(host, event) : super.dispatchPopulateAccessibilityEvent(host, event);
            this.d &= -9;
            return zDispatchPopulateAccessibilityEvent;
        } catch (Throwable th10) {
            this.d &= -9;
            throw th10;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View host) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        Intrinsics.checkNotNullParameter(host, "host");
        long j2 = this.d;
        if ((j2 & 256) == 256) {
            return null;
        }
        try {
            this.d = j2 | 256;
            View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
            if (accessibilityDelegate == null || (accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(host)) == null) {
                accessibilityNodeProvider = super.getAccessibilityNodeProvider(host);
            }
            this.d &= -257;
            return accessibilityNodeProvider;
        } catch (Throwable th10) {
            this.d &= -257;
            throw th10;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        long j2 = this.d;
        if ((j2 & 32) == 0) {
            try {
                this.d = j2 | 32;
                View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
                if (accessibilityDelegate != null) {
                    accessibilityDelegate.onInitializeAccessibilityEvent(host, event);
                } else {
                    super.onInitializeAccessibilityEvent(host, event);
                }
                this.d &= -33;
            } catch (Throwable th10) {
                this.d &= -33;
                throw th10;
            }
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        long j2 = this.d;
        if ((j2 & 64) == 0) {
            try {
                this.d = j2 | 64;
                View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
                if (accessibilityDelegate != null) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, info);
                } else {
                    super.onInitializeAccessibilityNodeInfo(host, info);
                }
                this.d &= -65;
            } catch (Throwable th10) {
                this.d &= -65;
                throw th10;
            }
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        long j2 = this.d;
        if ((j2 & 16) == 0) {
            try {
                this.d = j2 | 16;
                View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
                if (accessibilityDelegate != null) {
                    accessibilityDelegate.onPopulateAccessibilityEvent(host, event);
                } else {
                    super.onPopulateAccessibilityEvent(host, event);
                }
                this.d &= -17;
            } catch (Throwable th10) {
                this.d &= -17;
                throw th10;
            }
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        long j2 = this.d;
        if ((j2 & 128) == 128) {
            return false;
        }
        try {
            this.d = j2 | 128;
            View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
            boolean zOnRequestSendAccessibilityEvent = accessibilityDelegate != null ? accessibilityDelegate.onRequestSendAccessibilityEvent(host, child, event) : super.onRequestSendAccessibilityEvent(host, child, event);
            this.d &= -129;
            return zOnRequestSendAccessibilityEvent;
        } catch (Throwable th10) {
            this.d &= -129;
            throw th10;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.e = b.a(c.Companion, event);
        }
        View.OnTouchListener onTouchListener = this.f326478a;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(v, event);
        }
        return false;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View host, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(host, "host");
        long j2 = this.d;
        if ((j2 & 2) == 2) {
            return false;
        }
        try {
            this.d = j2 | 2;
            this.e = new c(f.ACCESSIBILITY_NODE, f, 0, 0, 0, 0, 0);
            View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
            boolean zPerformAccessibilityAction = accessibilityDelegate != null ? accessibilityDelegate.performAccessibilityAction(host, i, bundle) : super.performAccessibilityAction(host, i, bundle);
            this.d &= -3;
            return zPerformAccessibilityAction;
        } catch (Throwable th10) {
            this.d &= -3;
            throw th10;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View host, int i) {
        Intrinsics.checkNotNullParameter(host, "host");
        long j2 = this.d;
        if ((j2 & 1) == 0) {
            try {
                this.d = j2 | 1;
                this.e = new c(f.ACCESSIBILITY_NODE, f, 0, 0, 0, 0, 0);
                View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
                if (accessibilityDelegate != null) {
                    accessibilityDelegate.sendAccessibilityEvent(host, i);
                } else {
                    super.sendAccessibilityEvent(host, i);
                }
                this.d &= -2;
            } catch (Throwable th10) {
                this.d &= -2;
                throw th10;
            }
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        long j2 = this.d;
        if ((j2 & 4) == 0) {
            try {
                this.d = j2 | 4;
                View.AccessibilityDelegate accessibilityDelegate = this.f326479b;
                if (accessibilityDelegate != null) {
                    accessibilityDelegate.sendAccessibilityEventUnchecked(host, event);
                } else {
                    super.sendAccessibilityEventUnchecked(host, event);
                }
                this.d &= -5;
            } catch (Throwable th10) {
                this.d &= -5;
                throw th10;
            }
        }
    }
}
