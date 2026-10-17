package com.fourthline.core;

import android.content.Context;
import hb.a;
import ib.h;
import java.io.File;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lim.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\"\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"deleteFourthlineFiles", "", "Landroid/content/Context;", "fourthlineDirectory", "Ljava/net/URI;", "getFourthlineDirectory", "(Landroid/content/Context;)Ljava/net/URI;", "assetsFourthlineDirectory", "Ljava/io/File;", "getAssetsFourthlineDirectory", "(Landroid/content/Context;)Ljava/io/File;", "fourthline-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ContextExtensionsKt {
    public static final void deleteFourthlineFiles(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        a.c(null, "filesystem_delete_fourthline_folder_enter", 6);
        try {
            o.m(new File(getFourthlineDirectory(context)));
            a.c(null, "filesystem_delete_fourthline_folder_success", 6);
        } catch (Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            a.b(4, "filesystem_delete_fourthline_folder_fail", error, null);
        }
    }

    @NotNull
    public static final File getAssetsFourthlineDirectory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File dir = context.getDir("fourthline_assets", 0);
        Intrinsics.checkNotNullExpressionValue(dir, "getDir(...)");
        return dir;
    }

    @NotNull
    public static final URI getFourthlineDirectory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File file = new File(context.getCacheDir().getAbsolutePath() + "/fourthline");
        try {
            file.mkdirs();
        } catch (Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            h hVar = a.f150532a;
            a.b(4, "filesystem_create_fourthline_folder_fail", error, null);
        }
        URI uri2 = file.toURI();
        Intrinsics.checkNotNullExpressionValue(uri2, "toURI(...)");
        return uri2;
    }
}
