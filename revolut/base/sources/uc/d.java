package uc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.ui.RotationLayout;
import com.rd.PageIndicatorView;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import fwj.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te0.w;
import vx9.v;
import yua.q;
import z9l.j;
import zhm.f0;
import zq2.k;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements f, t28.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f278952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f278953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f278954c;

    public d(z9l.i progressionStepsMapper, j stepDateMapper, bp6.b feedbackWidgetMapper) {
        Intrinsics.checkNotNullParameter(progressionStepsMapper, "progressionStepsMapper");
        Intrinsics.checkNotNullParameter(stepDateMapper, "stepDateMapper");
        Intrinsics.checkNotNullParameter(feedbackWidgetMapper, "feedbackWidgetMapper");
        this.f278952a = progressionStepsMapper;
        this.f278953b = stepDateMapper;
        this.f278954c = feedbackWidgetMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(uc.d r5, java.io.File r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof zq2.h
            if (r0 == 0) goto L13
            r0 = r7
            zq2.h r0 = (zq2.h) r0
            int r1 = r0.f324352w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324352w = r1
            goto L18
        L13:
            zq2.h r0 = new zq2.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324352w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28
            goto L5a
        L28:
            r5 = move-exception
            goto L66
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            java.lang.Object r5 = r5.f278954c     // Catch: java.lang.Exception -> L28
            kotlin.Lazy r5 = (kotlin.Lazy) r5     // Catch: java.lang.Exception -> L28
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L28
            bi0.e r5 = (bi0.e) r5     // Catch: java.lang.Exception -> L28
            java.lang.String r7 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)     // Catch: java.lang.Exception -> L28
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Exception -> L28
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6)     // Catch: java.lang.Exception -> L28
            java.lang.String r7 = "decodeFile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Exception -> L28
            r0.f324352w = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r5.c(r6, r0)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L5a
            return r1
        L5a:
            com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode r7 = (com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode) r7     // Catch: java.lang.Exception -> L28
            if (r7 == 0) goto L65
            xq2.f r5 = xq2.f.FILE     // Catch: java.lang.Exception -> L28
            xq2.a r5 = ar2.e.a(r7, r5)     // Catch: java.lang.Exception -> L28
            return r5
        L65:
            return r4
        L66:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            rd0.d.a(r7, r4, r4, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.d.g(uc.d, java.io.File, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|64|23|24|75|25|(1:78)(4:28|29|(0)(0)|(0)(3:(1:36)|40|77))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        r8 = zhm.h0.f322473a;
        r9 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, r13, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        if (r5 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        if (r5 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        r5.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        throw r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0033, blocks: (B:12:0x002e, B:29:0x00a7, B:31:0x00ab, B:22:0x005d, B:24:0x0083, B:49:0x00d3, B:50:0x00d6, B:23:0x0066, B:47:0x00d1), top: B:68:0x002e, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #2 {all -> 0x0033, blocks: (B:12:0x002e, B:29:0x00a7, B:31:0x00ab, B:22:0x005d, B:24:0x0083, B:49:0x00d3, B:50:0x00d6, B:23:0x0066, B:47:0x00d1), top: B:68:0x002e, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9 A[EXC_TOP_SPLITTER, PHI: r2 r5 r6 r7 r12
      0x00c9: PHI (r2v4 int) = (r2v5 int), (r2v9 int) binds: [B:52:0x00e0, B:41:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r5v3 android.graphics.Bitmap) = (r5v4 android.graphics.Bitmap), (r5v9 android.graphics.Bitmap) binds: [B:52:0x00e0, B:41:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r6v2 android.os.ParcelFileDescriptor) = (r6v4 android.os.ParcelFileDescriptor), (r6v7 android.os.ParcelFileDescriptor) binds: [B:52:0x00e0, B:41:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r7v2 'renderer' android.graphics.pdf.PdfRenderer) = (r7v4 'renderer' android.graphics.pdf.PdfRenderer), (r7v7 'renderer' android.graphics.pdf.PdfRenderer) binds: [B:52:0x00e0, B:41:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r12v4 int) = (r12v7 int), (r12v10 int) binds: [B:52:0x00e0, B:41:0x00c7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:29:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c9 -> B:54:0x00e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e0 -> B:54:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(uc.d r11, java.io.File r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.d.h(uc.d, java.io.File, gim.c):java.lang.Object");
    }

    @Override // t28.g
    public List a(dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return f0.f322471a;
    }

    @Override // uc.f
    public void b(g gVar, File file, boolean z) throws IllegalAccessException, IOException, InvocationTargetException {
        ((HashSet) this.f278952a).add(file);
        if (z) {
            return;
        }
        b bVar = (b) this.f278953b;
        String str = bVar.f278948b;
        String str2 = gVar.f278955a;
        ZipEntry zipEntry = gVar.f278956b;
        String absolutePath = bVar.f278947a.getAbsolutePath();
        String name = zipEntry.getName();
        String absolutePath2 = file.getAbsolutePath();
        StringBuilder sbM = v0.a.m("NativeLibraryExtractor: split '", str, "' has native library '", str2, "' that does not exist; extracting from '");
        j6.a.D(sbM, absolutePath, "!", name, "' to '");
        sbM.append(absolutePath2);
        sbM.append("'");
        sbM.toString();
        ZipFile zipFile = (ZipFile) this.f278954c;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th10) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th11) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th10, th11);
                }
            }
            throw th10;
        }
    }

    @Override // t28.g
    public zel.f c() {
        return (zel.f) this.f278953b;
    }

    @Override // t28.g
    public Object d(String str, gim.c cVar) {
        return Intrinsics.f(str, "PopularStocksDynamic") ? ((n28.d) this.f278952a).e(cVar) : Boolean.FALSE;
    }

    @Override // t28.g
    public TextLocalisedClause e() {
        return (TextLocalisedClause) this.f278954c;
    }

    @Override // t28.g
    public v28.c f(dsh.e eVar) {
        return new v28.a(new TextLocalisedClause(R$string.wealth_invest_widget_popular_stocks_widget_title, null, null, 14));
    }

    public pfm.a i() {
        twj.f fVar = (twj.f) ((p) this.f278954c).f138685a;
        fVar.getClass();
        ufm.c cVar = new ufm.c(new twj.b(fVar, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        pfm.a aVar = new pfm.a(w.i0(cVar), new uwf.b(2, new uu9.b(this, 7)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return ue0.e.v(aVar);
    }

    public Bitmap j() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f278952a;
        viewGroup.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        viewGroup.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        viewGroup.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public r k(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return pd.b.r(((q) ((xua.a) this.f278953b)).o(id10), new yua.a(this, 0));
    }

    public Flow l(AccountId accountId, AnalyticsSpendingPeriod$Interval interval, xi0.b currency) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return boh.f.e(rd0.e.b(((lmd.j) ((xld.f) this.f278952a)).a(hx7.a.D(interval), accountId)), new v(this, 22, interval, currency));
    }

    public void m(xl.a aVar) {
        ((r10.q) ((mp.p) this.f278952a).f207710c).f250849b = aVar;
        ((PageIndicatorView) this.f278954c).invalidate();
    }

    public void n(Drawable drawable) {
        ViewGroup viewGroup = (ViewGroup) this.f278952a;
        viewGroup.setBackgroundDrawable(drawable);
        if (drawable == null) {
            viewGroup.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        viewGroup.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public d(xq2.d detectorSettings, bi0.f msBarcodeDetectorFactory, ar2.e legacyMapper, k pdfRendererDelegate, zq2.j bitmapDelegate) {
        Intrinsics.checkNotNullParameter(detectorSettings, "detectorSettings");
        Intrinsics.checkNotNullParameter(msBarcodeDetectorFactory, "msBarcodeDetectorFactory");
        Intrinsics.checkNotNullParameter(legacyMapper, "legacyMapper");
        Intrinsics.checkNotNullParameter(pdfRendererDelegate, "pdfRendererDelegate");
        Intrinsics.checkNotNullParameter(bitmapDelegate, "bitmapDelegate");
        this.f278952a = detectorSettings;
        this.f278953b = msBarcodeDetectorFactory;
        this.f278954c = yhm.j.b(new zh0.b(this, 12));
    }

    public d(xld.f upcomingSpendingInteractor, ppk.f ratesInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(upcomingSpendingInteractor, "upcomingSpendingInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f278952a = upcomingSpendingInteractor;
        this.f278953b = ratesInteractor;
        this.f278954c = dateProvider;
    }

    public d(Context context) {
        yg.a aVar = new yg.a(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.f278952a = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f278953b = rotationLayout;
        this.f278954c = (TextView) rotationLayout.findViewById(R.id.amu_text);
        aVar.f313477c = -1;
        n(aVar);
        TextView textView = (TextView) this.f278954c;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.amu_Bubble_TextAppearance_Dark);
        }
    }
}
