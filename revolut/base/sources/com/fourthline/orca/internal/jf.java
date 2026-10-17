package com.fourthline.orca.internal;

import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jf implements DeviceDataCollector {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf f29870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f29871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f29872c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public jf(kf factory, Function0 deviceDataCollectionProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(deviceDataCollectionProvider, "deviceDataCollectionProvider");
        this.f29870a = factory;
        this.f29871b = deviceDataCollectionProvider;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        try {
            ff ffVar = (ff) this.f29871b.invoke();
            ffVar.getEnabled();
            if (this.f29872c == null) {
                List listA = this.f29870a.a(ffVar);
                this.f29872c = listA;
                if (listA != null) {
                    listA.size();
                }
            }
            List list = this.f29872c;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    ((DeviceDataCollector) it8.next()).startDataCollection();
                }
            }
        } catch (Exception e2) {
            ib.d dVar = new ib.d(2, "device_data_failed", e2, null);
            ib.h hVar = hb.a.f150532a;
            if (hVar != null) {
                hVar.f(dVar);
            }
        }
    }
}
