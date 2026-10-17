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
public final class ju implements gq0.b {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f30037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq0 f30038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f30039c;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ju$a$a, reason: collision with other inner class name */
        public static final class C0231a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0231a f30040a = new C0231a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f30041b = "eid_pin";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f30042c = "eid_reuse_failed_pin";

            private C0231a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f30041b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f30042c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ju(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f30037a = imageServiceLocator;
        this.f30038b = a.C0231a.f30040a;
        this.f30039c = yhm.j.b(new ko1(this, 0));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f30038b;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void d() {
        super.d();
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f30039c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(ju juVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(juVar.f30037a.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_eid_pin_already_used_germany, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_use_other_pin, 0, 2, null)), new kd1.j(c81.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)), false, 16, null);
    }
}
