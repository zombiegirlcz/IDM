package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s5 implements gq0.b {
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f32903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f32904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hq0 f32905c;
    private final zp0 d;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.s5$a$a, reason: collision with other inner class name */
        public static final class C0279a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0279a f32906a = new C0279a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f32907b = "bav";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32908c = "transfer_aborted";

            private C0279a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f32907b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f32908c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public s5(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f32903a = viewNavigator;
        this.f32904b = imageServiceLocator;
        this.f32905c = a.C0279a.f32906a;
        c81.a aVar = c81.f27404a;
        this.d = new zp0.e(imageServiceLocator.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_bav_required_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_retry, 0, 2, null)), null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f32905c;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f32903a.b(l6.f30526a);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }
}
