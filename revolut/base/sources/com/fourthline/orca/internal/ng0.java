package com.fourthline.orca.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ng0 {
    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.governikus.ausweisapp2");
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268435456);
            context.startActivity(launchIntentForPackage);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.governikus.ausweisapp2"));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.governikus.ausweisapp2"));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        }
    }
}
