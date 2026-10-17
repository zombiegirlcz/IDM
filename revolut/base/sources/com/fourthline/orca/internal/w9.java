package com.fourthline.orca.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class w9 implements v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34552a;

    public w9(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34552a = context;
    }

    @Override // com.fourthline.orca.internal.v9
    public String a() {
        try {
            Object systemService = this.f34552a.getSystemService("phone");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((TelephonyManager) systemService).getSimCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }
}
