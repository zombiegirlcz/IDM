package com.google.firebase.messaging;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f49557b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f49558a;

    public final synchronized x a() {
        String str;
        x xVar;
        u uVar = this.f49558a;
        synchronized (((ArrayDeque) uVar.d)) {
            str = (String) ((ArrayDeque) uVar.d).peek();
        }
        Pattern pattern = x.d;
        xVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                xVar = new x(strArrSplit[0], strArrSplit[1]);
            }
        }
        return xVar;
    }
}
