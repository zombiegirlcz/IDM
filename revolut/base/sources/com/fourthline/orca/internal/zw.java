package com.fourthline.orca.internal;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class zw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f35734c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f35736b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public zw(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35735a = context;
        this.f35736b = yhm.j.b(new ht1(this, 20));
    }

    private final SharedPreferences a() {
        return (SharedPreferences) this.f35736b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences a(zw zwVar) {
        return zwVar.f35735a.getSharedPreferences("EtagPreference", 0);
    }

    public final String a(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return a().getString(filename, null);
    }

    public final void a(String filename, String value) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(value, "value");
        a().edit().putString(filename, value).apply();
    }
}
