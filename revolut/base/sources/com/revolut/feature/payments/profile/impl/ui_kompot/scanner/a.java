package com.revolut.feature.payments.profile.impl.ui_kompot.scanner;

import gim.i;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f79655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f79656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ File f79657y;
    public final /* synthetic */ CoroutineScope z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, File file, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.f79656x = bVar;
        this.f79657y = file;
        this.z = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f79656x, this.f79657y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x016e, code lost:
    
        if (r4 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0020, B:49:0x0172, B:15:0x0036, B:40:0x0143, B:42:0x0149, B:43:0x0156, B:45:0x015a, B:50:0x0175, B:51:0x017a, B:36:0x0128), top: B:60:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0020, B:49:0x0172, B:15:0x0036, B:40:0x0143, B:42:0x0149, B:43:0x0156, B:45:0x015a, B:50:0x0175, B:51:0x017a, B:36:0x0128), top: B:60:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.profile.impl.ui_kompot.scanner.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
