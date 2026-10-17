package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContract;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class af implements kx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f26776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26778c;
    private File d;
    private final ActivityResultLauncher e;

    public af(ContentResolver contentResolver, ActivityResultRegistry registry) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f26776a = contentResolver;
        final String str = "application/pdf";
        this.f26777b = "application/pdf";
        this.f26778c = "kx";
        this.e = registry.register("downloadDocument", new ActivityResultContract<String, Uri>(str) { // from class: androidx.activity.result.contract.ActivityResultContracts$CreateDocument

            @NotNull
            private final String mimeType;

            {
                Intrinsics.checkNotNullParameter(str, "mimeType");
                this.mimeType = str;
            }

            @Override // androidx.view.result.contract.ActivityResultContract
            public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @NotNull String input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                return null;
            }

            @Override // androidx.view.result.contract.ActivityResultContract
            @NotNull
            public Intent createIntent(@NotNull Context context, @NotNull String input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", input);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.view.result.contract.ActivityResultContract
            public final Uri parseResult(int resultCode, Intent intent) {
                if (resultCode != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            }
        }, new bj1(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(af afVar, Uri uri2) {
        File file;
        if (uri2 == null || (file = afVar.d) == null) {
            return;
        }
        afVar.a(file, uri2);
    }

    @Override // com.fourthline.orca.internal.kx
    public void a(String suggestedFileName, String originFilePath) {
        Intrinsics.checkNotNullParameter(suggestedFileName, "suggestedFileName");
        Intrinsics.checkNotNullParameter(originFilePath, "originFilePath");
        this.d = new File(originFilePath);
        this.e.launch(suggestedFileName);
    }

    private final void a(File file, Uri uri2) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f26776a.openFileDescriptor(uri2, "w");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    fileOutputStream.write(lim.m.d(file));
                    Unit unit = Unit.f186387a;
                    fileOutputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                } finally {
                }
            } catch (Throwable th10) {
                try {
                    throw th10;
                } catch (Throwable th11) {
                    com.bumptech.glide.d.e(parcelFileDescriptorOpenFileDescriptor, th10);
                    throw th11;
                }
            }
        } catch (FileNotFoundException | IOException unused) {
        }
    }
}
