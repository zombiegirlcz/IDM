package org.bouncycastle.pqc.legacy.bike;

import org.bouncycastle.pqc.crypto.KEMParameters;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes14.dex */
public class BIKEParameters implements KEMParameters {
    public static final BIKEParameters bike128 = new BIKEParameters("bike128", 12323, 142, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, 256, 5, 3, 128);
    public static final BIKEParameters bike192 = new BIKEParameters("bike192", 24659, 206, 199, 256, 5, 3, 192);
    public static final BIKEParameters bike256 = new BIKEParameters("bike256", 40973, 274, 264, 256, 5, 3, 256);
    private BIKEEngine bikeEngine;
    private final int defaultKeySize;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f228906l;
    private String name;
    private int nbIter;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f228907r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f228908t;
    private int tau;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f228909w;

    private BIKEParameters(String str, int i, int i2, int i3, int i5, int i6, int i21, int i22) {
        this.name = str;
        this.f228907r = i;
        this.f228909w = i2;
        this.f228908t = i3;
        this.f228906l = i5;
        this.nbIter = i6;
        this.tau = i21;
        this.defaultKeySize = i22;
        this.bikeEngine = new BIKEEngine(i, i2, i3, i5, i6, i21);
    }

    public BIKEEngine getEngine() {
        return this.bikeEngine;
    }

    public int getL() {
        return this.f228906l;
    }

    public int getLByte() {
        return this.f228906l / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getNbIter() {
        return this.nbIter;
    }

    public int getR() {
        return this.f228907r;
    }

    public int getRByte() {
        return (this.f228907r + 7) / 8;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f228908t;
    }

    public int getTau() {
        return this.tau;
    }

    public int getW() {
        return this.f228909w;
    }
}
