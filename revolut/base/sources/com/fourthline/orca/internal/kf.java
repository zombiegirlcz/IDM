package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.Context;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class kf {
    public static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f30262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AndroidDataCollectorHelper f30263c;
    private final ef d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public kf(Context context, Activity activity, AndroidDataCollectorHelper androidDataCollectorHelper, ef deviceDataBundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(androidDataCollectorHelper, "androidDataCollectorHelper");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        this.f30261a = context;
        this.f30262b = activity;
        this.f30263c = androidDataCollectorHelper;
        this.d = deviceDataBundle;
    }

    public final List a(ff config) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.getEnabled();
        return zhm.v.k(new uz(this.d.e(), config.getEnabled()), new c3(this.f30263c, this.d.a(), config.getEnabled() && config.getBattery().getEnabled()), new u9(this.f30263c, this.d.b(), config.getEnabled() && config.getCellular().getEnabled()), new jw(this.f30263c, this.d.d(), config.getEnabled() && config.getEnvironment().getEnabled()), new f00(this.f30263c, this.d.f(), config.getEnabled() && config.getGps().getEnabled()), new a10(this.f30263c, this.d.g(), config.getEnabled() && config.getHardware().getEnabled()), new a60(this.d.h(), config.getEnabled() && config.getLocale().getEnabled()), new w90(this.f30263c, this.d.k(), config.getEnabled() && config.getNetwork().getEnabled()), new tz0(this.f30263c, this.d.m(), config.getEnabled() && config.getIb.b.Screen java.lang.String().getEnabled()), new t71(this.f30261a, this.f30262b, this.d.o(), config.getEnabled() && config.getSystem().getEnabled()), new h9(this.d.l(), this.d.g(), config.getEnabled() && config.getHardware().getEnabled()));
    }
}
