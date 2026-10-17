package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class nj0 implements lx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31429a;

    public nj0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31429a = context;
    }

    @Override // com.fourthline.orca.internal.lx
    public void a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Context context = this.f31429a;
        Uri uriForFile = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".fourthline.provider", new File(path));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.setType("application/pdf");
        this.f31429a.startActivity(Intent.createChooser(intent, null));
    }
}
