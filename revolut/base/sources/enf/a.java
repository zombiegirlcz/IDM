package enf;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static Pair a(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
        try {
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
            try {
                if (pdfRenderer.getPageCount() == 0) {
                    throw new IllegalArgumentException("PDF contains no pages");
                }
                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                try {
                    Pair pair = new Pair(Integer.valueOf(pageOpenPage.getWidth()), Integer.valueOf(pageOpenPage.getHeight()));
                    mra.d.l(pageOpenPage, null);
                    com.bumptech.glide.d.e(parcelFileDescriptorOpen, null);
                    return pair;
                } finally {
                }
            } finally {
                pdfRenderer.close();
            }
        } finally {
        }
    }

    public static Bitmap b(File file, int i) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
        try {
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
            try {
                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(600, i, Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                    try {
                        bitmapCreateBitmap.eraseColor(-1);
                        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                        Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.RGB_565, false);
                        mra.d.l(pageOpenPage, null);
                        com.bumptech.glide.d.e(parcelFileDescriptorOpen, null);
                        Intrinsics.checkNotNullExpressionValue(bitmapCopy, "use(...)");
                        return bitmapCopy;
                    } finally {
                        bitmapCreateBitmap.recycle();
                    }
                } finally {
                }
            } finally {
                pdfRenderer.close();
            }
        } finally {
        }
    }
}
