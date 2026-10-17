package com.fourthline.orca.internal;

import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes23.dex */
public final class qb0 implements yg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f32370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dh1 f32371b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32374c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f32375g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f32376h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f32377j;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws NoSuchAlgorithmException {
            this.f32376h = obj2;
            this.f32377j |= Integer.MIN_VALUE;
            Object objA = qb0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public qb0(ib0 networkService, dh1 workflowSessionStore) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(workflowSessionStore, "workflowSessionStore");
        this.f32370a = networkService;
        this.f32371b = workflowSessionStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Pair pair) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str = (String) pair.f186385a;
        String str2 = (String) pair.f186386b;
        return URLEncoder.encode(str, "UTF-8") + "=" + URLEncoder.encode(str2, "UTF-8");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.yg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.yg1.a r18, kotlin.coroutines.Continuation r19) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.qb0.a(com.fourthline.orca.internal.yg1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String a(byte[] bArr) {
        String strEncodeToString = Base64.encodeToString(bArr, 3);
        Intrinsics.h(strEncodeToString);
        return kotlin.text.a0.E(kotlin.text.a0.E(strEncodeToString, '+', CoreConstants.DASH_CHAR), '/', '_');
    }

    private final String a(Pair... pairArr) {
        return kotlin.collections.d.d0(pairArr, "&", null, null, new nq1(4), 30);
    }

    private final ly0 a(String str) {
        try {
            Json jsonA = s40.a();
            jsonA.getClass();
            return (ly0) jsonA.b(ly0.INSTANCE.serializer(), str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
