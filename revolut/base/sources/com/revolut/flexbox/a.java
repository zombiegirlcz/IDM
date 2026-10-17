package com.revolut.flexbox;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f98240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f98241h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f98242j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f98243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f98244m;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f98246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f98247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f98248r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98237a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98238b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98239c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f98245n = new ArrayList();

    public final int a() {
        return this.f98241h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f98237a = Math.min(this.f98237a, (view.getLeft() - flexItem.P8()) - i);
        this.f98238b = Math.min(this.f98238b, (view.getTop() - flexItem.c2()) - i2);
        this.f98239c = Math.max(this.f98239c, view.getRight() + flexItem.w9() + i3);
        this.d = Math.max(this.d, view.getBottom() + flexItem.Z3() + i5);
    }
}
