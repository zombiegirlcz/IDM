package com.onfido.api.client;

import com.onfido.api.client.data.SdkUploadMetaData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import ulm.a1;
import ulm.b1;
import ulm.c1;
import ulm.o1;
import ulm.p1;

/* JADX INFO: loaded from: classes17.dex */
public abstract class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f50136a;

    public h(String sdkSource, String sdkVersion) {
        Intrinsics.checkNotNullParameter(sdkSource, "sdkSource");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        c1 c1Var = new c1(0);
        this.f50136a = c1Var;
        c("sdk_source", sdkSource);
        c("sdk_version", sdkVersion);
        c1Var.f(okhttp3.c.f226117n);
    }

    public final void a(String fileName, String fileType, String fileDataKey, byte[] data) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(fileDataKey, "fileDataKey");
        p1 p1Var = RequestBody.Companion;
        b1.Companion.getClass();
        o1 o1VarD = p1.d(p1Var, data, a1.a(fileType), 0, 6);
        c1 c1Var = this.f50136a;
        c1Var.a(fileDataKey, fileName);
        c1Var.b(fileDataKey, fileName, o1VarD);
    }

    public final void b(String fileName, String fileType, byte[] data) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(data, "data");
        a(fileName, fileType, "file", data);
    }

    public final void c(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f50136a.a(key, value);
    }

    public final void d(SdkUploadMetaData sdkUploadMetaData) {
        rlm.o oVar = e.f50133a;
        c("sdk_metadata", oVar.c(jh.d.v(oVar.f187949b, o0.a(SdkUploadMetaData.class)), sdkUploadMetaData));
    }
}
