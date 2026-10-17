package p30;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import qz0.j;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q10.a f232557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f232558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f232559c;
    public final su9.c d;

    public d(q10.a chatFileHelper, Context context, j imageRepository, su9.c imageTempFileProvider) {
        Intrinsics.checkNotNullParameter(chatFileHelper, "chatFileHelper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageRepository, "imageRepository");
        Intrinsics.checkNotNullParameter(imageTempFileProvider, "imageTempFileProvider");
        this.f232557a = chatFileHelper;
        this.f232558b = context;
        this.f232559c = imageRepository;
        this.d = imageTempFileProvider;
    }

    public final void a(File file) {
        Intent intent = new Intent("android.intent.action.SEND");
        q10.a aVar = this.f232557a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Context context = aVar.f241309a;
        Uri uriForFile = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".provider", file);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.addFlags(268435457);
        intent.setType("image/*");
        this.f232558b.startActivity(intent);
    }
}
