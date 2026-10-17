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
public final class tu implements gq0.b {
    public static final a f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f33874g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f33875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f33876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bs f33877c;
    private final hq0 d;
    private final Lazy e;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.tu$a$a, reason: collision with other inner class name */
        public static final class C0289a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0289a f33878a = new C0289a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f33879b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f33880c = "eid_can_recovery";

            private C0289a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f33879b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f33880c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public tu(fe1 viewNavigator, v10 imageServiceLocator, bs bundle) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f33875a = viewNavigator;
        this.f33876b = imageServiceLocator;
        this.f33877c = bundle;
        this.d = a.C0289a.f33878a;
        this.e = yhm.j.b(new xr1(this, 10));
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
        this.f33875a.b(cv.b.f27558a);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(tu tuVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(tuVar.f33876b.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_eid_second_incorrect_pin_germany, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_enter_can, 0, 2, null)), new kd1.j(c81.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void a() {
        this.f33875a.b(cv.c.f27559a);
    }
}
