package com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0495a f74285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f74286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f74287c;

    /* JADX INFO: renamed from: com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.a$a, reason: collision with other inner class name */
    public static final class C0495a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f74288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f74289b;

        public C0495a() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0495a)) {
                return false;
            }
            C0495a c0495a = (C0495a) obj2;
            return this.f74288a == c0495a.f74288a && this.f74289b == c0495a.f74289b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f74289b) + (Boolean.hashCode(this.f74288a) * 31);
        }

        public /* synthetic */ C0495a(int i) {
            this(false, true);
        }

        public C0495a(boolean z, boolean z3) {
            this.f74288a = z;
            this.f74289b = z3;
        }
    }

    public a() {
        this(0);
    }

    public static a a(a aVar, C0495a banner, i calendarEventsInfo, Data transactionContent, int i) {
        if ((i & 1) != 0) {
            banner = aVar.f74285a;
        }
        if ((i & 2) != 0) {
            calendarEventsInfo = aVar.f74286b;
        }
        if ((i & 4) != 0) {
            transactionContent = aVar.f74287c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(calendarEventsInfo, "calendarEventsInfo");
        Intrinsics.checkNotNullParameter(transactionContent, "transactionContent");
        return new a(banner, calendarEventsInfo, transactionContent);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f74285a, aVar.f74285a) && Intrinsics.f(this.f74286b, aVar.f74286b) && Intrinsics.f(this.f74287c, aVar.f74287c);
    }

    public final int hashCode() {
        return this.f74287c.hashCode() + r6.b.f(this.f74286b, this.f74285a.hashCode() * 31, 31);
    }

    public a(C0495a banner, i calendarEventsInfo, Data transactionContent) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(calendarEventsInfo, "calendarEventsInfo");
        Intrinsics.checkNotNullParameter(transactionContent, "transactionContent");
        this.f74285a = banner;
        this.f74286b = calendarEventsInfo;
        this.f74287c = transactionContent;
    }

    public /* synthetic */ a(int i) {
        C0495a c0495a = new C0495a(0);
        h hVar = i.Companion;
        Data data = new Data(null, null, true, 3, null);
        hVar.getClass();
        this(c0495a, h.a(data), new Data(null, null, true, 3, null));
    }
}
