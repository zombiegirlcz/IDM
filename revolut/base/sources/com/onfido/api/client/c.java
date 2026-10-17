package com.onfido.api.client;

import com.onfido.api.client.data.ErrorData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.Json;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements ErrorParser {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f50120a;

    public c(rlm.o json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f50120a = json;
    }

    @Override // com.onfido.api.client.ErrorParser
    public final ErrorData a(Response response) {
        String strString;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null && (strString = responseBodyErrorBody.string()) != null) {
                Json json = this.f50120a;
                return (ErrorData) json.b(jh.d.v(json.f187949b, o0.b(ErrorData.class)), strString);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
