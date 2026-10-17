package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public final class pj0 extends Painter implements RememberObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ParcelFileDescriptor f31979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PdfRenderer f31980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31981c;
    private Bitmap d;
    private Size e;

    public pj0(File pdfFile, Density density) {
        Intrinsics.checkNotNullParameter(pdfFile, "pdfFile");
        Intrinsics.checkNotNullParameter(density, "density");
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(pdfFile, 268435456);
            Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorOpen, "open(...)");
            this.f31979a = parcelFileDescriptorOpen;
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
            this.f31980b = pdfRenderer;
            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
            Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
            float width = pageOpenPage.getWidth() * density.getDensity();
            this.f31981c = Size.m1862constructorimpl((((long) Float.floatToRawIntBits(pageOpenPage.getHeight() * density.getDensity())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(width) << 32));
            pageOpenPage.close();
        } catch (FileNotFoundException unused) {
            throw new IllegalStateException(("FL Developer error. " + pdfFile.getAbsolutePath() + " doesn't exist").toString());
        }
    }

    private final Bitmap a(long j2) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j2 >> 32));
        if (iIntBitsToFloat < 1) {
            iIntBitsToFloat = 1;
        }
        int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
        if (iIntBitsToFloat2 < 1) {
            iIntBitsToFloat2 = 1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntBitsToFloat, iIntBitsToFloat2, Bitmap.Config.ARGB_8888);
        PdfRenderer.Page pageOpenPage = this.f31980b.openPage(0);
        Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
        pageOpenPage.close();
        return bitmapCreateBitmap;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2255getIntrinsicSizeNHjbRc() {
        return this.f31981c;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() throws IOException {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (this.d == null || !Size.m1865equalsimpl(drawScope.mo2212getSizeNHjbRc(), this.e)) {
            this.d = a(drawScope.mo2212getSizeNHjbRc());
            this.e = Size.m1861boximpl(drawScope.mo2212getSizeNHjbRc());
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            DrawScope.m2201drawImagegbVJVH8$default(drawScope, AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 62, null);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() throws IOException {
        this.f31980b.close();
        this.f31979a.close();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.d = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
