package g8;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import mp.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f141227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f141228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f141229c;

    public f(nbm.d dVar) {
        long j2 = dVar.f214095a;
        this.f141227a = dVar.f214096b;
        this.f141228b = dVar.f214097c;
        this.f141229c = dVar.d;
    }

    public f(g7.c cVar) {
        Context context = (Context) cVar.f141023b;
        float f = cVar.f141022a;
        ActivityManager activityManager = (ActivityManager) cVar.f141024c;
        int i = activityManager.isLowRamDevice() ? PKIFailureInfo.badSenderNonce : 4194304;
        this.f141229c = i;
        int iRound = Math.round(activityManager.getMemoryClass() * PKIFailureInfo.badCertTemplate * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) ((r) cVar.d).f207713b;
        float f4 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f4 * f);
        int iRound3 = Math.round(f4 * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f141228b = iRound3;
            this.f141227a = iRound2;
        } else {
            float f5 = i2 / (f + 2.0f);
            this.f141228b = Math.round(2.0f * f5);
            this.f141227a = Math.round(f5 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb6 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb6.append(Formatter.formatFileSize(context, this.f141228b));
            sb6.append(", pool size: ");
            sb6.append(Formatter.formatFileSize(context, this.f141227a));
            sb6.append(", byte array size: ");
            sb6.append(Formatter.formatFileSize(context, i));
            sb6.append(", memory class limited? ");
            sb6.append(i3 > iRound);
            sb6.append(", max size: ");
            sb6.append(Formatter.formatFileSize(context, iRound));
            sb6.append(", memoryClass: ");
            sb6.append(activityManager.getMemoryClass());
            sb6.append(", isLowMemoryDevice: ");
            sb6.append(activityManager.isLowRamDevice());
            sb6.toString();
        }
    }
}
