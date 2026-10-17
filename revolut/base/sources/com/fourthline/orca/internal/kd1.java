package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface kd1 {

    public static final class a implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30208b;

        public a(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30207a = resource;
            this.f30208b = "cancel";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f30207a, ((a) obj2).f30207a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30208b;
        }

        public int hashCode() {
            return this.f30207a.hashCode();
        }

        public String toString() {
            return "Cancel(resource=" + this.f30207a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30207a;
        }

        public /* synthetic */ a(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.a.a(c81.f27404a, R.string.shared_button_cancel, 0, 2, null) : c81Var);
        }
    }

    public static final class b implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30209a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c81 f30210b = c81.a.a(c81.f27404a, R.string.shared_button_close, 0, 2, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f30211c = "close";
        public static final int d = 8;

        private b() {
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return f30211c;
        }

        public int hashCode() {
            return -783165290;
        }

        public String toString() {
            return "Close";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return f30210b;
        }
    }

    public static final class c implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30213b;

        public c(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30212a = resource;
            this.f30213b = "collapse";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f30212a, ((c) obj2).f30212a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30213b;
        }

        public int hashCode() {
            return this.f30212a.hashCode();
        }

        public String toString() {
            return "Collapse(resource=" + this.f30212a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30212a;
        }

        public /* synthetic */ c(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.b.f27406b : c81Var);
        }
    }

    public static final class d implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30215b;

        public d(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30214a = resource;
            this.f30215b = "continue";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f30214a, ((d) obj2).f30214a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30215b;
        }

        public int hashCode() {
            return this.f30214a.hashCode();
        }

        public String toString() {
            return "Continue(resource=" + this.f30214a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30214a;
        }

        public /* synthetic */ d(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.a.a(c81.f27404a, R.string.shared_button_continue, 0, 2, null) : c81Var);
        }
    }

    public static final class e implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30217b;

        public e(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30216a = resource;
            this.f30217b = "download";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f30216a, ((e) obj2).f30216a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30217b;
        }

        public int hashCode() {
            return this.f30216a.hashCode();
        }

        public String toString() {
            return "Download(resource=" + this.f30216a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30216a;
        }

        public /* synthetic */ e(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.b.f27406b : c81Var);
        }
    }

    public static final class f implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30219b;

        public f(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30218a = resource;
            this.f30219b = "exit";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.f30218a, ((f) obj2).f30218a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30219b;
        }

        public int hashCode() {
            return this.f30218a.hashCode();
        }

        public String toString() {
            return "Exit(resource=" + this.f30218a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30218a;
        }

        public /* synthetic */ f(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.a.a(c81.f27404a, R.string.shared_button_exit, 0, 2, null) : c81Var);
        }
    }

    public static final class g implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30221b;

        public g(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30220a = resource;
            this.f30221b = "expand";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.f30220a, ((g) obj2).f30220a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30221b;
        }

        public int hashCode() {
            return this.f30220a.hashCode();
        }

        public String toString() {
            return "Expand(resource=" + this.f30220a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30220a;
        }

        public /* synthetic */ g(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.b.f27406b : c81Var);
        }
    }

    public static final class h implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30224c;
        private final c81 d;

        public h(String value, String accessibilityValue) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(accessibilityValue, "accessibilityValue");
            this.f30222a = value;
            this.f30223b = accessibilityValue;
            this.f30224c = "undefined";
            this.d = c81.b.f27406b;
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.d;
        }

        @Override // com.fourthline.orca.internal.kd1
        public String b(Composer composer, int i) {
            composer.startReplaceGroup(-1556611678);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1556611678, i, -1, "com.fourthline.orca.core.internal.composable.intent.UxIntent.LegacyString.getLabel (UxIntent.kt:31)");
            }
            String str = this.f30222a;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return str;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.f30222a, hVar.f30222a) && Intrinsics.f(this.f30223b, hVar.f30223b);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30224c;
        }

        public int hashCode() {
            return (this.f30222a.hashCode() * 31) + this.f30223b.hashCode();
        }

        public String toString() {
            return "LegacyString(value=" + this.f30222a + ", accessibilityValue=" + this.f30223b + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public String a(Composer composer, int i) {
            composer.startReplaceGroup(-1851447872);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1851447872, i, -1, "com.fourthline.orca.core.internal.composable.intent.UxIntent.LegacyString.getAccessibilityLabel (UxIntent.kt:36)");
            }
            String str = this.f30223b;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return str;
        }

        public /* synthetic */ h(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? str : str2);
        }
    }

    public static final class i implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30226b;

        public i(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30225a = resource;
            this.f30226b = "open";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof i) && Intrinsics.f(this.f30225a, ((i) obj2).f30225a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30226b;
        }

        public int hashCode() {
            return this.f30225a.hashCode();
        }

        public String toString() {
            return "Open(resource=" + this.f30225a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30225a;
        }

        public /* synthetic */ i(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.b.f27406b : c81Var);
        }
    }

    public static final class j implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30228b;

        public j(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30227a = resource;
            this.f30228b = "resolve";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof j) && Intrinsics.f(this.f30227a, ((j) obj2).f30227a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30228b;
        }

        public int hashCode() {
            return this.f30227a.hashCode();
        }

        public String toString() {
            return "Resolve(resource=" + this.f30227a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30227a;
        }
    }

    public static final class k implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30230b;

        public k(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30229a = resource;
            this.f30230b = "retry";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof k) && Intrinsics.f(this.f30229a, ((k) obj2).f30229a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30230b;
        }

        public int hashCode() {
            return this.f30229a.hashCode();
        }

        public String toString() {
            return "Retry(resource=" + this.f30229a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30229a;
        }

        public /* synthetic */ k(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.a.a(c81.f27404a, R.string.shared_button_retry, 0, 2, null) : c81Var);
        }
    }

    public static final class l implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f30231a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c81 f30232b = c81.a.a(c81.f27404a, R.string.step_document_nfc_intro_button_start_nfc_scan, 0, 2, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f30233c = "scan_chip";
        public static final int d = 8;

        private l() {
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof l);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return f30233c;
        }

        public int hashCode() {
            return 1296425227;
        }

        public String toString() {
            return "ScanChip";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return f30232b;
        }
    }

    public static final class m implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30235b;

        public m(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30234a = resource;
            this.f30235b = "share";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof m) && Intrinsics.f(this.f30234a, ((m) obj2).f30234a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30235b;
        }

        public int hashCode() {
            return this.f30234a.hashCode();
        }

        public String toString() {
            return "Share(resource=" + this.f30234a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30234a;
        }

        public /* synthetic */ m(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.b.f27406b : c81Var);
        }
    }

    public static final class n implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30237b;

        public n(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30236a = resource;
            this.f30237b = "skip";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof n) && Intrinsics.f(this.f30236a, ((n) obj2).f30236a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30237b;
        }

        public int hashCode() {
            return this.f30236a.hashCode();
        }

        public String toString() {
            return "Skip(resource=" + this.f30236a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30236a;
        }

        public /* synthetic */ n(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.b.f27406b : c81Var);
        }
    }

    public static final class o implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30239b;

        public o(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30238a = resource;
            this.f30239b = "take_photo";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof o) && Intrinsics.f(this.f30238a, ((o) obj2).f30238a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30239b;
        }

        public int hashCode() {
            return this.f30238a.hashCode();
        }

        public String toString() {
            return "TakePhoto(resource=" + this.f30238a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30238a;
        }

        public /* synthetic */ o(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.b.f27406b : c81Var);
        }
    }

    public static final class p implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30241b;

        public p(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30240a = resource;
            this.f30241b = "undefined";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof p) && Intrinsics.f(this.f30240a, ((p) obj2).f30240a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30241b;
        }

        public int hashCode() {
            return this.f30240a.hashCode();
        }

        public String toString() {
            return "Undefined(resource=" + this.f30240a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30240a;
        }
    }

    public static final class q implements kd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f30242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30243b;

        public q(c81 resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f30242a = resource;
            this.f30243b = "upload_photo";
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String a(Composer composer, int i) {
            return super.a(composer, i);
        }

        @Override // com.fourthline.orca.internal.kd1
        public /* bridge */ String b(Composer composer, int i) {
            return super.b(composer, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof q) && Intrinsics.f(this.f30242a, ((q) obj2).f30242a);
        }

        @Override // com.fourthline.orca.internal.kd1
        public String getAlias() {
            return this.f30243b;
        }

        public int hashCode() {
            return this.f30242a.hashCode();
        }

        public String toString() {
            return "UploadPhoto(resource=" + this.f30242a + ")";
        }

        @Override // com.fourthline.orca.internal.kd1
        public c81 a() {
            return this.f30242a;
        }

        public /* synthetic */ q(c81 c81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? c81.b.f27406b : c81Var);
        }
    }

    c81 a();

    default String a(Composer composer, int i2) {
        composer.startReplaceGroup(82662274);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(82662274, i2, -1, "com.fourthline.orca.core.internal.composable.intent.UxIntent.getAccessibilityLabel (UxIntent.kt:21)");
        }
        String strA = d81.a(a(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strA;
    }

    default String b(Composer composer, int i2) {
        composer.startReplaceGroup(188797664);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(188797664, i2, -1, "com.fourthline.orca.core.internal.composable.intent.UxIntent.getLabel (UxIntent.kt:16)");
        }
        String strC = d81.c(a(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strC;
    }

    String getAlias();
}
