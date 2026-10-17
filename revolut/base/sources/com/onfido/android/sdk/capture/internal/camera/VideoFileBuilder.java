package com.onfido.android.sdk.capture.internal.camera;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/VideoFileBuilder;", "", "()V", "<set-?>", "", "prefix", "getPrefix", "()Ljava/lang/String;", "build", "Ljava/io/File;", "context", "Landroid/content/Context;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VideoFileBuilder {
    private String prefix;

    @NotNull
    private static final String VIDEO_FILE_DATE_FORMAT = "yyyy_MM_dd_HH_mm_ss_SSS";

    @NotNull
    private static final String VIDEO_FILE_EXTENSION = "mp4";

    @NotNull
    public final File build(@NotNull Context context) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        File fileCreateTempFile = File.createTempFile(this.prefix + CoreConstants.DASH_CHAR + new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS", Locale.UK).format(new Date()) + CoreConstants.DASH_CHAR, ".mp4", context.getCacheDir());
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    public final VideoFileBuilder prefix(@NotNull String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.prefix = prefix;
        return this;
    }
}
