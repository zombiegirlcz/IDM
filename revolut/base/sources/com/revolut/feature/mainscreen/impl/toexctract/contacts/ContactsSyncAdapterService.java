package com.revolut.feature.mainscreen.impl.toexctract.contacts;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v49.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/mainscreen/impl/toexctract/contacts/ContactsSyncAdapterService;", "Landroid/app/Service;", "<init>", "()V", "Companion", "a", "retail_feature_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactsSyncAdapterService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f78086a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f78087b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        a aVar = f78087b;
        if (aVar != null) {
            return aVar.getSyncAdapterBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        synchronized (f78086a) {
            try {
                if (f78087b == null) {
                    Context context = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    f78087b = new a(context, true);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
