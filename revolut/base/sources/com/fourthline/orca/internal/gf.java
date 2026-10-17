package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface gf extends qg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28858a = a.f28859a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f28859a = new a();

        private a() {
        }
    }

    public static final class b implements gf {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ff f28860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ef f28861c;
        private final String d;

        public b(ff config, ef bundle, String fileName) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.f28860b = config;
            this.f28861c = bundle;
            this.d = fileName;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f28860b, bVar.f28860b) && Intrinsics.f(this.f28861c, bVar.f28861c) && Intrinsics.f(this.d, bVar.d);
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return zhm.r0.k(new Pair("name", "device_data_failed"), new Pair("details", hf.b(this.f28860b, this.f28861c, this.d)));
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getEventName() {
            return super.getEventName();
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getSchema() {
            return super.getSchema();
        }

        public int hashCode() {
            return (((this.f28860b.hashCode() * 31) + this.f28861c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "DeviceDataFailed(config=" + this.f28860b + ", bundle=" + this.f28861c + ", fileName=" + this.d + ")";
        }
    }

    public static final class c implements gf {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f28862b = new c();

        private c() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return zhm.q0.c(new Pair("name", "device_data_failed"));
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getEventName() {
            return super.getEventName();
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getSchema() {
            return super.getSchema();
        }

        public int hashCode() {
            return -1645628418;
        }

        public String toString() {
            return "DeviceDataFailedNoData";
        }
    }

    public static final class d implements gf {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ff f28863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ef f28864c;
        private final String d;

        public d(ff config, ef bundle, String fileName) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.f28863b = config;
            this.f28864c = bundle;
            this.d = fileName;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.f28863b, dVar.f28863b) && Intrinsics.f(this.f28864c, dVar.f28864c) && Intrinsics.f(this.d, dVar.d);
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return zhm.r0.k(new Pair("name", "device_data_uploaded"), new Pair("details", hf.b(this.f28863b, this.f28864c, this.d)));
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getEventName() {
            return super.getEventName();
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getSchema() {
            return super.getSchema();
        }

        public int hashCode() {
            return (((this.f28863b.hashCode() * 31) + this.f28864c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "DeviceDataUploaded(config=" + this.f28863b + ", bundle=" + this.f28864c + ", fileName=" + this.d + ")";
        }
    }

    public static final class e implements gf {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28865b;

        public e(String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.f28865b = fileName;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f28865b, ((e) obj2).f28865b);
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return zhm.r0.k(new Pair("name", "motion_data_failed"), new Pair("details", zhm.q0.c(new Pair("file_name", this.f28865b))));
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getEventName() {
            return super.getEventName();
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getSchema() {
            return super.getSchema();
        }

        public int hashCode() {
            return this.f28865b.hashCode();
        }

        public String toString() {
            return "MotionDataFailed(fileName=" + this.f28865b + ")";
        }
    }

    public static final class f implements gf {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28866b;

        public f(String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.f28866b = fileName;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.f28866b, ((f) obj2).f28866b);
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return zhm.r0.k(new Pair("name", "motion_data_uploaded"), new Pair("details", zhm.q0.c(new Pair("file_name", this.f28866b))));
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getEventName() {
            return super.getEventName();
        }

        @Override // com.fourthline.orca.internal.gf, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ String getSchema() {
            return super.getSchema();
        }

        public int hashCode() {
            return this.f28866b.hashCode();
        }

        public String toString() {
            return "MotionDataUploaded(fileName=" + this.f28866b + ")";
        }
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    @NotNull
    default Map getAttributes() {
        return zhm.r0.g();
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    default String getEventName() {
        return "app_event";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    default String getSchema() {
        return "iglu:com.fourthline.sdk/app_event/jsonschema/1-0-0";
    }
}
