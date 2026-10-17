package com.onfido.android.sdk.capture.utils;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import egm.b;
import igm.g;
import igm.p;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"FOCUS_ATTEMPT_INTERVAL_IN_MILLIS", "", "MAX_FOCUS_ATTEMPT", "sendAccessibilityFocusEvent", "", "Landroid/view/View;", "setDefaultAccessibilityFocus", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AccessibilityExtensionsKt {
    private static final long FOCUS_ATTEMPT_INTERVAL_IN_MILLIS = 100;
    private static final long MAX_FOCUS_ATTEMPT = 20;

    public static final void sendAccessibilityFocusEvent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(8);
    }

    public static final void setDefaultAccessibilityFocus(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.onfido.android.sdk.capture.utils.AccessibilityExtensionsKt.setDefaultAccessibilityFocus.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(@NotNull View host, int action, Bundle args) {
                Intrinsics.checkNotNullParameter(host, "host");
                ref$BooleanRef.f186407a = super.performAccessibilityAction(host, action, args);
                return ref$BooleanRef.f186407a;
            }
        });
        Observable.interval(0L, 100L, TimeUnit.MILLISECONDS).observeOn(b.a()).takeUntil(new p() { // from class: com.onfido.android.sdk.capture.utils.AccessibilityExtensionsKt.setDefaultAccessibilityFocus.2
            public final boolean test(long j2) {
                return ref$BooleanRef.f186407a;
            }

            @Override // igm.p
            public /* bridge */ /* synthetic */ boolean test(Object obj2) {
                return test(((Number) obj2).longValue());
            }
        }).take(20L).subscribe(new g() { // from class: com.onfido.android.sdk.capture.utils.AccessibilityExtensionsKt.setDefaultAccessibilityFocus.3
            public final void accept(long j2) {
                AccessibilityExtensionsKt.sendAccessibilityFocusEvent(view);
                view.requestFocus();
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.utils.AccessibilityExtensionsKt.setDefaultAccessibilityFocus.4
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
            }
        }, new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(view, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDefaultAccessibilityFocus$lambda$0(View this_setDefaultAccessibilityFocus) {
        Intrinsics.checkNotNullParameter(this_setDefaultAccessibilityFocus, "$this_setDefaultAccessibilityFocus");
        ViewCompat.setAccessibilityDelegate(this_setDefaultAccessibilityFocus, null);
    }
}
