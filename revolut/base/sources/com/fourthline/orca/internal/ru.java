package com.fourthline.orca.internal;

import android.content.Context;
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
public final class ru implements gq0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f32832g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f32833h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f32834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f32835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bs f32836c;
    private final Context d;
    private final hq0 e;
    private final Lazy f;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ru$a$a, reason: collision with other inner class name */
        public static final class C0277a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0277a f32837a = new C0277a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f32838b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32839c = "eid_card_blocked";

            private C0277a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f32838b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f32839c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ru(fe1 viewNavigator, v10 imageServiceLocator, bs bundle, Context context) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32834a = viewNavigator;
        this.f32835b = imageServiceLocator;
        this.f32836c = bundle;
        this.d = context;
        this.e = a.C0277a.f32837a;
        this.f = yhm.j.b(new xr1(this, 3));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        ng0.a(this.d);
        this.f32834a.b(cv.c.f27559a);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(ru ruVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(ruVar.f32835b.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_eid_third_incorrect_pin_germany, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_go_to_ausweisapp, 0, 2, null)), new kd1.j(c81.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void a() {
        this.f32834a.b(cv.c.f27559a);
    }
}
