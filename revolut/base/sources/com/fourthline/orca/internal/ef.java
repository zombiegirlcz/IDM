package com.fourthline.orca.internal;

import com.fourthline.vision.MotionData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f28116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f28117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f28118c;
    private final Map d;
    private final Map e;
    private final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f28119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f28120h;
    private final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f28121j;
    private final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f28122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f28123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MotionData f28124n;
    private MotionData o;

    public ef(Map environment, Map gps, Map cellular, Map network, Map general, Map hardware, Map screen, Map battery, Map locale, Map system, List motion, Map motionMetadata, Map scannerCameraData, MotionData motionData, MotionData motionData2) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(gps, "gps");
        Intrinsics.checkNotNullParameter(cellular, "cellular");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(general, "general");
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(battery, "battery");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(system, "system");
        Intrinsics.checkNotNullParameter(motion, "motion");
        Intrinsics.checkNotNullParameter(motionMetadata, "motionMetadata");
        Intrinsics.checkNotNullParameter(scannerCameraData, "scannerCameraData");
        this.f28116a = environment;
        this.f28117b = gps;
        this.f28118c = cellular;
        this.d = network;
        this.e = general;
        this.f = hardware;
        this.f28119g = screen;
        this.f28120h = battery;
        this.i = locale;
        this.f28121j = system;
        this.k = motion;
        this.f28122l = motionMetadata;
        this.f28123m = scannerCameraData;
        this.f28124n = motionData;
        this.o = motionData2;
    }

    public final Map a() {
        return this.f28120h;
    }

    public final Map b() {
        return this.f28118c;
    }

    public final MotionData c() {
        return this.o;
    }

    public final Map d() {
        return this.f28116a;
    }

    public final Map e() {
        return this.e;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ef)) {
            return false;
        }
        ef efVar = (ef) obj2;
        return Intrinsics.f(this.f28116a, efVar.f28116a) && Intrinsics.f(this.f28117b, efVar.f28117b) && Intrinsics.f(this.f28118c, efVar.f28118c) && Intrinsics.f(this.d, efVar.d) && Intrinsics.f(this.e, efVar.e) && Intrinsics.f(this.f, efVar.f) && Intrinsics.f(this.f28119g, efVar.f28119g) && Intrinsics.f(this.f28120h, efVar.f28120h) && Intrinsics.f(this.i, efVar.i) && Intrinsics.f(this.f28121j, efVar.f28121j) && Intrinsics.f(this.k, efVar.k) && Intrinsics.f(this.f28122l, efVar.f28122l) && Intrinsics.f(this.f28123m, efVar.f28123m) && Intrinsics.f(this.f28124n, efVar.f28124n) && Intrinsics.f(this.o, efVar.o);
    }

    public final Map f() {
        return this.f28117b;
    }

    public final Map g() {
        return this.f;
    }

    public final Map h() {
        return this.i;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((this.f28116a.hashCode() * 31) + this.f28117b.hashCode()) * 31) + this.f28118c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f28119g.hashCode()) * 31) + this.f28120h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.f28121j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.f28122l.hashCode()) * 31) + this.f28123m.hashCode()) * 31;
        MotionData motionData = this.f28124n;
        int iHashCode2 = (iHashCode + (motionData == null ? 0 : motionData.hashCode())) * 31;
        MotionData motionData2 = this.o;
        return iHashCode2 + (motionData2 != null ? motionData2.hashCode() : 0);
    }

    public final List i() {
        return this.k;
    }

    public final Map j() {
        return this.f28122l;
    }

    public final Map k() {
        return this.d;
    }

    public final Map l() {
        return this.f28123m;
    }

    public final Map m() {
        return this.f28119g;
    }

    public final MotionData n() {
        return this.f28124n;
    }

    public final Map o() {
        return this.f28121j;
    }

    public String toString() {
        return "DeviceDataBundle(environment=" + this.f28116a + ", gps=" + this.f28117b + ", cellular=" + this.f28118c + ", network=" + this.d + ", general=" + this.e + ", hardware=" + this.f + ", screen=" + this.f28119g + ", battery=" + this.f28120h + ", locale=" + this.i + ", system=" + this.f28121j + ", motion=" + this.k + ", motionMetadata=" + this.f28122l + ", scannerCameraData=" + this.f28123m + ", selfieMotionData=" + this.f28124n + ", documentMotionData=" + this.o + ")";
    }

    public final void a(MotionData motionData) {
        this.o = motionData;
    }

    public final void b(MotionData motionData) {
        this.f28124n = motionData;
    }

    public /* synthetic */ ef(Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Map map9, Map map10, List list, Map map11, Map map12, MotionData motionData, MotionData motionData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? new LinkedHashMap() : map2, (i & 4) != 0 ? new LinkedHashMap() : map3, (i & 8) != 0 ? new LinkedHashMap() : map4, (i & 16) != 0 ? new LinkedHashMap() : map5, (i & 32) != 0 ? new LinkedHashMap() : map6, (i & 64) != 0 ? new LinkedHashMap() : map7, (i & 128) != 0 ? new LinkedHashMap() : map8, (i & 256) != 0 ? new LinkedHashMap() : map9, (i & 512) != 0 ? new LinkedHashMap() : map10, (i & 1024) != 0 ? new ArrayList() : list, (i & 2048) != 0 ? new LinkedHashMap() : map11, (i & 4096) != 0 ? new LinkedHashMap() : map12, (i & 8192) != 0 ? null : motionData, (i & 16384) != 0 ? null : motionData2);
    }
}
