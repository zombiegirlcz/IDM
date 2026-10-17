package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public final class q71 extends Painter implements RememberObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ParcelFileDescriptor f32225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jz0 f32226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f32227c;
    private Size d;

    public q71(File svgFile, Density density) {
        Intrinsics.checkNotNullParameter(svgFile, "svgFile");
        Intrinsics.checkNotNullParameter(density, "density");
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(svgFile, 268435456);
            Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorOpen, "open(...)");
            this.f32225a = parcelFileDescriptorOpen;
            try {
                jz0 jz0VarA = jz0.a(new FileInputStream(svgFile));
                Intrinsics.checkNotNullExpressionValue(jz0VarA, "getFromInputStream(...)");
                this.f32226b = jz0VarA;
                jz0VarA.a(density.getDensity() * 160.0f);
            } catch (nz0 e) {
                throw new IllegalStateException(("FL Developer error. Failed to parse SVG: " + e.getMessage()).toString());
            }
        } catch (FileNotFoundException unused) {
            throw new IllegalStateException(("FL Developer error. " + svgFile.getAbsolutePath() + " doesn't exist").toString());
        }
    }

    private final Bitmap a(long j2) {
        int i = (int) (j2 >> 32);
        int iIntBitsToFloat = (int) Float.intBitsToFloat(i);
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntBitsToFloat, (int) Float.intBitsToFloat(i2), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (mo2255getIntrinsicSizeNHjbRc() >> 32)), Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & mo2255getIntrinsicSizeNHjbRc())));
        this.f32226b.a(canvas);
        return bitmapCreateBitmap;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2255getIntrinsicSizeNHjbRc() {
        if (this.f32226b.a() == -1.0f || this.f32226b.b() == -1.0f) {
            return Size.INSTANCE.m1874getUnspecifiedNHjbRc();
        }
        float fB = this.f32226b.b();
        return Size.m1862constructorimpl((((long) Float.floatToRawIntBits(this.f32226b.a())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fB) << 32));
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() throws IOException {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (this.f32227c == null || !Size.m1865equalsimpl(drawScope.mo2212getSizeNHjbRc(), this.d)) {
            this.f32227c = a(drawScope.mo2212getSizeNHjbRc());
            this.d = Size.m1861boximpl(drawScope.mo2212getSizeNHjbRc());
        }
        Bitmap bitmap = this.f32227c;
        if (bitmap != null) {
            DrawScope.m2201drawImagegbVJVH8$default(drawScope, AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 62, null);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() throws IOException {
        this.f32225a.close();
        Bitmap bitmap = this.f32227c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f32227c = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
