package com.onfido.api.client.exception;

/* JADX INFO: loaded from: classes17.dex */
public class EnterpriseFeaturesNotAuthorizedException extends RuntimeException {
    public EnterpriseFeaturesNotAuthorizedException() {
        super("Enterprise features are not available on this account. Please talk to your Onfido Account Representative if you think you are receiving this message in error.");
    }
}
