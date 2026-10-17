package com.revolut.feature.alipay_plus.mpm.support;

import a3l.c;
import android.os.Handler;
import android.os.Looper;
import hf7.d;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMDispatch;", "", "<init>", "()V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "Lkotlin/Lazy;", "main", "", "block", "Lkotlin/Function0;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMDispatch {

    @NotNull
    public static final APMPMDispatch INSTANCE = new APMPMDispatch();

    /* JADX INFO: renamed from: mainHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mainHandler = j.b(new d(15));

    private APMPMDispatch() {
    }

    private final Handler getMainHandler() {
        return (Handler) mainHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mainHandler_delegate$lambda$0() {
        Object objA;
        try {
            m.Companion aVar = m.INSTANCE;
            objA = new Handler(Looper.getMainLooper());
        } catch (Throwable th10) {
            m.Companion aVar2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        return (Handler) objA;
    }

    public final void main(@NotNull Function0<Unit> block) {
        Object objA;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            m.Companion aVar = m.INSTANCE;
            objA = Boolean.valueOf(Intrinsics.f(Looper.myLooper(), Looper.getMainLooper()));
        } catch (Throwable th10) {
            m.Companion aVar2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Object obj2 = Boolean.FALSE;
        if (objA instanceof n) {
            objA = obj2;
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        Handler mainHandler2 = getMainHandler();
        if (zBooleanValue || mainHandler2 == null) {
            block.invoke();
        } else {
            mainHandler2.post(new c(4, block));
        }
    }
}
