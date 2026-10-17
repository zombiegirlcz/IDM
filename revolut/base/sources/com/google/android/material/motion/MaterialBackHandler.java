package com.google.android.material.motion;

import androidx.annotation.NonNull;
import androidx.view.BackEventCompat;

/* JADX INFO: loaded from: classes16.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(@NonNull BackEventCompat backEventCompat);

    void updateBackProgress(@NonNull BackEventCompat backEventCompat);
}
