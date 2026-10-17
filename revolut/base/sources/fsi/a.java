package fsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    default void E(Bundle bundle) {
    }

    default void I() {
    }

    default boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    default void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
    }

    default void onActivityResult(int i, int i2, Intent intent) {
    }

    default void onCreate(Bundle bundle) {
    }

    void onDestroy();

    default boolean onFinish() {
        return false;
    }

    void onPause();

    default void onResume() {
    }

    default void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    default void onStart() {
    }

    void onStop();

    default void u() {
    }

    default void x() {
    }
}
