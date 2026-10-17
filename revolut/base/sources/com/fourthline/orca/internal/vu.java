package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.cv;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vu implements gq0.b {
    public static final a f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34454g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f34455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f34456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bs f34457c;
    private final hq0 d;
    private final Lazy e;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vu$a$a, reason: collision with other inner class name */
        public static final class C0301a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0301a f34458a = new C0301a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f34459b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f34460c = "eid_can_not_correct";

            private C0301a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f34459b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f34460c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public vu(fe1 viewNavigator, v10 imageServiceLocator, bs bundle) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f34455a = viewNavigator;
        this.f34456b = imageServiceLocator;
        this.f34457c = bundle;
        this.d = a.C0301a.f34458a;
        this.e = yhm.j.b(new xr1(this, 20));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f34455a.b(cv.b.f27558a);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(vu vuVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(vuVar.f34456b.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_incorrect_can_number, 0, 2, null), new kd1.k(null, 1, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void a() {
        this.f34455a.b(cv.c.f27559a);
    }
}
