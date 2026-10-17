package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes17.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigFetchThrottledException() {
        super("Fetch was throttled.");
    }

    public FirebaseRemoteConfigFetchThrottledException(String str) {
        super(str);
    }
}
