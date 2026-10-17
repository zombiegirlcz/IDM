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
public final class uu implements gq0.b {
    public static final a f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34185g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f34186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f34187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bs f34188c;
    private final hq0 d;
    private final Lazy e;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.uu$a$a, reason: collision with other inner class name */
        public static final class C0294a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0294a f34189a = new C0294a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f34190b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f34191c = "eid_generic";

            private C0294a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f34190b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f34191c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public uu(fe1 viewNavigator, v10 imageServiceLocator, bs bundle) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f34186a = viewNavigator;
        this.f34187b = imageServiceLocator;
        this.f34188c = bundle;
        this.d = a.C0294a.f34189a;
        this.e = yhm.j.b(new xr1(this, 15));
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
        this.f34188c.b(false);
        this.f34186a.b(cv.c.f27559a);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.e.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(uu uuVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(uuVar.f34187b.a(r10.F0), c81.a.a(aVar, R.string.shared_dialog_error_eid_unrecoverable_germany, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), null, false, 24, null);
    }
}
