package com.orhanobut.dialogplus;

import ag.p;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.Arrays;
import x0i.i;
import y2l.a;

/* JADX INFO: loaded from: classes17.dex */
public class DialogPlusBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f50223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f50224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f50225c;
    public final FrameLayout.LayoutParams d;
    public a e;
    public final BaseDelegatesActivity f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f50226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ListHolder f50227h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f50228j;
    public i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f50229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f50230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f50231n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f50232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f50233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f50234r;

    private DialogPlusBuilder() {
        this.f50223a = new int[4];
        this.f50224b = new int[4];
        this.f50225c = new int[4];
        this.d = new FrameLayout.LayoutParams(-1, -2, 80);
        this.i = 80;
        this.f50229l = true;
        this.f50230m = android.R.color.white;
        this.f50231n = -1;
        this.o = -1;
        this.f50232p = -1;
        this.f50233q = -1;
        this.f50234r = com.revolut.revolut.feature_fourthline_impl.R.color.dialogplus_black_overlay;
    }

    public DialogPlusBuilder(BaseDelegatesActivity baseDelegatesActivity) {
        int[] iArr = new int[4];
        this.f50223a = iArr;
        this.f50224b = new int[4];
        this.f50225c = new int[4];
        this.d = new FrameLayout.LayoutParams(-1, -2, 80);
        this.i = 80;
        this.f50229l = true;
        this.f50230m = android.R.color.white;
        this.f50231n = -1;
        this.o = -1;
        this.f50232p = -1;
        this.f50233q = -1;
        this.f50234r = com.revolut.revolut.feature_fourthline_impl.R.color.dialogplus_black_overlay;
        this.f = baseDelegatesActivity;
        Arrays.fill(iArr, -1);
    }
}
