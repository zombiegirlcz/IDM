package com.github.devnied.emvnfccard.model;

/* JADX INFO: loaded from: classes16.dex */
public class Afl {
    private int firstRecord;
    private int lastRecord;
    private boolean offlineAuthentication;

    /* JADX INFO: renamed from: sfi, reason: collision with root package name */
    private int f37245sfi;

    public int getFirstRecord() {
        return this.firstRecord;
    }

    public int getLastRecord() {
        return this.lastRecord;
    }

    public int getSfi() {
        return this.f37245sfi;
    }

    public boolean isOfflineAuthentication() {
        return this.offlineAuthentication;
    }

    public void setFirstRecord(int i) {
        this.firstRecord = i;
    }

    public void setLastRecord(int i) {
        this.lastRecord = i;
    }

    public void setOfflineAuthentication(boolean z) {
        this.offlineAuthentication = z;
    }

    public void setSfi(int i) {
        this.f37245sfi = i;
    }
}
