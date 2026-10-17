package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes16.dex */
public final class zak extends Drawable implements Drawable.Callback {
    private int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private long f39206zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private int f39207zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private int f39208zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private int f39209zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private int f39210zaf;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private boolean f39211zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private boolean f39212zah;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private zaj f39213zai;

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    private Drawable f39214zaj;
    private Drawable zak;

    /* JADX INFO: renamed from: zal, reason: collision with root package name */
    private boolean f39215zal;

    /* JADX INFO: renamed from: zam, reason: collision with root package name */
    private boolean f39216zam;
    private boolean zan;
    private int zao;

    public zak(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? zai.zaa : drawable;
        this.f39214zaj = drawable;
        drawable.setCallback(this);
        zaj zajVar = this.f39213zai;
        zajVar.f39205zab = drawable.getChangingConfigurations() | zajVar.f39205zab;
        drawable2 = drawable2 == null ? zai.zaa : drawable2;
        this.zak = drawable2;
        drawable2.setCallback(this);
        zaj zajVar2 = this.f39213zai;
        zajVar2.f39205zab = drawable2.getChangingConfigurations() | zajVar2.f39205zab;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.zaa
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L3a
            if (r0 == r1) goto Lb
        L9:
            r4 = r3
            goto L43
        Lb:
            long r0 = r7.f39206zab
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L9
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f39206zab
            long r0 = r0 - r4
            int r4 = r7.f39209zae
            float r4 = (float) r4
            float r0 = (float) r0
            float r0 = r0 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L27
            r4 = r3
            goto L28
        L27:
            r4 = r2
        L28:
            if (r4 == 0) goto L2c
            r7.zaa = r2
        L2c:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f39207zac
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.f39210zaf = r0
            goto L43
        L3a:
            long r4 = android.os.SystemClock.uptimeMillis()
            r7.f39206zab = r4
            r7.zaa = r1
            r4 = r2
        L43:
            int r0 = r7.f39210zaf
            boolean r1 = r7.f39211zag
            android.graphics.drawable.Drawable r5 = r7.f39214zaj
            android.graphics.drawable.Drawable r6 = r7.zak
            if (r4 == 0) goto L62
            if (r1 == 0) goto L52
            if (r0 != 0) goto L57
            goto L53
        L52:
            r2 = r0
        L53:
            r5.draw(r8)
            r0 = r2
        L57:
            int r1 = r7.f39208zad
            if (r0 != r1) goto L61
            r6.setAlpha(r1)
            r6.draw(r8)
        L61:
            return
        L62:
            if (r1 == 0) goto L6b
            int r1 = r7.f39208zad
            int r1 = r1 - r0
            r5.setAlpha(r1)
            r2 = r3
        L6b:
            r5.draw(r8)
            if (r2 == 0) goto L75
            int r1 = r7.f39208zad
            r5.setAlpha(r1)
        L75:
            if (r0 <= 0) goto L82
            r6.setAlpha(r0)
            r6.draw(r8)
            int r8 = r7.f39208zad
            r6.setAlpha(r8)
        L82:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zak.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zaj zajVar = this.f39213zai;
        return changingConfigurations | zajVar.zaa | zajVar.f39205zab;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!zac()) {
            return null;
        }
        this.f39213zai.zaa = getChangingConfigurations();
        return this.f39213zai;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f39214zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f39214zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.zan) {
            this.zao = Drawable.resolveOpacity(this.f39214zaj.getOpacity(), this.zak.getOpacity());
            this.zan = true;
        }
        return this.zao;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.f39212zah || super.mutate() != this) {
            return this;
        }
        if (!zac()) {
            throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
        }
        this.f39214zaj.mutate();
        this.zak.mutate();
        this.f39212zah = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f39214zaj.setBounds(rect);
        this.zak.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f39210zaf == this.f39208zad) {
            this.f39210zaf = i;
        }
        this.f39208zad = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39214zaj.setColorFilter(colorFilter);
        this.zak.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.zak;
    }

    public final void zab(int i) {
        this.f39207zac = this.f39208zad;
        this.f39210zaf = 0;
        this.f39209zae = Constants.TAG_SUPPORTED_LOCALE_LIST;
        this.zaa = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.f39215zal) {
            boolean z = false;
            if (this.f39214zaj.getConstantState() != null && this.zak.getConstantState() != null) {
                z = true;
            }
            this.f39216zam = z;
            this.f39215zal = true;
        }
        return this.f39216zam;
    }

    public zak(zaj zajVar) {
        this.zaa = 0;
        this.f39208zad = 255;
        this.f39210zaf = 0;
        this.f39211zag = true;
        this.f39213zai = new zaj(zajVar);
    }
}
