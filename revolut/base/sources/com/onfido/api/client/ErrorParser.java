package com.onfido.api.client;

import com.onfido.api.client.data.ErrorData;
import retrofit2.Response;

/* JADX INFO: loaded from: classes17.dex */
public interface ErrorParser {
    ErrorData a(Response response);
}
