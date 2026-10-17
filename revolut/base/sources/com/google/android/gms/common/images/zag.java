package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zag {
    final zad zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    protected int f38013zab;

    public zag(Uri uri2, int i) {
        this.f38013zab = 0;
        this.zaa = new zad(uri2);
        this.f38013zab = i;
    }

    public abstract void zaa(Drawable drawable, boolean z, boolean z3, boolean z4);

    public final void zab(Context context, zam zamVar, boolean z) {
        int i = this.f38013zab;
        zaa(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    public final void zac(Context context, Bitmap bitmap, boolean z) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
