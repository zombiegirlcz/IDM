package com.fourthline.orca.internal;

import android.content.Intent;
import android.net.Uri;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j8 implements qe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityResultRegistry f29823a;

    public j8(ActivityResultRegistry resultRegistry) {
        Intrinsics.checkNotNullParameter(resultRegistry, "resultRegistry");
        this.f29823a = resultRegistry;
    }

    @Override // com.fourthline.orca.internal.qe1
    public void a(Uri url2, Function0 onUserReturned) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(onUserReturned, "onUserReturned");
        Intent intent = new Intent("android.intent.action.VIEW", url2);
        ActivityResultLauncher activityResultLauncherRegister = this.f29823a.register("BrowserLauncherResult", new ActivityResultContracts$StartActivityForResult(), new bj1(onUserReturned, 1));
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
        activityResultLauncherRegister.launch(intentCreateChooser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 function0, ActivityResult it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function0.invoke();
    }
}
