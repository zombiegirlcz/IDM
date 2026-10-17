package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class y20 extends kh0 {

    public static abstract class a extends y20 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.y20$a$a, reason: collision with other inner class name */
        public static final class C0313a extends a {
            public C0313a() {
                super("document_expired", null);
            }
        }

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private a(String str) {
            super(str, null);
        }
    }

    public static abstract class b extends y20 {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final fd f35144a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final gm f35145b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fd country) {
                super("nationality_not_matching", null);
                Intrinsics.checkNotNullParameter(country, "country");
                this.f35144a = country;
                this.f35145b = gm.f28932a;
            }

            public final fd a() {
                return this.f35144a;
            }

            public final gm b() {
                return this.f35145b;
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.y20$b$b, reason: collision with other inner class name */
        public static final class C0314b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final fd f35146a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final KycError.NationalityNotSupported f35147b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0314b(fd country) {
                super("nationality_not_supported", null);
                Intrinsics.checkNotNullParameter(country, "country");
                this.f35146a = country;
                this.f35147b = KycError.NationalityNotSupported.INSTANCE;
            }

            public final fd a() {
                return this.f35146a;
            }

            public final KycError.NationalityNotSupported b() {
                return this.f35147b;
            }
        }

        public static final class c extends b {
            public c() {
                super("person_underage", null);
            }
        }

        public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private b(String str) {
            super(str, null);
        }
    }

    public static final class c extends y20 {
        public c() {
            super("empty", null);
        }
    }

    public static final class d extends y20 {
        public d() {
            super("invalid", null);
        }
    }

    public /* synthetic */ y20(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private y20(String str) {
        super(null, null, str, 3, null);
    }
}
