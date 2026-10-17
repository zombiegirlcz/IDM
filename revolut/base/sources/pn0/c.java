package pn0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jli.g;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f237652a;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f237652a = context;
    }

    public static ArrayList a(List list, MessageDigest messageDigest) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            messageDigest.update(((Signature) it8.next()).toByteArray());
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
            arrayList.add(g.i(bArrDigest));
        }
        return arrayList;
    }

    public final List b(String str) {
        Context context = this.f237652a;
        if (str == null) {
            str = context.getPackageName();
        }
        List listV0 = null;
        try {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo;
            Signature[] signingCertificateHistory = (signingInfo == null || !signingInfo.hasMultipleSigners()) ? signingInfo != null ? signingInfo.getSigningCertificateHistory() : null : signingInfo.getApkContentsSigners();
            if (signingCertificateHistory != null) {
                listV0 = d.v0(signingCertificateHistory);
            }
        } catch (Exception e) {
            e = e;
            if (e instanceof PackageManager.NameNotFoundException) {
                e = null;
            }
            if (e != null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        return listV0 == null ? f0.f322471a : listV0;
    }

    public final ArrayList c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        return a(b(str), messageDigest);
    }
}
