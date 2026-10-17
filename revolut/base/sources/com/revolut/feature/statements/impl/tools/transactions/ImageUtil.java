package com.revolut.feature.statements.impl.tools.transactions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import o80.c;

/* JADX INFO: loaded from: classes7.dex */
public final class ImageUtil {
    @NonNull
    public static String getImageBase64AndScale(Context context, @NonNull String str) {
        try {
            return Base64.encodeToString(scaleReceipt(context, c.e(new File(str))), 0);
        } catch (Exception unused) {
            return "";
        }
    }

    public static File getRevolutImagesDirectory() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES + "/Revolut");
    }

    @NonNull
    private static byte[] resize(@NonNull Drawable drawable) {
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap.getHeight() < bitmap.getWidth()) {
            Intrinsics.checkNotNullParameter(bitmap, "<this>");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Matrix matrix = new Matrix();
            matrix.postRotate(90.0f);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 340, (int) ((bitmap.getHeight() / bitmap.getWidth()) * 340.0f), false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @NonNull
    private static byte[] scaleReceipt(Context context, @NonNull byte[] bArr) {
        return resize(new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }
}
