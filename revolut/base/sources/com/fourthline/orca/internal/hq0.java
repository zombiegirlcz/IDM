package com.fourthline.orca.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface hq0 {

    public static final class a implements hq0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29371a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f29372b = "n/a";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f29373c = "camera_permission";

        private a() {
        }

        @Override // com.fourthline.orca.internal.hq0
        public String a() {
            return f29372b;
        }

        @Override // com.fourthline.orca.internal.hq0
        public String getName() {
            return f29373c;
        }
    }

    public static final class b implements hq0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29374a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f29375b = "n/a";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f29376c = "cancel_flow";

        private b() {
        }

        @Override // com.fourthline.orca.internal.hq0
        public String a() {
            return f29375b;
        }

        @Override // com.fourthline.orca.internal.hq0
        public String getName() {
            return f29376c;
        }
    }

    String a();

    String getName();

    public static final class c implements hq0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kh0 f29377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function0 f29379c;

        public c(kh0 error, String source, Function0 onRetry) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(onRetry, "onRetry");
            this.f29377a = error;
            this.f29378b = source;
            this.f29379c = onRetry;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b() {
            return Unit.f186387a;
        }

        @Override // com.fourthline.orca.internal.hq0
        public String a() {
            return this.f29378b;
        }

        public final kh0 c() {
            return this.f29377a;
        }

        public final Function0 d() {
            return this.f29379c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f29377a, cVar.f29377a) && Intrinsics.f(this.f29378b, cVar.f29378b) && Intrinsics.f(this.f29379c, cVar.f29379c);
        }

        @Override // com.fourthline.orca.internal.hq0
        public String getName() {
            return this.f29377a.getAlias();
        }

        public int hashCode() {
            return (((this.f29377a.hashCode() * 31) + this.f29378b.hashCode()) * 31) + this.f29379c.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f29377a + ", source=" + this.f29378b + ", onRetry=" + this.f29379c + ")";
        }

        public /* synthetic */ c(kh0 kh0Var, String str, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kh0Var, (i & 2) != 0 ? "n/a" : str, (i & 4) != 0 ? new dl1(26) : function0);
        }
    }
}
