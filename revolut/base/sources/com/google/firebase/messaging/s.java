package com.google.firebase.messaging;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes17.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f49527c;
    public final String d;
    public final String e;
    public final String[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f49528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f49529h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f49530j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f49531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f49532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f49533n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f49534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f49535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f49536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f49537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f49538t;
    public final boolean u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f49539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f49540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f49541y;
    public final long[] z;

    public s(zjh.f fVar) {
        String[] strArr;
        String[] strArr2;
        this.f49525a = fVar.s("gcm.n.title");
        this.f49526b = fVar.p("gcm.n.title");
        Object[] objArrO = fVar.o("gcm.n.title");
        if (objArrO == null) {
            strArr = null;
        } else {
            strArr = new String[objArrO.length];
            for (int i = 0; i < objArrO.length; i++) {
                strArr[i] = String.valueOf(objArrO[i]);
            }
        }
        this.f49527c = strArr;
        this.d = fVar.s("gcm.n.body");
        this.e = fVar.p("gcm.n.body");
        Object[] objArrO2 = fVar.o("gcm.n.body");
        if (objArrO2 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[objArrO2.length];
            for (int i2 = 0; i2 < objArrO2.length; i2++) {
                strArr2[i2] = String.valueOf(objArrO2[i2]);
            }
        }
        this.f = strArr2;
        this.f49528g = fVar.s("gcm.n.icon");
        String strS = fVar.s("gcm.n.sound2");
        this.i = TextUtils.isEmpty(strS) ? fVar.s("gcm.n.sound") : strS;
        this.f49530j = fVar.s("gcm.n.tag");
        this.k = fVar.s("gcm.n.color");
        this.f49531l = fVar.s("gcm.n.click_action");
        this.f49532m = fVar.s("gcm.n.android_channel_id");
        String strS2 = fVar.s("gcm.n.link_android");
        strS2 = TextUtils.isEmpty(strS2) ? fVar.s("gcm.n.link") : strS2;
        this.f49533n = TextUtils.isEmpty(strS2) ? null : Uri.parse(strS2);
        this.f49529h = fVar.s("gcm.n.image");
        this.o = fVar.s("gcm.n.ticker");
        this.f49534p = fVar.l("gcm.n.notification_priority");
        this.f49535q = fVar.l("gcm.n.visibility");
        this.f49536r = fVar.l("gcm.n.notification_count");
        this.u = fVar.k("gcm.n.sticky");
        this.v = fVar.k("gcm.n.local_only");
        this.f49539w = fVar.k("gcm.n.default_sound");
        this.f49540x = fVar.k("gcm.n.default_vibrate_timings");
        this.f49541y = fVar.k("gcm.n.default_light_settings");
        this.f49538t = fVar.q();
        this.f49537s = fVar.n();
        this.z = fVar.t();
    }
}
