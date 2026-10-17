package com.fourthline.orca.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class tg0 {
    public static final void a(Context context) {
        ib.h hVar;
        Intrinsics.checkNotNullParameter(context, "context");
        ib.h hVar2 = hb.a.f150532a;
        Intrinsics.checkNotNullParameter("Ten-fourthlineFL", "tenantId");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!hb.a.f150533b) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                hVar = new ib.h(context);
            } catch (Throwable th10) {
                if (th10 instanceof InvocationTargetException) {
                    th10.getTargetException();
                }
                hVar = null;
            }
            hb.a.f150532a = hVar;
            hb.a.f150533b = hVar != null;
        }
        hb.a.e(hb.b.PENDING);
    }
}
