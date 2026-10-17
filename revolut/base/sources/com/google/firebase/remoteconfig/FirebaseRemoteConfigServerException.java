package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49613a;

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.f49613a = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str, int i2) {
        super(str);
        this.f49613a = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.f49613a = i;
    }

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.f49613a = -1;
    }
}
