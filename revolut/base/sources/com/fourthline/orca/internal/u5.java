package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class u5 implements gq0.b {
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f33957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f33958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hq0 f33959c;
    private final zp0 d;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.u5$a$a, reason: collision with other inner class name */
        public static final class C0291a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0291a f33960a = new C0291a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f33961b = "bav";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f33962c = "transfer_missing_data";

            private C0291a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f33961b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f33962c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public u5(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f33957a = viewNavigator;
        this.f33958b = imageServiceLocator;
        this.f33959c = a.C0291a.f33960a;
        c81.a aVar = c81.f27404a;
        this.d = new zp0.e(imageServiceLocator.a(r10.D0), c81.a.a(aVar, R.string.shared_error_account_verification_failed_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_retry, 0, 2, null)), null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f33959c;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f33957a.b(l6.f30526a);
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
