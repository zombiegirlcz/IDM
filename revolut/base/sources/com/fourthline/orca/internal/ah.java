package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ah implements bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bh f26794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bh f26795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26796c;

    public static final class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Integer.valueOf(ah.this.a((er) obj3)), Integer.valueOf(ah.this.a((er) obj2)));
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f26800c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f26801g;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f26801g |= Integer.MIN_VALUE;
            return ah.this.a((md1) null, (nd1) null, this);
        }
    }

    public ah(bh countryAndTypeValidator, bh documentSelectionValidator, boolean z) {
        Intrinsics.checkNotNullParameter(countryAndTypeValidator, "countryAndTypeValidator");
        Intrinsics.checkNotNullParameter(documentSelectionValidator, "documentSelectionValidator");
        this.f26794a = countryAndTypeValidator;
        this.f26795b = documentSelectionValidator;
        this.f26796c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.bh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.md1 r9, com.fourthline.orca.internal.nd1 r10, kotlin.coroutines.Continuation r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ah.a(com.fourthline.orca.internal.md1, com.fourthline.orca.internal.nd1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fourthline.orca.internal.er a(com.fourthline.core.DocumentFileSide r3, com.fourthline.orca.internal.nd1 r4, com.fourthline.core.DocumentType r5) {
        /*
            r2 = this;
            boolean r0 = r2.f26796c
            r1 = 0
            if (r0 == 0) goto L16
            com.fourthline.core.DocumentType r0 = com.fourthline.core.DocumentType.PAPER_ID
            if (r5 != r0) goto L16
            if (r4 == 0) goto L10
            com.fourthline.core.DocumentFileSide r5 = r4.b()
            goto L11
        L10:
            r5 = r1
        L11:
            com.fourthline.core.DocumentFileSide r0 = com.fourthline.core.DocumentFileSide.FRONT
            if (r5 != r0) goto L16
            goto L23
        L16:
            if (r4 == 0) goto L1d
            com.fourthline.core.DocumentFileSide r4 = r4.b()
            goto L1e
        L1d:
            r4 = r1
        L1e:
            if (r3 == r4) goto L23
            com.fourthline.orca.internal.er$b r3 = com.fourthline.orca.internal.er.b.f28232a
            return r3
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ah.a(com.fourthline.core.DocumentFileSide, com.fourthline.orca.internal.nd1, com.fourthline.core.DocumentType):com.fourthline.orca.internal.er");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(er erVar) {
        if (Intrinsics.f(erVar, er.j.f28248a) || Intrinsics.f(erVar, er.c.f28234a)) {
            return 10;
        }
        if (Intrinsics.f(erVar, er.g.f28242a) || Intrinsics.f(erVar, er.f.f28240a)) {
            return 5;
        }
        if (Intrinsics.f(erVar, er.e.f28238a)) {
            return 2;
        }
        if (Intrinsics.f(erVar, er.d.f28236a) || Intrinsics.f(erVar, er.i.f28246a) || Intrinsics.f(erVar, er.a.f28230a) || Intrinsics.f(erVar, er.b.f28232a)) {
            return 0;
        }
        if (Intrinsics.f(erVar, er.h.f28244a)) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
