package com.fourthline.orca.internal;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s90 implements t9 {
    public static final a d = new a(null);
    public static final int e = 8;
    private static final String f = "NetworkCdnUrlDownloadWorker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kb0 f32949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zw f32950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f32951c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32954c;
        /* synthetic */ Object d;
        int f;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = s90.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public s90(kb0 networkServiceProvider, zw etagSharedPreference) {
        Intrinsics.checkNotNullParameter(networkServiceProvider, "networkServiceProvider");
        Intrinsics.checkNotNullParameter(etagSharedPreference, "etagSharedPreference");
        this.f32949a = networkServiceProvider;
        this.f32950b = etagSharedPreference;
        this.f32951c = yhm.j.b(new xr1(this, 4));
    }

    private final ib0 a() {
        return (ib0) this.f32951c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ib0 a(s90 s90Var) {
        return (ib0) s90Var.f32949a.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.t9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.t9.a r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.s90.a(com.fourthline.orca.internal.t9$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
