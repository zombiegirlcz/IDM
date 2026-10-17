package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bf0;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.cv;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class dv implements gq0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f27925g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27926h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l70 f27927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wr f27928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fe1 f27929c;
    private final ev d;
    private final hq0 e;
    private final Lazy f;

    public static final class a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.dv$a$a, reason: collision with other inner class name */
        public static final class C0187a implements hq0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0187a f27930a = new C0187a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f27931b = "eid_scanner";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f27932c = "nfc_settings";

            private C0187a() {
            }

            @Override // com.fourthline.orca.internal.hq0
            public String a() {
                return f27931b;
            }

            @Override // com.fourthline.orca.internal.hq0
            public String getName() {
                return f27932c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[as.values().length];
            try {
                iArr[as.f26894c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[as.f26892a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[as.f26893b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dv(l70 lottieServiceLocator, wr effectHandler, fe1 viewNavigator, ev repository) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f27927a = lottieServiceLocator;
        this.f27928b = effectHandler;
        this.f27929c = viewNavigator;
        this.d = repository;
        this.e = a.C0187a.f27930a;
        this.f = yhm.j.b(new gj1(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bf0 f() {
        return bf0.d.f27113a;
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
        this.f27928b.a(new pj1(27));
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zp0.a getState() {
        return (zp0.a) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.a a(dv dvVar) {
        p70 p70VarA = dvVar.f27927a.a(k70.f30171w);
        c81.a aVar = c81.f27404a;
        return new zp0.a(c81.a.a(aVar, R.string.shared_dialog_permission_nfc_header, 0, 2, null), p70VarA, c81.a.a(aVar, R.string.shared_dialog_permission_nfc_message, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new kd1.a(null, 1, null), false, 32, null);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void a() {
        int i = b.$EnumSwitchMapping$0[this.d.d().ordinal()];
        if (i == 1) {
            this.f27929c.b(cv.b.f27558a);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.f27929c.b(cv.e.f27561a);
        }
    }
}
