package vc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.revolut.kompot.common.ui.RevolutKompotFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.bouncycastle.asn1.eac.CertificateBody;
import ukm.c0;
import ukm.u;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ecm.q f287601a;

    public static ukm.q a(int i, ukm.f fVar, Function1 function1, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            fVar = ukm.f.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        if (i == -2) {
            if (fVar != ukm.f.SUSPEND) {
                return new c0(1, fVar, function1);
            }
            u.E1.getClass();
            return new ukm.q(ukm.t.f280840b, function1);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? fVar == ukm.f.SUSPEND ? new ukm.q(i, function1) : new c0(i, fVar, function1) : new ukm.q(Integer.MAX_VALUE, function1) : fVar == ukm.f.SUSPEND ? new ukm.q(0, function1) : new c0(1, fVar, function1);
        }
        if (fVar == ukm.f.SUSPEND) {
            return new c0(1, ukm.f.DROP_OLDEST, function1);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final rr0.g b(View hostView, boolean z) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        return new rr0.g(hostView, (rr0.d) hostView, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rr0.g c(koi.b viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return d(viewHolder, (rr0.d) viewHolder, null, 4);
    }

    public static rr0.g d(koi.b viewHolder, rr0.d callback, fu0.h highlightTarget, int i) {
        if ((i & 4) != 0) {
            highlightTarget = new fu0.l(viewHolder);
        }
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(highlightTarget, "highlightTarget");
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        rr0.g gVar = new rr0.g(itemView, callback, true);
        gVar.f(highlightTarget);
        return gVar;
    }

    public static void e(int i, int i2) {
        String strB;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strB = com.bumptech.glide.c.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a0.d.n("negative size: ", i2));
                }
                strB = com.bumptech.glide.c.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void f(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? l(i, i3, "start index") : (i2 < 0 || i2 > i3) ? l(i2, i3, "end index") : com.bumptech.glide.c.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static final String g(String str) {
        if (str == null || d0.W(str)) {
            m70.a.c(t0.f186434a);
            return "";
        }
        StringBuilder sb6 = new StringBuilder(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((Intrinsics.k(cCharAt, 31) <= 0 && cCharAt != '\t') || Intrinsics.k(cCharAt, CertificateBody.profileType) >= 0) {
                sb6.setCharAt(i, '_');
            }
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static void h(Object obj2, Class cls) {
        if (obj2 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void i(Object obj2, String str) {
        if (obj2 == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public static void k(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static String l(int i, int i2, String str) {
        if (i < 0) {
            return com.bumptech.glide.c.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.bumptech.glide.c.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a0.d.n("negative size: ", i2));
    }

    public static boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            pd.g.c();
            pd.g gVarC = pd.g.c();
            gVarC.a();
            Context context = gVarC.f235023a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            return false;
        }
    }

    public static final him.a n(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new him.a(entries);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(android.content.Intent r11) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.s.o(android.content.Intent):void");
    }

    public static void p(Bundle bundle, String str) {
        try {
            pd.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                }
            }
            String str2 = zjh.f.v(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String str3 = "Logging to scion event=" + str + " scionPayload=" + bundle2;
            }
            td.b bVar = (td.b) pd.g.c().b(td.b.class);
            if (bVar != null) {
                ((td.c) bVar).a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final void q(RevolutKompotFragment revolutKompotFragment, gki.d hook, gki.c key) {
        Intrinsics.checkNotNullParameter(revolutKompotFragment, "<this>");
        Intrinsics.checkNotNullParameter(hook, "hook");
        Intrinsics.checkNotNullParameter(key, "key");
        uji.b bVar = (uji.b) revolutKompotFragment.f98377b0.getValue();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(hook, "hook");
        Intrinsics.checkNotNullParameter(key, "key");
        bVar.f.put(key, hook);
    }

    public static boolean r(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final ArrayList s(pk0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List<pk0.b> listB = aVar.getEntries();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        for (pk0.b bVar : listB) {
            arrayList.add(new qk0.b(bVar.getKey(), bVar.getValue(), null));
        }
        return arrayList;
    }

    public static final ao.h t(com.revolut.kompot.navigable.a aVar, Function1 viewBindingProvider) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingProvider, "viewBindingProvider");
        return new ao.h(aVar, viewBindingProvider);
    }
}
