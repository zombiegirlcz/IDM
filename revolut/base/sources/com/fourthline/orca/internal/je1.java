package com.fourthline.orca.internal;

import android.content.Context;
import androidx.core.content.ContextCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class je1 implements sj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f29869b;

    public je1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29868a = context;
        this.f29869b = zhm.u.c("android.permission.CAMERA");
    }

    @Override // com.fourthline.orca.internal.sj0
    public boolean a() {
        List list = this.f29869b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (ContextCompat.checkSelfPermission(this.f29868a, (String) it8.next()) != 0) {
                return false;
            }
        }
        return true;
    }
}
