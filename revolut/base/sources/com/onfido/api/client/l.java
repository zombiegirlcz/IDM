package com.onfido.api.client;

import com.onfido.api.client.data.ErrorData;

/* JADX INFO: loaded from: classes17.dex */
public interface l {
    void onError(int i, String str, ErrorData errorData);

    void onFailure(Throwable th10);

    void onSuccess(Object obj2);
}
