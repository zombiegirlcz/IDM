package com.fourthline.orca.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class qj0 implements oj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32462a;

    public qj0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32462a = context;
    }

    @Override // com.fourthline.orca.internal.oj0
    public List a(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return a(new PdfRenderer(ParcelFileDescriptor.open(new File(filePath), 268435456)));
    }

    private final List a(PdfRenderer pdfRenderer) {
        ArrayList arrayList = new ArrayList();
        float f = this.f32462a.getResources().getDisplayMetrics().density;
        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
        Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (pageOpenPage.getWidth() * f), (int) (pageOpenPage.getHeight() * f), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
        arrayList.add(bitmapCreateBitmap);
        pageOpenPage.close();
        pdfRenderer.close();
        return arrayList;
    }
}
