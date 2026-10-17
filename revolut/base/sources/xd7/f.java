package xd7;

import android.graphics.drawable.ShapeDrawable;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends ShapeDrawable.ShaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f304274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f304275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f304276c;
    public final /* synthetic */ int d;

    public f(float f, int i, int i2, int i3) {
        this.f304274a = f;
        this.f304275b = i;
        this.f304276c = i2;
        this.d = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Shader resize(int r10, int r11) {
        /*
            r9 = this;
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r11 <= 0) goto Lc
            float r0 = r9.f304274a
            float r1 = (float) r11
            float r0 = r0 / r1
            int r1 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r1 <= 0) goto Ld
        Lc:
            r0 = r10
        Ld:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            float r5 = (float) r11
            int r11 = r9.f304276c
            int r2 = r9.d
            int r3 = r9.f304275b
            int[] r6 = new int[]{r3, r11, r2, r2}
            r11 = 1048576000(0x3e800000, float:0.25)
            float r11 = r11 * r0
            r2 = 4
            float[] r7 = new float[r2]
            r2 = 0
            r3 = 0
            r7[r3] = r2
            r2 = 1
            r7[r2] = r11
            r11 = 2
            r7[r11] = r0
            r11 = 3
            r7[r11] = r10
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xd7.f.resize(int, int):android.graphics.Shader");
    }
}
