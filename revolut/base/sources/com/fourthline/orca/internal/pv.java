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
public final class pv implements gq0.b {
    public static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f32051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f32052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hq0 f32053c;
    private final Lazy d;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pv$a$a, reason: collision with other inner class name */
        public static final class C0266a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0266a f32054a = new C0266a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f32055b = "eid_upload";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32056c = "eid_upload_another_type_error";

            private C0266a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f32055b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f32056c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public pv(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f32051a = viewNavigator;
        this.f32052b = imageServiceLocator;
        this.f32053c = a.C0266a.f32054a;
        this.d = yhm.j.b(new ko1(this, 24));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f32053c;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f32051a.b(cv.c.f27559a);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(pv pvVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(pvVar.f32052b.a(r10.F0), c81.a.a(aVar, R.string.shared_dialog_error_eid_unrecoverable_germany, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), null, false, 24, null);
    }
}
