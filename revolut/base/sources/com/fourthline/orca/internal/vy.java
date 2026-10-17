package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vy implements gq0.b {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f34472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq0 f34473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f34474c;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vy$a$a, reason: collision with other inner class name */
        public static final class C0302a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0302a f34475a = new C0302a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f34476b = "verification_type";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f34477c = "eid_verification_type_error";

            private C0302a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f34476b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f34477c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public vy(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f34472a = imageServiceLocator;
        this.f34473b = a.C0302a.f34475a;
        this.f34474c = yhm.j.b(new xr1(this, 22));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f34473b;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void d() {
        super.d();
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f34474c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(vy vyVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(vyVar.f34472a.a(r10.F0), c81.a.a(aVar, R.string.shared_dialog_error_eid_unrecoverable_germany, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), null, false, 24, null);
    }
}
