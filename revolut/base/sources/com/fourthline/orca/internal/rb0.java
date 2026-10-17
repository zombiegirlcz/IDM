package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.internal.identifiers.AppTrackerIdProvider;
import com.fourthline.core.internal.identifiers.UserIdProvider;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rb0 implements gh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib0 f32675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeviceMetadata f32676c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32678b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f32678b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = rb0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public rb0(Context context, ib0 networkService, DeviceMetadata deviceMetadata) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(deviceMetadata, "deviceMetadata");
        this.f32674a = context;
        this.f32675b = networkService;
        this.f32676c = deviceMetadata;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.gh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.gh1.a r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.rb0.a(com.fourthline.orca.internal.gh1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final lf a() {
        String value = new AppTrackerIdProvider(this.f32674a).getValue();
        return new lf(this.f32676c.getLanguage(), this.f32676c.getSdkVersion(), "android", this.f32676c.getModel(), this.f32676c.getOsCompromised(), this.f32676c.getOsVersion(), new UserIdProvider(this.f32674a).getValue(), value, this.f32676c.getRegion());
    }
}
