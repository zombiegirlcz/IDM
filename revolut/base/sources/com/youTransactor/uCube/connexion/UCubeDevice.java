package com.youTransactor.uCube.connexion;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes17.dex */
public class UCubeDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107585c;

    public UCubeDevice(String str, String str2) {
        this.f107583a = str;
        this.f107584b = str2;
        this.f107585c = 0;
    }

    public boolean equals(Object obj2) {
        if (obj2 != null && (obj2 instanceof UCubeDevice)) {
            UCubeDevice uCubeDevice = (UCubeDevice) obj2;
            if (getAddress().equals(uCubeDevice.getAddress()) && getName().equals(uCubeDevice.getName())) {
                return true;
            }
        }
        return false;
    }

    public String getAddress() {
        return this.f107584b;
    }

    public String getName() {
        return this.f107583a;
    }

    public int getRssi() {
        return this.f107585c;
    }

    @NonNull
    public String toString() {
        return this.f107583a + " : " + this.f107584b;
    }

    public UCubeDevice(String str, String str2, int i) {
        this.f107583a = str;
        this.f107584b = str2;
        this.f107585c = i;
    }
}
