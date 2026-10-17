package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes17.dex */
public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(String str, Exception exc2) {
        super(str, exc2);
    }

    public FirebaseRemoteConfigClientException() {
        super("Unable to connect to the server. Check your connection and try again.");
    }
}
