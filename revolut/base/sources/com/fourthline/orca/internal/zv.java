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
public final class zv implements gq0.b {
    public static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f35725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f35726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hq0 f35727c;
    private final Lazy d;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.zv$a$a, reason: collision with other inner class name */
        public static final class C0322a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0322a f35728a = new C0322a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f35729b = "eid_upload";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f35730c = "eid_backend_recoverable";

            private C0322a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f35729b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f35730c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public zv(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f35725a = viewNavigator;
        this.f35726b = imageServiceLocator;
        this.f35727c = a.C0322a.f35728a;
        this.d = yhm.j.b(new ht1(this, 18));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f35727c;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f35725a.b(cv.c.f27559a);
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
    public static final zp0.e a(zv zvVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(zvVar.f35726b.a(r10.F0), c81.a.a(aVar, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_retry, 0, 2, null)), null, false, 24, null);
    }
}
