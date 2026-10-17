package ch;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import bmm.k0;
import com.google.android.gms.internal.mlkit_common.zzss;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import l8.d0;
import sgm.v4;
import tfm.u4;
import tfm.y4;

/* JADX INFO: loaded from: classes.dex */
public final class b implements k0, ce.f, ge.a, d0, lj.e, kfm.g, r8.g, re.a, u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24014a;

    public /* synthetic */ b(int i) {
        this.f24014a = i;
    }

    @Override // r8.g
    public void a(FragmentActivity fragmentActivity) {
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        mo3.a.m(new OnErrorNotImplementedException((Throwable) obj2));
    }

    @Override // lj.e
    public byte[] b(byte[] bArr) {
        return bArr;
    }

    @Override // tfm.u4
    public y4 call() {
        return new v4();
    }

    @Override // lj.e
    public byte[] encrypt(byte[] bArr) {
        return bArr;
    }

    @Override // ge.a
    public void i(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
    }

    @Override // l8.d0
    public void k(MediaExtractor mediaExtractor, Object obj2) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj2;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // l8.d0
    public void l(MediaMetadataRetriever mediaMetadataRetriever, Object obj2) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj2;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // ce.f
    public Object m(ce.v vVar) {
        switch (this.f24014a) {
            case 2:
                return new l((Context) vVar.a(Context.class));
            case 20:
                return new i();
            default:
                zzss.zzb("common");
                return new ah.a(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // re.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.StackTraceElement[] n(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r2
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.b.n(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    public b(lal.j stubImpl, lal.j realImpl, kla.a productIntroToggleResolver) {
        this.f24014a = 10;
        Intrinsics.checkNotNullParameter(stubImpl, "stubImpl");
        Intrinsics.checkNotNullParameter(realImpl, "realImpl");
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
    }
}
