package androidx.camera.video.internal.compat;

import android.content.Context;
import android.media.AudioRecord;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Api31Impl {
    public static void setContext(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }
}
