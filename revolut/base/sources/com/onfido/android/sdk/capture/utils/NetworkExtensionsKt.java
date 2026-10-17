package com.onfido.android.sdk.capture.utils;

import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import io.reactivex.rxjava3.core.Single;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.d;
import mmm.k0;
import mmm.v0;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import tgm.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"httpErrorBodyString", "", "", "saveFile", "Lio/reactivex/rxjava3/core/Single;", "Ljava/io/File;", "Lokhttp3/ResponseBody;", "file", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NetworkExtensionsKt {
    @InternalOnfidoApi
    public static final String httpErrorBodyString(@NotNull Throwable th10) {
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        Intrinsics.checkNotNullParameter(th10, "<this>");
        if (!(th10 instanceof HttpException) || (response = ((HttpException) th10).response()) == null || (responseBodyErrorBody = response.errorBody()) == null) {
            return null;
        }
        return responseBodyErrorBody.string();
    }

    @NotNull
    public static final Single<File> saveFile(@NotNull ResponseBody responseBody, @NotNull File file) {
        b bVarE;
        Intrinsics.checkNotNullParameter(responseBody, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        k0 k0VarB = u1.b(new d(fileOutputStream, new v0()));
        try {
            try {
                k0VarB.R8(responseBody.source());
                k0VarB.flush();
                bVarE = Single.f(file);
            } catch (IOException e) {
                bVarE = Single.e(e);
            }
            return bVarE;
        } finally {
            k0VarB.close();
        }
    }
}
