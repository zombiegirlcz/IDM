package uh0;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import vc.o;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f280049a = new a();

    private a() {
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        uc.a.d(context, false);
    }

    public final void b(Context context, LinkedHashSet libs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(libs, "libs");
        Iterator it8 = libs.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            int i = vc.a.f287570a;
            synchronized (o.class) {
                try {
                    System.loadLibrary(str);
                } catch (UnsatisfiedLinkError e) {
                    String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                    if (!new File(str2).exists()) {
                        throw e;
                    }
                    System.load(str2);
                }
            }
        }
    }
}
