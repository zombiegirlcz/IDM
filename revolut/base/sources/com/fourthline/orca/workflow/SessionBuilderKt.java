package com.fourthline.orca.workflow;

import a1m.e;
import android.content.Context;
import com.fourthline.orca.Orca;
import com.fourthline.orca.internal.eg1;
import com.fourthline.orca.internal.ff;
import com.fourthline.orca.internal.ra;
import com.fourthline.orca.internal.tg0;
import com.fourthline.orca.internal.z31;
import gim.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/fourthline/orca/Orca;", "Landroid/content/Context;", "context", "", "validationCode", "Lcom/fourthline/orca/workflow/WorkflowSessionConfiguration;", "workflowSession", "(Lcom/fourthline/orca/Orca;Landroid/content/Context;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowSessionConfiguration;", "Lcom/fourthline/orca/internal/z31;", "startSessionSubcomponent", "Lcom/fourthline/orca/internal/eg1;", "mobileSession", "Lcom/fourthline/orca/internal/ra;", "tryCreateMotionDataUploader", "(Lcom/fourthline/orca/internal/z31;Lcom/fourthline/orca/internal/eg1;)Lcom/fourthline/orca/internal/ra;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "tryCollectDeviceData", "(Lcom/fourthline/orca/internal/z31;Lcom/fourthline/orca/internal/eg1;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fourthline-sdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SessionBuilderKt {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f35792c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f35793g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f35794h;
        Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f35795j;
        int k;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f35795j = obj2;
            this.k |= Integer.MIN_VALUE;
            return SessionBuilderKt.tryCollectDeviceData(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff b(ff ffVar) {
        return ffVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object tryCollectDeviceData(@org.jetbrains.annotations.NotNull com.fourthline.orca.internal.z31 r16, @org.jetbrains.annotations.NotNull com.fourthline.orca.internal.eg1 r17, @org.jetbrains.annotations.NotNull android.content.Context r18, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.workflow.SessionBuilderKt.tryCollectDeviceData(com.fourthline.orca.internal.z31, com.fourthline.orca.internal.eg1, android.content.Context, kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final ra tryCreateMotionDataUploader(@NotNull z31 startSessionSubcomponent, @NotNull eg1 mobileSession) {
        Intrinsics.checkNotNullParameter(startSessionSubcomponent, "startSessionSubcomponent");
        Intrinsics.checkNotNullParameter(mobileSession, "mobileSession");
        ff ffVarC = mobileSession.c().getTenant().getDeviceDataCollection();
        if (ffVarC.getEnabled() && ffVarC.getMotion().getEnabled() && !e.B(mobileSession.b().b())) {
            return new ra(startSessionSubcomponent.b(), mobileSession.b().f(), startSessionSubcomponent.a());
        }
        return null;
    }

    @NotNull
    public static final WorkflowSessionConfiguration workflowSession(@NotNull Orca orca, @NotNull Context context, @NotNull String validationCode) {
        Intrinsics.checkNotNullParameter(orca, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        tg0.a(context);
        return new SessionBuilder(context, validationCode, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff a(ff ffVar) {
        return ffVar;
    }
}
